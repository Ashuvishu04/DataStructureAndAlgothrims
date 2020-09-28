package InterviewQuestions.Arrays;

public class PrintMatrixDiagonally {

  public static void main(String[] args) {
    int[][] arr = new int[4][3];
    arr[0][0]= 1;
    arr[0][1]= 2;
    arr[0][2]= 3;

    arr[1][0]= 5;
    arr[1][1]= 6;
    arr[1][2]= 7;

    arr[2][0]= 9;
    arr[2][1]= 10;
    arr[2][2]= 11;

    arr[3][0]= 13;
    arr[3][1]= 14;
    arr[3][2]= 15;

    print(arr);
  }

  public static void print(int[][] arr){
    int m = arr.length;
    int n = arr[0].length;
    for(int i =0;i<m;i++){
        int a = i;
        int b = 0;
        while (a>=0){
          System.out.print(arr[a][b]);
          a = a - 1;
          b = b + 1;
        }
        System.out.println();
    }

    for(int i =1;i<n;i++){
      int a = m - 1;
      int b = i;
      while(b<=n-1){
        System.out.print(arr[a][b]);
        a = a - 1;
        b = b + 1;
      }
      System.out.println();
    }

    System.out.println("mm");

  }
}
