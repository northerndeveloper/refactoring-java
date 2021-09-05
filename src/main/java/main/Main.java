package main;

import entity.Customer;
import entity.MovieRental;
import service.RentalService;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        //TODO /n / t vs bunlari silmeye calis ya da bunun yerine baska bir sey kullanmaya calis
        String expected = "Rental Record for C. U. Stomer\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";

        String result = new RentalService().createRentalStatement(new Customer("C. U. Stomer", Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1))));

        if (!result.equals(expected)) {
            throw new AssertionError("Expected: " + System.lineSeparator() + String.format(expected) + System.lineSeparator() + System.lineSeparator() + "Got: " + System.lineSeparator() + result);
        }

        System.out.println("Success");
    }

}