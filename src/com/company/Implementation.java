package com.company;

import java.io.IOException;
import java.util.*;

public class Implementation {

    public void print() throws IOException {
        Cat[] cats = JsonSerializer.getCat();
        System.out.println("---+--------+-----+-------+------+-------+-----------------+");
        System.out.printf("%-2s | %-6s | %-3s | %-5s | %-4s | %-5s | %-15s|","#","Name","Age","Health","Mood","Satiety","Average level");
        System.out.println();
        System.out.println("---+--------+-----+-------+------+-------+-----------------+");
        for (int i = 0; i < cats.length; i++){
            int average = (cats[i].getHealthLevel() + cats[i].getMoodLevel() + cats[i].getSatietyLevel()) / 3;
            System.out.printf("%-2s | %-6s | %-3s | %-5s | %-4s | %-5s | %-15s|",i+1,cats[i].getName(),cats[i].getAge(),cats[i].getHealthLevel(),cats[i].getMoodLevel(),cats[i].getSatietyLevel(),average);
            System.out.println();
        }
        System.out.println("---+--------+-----+-------+------+-------+-----------------+\n");


    }


    public void catAction() throws IOException {
        Actions actions = new Actions();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1: Покормить\n2: Поиграть\n3: К ветеринару\n4: Следующий день\n");
            System.out.print("Выбирай действие (1-4): ");
            int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        actions.feed();
                        break;
                    case 2:
                        actions.play();
                        break;
                    case 3:
                        actions.treat();
                        break;
                    case 4:
                        actions.nextDay();
                }
        }catch (NumberFormatException  nfe){
            System.out.println("Выбирай только цифры!");
        }
    }
}
