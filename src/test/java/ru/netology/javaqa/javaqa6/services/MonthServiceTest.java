package ru.netology.javaqa.javaqa6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthServiceTest {

    @ParameterizedTest
/*    @CsvSource({
            "2,100000,60000,150000",
            "0,15000,10000,150000",
            "3,10000,3000,20000"
    })*/
    @CsvFileSource(files="src/test/resources/month.csv")
    public void testMonthHoliday(int expected, int income, int expenses, int threshold) {
        MonthService service = new MonthService();

//        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    /*@Test
    public void testMonthNoholiday() {
        MonthService service = new MonthService();

        int expected = 0;
        int actual = service.calculate(15_000, 10_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }*/
}