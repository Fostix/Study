package Lesson02.Ex006test;

public class Program {
    public static void main(String[] args) { // can't add more one brand water!!
        Coffee<Water> latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        Beverage s = new Coffee();
        System.out.println(s);

        for(var ingredient : latte) {
            System.err.println(ingredient);
        }
        System.out.println(latte.iterator());


    }
}
