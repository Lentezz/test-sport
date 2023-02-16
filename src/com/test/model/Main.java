package com.test.model;

public class Main {
    public static void main(String[] args) {
        Training[] trainings = new Training[7];

        trainings[0] = new RunningTraining(110, 60, 77.2, 10);
        trainings[1] = new Kickboxing(99, 120, 76.7);
        trainings[2] = new Crossfit(90, 50, 76.3, 90);
        trainings[3] = new RunningTraining(130, 80, 75.5, 15);
        trainings[4] = new Crossfit(120, 60, 74.9, 95);
        trainings[5] = new RunningTraining(133, 120, 74, 17.2);
        trainings[6] = new Kickboxing(125, 120, 73.5);
        for(Training t : trainings){
            System.out.println(t);
        }
    }
}
