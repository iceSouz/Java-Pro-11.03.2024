package polymorphism.competition;

import polymorphism.obstacles.Obstacle;
import polymorphism.participants.Participant;

public class CompetitionManager {
    public static void conductCompetition(Participant[] participants, Obstacle[] obstacles) {
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (participant.isActive()) {
                    obstacle.overcome(participant);
                    System.out.println();
                } else {
                    System.out.println(participant.getName() + " drops out of the competition!\n");
                    break;
                }
            }

            if (participant.isActive()) {
                System.out.println(participant.getName() + " successfully passed all obstacles!\n");
            }
        }
    }
}
