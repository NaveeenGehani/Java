package LABS.Lab_02;

public class clock_07 {
    public static void main(String[] args) {
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 60; j++){
                String time = String.format("%02d:%02d", i, j);
                System.out.println(time);
            }
        }
    }
}
