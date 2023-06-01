import java.util.ArrayList;
import java.util.List;

public class Task1 {

  public static void main(String[] args) {  // O(n)
    List<Integer> numbers = new ArrayList<>();  // O(n)
    int amount = getRandomInteger(15, 5); // O(1)
    for (int i = 0; i < amount; ++i) {  // O(n)
      numbers.add(getRandomInteger(100, 1)); // O(1)
    }
    System.out.println(numbers);  // O(n)
    System.out.println(getIndexToSmallestEvenNumber(numbers));  // O(n)
  }

  public static int getRandomInteger(int maximum, int minimum) {  // O(1)
    return ((int) (Math.random() * (maximum - minimum))) + minimum; // O(1)
  }

  public static int getIndexToSmallestEvenNumber(List<Integer> list) {  // O(n)
    int iTemp = 0;
    boolean values = false;
    for (int i = 0; i < list.size(); ++i) { // O(n)
      if (list.get(i) == 2) { // O(1)
        return i;
      }
      if (list.get(i) <= list.get(iTemp) & list.get(i) % 2 == 0) { // O(1)
        values = true;
        iTemp = i;
      }
    }
    return values ? iTemp : -1;
  }
}
