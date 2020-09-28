package InterviewQuestions;

public class XOROperation {

  public static void main(String[] args) {
    XOROperation operation = new XOROperation();
    operation.xorOperation(4,3);
  }

  public int xorOperation(int n, int start) {
    int res = start;
    for(int i =1;i<n;i++){
      res = res^(start + 2*i);
    }

    return res;
  }

}
