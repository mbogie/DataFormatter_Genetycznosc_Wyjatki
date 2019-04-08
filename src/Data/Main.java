package Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("podaj date");
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        date = date.plusYears(1);
        date = date.plusDays(12);

        LocalDateTime dateAtTime = date.atTime(15, 47);

        System.out.println("rok:"+ dateAtTime.getYear());
        System.out.println("miesiac:"+ dateAtTime.getMonth());
        System.out.println("dzien miesiaca:"+dateAtTime.getDayOfMonth());
        System.out.println("dzien tygodnia:"+dateAtTime.getDayOfWeek());
        System.out.println("dzien roku:"+dateAtTime.getDayOfYear());
        System.out.println("godzina:"+dateAtTime.getHour());
        System.out.println("minuta:"+dateAtTime.getMinute());

        System.out.println("--------");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        System.out.println(now.format(formatter1));
    }
}
