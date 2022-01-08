package com.company;


public class Cat {
    private String name;
    private int age;
    private int satietyLevel;
    private int moodLevel;
    private int healthLevel;

    public Cat(String name, int age, int satietyLevel, int moodLevel, int healthLevel) {
        this.name = name;
        this.age = age;
        this.satietyLevel = satietyLevel;
        this.moodLevel = moodLevel;
        this.healthLevel = healthLevel;

    }

    @Override
    public String toString() {
        return "name: " + name +
                ", age: " + age +
                ", satietyLevel: " + satietyLevel +
                ", moodLevel: " + moodLevel +
                ", healthLevel: " + healthLevel +
                '}';
    }

    public void setSatietyLevel(int satietyLevel) {
        this.satietyLevel = satietyLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSatietyLevel() {
        return satietyLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }
}
