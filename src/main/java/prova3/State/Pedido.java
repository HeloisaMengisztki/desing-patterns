package prova3.State;

import prova3.Domains.Carrinho;
import prova3.Strategy.Strategy;

import java.util.Scanner;

public class Pedido  {
    private final Scanner sc = new Scanner(System.in);

    public String nome;
    public String endereco;

    private final Carrinho carrinho = new Carrinho();;

    private EstadoPedido state = new IniciarPedido(this);

    public Pedido(){
        System.out.println(" ----- Bem vindo ao sistema ----- ");

        setNome();
        setEndereco();
    }

    EstadoPedido getState(){
        System.out.println();
        //System.out.println("Obtendo estado do pedido " + this.state.nomeEstado());
        return this.state;
    }

    void setState(EstadoPedido state){
        //System.out.println("Mudando estado para " + state.nomeEstado());
        this.state = state;
    }


    public void setNome() {
        System.out.println("Informe o nome: ");
        this.nome = sc.nextLine();
    }

    public void setEndereco() {
        System.out.println("Informe o endereco de entrega: ");
        this.endereco = sc.nextLine();
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void processar(Strategy strategy) {
        strategy.mostraMenu();
        strategy.leEscolha();
        strategy.executa();
    }

    //GET ESTADOS DO PEDIDO
    public boolean fechado() {
        return getState().pedidoEncerrado();
    }

    public boolean concluido() {
        return getState().pedidoConcluido();
    }

    public boolean escolherItens() {
        return getState().escolhendoItens();
    }

    public boolean visualizarCarrinho() {
        return getState().verCarrinho();
    }

    //SET ESTADOS DO PEDIDO
    public void concluir() { setState(new PedidoConcluido(this)); }

    public void fechar() {
        setState(new PedidoEncerrado(this));
    }

    public void realizarPedido() {
        setState(new EscolhendoItens(this));
    }

    public void verCarrinho() { setState(new VerCarrinho(this)); }
}