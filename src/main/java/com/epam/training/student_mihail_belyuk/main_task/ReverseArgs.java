package com.epam.training.student_mihail_belyuk.main_task;

import java.util.Scanner;

public class ReverseArgs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String arguments = scanner.nextLine();
    StringBuilder reversedArguments = new StringBuilder(arguments).reverse();
    System.out.println(reversedArguments);
    scanner.close();
  }
}
