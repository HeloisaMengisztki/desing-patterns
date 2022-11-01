package Comportamental.Observer;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("escreva a mensagem a ser ouvida");
        String paragraph = in.nextLine();

        InputObservable inputObservable = new InputObservable();
        ParagraphObserver paragraphObs1 = new ParagraphObserver("escutando no observer 1: ");
        ParagraphObserver paragraphObs2 = new ParagraphObserver("escutando no observer 2: ");

        inputObservable.subscribe(paragraphObs1);
        inputObservable.subscribe(paragraphObs2);

        try {
            inputObservable.notificar(paragraph);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}