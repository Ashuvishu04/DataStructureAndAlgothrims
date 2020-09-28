package InterviewQuestions.Arrays;

public class ArrayMultiplication {

  public static void main(String[] args) {
    int a[][]={{1,1,1},{2,2,2},{3,3,3}};
    int b[][]={{1,1,1},{2,2,2},{3,3,3}};
    int[][] c = multiply(a,b);
    printMatrix(c);
  }

  static int[][] multiply(int[][] a,int[][] b){
    int[][] c = new int[a.length][b[0].length];
    int sum = 0;
    int l1 = a.length;
    int l2 = b[0].length;
    int l3 = b.length;
    for(int i=0;i<l1;i++){
      for(int j=0;j<l2;j++){
        for(int k=0;k<l3;k++){
            sum = sum + a[i][k]*b[k][j];
        }
        c[i][j] = sum;
        sum = 0;
      }
    }
    return c;
  }

  static void printMatrix(int[][] matrix){
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
