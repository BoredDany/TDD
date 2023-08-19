package org.example;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Salon y sus métodos
        int[] arriveTimes = {-1, 0, 2, -3, 4};
        int minStudents = 3;

        Salon salon = new Salon(minStudents, arriveTimes);

        System.out.println("Is class cancelled? " + salon.isClassCancelled());

        // También puedes hacer otras pruebas y manipulaciones aquí
    }
}