package ArrayPractice;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2,5};

        HashSet<Integer> h = new HashSet<>();
        for (int num : nums) {
            h.add(num);
        }

        int ls = 0;

        for (int num : h) {
            if (!h.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;


                while (h.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                ls = Math.max(ls, currentStreak);
            }
        }

        System.out.println("Length of the longest consecutive sequence: " + ls); // Output: 4
    }
}

