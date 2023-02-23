/*
Author: 
Date: 

Description: 
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Exercise20_21 {
  public static void main(String[] args) {

    System.out.println("List 1");

    GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
        new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
        new Circle(6.5), new Rectangle(4, 5)};
    selectionSort(list, new GeometricObjectComparator());
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i].getArea() + " ");

    System.out.println("\n\nList 2");

    Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
      new Circle(5), new Circle(6), new Circle(1), new Circle(2),
      new Circle(3), new Circle(14), new Circle(12)};
    selectionSort(list1, new GeometricObjectComparator());
    for (int i = 0; i < list1.length; i++)
      System.out.print(list1[i].getArea() + " ");
  }

  public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
    Arrays.sort(list, comparator);
  }
}










