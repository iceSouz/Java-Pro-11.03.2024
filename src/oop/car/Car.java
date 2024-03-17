package oop.car;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start the electrical system.");
    }

    private void startCommand() {
        System.out.println("Start the control system.");
    }

    private void startFuelSystem() {
        System.out.println("Start the fuel system.");
    }
}
