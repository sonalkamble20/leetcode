package Patterns;
//*
//**
//***
//****
//*****

public class PatternPrint1To5 {
    public static void main(String[] args) {
        for(int row = 0; row < 6; row++) {
            for (int col = 0; col < row; col++)
                System.out.print("*");
            System.out.println("\n");
        }
    }
}
