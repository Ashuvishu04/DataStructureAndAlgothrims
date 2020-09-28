package InterviewQuestions;

public class BinaryToHexadecimal {

  public static void main(String[] args) {
    System.out.println(convertBinaryToHexadecimal("100110"));
    System.out.println(binaryToDecimal(100110));
  }

  public static String convertBinaryToHexadecimal(String number) {
    String hexa = "";
    char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
        'b', 'c', 'd', 'e', 'f' };
    if (number != null && !number.isEmpty()) {
      int decimal = convertBinaryToDecimal(number);
      while (decimal > 0) {
        hexa = hex[decimal % 16] + hexa;
        decimal /= 16;
      }
      System.out.println("The hexa decimal number is: " + hexa);
    }

    return hexa;
  }

  public static int convertBinaryToDecimal(String number) {
    int length = number.length() - 1;
    int decimal = 0;
    if (isBinary(number)) {
      char[] digits = number.toCharArray();
      for (char digit : digits) {
        if (String.valueOf(digit).equals("1")) {
          decimal += Math.pow(2, length);
        }
        --length;
      }
      System.out.println("The decimal number is : " + decimal);
    }
    return decimal;
  }

  public static boolean isBinary(String number) {

    boolean isBinary = false;

    if (number != null && !number.isEmpty()) {
      long num = Long.parseLong(number);
      while (num > 0) {
        if (num % 10 <= 1) {
          isBinary = true;
        } else {
          isBinary = false;
          break;
        }
        num /= 10;
      }
    }

    return isBinary;
  }

  static int binaryToDecimal(int n)
  {
    int dec_value = 0;

    // Initializing base
    // value to 1, i.e 2^0
    int base = 1;

    while ( n> 0) {
      int last_digit = n % 10;
      n = n / 10;

      dec_value += last_digit * base;

      base = base * 2;
    }

    return dec_value;
  }
}
