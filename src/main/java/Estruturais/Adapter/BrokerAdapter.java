public class BrokerAdapter implements CopiaInterfaceParaSerAdaptada {
    private ClasseComBroker classeComBroker;

    public BrokerAdapter(ClasseComBroker classeComBroker){

        this.classeComBroker = classeComBroker;
    }


    @Override
    public void ConsumeEvento(String evento) {
        System.out.println("Utilizando " + this.classeComBroker.Entrada().getClass());
        this.classeComBroker.Entrada().ConsumeEvento(evento);
    }

    @Override
    public void PublicaEvento(String evento) {
        System.out.println("Utilizando " + this.classeComBroker.Saida().getClass());
        this.classeComBroker.Saida().PublicaEvento(evento);
    }
}
