package ru.ogrezem.firstTvarTask;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 *
 *
 */
public class App {

  public static void main(String[] args) {
    int taskResult = doTask(readN());
    System.out.printf("Task result: %d%n", taskResult);
  }

  private static int readN() {
    var scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Write the n value. It must be integer number: ");
      try {
        return scanner.nextInt();
      } catch(NoSuchElementException ex) {
        System.err.println("Error. N can be only integer number.");
        scanner.nextLine();
        continue;
      } catch(Exception ex) {
        ex.printStackTrace();
        System.exit(1);
      }
    }
  }

  private static int doTask(int n) {
    if (n < 5) {
      return 1;
    }
    for (int k = 2;; k++) {
      int fivePowK = 1;
      for (int i = 0; i < k; i++) {
        fivePowK *= 5;
      }
      if (fivePowK > n) {
        return k;
      }
    }
  }
}
