public class Reversed {
    public static void main(String[] args){
        int num = 1234, reversed = 0;
        System.out.println("The original number = " +num);

        //run loop until num becomes 0
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            //remove the last digit from num
            num /= 10;
        }
        System.out.println("Reversed num : " +reversed);
    }
}
