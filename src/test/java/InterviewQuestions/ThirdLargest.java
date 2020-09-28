package InterviewQuestions;

public class ThirdLargest {

  public static void main(String[] args) {
    int a[] = {3,2,1};
    System.out.println(thirdLargest(a));
  }

  public static int thirdLargest(int[] a){
      Integer first =null;
      Integer second = null;
      Integer third = null;

      for(Integer num : a){
        if(num.equals(first) || num.equals(second) || num.equals(third)){
          continue;
        }
        if(first==null || num>first){
          third = second;
          second = first;
          first = num;
        }
        else if(second==null || num>second){
          third = second;
          second = num;
        }
        else if(third==null || num>third){
          third = num;
        }
      }

      if(third == null){
        return first;
      }
      return third;
  }

}
