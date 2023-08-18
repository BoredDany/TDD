package org.example;

import java.util.ArrayList;

public class Salon {

    //1 < n < 1000
    //1 < k < n
    //-100 <= arr[i] <= 100
    private int min_students;
    private int[] arrive_times;

    public Salon(int min_students, int[] arrive_times) {
        this.min_students = min_students;
        this.arrive_times = arrive_times;
    }

    public Salon() {

    }

    public int getMin_students() {
        return min_students;
    }

    public int[] getArrive_times() {
        return arrive_times;
    }

    public void setMin_students(int min_students) {
        this.min_students = min_students;
    }

    public void setArrive_times(int[] arrive_times) {
        this.arrive_times = arrive_times;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "min_students=" + min_students +
                ", arrive_times=" + arrive_times +
                '}';
    }
    // test of asing minimum  number of student in k

    public void asign_min_students(int min_students, int[] students) {
        if(min_students<0){
            throw new RuntimeException("Numero mínimo de estudiantes no puede ser cero");
        }
        if(min_students > students.length){
            throw new RuntimeException("Numero mínimo de estudiantes supera cantidad de estudiantes que llegaron");
        }
        this.min_students = min_students;
    }
    public void asign_array (int[] arrive_times){
        if(arrive_times.length < 1 || arrive_times.length >100){
            throw new RuntimeException("Numero de estudiantes no valido");
        }
        if(negative_values(arrive_times)){
            throw new RuntimeException("Tiempos de llegada no validos");
        }
    }
    public boolean negative_values(int[] arrive_times){
        boolean is_negative = false;
        for(int i = 0 ; i < arrive_times.length ; i++){
            if (arrive_times[i] < 0){
                is_negative = true;
            }
        }
        return is_negative;
    }
}
