package lesson5;

public class Hwfrom4 {
    public static void minFrom4Num(int a, int b, int c, int d){
        if (a <= b && a <= c && a <= d) {
            System.out.println(a);
        } else if (b <= a && b <= c && b <= d) {
            System.out.println(b);
        } else if (c <= a && c <= b && c <= d) {
            System.out.println(c);
        } else System.out.println(d);;
    }
    public static void minFrom4Num(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}
