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
        int valueForN = scanner.nextInt();
        if (valueForN <= 1) {
          System.err.println("Error. N must be more than 1.");
          continue;
        }
        return valueForN;
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
    int k = 1;
    for (int fivePowK = 5; fivePowK <= n; fivePowK *= 5, k++) {}
    return k;
  }
}
