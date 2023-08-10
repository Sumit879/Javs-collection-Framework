import java.util.Arrays;

public class LearnArraysClasss {
    public static void main(String[] args) {
        int nums[] =  {1,2,3,4,5,11,7,8,9,10};
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums,4);
        System.out.println(index);
        for(int i : nums){
            System.out.print(i+" ");
        }
        Arrays.fill(nums,12);
        for(int i : nums){
            System.out.print(i+" ");
        }

    }
}
