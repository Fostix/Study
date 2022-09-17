package Lessons.OOP.Lesson03.Ex006_Game.Ex2;

public class Game {
    public static void main(String[] args) {
        System.out.println("Ex002_Game");
        Team<Intern> team1 = new Team<>("Воробушки");
        team1.add(Gb.CreateIntern());
        team1.add(Gb.CreateIntern());
        System.out.println(team1);

        Team<Intern> team2 = new Team<>("Хлебушки");
        team2.add(Gb.CreateIntern());
        team2.add(Gb.CreateIntern());
        // team2.add(Gb.CreateMiddle());
        System.out.println(team2);

        var o = new Olympiad<Intern>(team1, team2);
        o.start();
        System.out.println("str1 vs str2");

        //#region
        var st1 = new Team<String>("string team1");
        var st2 = new Team<String>("string team1");

        Olympiad<String> o1 = new Olympiad<>(st1, st2);
        o1.start();
        //#endregion
    }
}
