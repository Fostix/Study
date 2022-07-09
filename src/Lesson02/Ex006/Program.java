package Lesson02.Ex006;

public class Program {
    public static void main(String[] args) { // can't add more one brand water!!
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));

        for(var ingredient : latte) {
            System.err.println(ingredient);
        }
        System.out.println(latte.iterator());


    }
}
