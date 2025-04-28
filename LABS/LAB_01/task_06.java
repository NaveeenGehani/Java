public class task_06 {
    public static void main(String[] args) {
        int [] nums = {2,1,3,4,5,6,7,8,9,33,44,55,66,105,207,66,77,88,99};
        int sm = nums[0];
        int lr = nums[0];
        for(int i : nums){ 
            if(i < sm){
                sm = i;
            }
            if(i > lr){
                lr = i;
            }
        }
        System.out.println("Smallest integer: " + sm);
        System.out.println("Largest integer: " + lr);
        System.out.println("Difference btw largest and smallest: " +(lr - sm));
    }
}