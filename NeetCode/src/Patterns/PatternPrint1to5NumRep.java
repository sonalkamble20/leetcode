package Patterns;
//1
//22
//333
//4444
//55555
public class PatternPrint1to5NumRep {
    public static void main(String[] args) {
        for(int row = 0; row < 6; row++) {
            for (int col = 0; col < row; col++)
                System.out.print(row);
            System.out.println("\n");
        }
    }
}
