package com.epam.training.student_mihail_belyuk.main_task;

import java.util.Scanner;

public class RandomInput {
  private int[] intArray;

  public static void main(String[] args) {
    RandomInput task3 = new RandomInput();
    System.out.println("Set random number count: ");
    task3.createRandomNumbers();
    task3.showInputNumbersInOneLine();
    System.out.print("\n");
    task3.showEachNumberOnNewLine();
  }

  public void createRandomNumbers() {
    Scanner scanner = new Scanner(System.in);
    int numberCount = scanner.nextInt();
    intArray = new int[numberCount];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = (int) (Math.random() * 100);
    }
    scanner.close();
  }

  public void showEachNumberOnNewLine() {
    for (int integer : intArray) {
      System.out.println(integer);
    }
  }

  public void showInputNumbersInOneLine() {
    for (int integer : intArray) {
      System.out.print(integer + " ");
    }
  }
}
