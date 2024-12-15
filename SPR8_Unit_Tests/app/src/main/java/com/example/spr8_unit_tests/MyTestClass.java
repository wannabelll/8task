package com.example.spr8_unit_tests;
public class MyTestClass {

    public int findMinValue(char[] array){
        if (array==null) return -1;
        char min=array[0];
        for(char elem: array){
            if(elem<min&&elem>0){
                min=elem;
            }
        }
        return min;
    }

    public int calcSUmOfNegatives(int[] array){
        int sum = 0;

        for (int num : array) {
            if (num < 0) {
                sum += num;
            }
        }

        return sum;
    }

  public int fibonacci(int number)
    {
        if (number == 0)
            return 0;
        if (number == 1)
            return 1;
        return fibonacci(number-1) + fibonacci(number-2);
    }

    public double calculateCurrent(double voltage, double resistance) {
        if (resistance == 0.0) {
            System.out.println("Cannot divide by zero.");
            return voltage+resistance;
        }
        return voltage / resistance;
    }


}
