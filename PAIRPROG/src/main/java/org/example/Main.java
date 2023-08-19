package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cant = 0, minStudents = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Write data: ");
        cant = sn.nextInt();
        minStudents = sn.nextInt();
        int [] arriveTimes = new int [cant];
        for(int i = 0 ; i < cant ; i++){
            arriveTimes[i] = sn.nextInt();
        }
        System.out.println("cant: "+cant);
        System.out.println("miin: "+minStudents);
        System.out.println("array: ");
        for(int i: arriveTimes){
            System.out.print(i + " ");
        }

        Salon salon = new Salon();
        salon.asign_min_students(minStudents,arriveTimes);
        salon.asign_array(arriveTimes);

        System.out.println("\nIs class cancelled? " + salon.isClassCancelled());

        sn.close();
    }
}