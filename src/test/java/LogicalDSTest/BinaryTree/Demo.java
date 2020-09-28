package LogicalDSTest.BinaryTree;
import java.io.*;

class Result {

  /*
   * Complete the 'maxMoves' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. STRING s
   *  2. STRING t
   */

  public static int maxMoves(String s, String t) {
    // Write your code here
    int leftCount =0;
    int rightCount = 0;
    StringBuilder sb = new StringBuilder(s);
    String reversedString = sb.reverse().toString();

    while(true){
      if(s.contains(t)){
        s = s.replace(t, "");
      }
      else{
        break;
      }
      ++leftCount;
    }

    while(true){
      if(reversedString.contains(t)){
        s = s.replace(t, "");
      }
      else{
        break;
      }
      ++rightCount;
    }
    if(rightCount >leftCount)
      return rightCount;
    else if (leftCount >rightCount)
      return leftCount;
    else
      return leftCount;
  }
}

public class Demo {
  public static void main(String[] args) throws IOException {

    int result = Result.maxMoves("aabb", "ab");

   System.out.println(result);
  }
}

