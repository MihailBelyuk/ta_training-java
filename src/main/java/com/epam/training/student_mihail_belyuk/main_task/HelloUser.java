package com.epam.training.student_mihail_belyuk.main_task;

import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Hello " + name + "!");
    scanner.close();
  }
}
