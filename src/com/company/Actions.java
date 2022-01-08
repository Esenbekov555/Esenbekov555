package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Actions {

    public void feed() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выбирай кота, по его номеру: ");
        int chooseCat = sc.nextInt();
        Cat[] cats = JsonSerializer.getCat();
        if (chooseCat == 1) {
            cats[0].setMoodLevel(cats[0].getMoodLevel() + 7);
            cats[0].setSatietyLevel(cats[0].getSatietyLevel() + 7);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты покормил кота " + cats[0].getName() + ", ему " + cats[0].getAge() + " лет");
        }else if (chooseCat == 2) {
            cats[1].setSatietyLevel(cats[1].getSatietyLevel() + 4);
            cats[1].setMoodLevel(cats[1].getMoodLevel() + 4);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты покормил кота " + cats[1].getName() + ", ему " + cats[1].getAge() + " лет");
        } else if (chooseCat == 3) {
            cats[2].setSatietyLevel(cats[2].getSatietyLevel() + 5);
            cats[2].setMoodLevel(cats[2].getMoodLevel() + 5);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты покормил кота " + cats[2].getName() + ", ему " + cats[2].getAge() + " лет");
        } else if (chooseCat == 4) {
            cats[3].setSatietyLevel(cats[3].getSatietyLevel() + 7);
            cats[3].setMoodLevel(cats[3].getMoodLevel() + 7);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты покормил кота " + cats[3].getName() + ", ему " + cats[3].getAge() + " лет");
        }
    }

    public void play() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выбирай кота, по его номеру: ");
        int chooseCat = sc.nextInt();
        Cat[] cats = JsonSerializer.getCat();
        if (chooseCat == 1) {
            cats[0].setMoodLevel(cats[0].getMoodLevel() + 7);
            cats[0].setSatietyLevel(cats[0].getSatietyLevel() - 3);
            cats[0].setHealthLevel(cats[0].getHealthLevel() + 7);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты поиграл с котом " + cats[0].getName() + ", ему " + cats[0].getAge() + " лет");
        } else if (chooseCat == 2) {
            cats[1].setMoodLevel(cats[1].getMoodLevel() + 4);
            cats[1].setSatietyLevel(cats[1].getSatietyLevel() - 6);
            cats[1].setHealthLevel(cats[1].getHealthLevel() + 4);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты поиграл с котом " + cats[1].getName() + ", ему " + cats[1].getAge() + " лет");
        } else if (chooseCat == 3) {
            cats[2].setMoodLevel(cats[2].getMoodLevel() + 5);
            cats[2].setSatietyLevel(cats[2].getSatietyLevel() - 5);
            cats[2].setHealthLevel(cats[2].getHealthLevel() + 5);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты поиграл с котом " + cats[2].getName() + ", ему " + cats[2].getAge() + " лет");
        } else if (chooseCat == 4) {
            cats[3].setMoodLevel(cats[3].getMoodLevel() + 7);
            cats[3].setSatietyLevel(cats[3].getSatietyLevel() - 3);
            cats[3].setHealthLevel(cats[3].getHealthLevel() + 7);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты поиграл с котом " + cats[3].getName() + ", ему " + cats[3].getAge() + " лет");
        }
    }
    public void treat() throws IOException {
        Cat[] cats = JsonSerializer.getCat();
        Scanner sc = new Scanner(System.in);
        System.out.print("Выбирай кота, по его номеру: ");
        int chooseCat = sc.nextInt();
        if (chooseCat == 1) {
            cats[0].setMoodLevel(cats[0].getMoodLevel() - 3);
            cats[0].setSatietyLevel(cats[0].getSatietyLevel() - 3);
            cats[0].setHealthLevel(cats[0].getHealthLevel() + 7);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты отправил к ветеринару кота " + cats[0].getName() + ", ему " + cats[0].getAge() + " лет");
        } else if (chooseCat == 2) {
            cats[1].setMoodLevel(cats[1].getMoodLevel() - 6);
            cats[1].setSatietyLevel(cats[1].getSatietyLevel() - 6);
            cats[1].setHealthLevel(cats[1].getHealthLevel() + 4);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты отправил к ветеринару кота " + cats[1].getName() + ", ему " + cats[1].getAge() + " лет");
        } else if (chooseCat == 3) {
            cats[2].setMoodLevel(cats[2].getMoodLevel() - 5);
            cats[2].setSatietyLevel(cats[2].getSatietyLevel() - 5);
            cats[2].setHealthLevel(cats[2].getHealthLevel() + 5);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты отправил к ветеринару кота " + cats[2].getName() + ", ему " + cats[2].getAge() + " лет");
        } else if (chooseCat == 4) {
            cats[3].setMoodLevel(cats[3].getMoodLevel() - 3);
            cats[3].setSatietyLevel(cats[3].getSatietyLevel() - 3);
            cats[3].setHealthLevel(cats[3].getHealthLevel() + 7);
            JsonSerializer.writeCat(cats);
            System.out.println("Ты отправил к ветеринару кота " + cats[3].getName() + ", ему " + cats[3].getAge() + " лет");
        }
    }

    public void nextDay() throws IOException {
        Random r = new Random();
        Cat[] cats = JsonSerializer.getCat();
        for (int i = 0; i < cats.length; i++){
            cats[i].setSatietyLevel(cats[i].getSatietyLevel() - r.nextInt(6)+1);
            cats[i].setMoodLevel(cats[i].getMoodLevel() - r.nextInt(7) - 3);
            cats[i].setHealthLevel(cats[i].getHealthLevel() - r.nextInt(7) - 3);
            JsonSerializer.writeCat(cats);
        }
    }
}
