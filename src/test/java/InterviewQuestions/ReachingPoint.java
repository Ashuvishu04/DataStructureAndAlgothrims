package InterviewQuestions;

public class ReachingPoint {

  public static void main(String[] args) {
    int x1 = 1;
    int y1 = 1;
    int x2 = 2;
    int y2 = 5;
    boolean isReach = reachingPoints(x1,y1,x2,y2);
    System.out.println(isReach);
  }
  
  public static boolean reachingPoints(int x1, int y1, int x2, int y2) {
    while (x1 < x2 && y1 < y2)
      if (x2 < y2) y2 %= x2;
      else x2 %= y2;
    return x1 == x2 && y1 <= y2 && (y2 - y1) % x1 == 0 ||
        y1 == y2 && x1 <= x2 && (x2 - x1) % y1 == 0;
  }

}
