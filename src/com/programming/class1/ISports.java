package com.programming.class1;
// This is an interface where we only do declarations. keyword: `interface`
public interface ISports {

    void homeTeam(String teamName); // only declaration
    void visitingTeam(String teamName);
    void venue(String location);

    int defaultNumberForPlayers = 8;
}

// this creates a skeleton. use this to create classes and override these declared methods.
