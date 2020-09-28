package InterviewQuestions.Arrays;

public class BinarySearch {

  public static void main(String[] args) {
    int[] a = {2,5,7,11,12,15,20,30,34,36};
    int index = search(a,34);
    System.out.println(index);
  }

  public static int search(int[] arr,int element){
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;

    while (start<end){
      mid = (start + end)/2;

      if(arr[mid] <element){
        start = mid + 1;
      }else if (arr[mid] > element){
        end = mid - 1;
      }else{
        break;
      }

    }
    return mid;
  }
}
