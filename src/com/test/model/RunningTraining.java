package com.test.model;

public class RunningTraining extends Training{
    private double distance;

    public RunningTraining(double averagePulse, int duration, double weight, double distance) {
        super(averagePulse, duration, weight);
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Running training! Duration: " + super.getDuration() + " min. " +
                "Distance: " + distance + " km. Kilocalories: " + super.calculateCalories();
    }
}
