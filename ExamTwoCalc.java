import java.lang.reflect.Array;
import java.util.Arrays;

public class ExamTwoCalc {
	public static void main(String[] args) {

		int[]nums = {12, 11, 10, 10, 8, 7};
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				nums[i + 1]++;
			}
		}
		System.out.print(Arrays.toString(nums));
	}
}
