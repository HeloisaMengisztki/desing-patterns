# Avaliação 3 

Padrões de projeto escolhidos: Strategy e State

Para o strategy foram feitos as telas de menú que contém os métodos herdados da interface de Strategy:

    void mostraMenu();
    void leEscolha();
    void executa();

Para o State foi utilizado em cima da classe Pedido herdando da interface de Estado do pedido:

    boolean escolhendoItens();
    boolean pedidoEncerrado();
    boolean pedidoConcluido();
    boolean verCarrinho();

Os dois patterns trabalham juntos quando no menú, de acordo com o estado atual do pedido um menú diferente é mostrado, facilitando o gerenciamento tanto do estado atual do pedido quanto qual menu mostrar.

    if (strategy == null)
    strategy = new MenuPedido(pedido);

    else if(pedido.escolherItens())
        strategy = new MenuItensPedido(pedido, portifolio);

    else if(pedido.visualizarCarrinho())
        strategy = new MenuCarrinho(pedido);

    else if(pedido.concluido()){
        strategy = new MenuConclusao(pedido);
    }

    pedido.processar(strategy);

As classes usadas para cada padrão estão dispostas e organizadas em pastas com os nomes do padrão no próprio projeto.