package com.test.model;

public class Kickboxing extends Training {

    public Kickboxing(double averagePulse, int duration, double weight) {
        super(averagePulse, duration, weight);
    }

    @Override
    public String toString() {
        return "Kickboxing training! Duration: " + super.getDuration() + " min. Kilocalories: " + super.calculateCalories();
    }
}
