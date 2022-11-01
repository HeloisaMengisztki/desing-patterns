public class Main{
    public static void main(String[] args){
        ClasseComBroker classe = new ClasseComBroker();
        BrokerAdapter adapter = new BrokerAdapter(classe);

        adapter.ConsumeEvento("mensagem de entrada");
        adapter.PublicaEvento("mensagem publicada");
    }
}

