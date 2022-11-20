package prova3.Strategy;

import prova3.State.Pedido;

import java.util.Scanner;

public class MenuPedido implements Strategy {
    public int escolha;
    private Pedido pedido;


    public MenuPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void mostraMenu() {
        System.out.println(" MENU PEDIDO ");
        System.out.println("1 - Realizar pedido");
        System.out.println("2 - Trocar nome");
        System.out.println("3 - Trocar endereco");
        System.out.println("4 - Sair");
    }

    @Override
    public void leEscolha() {
        System.out.println("Informe a opção escolhida: ");

        Scanner sc = new Scanner(System.in);
        this.escolha = sc.nextInt();
    }

    @Override
    public void executa() {
        switch (this.escolha) {
            case 1 -> {
                pedido.realizarPedido();
            }
            case 2 -> {
                pedido.setNome();
            }
            case 3 -> {
                pedido.setEndereco();
            }
            case 4 -> {
                pedido.fechar();
            }
        }
    }
}
