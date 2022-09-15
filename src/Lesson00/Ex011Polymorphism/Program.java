package Lesson00.Ex011Polymorphism;

public class Program {
    public static void main(String[] args) {

        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        BaseHero hero3 = new Warrior();
        System.out.println(hero3.getInfo());

        BaseHero hero4 = new Magician(); // Переменная базового класса и в него положили экземпляр производного класса.
        System.out.println(hero4.getInfo());

        BaseHero hero5 = new Priest(); // Помогает не писать лишний код.
        System.out.println(hero5.getInfo());

        BaseHero hero6 = new Warrior();
        System.out.println(hero6.getInfo());

        System.out.println("----------------------------------------------");
        // Attack
        System.out.println(hero4.getInfo());
        System.out.println(hero3.getInfo());
        System.out.println(hero3.getInfo());
        hero3.Attack(hero4);
        hero4.Attack(hero3);
        System.out.println(hero4.getInfo());
        System.out.println(hero3.getInfo());

        // Heal
        System.out.println("----------------------------");
        System.out.println(hero4.getInfo());
        System.out.println(hero3.getInfo());

        hero3.HealHero(hero4);
        System.out.println(hero4.getInfo());
        System.out.println(hero3.getInfo());

        // Die активируется только реплика!
        System.out.printf("-".repeat(100));
        System.out.println();
        for (int i = 0; i < 15; i++) {
            hero4.Attack(hero3);
        }
        System.out.println(hero4.getInfo());
        System.out.println(hero3.getInfo());

        //#region legion
//        System.out.println("-----------------------------------------------");
//        // Team
//        int teamCount = 10;
//        Random rand = new Random();
//        int magicialCount = 0;
//        int priestCount = 0;
//        int warriorCount = 0;
//
//        List<BaseHero> teams = new ArrayList<>();
//        for (int i = 0; i < teamCount; i++) {
//            if(rand.nextInt(3) == 0) {
//                teams.add(new Priest());
//                priestCount++;
//            } else if (rand.nextInt(3) == 1) {
//                teams.add(new Warrior());
//                warriorCount++;
//            } else {
//                teams.add(new Magician());
//                magicialCount++;
//            }
//            System.out.println(teams.get(i).getInfo());
//        }
//        System.out.println();
//        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicialCount, priestCount);
        //#endregion

        // 1. todo добавить ещё один класс (добавил война)
        //  и
        // 2. реализовать возможность лечения героев !!! (реализовал)
    }
}
