package Lesson5;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.Runner;

import java.awt.*;

public class StartTest {
    @Test
    public void checkMethodTraceTest() {
        Cat catTim = new Cat("Tim", 11, 6);
        Cat catGarry = new Cat("Garry", 8, 4);
        Cat catMoris = new Cat("Moris", 16, 9);

        Runner humanMichael = new Human("Michael", 14, 5);
        Runner humanAlla = new Human("Alla", 11, 3);
        Runner humanAlex = new Human("Alex", 19, 7);

        Runner robotRally = new Robot("Rally", 14, 5);
        Runner robotElla = new Robot("Ella", 16, 17);
        Runner robotBandy = new Robot("Bandy", 19, 7);

        Runner[] runners = {catTim, catGarry, catMoris, humanMichael, humanAlla, humanAlex,
                robotRally, robotElla, robotBandy};

        Obstacles[] obstacles = {
                new Wall(6),
                new Wall(7),
                new Treadmill(11),
                new Wall(8),
                new Treadmill(15),
                new Treadmill(16),
        };

        new Start().trace(runners, obstacles);

        Assertions.assertTrue(robotElla.getSuccess());
        Assertions.assertTrue(catMoris.getSuccess());
        Assertions.assertTrue(catTim.getSuccess());
    }
}

