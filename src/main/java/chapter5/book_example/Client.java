package chapter5.book_example;

public class Client {

    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("atom");

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println("\nMy name is " + atom.getName());
        atom.move();
        atom.attack();

    }

}
