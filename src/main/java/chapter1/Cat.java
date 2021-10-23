package chapter1;

public class Cat {
    private String name;

    public void meow(){
        System.out.println(name + "~~~~~" + "웁니다.");
    }

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat("냥냥이");
        Cat cat2 = new Cat("야옹이");

        cat1.meow();
        cat2.meow();
    }
}
