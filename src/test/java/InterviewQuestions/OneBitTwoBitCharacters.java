package InterviewQuestions;

public class OneBitTwoBitCharacters {

  public static void main(String[] args) {
    OneBitTwoBitCharacters characters = new OneBitTwoBitCharacters();
    int[] nums = {1, 0, 0};
    characters.isOneBitCharacter(nums);
  }

  public boolean isOneBitCharacter(int[] bits) {
    int i = 0;
    while (i < bits.length - 1) {
      i += bits[i] + 1;
    }
    return i == bits.length - 1;
  }

}
