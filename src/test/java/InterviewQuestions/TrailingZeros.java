package InterviewQuestions;

public class TrailingZeros {

  public static void main(String[] args) {
    int zeros = trailingZeros2(30);
    System.out.println(zeros);
  }

  public static int trailingZeros(int n){
    int zeros =0;
    double fact =1;
    if(n==0){
      fact = 1;
    }
    else{
      for(int i=n;i>0;i--){
        fact = fact * i;
      }
    }

    while(fact%10==0){
      fact = fact/10;
      zeros = zeros+1;
    }
    return zeros;
  }


  public static int trailingZeros2(int n){
    int count = 0;
    while (n != 0)
    {
      count += n / 5;
      n /= 5;
    }
    return count;
  }
}
