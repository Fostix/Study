package Lessons.Basic.Lesson4.Ex008Robot;

public class Robot2 {
    /** Уровень робота */
    private int level;

    /** Имя робота */
    private String name;

    /**
     * Создание робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Методы вкл\выкл подсистемы

    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }


    /**Включение BIOS */
    private void startBIOS() {
        System.out.println("start BIOS...");
    }

    /**Включение OS */
    private void startOS() {
        System.out.println("start OS...");
    }

    /**Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("stop BIOS...");
    }

    /**Выгрузка OS */
    private void stopOS() {
        System.out.println("stop OS...");
    }

    /**Приветствие */
    private void sayHi() {
        System.out.println("hello world...");
    }

    /**Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /**Работа */
    public void work() {
        System.out.println("Working...");
    }
}
