/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

*/

package InterviewQuestions;

public class HammingDistance {

  static int hammingDistance(int n1, int n2)
  {
    int x = n1 ^ n2;
    int setBits = 0;

    while (x > 0)
    {
      setBits += x & 1;
      x >>= 1;
    }

    return setBits;
  }

  // Driver code
  public static void main(String[] args)
  {
    int n1 = 9, n2 = 14;
    System.out.println(hammingDistance(n1, n2));
  }

}
