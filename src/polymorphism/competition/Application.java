package polymorphism.competition;

import polymorphism.obstacles.Obstacle;
import polymorphism.obstacles.Treadmill;
import polymorphism.obstacles.Wall;
import polymorphism.participants.Cat;
import polymorphism.participants.Human;
import polymorphism.participants.Participant;
import polymorphism.participants.Robot;

public class Application {
    public static void main(String[] args) {

        Participant[] participants = new Participant[]{
                new Human("John", 1000, 1.5),
                new Cat("Whiskers", 200, 0.8),
                new Robot("R2D2", 900, 2.0)
        };

        Obstacle[] obstacles = new Obstacle[]{
                new Treadmill(800),
                new Wall(1.9),
                new Treadmill(600),
                new Wall(1.4)
        };

        CompetitionManager.conductCompetition(participants, obstacles);
    }
}
