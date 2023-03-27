/*
Author: 
Date: 

Description: 
*/
import java.util.*;

public class Exercise23_03 {
  public static void main(String[] args) {
    Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    quickSort(list);
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }

    System.out.println();
    Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
                     new Circle(5), new Circle(6), new Circle(1), new Circle(2),
                     new Circle(3), new Circle(14), new Circle(12)};
    quickSort(list1, new GeometricObjectComparator());
    for (int i = 0; i < list1.length; i++) {
      System.out.println(list1[i] + " ");
    }
  }

  public static <E> void quickSort(E[] array1, GeometricObjectComparator geometricObjectComparator) {
    List<E> list = new ArrayList<>(array1.length);
    list.addAll(Arrays.asList(array1));
    list.sort((Comparator<? super E>) geometricObjectComparator);

    for (int i = 0; i < list.size(); i ++) {
      array1[i] = list.get(i);
    }
  }

  public static <E extends Comparable<E>> void quickSort(E[] array) {
    List<E> list = new ArrayList<>(array.length);
    list.addAll(Arrays.asList(array));
    Collections.sort(list);

    for (int i = 0; i < list.size(); i ++) {
      array[i] = list.get(i);
    }

  }
}