package polymorphism.participants;

public abstract class Participant {
    private final String name;
    private double runLimit;
    private double jumpLimit;
    private boolean isActive = true;

    protected Participant(String name, double runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public void run() {
        System.out.printf("%s named %s can run a distance of %.2f meters.\n",
                getClass().getSimpleName(), name, runLimit);
    }

    public void jump() {
        System.out.printf("%s named %s can jump over an obstacle of %.2f meters.\n",
                getClass().getSimpleName(), name, jumpLimit);
    }

    public String getName() {
        return name;
    }

    public double getRunLimit() {
        return runLimit;
    }

    public double getJumpLimit() {
        return jumpLimit;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
