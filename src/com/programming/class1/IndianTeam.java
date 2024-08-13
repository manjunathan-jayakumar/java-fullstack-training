package com.programming.class1;
/*
This class implements the ISports Interface so we need to override
the methods declared in that interface
 */

public class IndianTeam implements ISports{
    @Override
    public void homeTeam(String teamName) {
        System.out.println("HomeTeam: "+ teamName);
    }

    @Override
    public void visitingTeam(String teamName) {
        System.out.println("Opponent team: "+ teamName);
    }

    @Override
    public void venue(String location) {
        System.out.println("Venue: " + location);
    }

    public static void main(String[] args) {
        IndianTeam team1 = new IndianTeam();

        team1.homeTeam("MI");
        team1.visitingTeam("CSK");
        team1.venue("M.Chinnaswamy stadium");

        System.out.println("number of players: " + team1.defaultNumberForPlayers);
    }
}
