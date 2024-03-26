package polymorphism.obstacles;

import polymorphism.participants.Participant;

public class Treadmill implements Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run();

        if (participant.getRunLimit() >= length) {
            System.out.printf("%s successfully ran a treadmill %d meters long.\n",
                    participant.getName(), length);
        } else {
            System.out.printf("%s couldn't run a treadmill %d meters long.\n",
                    participant.getName(), length);
            participant.setActive(false);
        }
    }
}
