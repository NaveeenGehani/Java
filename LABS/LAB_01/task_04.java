package LABS.LAB_01;

public class task_04 {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2}, {3,4}};
        int [][] mat2 = {{5,6}, {7,8}};
        int [][] sum = {{0,0}, {0,0}};

        for(int i = 0; i < sum.length; i++){
            for(int j = 0; j < sum[i].length;j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
