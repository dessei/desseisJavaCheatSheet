package basics;

import java.util.Arrays;
import java.util.Random;

public class arrays {
    public static void array_example() {
        int[] nums = {1,3,2,4};  //reference data type -> not passed by value(s)
        int numofnums = nums.length;
        System.out.println(nums[3]-nums[0]);
        //praktisch: for each loops -> siehe control flow
        Arrays.sort(nums);

        //unclear size
        int size = 5; //oder irgendwas @ runtime
        int[] myArray = new int[size];


        //2D arrays
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        //of objects
        Random[] randoms = new Random[4];
        Random r = new Random();
        Random r2 = new Random();
        Random[] randoms2 =  {r, r2};
    }
}
