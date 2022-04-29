package com.fzf.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author
 * @Data:2022/4/27 20:38
 * @description:some description
 * @Function:
 */

public class AlgorithmTest {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int kk[]=new int[nums.length];
        AlgorithmTest algorithmTest=new AlgorithmTest();
        kk=algorithmTest.moveZeroes(nums);
        for (int tmp:kk
             ) {
            System.out.print(tmp+" ");
        }
    }

    /**
     * 二分法查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchBynary(int[] nums, int target) {
        //        AlgorithmTest test=new AlgorithmTest();
//        int[] nums={-1,0,3,5,9,12};
//        int target=9;
//
//        System.out.println(test.searchBynary(nums,target));
        /****************上面是mian里面的***************/
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 运用Arrays.sort()排序
     *
     * @param nums
     * @return
     */
    public int[] orderedArraySquare(int[] nums) {
        int tmp = 0;
        int k[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        k = nums;
        Arrays.sort(k);
        return k;
    }

    /**
     * 双指针排序,左右两边同时移动
     *
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        //        int[] nums = {-4, -1, 0, 3, 10};
//        AlgorithmTest algorithmTest = new AlgorithmTest();
//        int k[] = algorithmTest.orderedArraySquare(nums);
//        //int k[]=algorithmTest.sortedSquares(nums);
//        for (int num : k) {
//            System.out.print(num + " ");
//        }
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return ans;
    }

    /**
     * 轮转数组
     *减少空间复杂度的方法是用一个temp代替数组
     * @param nums
     * @return
     */
    public int[] doublePointer1(int[] nums, int k) {
//        int[] nums={1,2,3,4,5,6,7};
//        int k=3;
//        int kk[]=new int[nums.length];
//        AlgorithmTest algorithmTest=new AlgorithmTest();
//        kk=algorithmTest.doublePointer1(nums,k);
//        for (int tmp:kk
//        ) {
//            System.out.print(tmp+" ");
//        }

        int n = nums.length;
        int[] nums2=new int[n];
        if (k % n == 0) {
            return nums;
        } else {
            for (int i = 0; i < n; i++) {
                nums2[(k+i)%n]=nums[i];
            }
            return nums2;
        }
    }

    public int[] moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        for (int i = 0; i <n-1; i++) {
            if(nums[i]==0){
                k++;
                nums[i]=nums[i+1];
                nums[i+1]=0;
            }
        }
        for (int i = 0; i < k; i++) {
            nums[n-i-1]=0;
        }
        return nums;
    }
}
