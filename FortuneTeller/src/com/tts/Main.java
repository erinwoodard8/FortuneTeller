package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput ="";
        do {
            System.out.println("What is your first name?");
            String firstName = input.next();

            System.out.println("What is your last name?");
            String lastName = input.next();

            System.out.println("What is your age?");
            int age = input.nextInt();

            System.out.println("What is your birth month? (enter a number. Example: Aug = 8 Oct = 10)");
            int birth = input.nextInt();

            System.out.println("What is your favorite ROYGBIV color? (Enter 'Help' if you don't know what ROYGBIV is)");
            String color = input.next();
            if (color.equals("Help")) {
                System.out.println("red, orange, yellow, green, blue, indigo, violet");
                System.out.println("What is your favorite ROYGBIV color?");
                color = input.next();
            }

            System.out.println("How many siblings do you have?");
            int siblings = input.nextInt();

            String retirement;
            if (age % 2 == 0) {
                retirement = "12 years";
            } else {
                retirement = "14 years";
            }


            String home;

            switch (siblings) {
                case 0:
                    home = "Miami, FL";
                    break;

                case 1:
                    home = "Tokyo, Japan";
                    break;

                case 2:
                    home = "Portland, Oregon";
                    break;

                case 3:
                    home = "Asheville, NC";
                    break;

                default:
                    if (siblings < 0) {
                        home = "Hell";
                    } else {
                        home = "Honolulu, Hawaii";
                    }
            }

            String transport = "";

            switch (color) {
                case "red" -> transport = "Maserati";
                case "orange" -> transport = "horse";
                case "yellow" -> transport = "scooter";
                case "blue" -> transport = "rickshaw";
                case "indigo" -> transport = "jetpack";
                case "violet" -> transport = "flying saucer";
            }

            String bank;

            if (1 >= birth || birth <= 4) {
                bank = "$256,000";
            } else if (5 >= birth || birth <= 8) {
                bank = "$3,475,293";
            } else if (9 >= birth || birth <= 12) {
                bank = "$100";
            } else {
                bank = "$0";
            }
            System.out.println(firstName + " " + lastName + " will retire in " + retirement + " with " + bank + " in the bank, a vacation home in " + home + " , and travel by " + transport + ".");
            System.out.println("Do you want to play again? enter 'yes' or 'no'");
            userInput = input.next();
        } while (!userInput.equals("no"));

        System.out.println("No one likes a quitter...");
    }

    }


