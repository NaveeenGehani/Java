
public class task_05 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,43,53,57};
        int isEven = 0;
        int isOdd = 0;
        for(int i : numbers){
            if(i % 2 == 0){
                isEven++;
            }else{
                isOdd++;
            }
        }  
        System.out.println("Total Even Numbers: " + isEven);
        System.out.println("Total Odd Numbers: " + isOdd);
    }
}