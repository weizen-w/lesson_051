import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) { // O(n)
    Scanner scanner = new Scanner(System.in); // O(1)
    List<String> words = new ArrayList<>(); // O(n)
    int amount = scanner.nextInt(); // O(1)
    scanner.nextLine(); // O(1)
    int lenght = Integer.MAX_VALUE; // O(1)
    for (int i = 0; i < amount; i++) { // O(n)
      String str = scanner.nextLine(); // O(1)
      words.add(str); // O(1)
      if (str.length() < lenght) { // O(1)
        lenght = str.length(); // O(1)
      }
    }
    for (String str : words) { // O(n)
      if (str.length() == lenght) { // O(1)
        System.out.print(str + " "); // O(1)
      }
    }
  }
}
