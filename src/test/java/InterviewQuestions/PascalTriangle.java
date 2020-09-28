package InterviewQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

  public static void main(String[] args) {
    List<List<Integer>> l = generate(6);
    System.out.println(l);
  }

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();

    // First base case; if user requests zero rows, they get zero rows.
    if (numRows == 0) {
      return triangle;
    }

    // Second base case; first row is always [1].
    triangle.add(new ArrayList<>());
    triangle.get(0).add(1);

    for (int rowNum = 1; rowNum < numRows; rowNum++) {
      List<Integer> row = new ArrayList<>();
      List<Integer> prevRow = triangle.get(rowNum-1);

      // The first row element is always 1.
      row.add(1);

      // Each triangle element (other than the first and last of each row)
      // is equal to the sum of the elements above-and-to-the-left and
      // above-and-to-the-right.
      for (int j = 1; j < rowNum; j++) {
        row.add(prevRow.get(j-1) + prevRow.get(j));
      }

      // The last row element is always 1.
      row.add(1);

      triangle.add(row);
    }

    return triangle;
  }

  public static List<List<Integer>> generate2(int numRows) {
    List<List<Integer>> l = new LinkedList<>();
    for(int i=0;i<numRows;i++){
      List<Integer> l1  = new LinkedList<>();
      String[] s = String.valueOf(Math.pow(11,i)).replace(".0","").split("");
      for(String s1: s){
        l1.add(Integer.valueOf(s1));
      }
      l.add(l1);
    }
    return l;
  }
}

