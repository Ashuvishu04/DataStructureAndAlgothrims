package InterviewQuestions;

public class PowerOf2 {

  public static void main(String[] args) {
    System.out.println(isPowerOfTwo2(1));
  }

  public static boolean isPowerOfTwo(int n) {
    if(n==0 || n==1){
      return true;
    }
    for(int i=1;i<n;i++){
      if(Math.pow(2,i) == Double.valueOf(n)){
        return true;
      }
      if(Math.pow(2,i)>Double.valueOf(n)){
        break;
      }
    }
    return false;
  }

  public static boolean isPowerOfTwo2(int n) {
    long i=1;
    while(i<n){
      i *= 2;
    }
    return i==n;
  }
}
