package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalonTest {
    private Salon salonTest;

    @BeforeEach
    void setUp() {
        this.salonTest = new Salon();
    }

    @AfterEach
    void tearDown() {

    }

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
    public void Asign_min_students_in_range() {
        int min_students = 3;
        int[] arrive_times = new int [5];
        salonTest.asign_min_students(min_students,arrive_times);
        assertEquals(3, salonTest.getMin_students());
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
    public void Asign_array_students_null() {
        assertThrows(RuntimeException.class, () -> salonTest.asign_array(null));
    }

    @Test
    public void Asign_array_students_in_range() {
        int[] arrive_times = new int [500];
        assertThrows(RuntimeException.class, () -> salonTest.asign_array(arrive_times));
    }

    @Test
    public void Asign_array_students_negative_values() {
        int[] arrive_times = {-102, -103, -110, -115};
        assertThrows(RuntimeException.class, () -> salonTest.asign_array(arrive_times));
    }

    @Test
    public void Asign_array_students_big_values() {
        int[] arrive_times = {200, 300, 500, 600};
        assertThrows(RuntimeException.class, () -> salonTest.asign_array(arrive_times));
    }

    @Test
    public void Asign_array_students_in_range_values() {
        int[] arrive_times = {100, -90, 50, 0};
        assertEquals(true, salonTest.valid_values(arrive_times));
    }


}
