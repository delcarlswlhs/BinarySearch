import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(5);
    numList.add(4);
    numList.add(25);
    numList.add(2);
    numList.add(14);
    numList.add(87);
    numList.add(56);
    System.out.println(numList);
    Collections.sort(numList);
    System.out.println(numList);
    System.out.println("The number 25 was found at " + binarySearch(numList, 25));

  }

  public static int binarySearch(ArrayList<Integer> list, int target) {
    // write the binary search to look for 25
    // find the middle
    // is target less than or greater than middle
    // if less, get rid of middle and elements to right
    // else, get rid of middle and elements to left
    // if element is target, return it, else return -1

    int first = 0;
    int last = list.size() - 1;

    while (first <= last) {
      int mid = (first + last) / 2;

      if (list.get(mid) == target) {
        return mid;
      } else if (list.get(mid) < target) {
        first = mid + 1;
      } else {
        last = mid - 1;
      }
    }
    return -1;

  }
}
