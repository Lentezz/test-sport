package com.test.model;

public class Training {
    private double averagePulse;
    private int duration;
    private double weight;

    public Training(double averagePulse, int duration, double weight) {
        this.averagePulse = averagePulse;
        this.duration = duration;
        this.weight = weight;
    }

    public double calculateCalories(){
        return 0.014 * weight * duration * (0.12 * averagePulse - 7);
    }

    public double getAveragePulse() {
        return averagePulse;
    }

    public void setAveragePulse(double averagePulse) {
        this.averagePulse = averagePulse;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Training{" +
                "averagePulse=" + averagePulse +
                ", duration=" + duration +
                ", weight=" + weight +
                '}';
    }
}
