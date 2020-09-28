package InterviewQuestions.Arrays;

public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] a = {1,2,2,3,3,3,4,4,5};
    eliminateDuplicates(a);
  }

  public static void eliminateDuplicates(int[] a){

    int j=0;
    int n = a.length;
    for(int i=0;i<n-1;i++){
      if(a[i]!=a[i+1]) {
        a[j] = a[i];
        j++;
      }
    }
    a[j] = a[n-1];

    for(int i =0;i<=j;i++){
      System.out.println(a[i]);
    }
  }
}
