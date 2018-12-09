public class problem167 {
   public static void main(String[] args){
     System.out.println("Hello vscode!");
     int[] numbers = {2,7,11,15};
     int target = 9;
     int[] result = twoSum(numbers, target);
     for(var i = 0; i < result.length; i++) {
       System.out.println(result[i]);
     }
     
   }
   public static int[] twoSum(int[] numbers, int target){
     int i= 0, j=numbers.length-1;
     while(i<j){
       int sum = numbers[i]+numbers[j];
       if(sum == target){
          return new int[] {i+1,j+1};
       }else if (sum<target){
         i++;
       }else{
         j--;
       }
     }
     return null;
   }
 }