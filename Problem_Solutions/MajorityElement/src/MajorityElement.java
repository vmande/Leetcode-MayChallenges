import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

  public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length/2];
  }
}
