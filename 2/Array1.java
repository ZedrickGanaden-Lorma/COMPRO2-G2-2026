import java.util.Scanner;
public class Array1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int x = 0; x < nums.length; x++){
            System.out.printf("num [%d] : %d%n",x,nums[x]);
        }

        System.out.println("Enter a number and get its index");
        int number = input.nextInt();
        for(int x = 0; x < nums.length; x++){
            if(number == nums[x]){
                System.out.printf("The index of %d in nums[] is %d%n",number,x);
                break;
            }
            if(x == (nums.length - 1)){
                System.out.println("Could not find number in nums[]");
            }
        }
        input.close();
    }
}