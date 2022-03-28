package com.epam.training.student_mihail_belyuk.main_task;

import java.util.Scanner;

public class Month {
  private static final String DIGIT_REGEXP = "\\d+";

  public static void main(String[] args) throws CustomException {
    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();
    scanner.close();
    if (!choice.matches(DIGIT_REGEXP)) {
      throw new CustomException("Input should be digit.");
    } else {
      switch (choice) {
        case "1":
          System.out.println("January");
          break;
        case "2":
          System.out.println("February");
          break;
        case "3":
          System.out.println("March");
          break;
        case "4":
          System.out.println("April");
          break;
        case "5":
          System.out.println("May");
          break;
        case "6":
          System.out.println("June");
          break;
        case "7":
          System.out.println("July");
          break;
        case "8":
          System.out.println("August");
          break;
        case "9":
          System.out.println("September");
          break;
        case "10":
          System.out.println("October");
          break;
        case "11":
          System.out.println("November");
          break;
        case "12":
          System.out.println("December");
          break;
        default:
          System.out.println("There is no such month.");
      }
    }
  }
}
