package cn.shiki.user.controller;

import java.util.Arrays;

/**
 * @Author: shiki
 * @Date: 2019/06/11 22:44
 */
public class UserControllerTest {

    public static void main(String[] args) {
        int[] ints = new int[]{1,1,2,2,5,5,7};
        int i = removeDuplicates(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(i);
    }

    private static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int flag = 0;
        for (int i = 0; i < len; i++) {
            if (i == len - 1) break;
            if ((nums[i] ^ nums[i + 1]) != 0) {
                flag--;
                nums[i + 1] = nums[flag] ^ nums[i + 1];
                nums[flag] = nums[flag] ^ nums[i + 1];
                nums[i + 1] = nums[flag] ^ nums[i + 1];
            }
        }
        return len-flag;
    }
}
