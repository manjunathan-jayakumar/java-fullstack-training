package com.programming.class1;
/*
This is an example of Multiple inheritance. Multiple inheritance can be
only be achieved through interfaces in java.
 */

public class IndiaSportsClub implements IHockey, IFootball{
    @Override
    public void homeTeamFormation(String form) {
        System.out.println("Home Form: "+ form);
    }

    @Override
    public void visitingTeamFormation(String form) {
        System.out.println("visitor Form: "+ form);

    }

    @Override
    public void homeTeamGoalsScored(int goalPoints) {
        System.out.println("Home Goals: "+ goalPoints);
    }

    @Override
    public void visitingTeamGoalsScored(int goalPoints) {
        System.out.println("Visitor goals: "+ goalPoints);
    }

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
    public static void main(String[] args){
        // create an object and call any method
    }
}
