package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScheduleServiceTest {
    @Test
    public void salary10000() {
        ScheduleService service = new ScheduleService ();
        int exepted = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(exepted, actual);

    }

    @Test
    public void salary100000() {
        ScheduleService service = new ScheduleService();
        int exepted = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(exepted, actual);
    }
}
