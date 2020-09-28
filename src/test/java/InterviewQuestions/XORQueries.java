package InterviewQuestions;

public class XORQueries {

  public static void main(String[] args) {
    XORQueries xorQueries = new XORQueries();
    int[] arr = {16};
    int[][] queries = {{0,0},{0,0},{0,0}};
    xorQueries.xorQueries(arr, queries);
  }

  public int[] xorQueries(int[] arr, int[][] queries) {
    int[] ans = new int[queries.length];
    int j = 0;
    for(int i =0;i<queries.length;i++){
      int l = queries[i][0];
      int r = queries[i][1];
      int res = 0;
      while(l<=r){
        res = res^arr[l];
        l++;
      }
      ans[j] = res;
      j++;
    }
    return ans;
  }

}
