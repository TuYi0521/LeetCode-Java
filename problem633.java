import java.util.Scanner;

public class problem633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean flag = judgeSquareSum(input);
        System.out.println("flag: "+flag);
    }

    public static boolean judgeSquareSum(int c){
        int i = 0, j = (int) Math.sqrt(c);
        while (i<=j){
            int powSum = i*i+j*j;
            if (powSum == c){
                return true;
            }else if (powSum>c){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
