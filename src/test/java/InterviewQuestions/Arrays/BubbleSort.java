package InterviewQuestions.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] a = {5,3,1,6,7,2,4,8};
    a = sort(a);
    for(int num : a){
      System.out.print(num + " ");
    }
  }

  public static int[] sort(int[] a){

    int n = a.length;
    for(int i =0;i<n;i++){
      for(int j =0; j<n-1;j++){
        if(a[j]>a[j+1]){
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
    return a;
  }
}
