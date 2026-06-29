public class Task6 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5 - row; col++) {
                if (col > 0) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}