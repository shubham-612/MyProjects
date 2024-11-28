package ArrayPractice;

public class MajorityElement {
    public static void main(String[] args) {
        // Test case where 3 is the majority element
        int[] nums = {3, 3, 4, 2, 4, 4, 3, 3, 3, 4, 4};

        int candidate = findMajorityElement(nums);
        System.out.println("Majority Element: " + candidate); // Expected output: 3
    }

    public static int findMajorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;

        // Phase 1: Find the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is indeed the majority element
        return (count > nums.length / 2) ? candidate : -1;
    }
}


