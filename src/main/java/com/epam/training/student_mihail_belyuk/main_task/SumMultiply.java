package com.epam.training.student_mihail_belyuk.main_task;

import java.util.Scanner;

public class SumMultiply {
  private int[] inputNumberArray;

  public static void main(String[] args) {
    SumMultiply task4 = new SumMultiply();
    task4.retrieveConsoleInfo();
    task4.countMultiplication();
    task4.countSum();
  }

  public void retrieveConsoleInfo() {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] numbers = input.strip().split(" ");
    inputNumberArray = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      inputNumberArray[i] = Integer.parseInt(numbers[i]);
    }
    scanner.close();
  }

  public void countSum() {
    int result = 0;
    for (int j : inputNumberArray) {
      result += j;
    }
    System.out.println(result);
  }

  public void countMultiplication() {
    int result = 1;
    for (int j : inputNumberArray) {
      result *= j;
    }
    System.out.println(result);
  }
}
