package InterviewQuestions.Arrays;

public class MergeTwoArrays {

  public static void main(String[] args) {
    int[] arr1 = {1,3,5,7,9};
    int[] arr2 = {2,4,8,10,11,12,16};

    int[] res = merge(arr1,arr2);
    for(int num : res){
      System.out.print(num + " ");
    }
  }

  public static int[] merge(int[] arr1,int[] arr2){
    int a = arr1.length;
    int b = arr2.length;
    int i=0,j=0,k =0;

    int[] res = new int[a+b];

    while(i<a && j<b){

      if(arr1[i]<arr2[j]){
        res[k] = arr1[i];
        i++;
        k++;
      }else{
        res[k] = arr2[j];
        j++;k++;
      }
    }

    while(i<a){
      res[k++] = arr1[i++];
    }
    while (j<b){
      res[k++] = arr2[j++];
    }

    return res;
  }
}
