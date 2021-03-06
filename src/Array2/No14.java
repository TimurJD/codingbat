package Array2;

/*Учитывая массив ints, верните true, если он не содержит 1 или он не содержит 4.
        no14 ([1, 2, 3]) → true
        no14 ([1, 2, 3, 4]) → false
        no14 ([2, 3, 4]) → true*/

public class No14 {
    public boolean no14(int[] nums) {
        boolean a = false;
        boolean b = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                a = true;
            }
            if (nums[i] == 1) {
                b = true;
            }
        }
        return !a || !b;
    }

    public static void main(String[] args) {
        No14 no = new No14();
        int[] nums = {1, 2, 3, 4};
        System.out.println(no.no14(nums));
    }
}
