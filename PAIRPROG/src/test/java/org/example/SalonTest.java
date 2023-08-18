package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class SalonTest {
    private Salon salonTest;

    @Test
    public void Asign_min_students_cero() {
        int min_students = -1;
        int[] arrive_times = new int[0];
        assertThrows(RuntimeException.class, () -> salonTest.asign_min_students(min_students, arrive_times));
    }

    @Test
    public void Asign_min_students_higher_n() {
        int min_students = 10;
        int[] arrive_times = new int [5];
        assertThrows(RuntimeException.class, () -> salonTest.asign_min_students(min_students, arrive_times));
    }

    @Test
    public void Asign_array_students_one() {
        int[] arrive_times = new int [0];
        assertThrows(RuntimeException.class, () -> salonTest.asign_array(arrive_times));
    }

    @Test
    public void Asign_array_students_higher_1000() {
        int[] arrive_times = new int [1100];
        assertThrows(RuntimeException.class, () -> salonTest.asign_array(arrive_times));
    }

    @Test
    public void Asign_array_students_negative_values() {
        int[] arrive_times = new int [10];
        fill_array(arrive_times);
        assertThrows(RuntimeException.class, () -> salonTest.asign_array(arrive_times));
    }

    public void fill_array (int[] arrive_times){
        int counter = 0;
        for(int i = -101 ; counter < 10 ; i--){
            arrive_times[counter] = i;
        }
    }

}
