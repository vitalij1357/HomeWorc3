package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumCalculator {

    public int IntSum(int n) {
        int result = 0;
        if (n == 0){
            throw new IllegalArgumentException("Wrong Argument- "+ n);
        }
        for (int i = 1; i <=n ; i++) {
               result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SumCalculator().IntSum(6));
    }
}