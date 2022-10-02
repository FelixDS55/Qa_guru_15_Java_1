package com.turilovm;

import java.util.Scanner;

public class LessonJava1 {

    public static void main(String [] args){

        String name = "Mike";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свой возраст");
        int age = scanner.nextInt();
        System.out.println("Какая температура на улице");
        int temp = scanner.nextInt();

        if(temp >= 20 && age >=36) {

            System.out.println(name + "," + " Сиди лучше дома, ты старый");
        }
        else {
            System.out.println(name + " Ты справишься)");
        }

        scanner.close();

    }
}
