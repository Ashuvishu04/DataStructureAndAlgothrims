package InterviewQuestions.Arrays;

public class ArrayRotation {

  public static void main(String[] args) {
    char[] ch = {'a','b','c','d','e','f','g'};
    rotate(ch,2);
  }

  private static char[] rotate(char[] array, int rotateIndex) {
    int arr1 = array.length - rotateIndex;

    reverseArray(array,0,arr1-1);
    reverseArray(array,arr1,array.length-1);

    array = reverseArray(array,0,array.length-1);
    return array;
  }

  public static char[] reverseArray(char[] arr,int start,int end){
    int i = start;
    int j = end;

    while(i<j){
      char temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }

    return arr;
  }

}
