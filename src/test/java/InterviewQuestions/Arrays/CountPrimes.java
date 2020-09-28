package InterviewQuestions.Arrays;

public class CountPrimes {

  public static void main(String[] args) {
    count(10);
  }

  public static int count(int n){
    if(n<2) return 0;
    double a = Math.sqrt(n);
    int count = 0;
    boolean[] res = new boolean[n];

    for(int i =2;i<a;i++){
      for(int j = i*i;j<n;j +=i){
        if(j%i==0){
          res[j] = true;
        }
      }
    }

    for(boolean result : res){
      if(result == true){
        count++;
      }
    }
    return n-count-2;
  }
}
