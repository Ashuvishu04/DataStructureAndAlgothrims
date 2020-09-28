package InterviewQuestions;

public class ShiftedArraySearch {

  public static void main(String[] args) {
    int[] a = {9,12,17,2,4,5};
    int pivot = findPivot(a);
    int target = 12;
    if(pivot==0 || target<a[0]){
    System.out.println(findNumber(a,pivot,a.length-1,target));}
    else{ System.out.println(findNumber(a,0,pivot-1,target));}
    }

  public static int findNumber(int[] a,int start,int end,int target){
    while(start<=end){
      int mid = end-start/2;
      if(a[mid]==target){
        return mid;
      }
      if(a[mid]<target){
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
    return -1;
  }

  public static int findPivot(int[] a){
    int start=0;
    int end=a.length-1;

    while(start<=end){
      int mid = end-start/2;
      if(a[mid]>a[0]){
        start = mid + 1;
      }
      else if(mid == 0 || a[mid]<a[mid-1]){
        return mid;
      }
      else{
        end = mid - 1;
      }
    }
    return 0;
  }
}
