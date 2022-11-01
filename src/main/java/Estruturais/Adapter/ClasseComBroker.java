public class ClasseComBroker {
    public BrokerBase Entrada(){
        return new Broker1();
    }

    public BrokerBase Saida(){
        return new Broker2();
    }
}

