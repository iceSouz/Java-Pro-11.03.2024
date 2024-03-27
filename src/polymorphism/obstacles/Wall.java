package polymorphism.obstacles;

import polymorphism.participants.Participant;

public class Wall implements Obstacle {
    private double high;

    public Wall(double high) {
        this.high = high;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump();

        if (participant.getJumpLimit() > high) {
            System.out.printf("%s successfully jumped over a wall %.2f meters high.\n",
                    participant.getName(), high);
        } else {
            System.out.printf("%s couldn't jump over a wall %.2f meters high.\n",
                    participant.getName(), high);
            participant.setActive(false);
        }
    }
}
