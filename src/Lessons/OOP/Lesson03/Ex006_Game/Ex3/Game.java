package Lessons.OOP.Lesson03.Ex006_Game.Ex3;

public class Game {
    public static void main(String[] args) {
        System.out.println("Ex003_Name");
        Team<Intern> team1 = new Team<>("Воробушки");
        team1.Add(Gb.CreateIntern());
        team1.Add(Gb.CreateIntern());
        System.out.println(team1);

        Team<Intern> team2 = new Team<>("Хлебушки");
        team2.Add(Gb.CreateIntern());
        team2.Add(Gb.CreateIntern());
        System.out.println(team2);

        var o = new Olympiad<Intern>(team1, team2);
        o.start();

        //#region
//        System.out.println("st1 vs st2");
//        var st1 = new Team<String>("String team1");
//        var st2 = new Team<String>("String team1");
//
//        Olympiad<String> o1 = new Olympiad<>(st1, st2);
//        o1.start();
        //#endregion

    }
}
