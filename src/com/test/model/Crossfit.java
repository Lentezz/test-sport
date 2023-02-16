package com.test.model;

public class Crossfit extends Training{
    private int maxWeight;

    public Crossfit(double averagePulse, int duration, double weight, int maxWeight) {
        super(averagePulse, duration, weight);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Crossfit training! Duration: " + super.getDuration() + " min. " +
                "Max barbell weight: " + maxWeight + " kg. Kilocalories: " + super.calculateCalories();
    }
}
