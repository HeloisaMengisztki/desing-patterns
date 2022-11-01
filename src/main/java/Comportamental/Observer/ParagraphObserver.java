package Comportamental.Observer;

public class ParagraphObserver implements Observer{

    private String message;

    ParagraphObserver(String message){

        this.message = message;
    }

    @Override
    public void update(String message) {
        System.out.println("updating observable " + this.message + message);
    }
}
