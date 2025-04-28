
public class task_07 {
    public static void main(String[] args) {
            int [][] mat1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12},
            {13,14,15}
        };
        int [][] mat2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12},
            {13,14,15}
        };
        boolean isEqual = equalityCheck(mat1, mat2);
        if(isEqual){
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }
        // Method for checking equality of matrices
        public static boolean equalityCheck(int [][] x, int [][] y){
            for(int i = 0; i < x.length; i++){
                for(int j = 0; j < x[i].length; j++){
                if(x[i][j] != y[i][j]){
                    return false;
                } 
            }
        }
        return true;
    }
}