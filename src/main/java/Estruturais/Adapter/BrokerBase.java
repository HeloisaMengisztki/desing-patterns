public class BrokerBase implements InterfaceParaSerAdaptada {

    @Override
    public void ConsumeEvento(String evento) {
        System.out.println("Consumindo Evento" + evento);
    }

    @Override
    public void PublicaEvento(String evento) {
        System.out.println("Publicando Evento" + evento);
    }
}
