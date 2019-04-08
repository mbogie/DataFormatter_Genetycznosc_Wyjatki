package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj liczbe:");
//

//          sprawdzanie czy wprowadzone dane to liczba
//        String input = sc.nextLine();
//        try {
//            int cyfra = Integer.valueOf(input);
//        } catch (NumberFormatException ex){ //ex - tworzenie obiekt wyjatku
//            System.out.println("Wprowadziles niewlasciwe dane. Podaj liczbe!!");
//            System.out.println(ex.getMessage());
//            ex.printStackTrace(); //wyswietla stos wywolan, ulatwia wynajdywanie bledow
//        }

//        try {
//            int liczba = sc.nextInt();
//        }catch(InputMismatchException ex){
//            System.out.println("Wprowadziles niewlasciwe dane. Podaj liczbe!!");
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj zwierzaka:");
        String animalName = sc.nextLine();
        animalName = animalName.toUpperCase();
        Animal animal = null;

        try{
            animal = Animal.valueOf(animalName);
            System.out.println(animal.getPolishTranslation());
        }catch(IllegalArgumentException ex){
            System.out.println("brak zwierzecia");
            ex.printStackTrace();
            throw new UnknownAnimalException();  // rzucanie wlasnego wyjatu
        }


    }
}