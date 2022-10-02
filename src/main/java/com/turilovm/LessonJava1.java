package com.turilovm;

import java.util.Scanner;

public class LessonJava1 {

    public static void main(String [] args){

        //int temp = 15;
//        //int age = 36;
        String name = "Mike";
//        String weather = "Rain";
////        int oldMan = 65 - age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свой возраст");
        int age = scanner.nextInt();
        System.out.println("Какая температура на улице");
        int temp = scanner.nextInt();

        if(temp >= 20 && age >=36) {

            System.out.println(name + "," + " Сиди лучше дома, ты старый");
        }
        else {
            System.out.println(name + " Сиди лучше дома, ты старый");
        }

        scanner.close();


    }
}
