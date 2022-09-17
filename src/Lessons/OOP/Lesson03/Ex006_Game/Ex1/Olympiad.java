package Lessons.OOP.Lesson03.Ex006_Game.Ex1;

import java.util.Random;

public class Olympiad {
    Team team1, team2;
    Random r = new Random();

    public Olympiad(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void start() {
        String winner = r.nextInt(2) == 0 ? team1.getName() : team2.getName();
        System.out.println(String.format("Winner: %s", winner));
    }
}
