package ru.netology.javaqa.javaqa6.services;

public class Main {
    public static void main(String[] args) {
        MonthService service = new MonthService();

        System.out.println(service.calculate(100_000, 60_000, 150_000) + " месяц(ев) отдыха в году");
    }
}
