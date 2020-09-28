package InterviewQuestions;

public class SpiralMatrix {

  public static void main(String[] args) {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    spiralMatrix.generateMatrix(5);
  }

  public int[][] generateMatrix(int n) {
    int[][] ans = new int[n][n];
    int ele = 1;
    int r1 = 0,r2 =n-1,c1=0,c2=n-1;

    while(r1<=r2 && c1<=c2 && ele!=(n*n)-1){

      for(int i = c1;i<=c2;i++){
        ans[r1][i] = ele;
        ele++;
      }

      for(int i = r1 +1;i<=r2;i++){
        ans[i][c2] = ele;
        ele++;
      }

      if(r1<r2 && c1<c2){
        for(int i = c2-1;i>c1;i--){
          ans[r2][i] = ele;
          ele++;
        }

        for(int i = r2;i>r1;i--){
          ans[i][c1] = ele;
          ele++;
        }
      }

      r1++;
      c2--;
      r2--;
      c1++;
    }

    return ans;
  }

}
