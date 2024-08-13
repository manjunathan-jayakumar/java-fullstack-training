package com.programming.class1;
/*
This interface inherits the ISports interface. classes that implement this
interface needs to override the functions in parent interface also.
 */
public interface IHockey extends ISports {

    void homeTeamGoalsScored(int goalPoints);
    void visitingTeamGoalsScored(int goalPoints);

}
