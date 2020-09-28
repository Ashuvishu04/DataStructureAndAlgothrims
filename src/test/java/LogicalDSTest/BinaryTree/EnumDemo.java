package LogicalDSTest.BinaryTree;

import java.io.*;
    import java.util.*;
public class EnumDemo {

  public static void main(String[] args) {
    int codeFromDB = 10003;
    EmpCode code = EmpCode.getEnum(codeFromDB);
    System.out.println(code);


  }


  // complete the enum definition
  public enum EmpCode {

    ASSOCIATE(10001),
    SENIOR_ASSOCIATE(10002),
    MANAGER(10003),
    SENIOR_MANAGER(10004);

    EmpCode(int code) {
      this.code = code;
    }

    private int code;

    public int getCode() {
      return code;
    }


    // also implement this method properly
    public static EmpCode getEnum(int code) {
      EmpCode eCode = null;
      //EmpCode empCode = Arrays.stream(EmpCode.values()).filter(m -> Integer.valueOf(m.getCode()) == code).findFirst().get();
      for(EmpCode empCode : EmpCode.values()){
        if(Integer.valueOf(empCode.getCode()) == code){
          eCode =  empCode;
        }
      }
      return eCode;
    }

  }
}

