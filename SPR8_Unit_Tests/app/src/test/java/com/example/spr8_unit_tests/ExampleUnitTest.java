package com.example.spr8_unit_tests;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void findMinValue_p(){

        char[] arr = {1,2,3,4,5};
        MyTestClass myTestClass = new MyTestClass();
        int actual = myTestClass.findMinValue(arr);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void findMinValue_n(){

        MyTestClass myTestClass = new MyTestClass();
        int actual = myTestClass.findMinValue(null);
        int expected = -1;
        assertEquals(expected, actual);

    }

    @Test
    public void testCalcSUmOfNegatives_p() {
        int[] array = {-2, -3, -4, -5, -1,8};
        MyTestClass myTestClass = new MyTestClass();
        assertEquals(-15,  myTestClass.calcSUmOfNegatives(array) );
    }


    @Test
    public void testCalcSUmOfNegatives_n() {
        int[] array = {2, 3, 4, 5, 1,-8};
        MyTestClass myTestClass = new MyTestClass();
        assertEquals(-8,  myTestClass.calcSUmOfNegatives(array) );
    }

    @Test
    public void testFibonacci_p() {
        MyTestClass myTestClass = new MyTestClass();
        assertEquals(21, myTestClass.fibonacci(8));
    }
    @Test
    public void testFibonacci_n() {
        MyTestClass myTestClass = new MyTestClass();
        assertEquals(0, myTestClass.fibonacci(0));
    }

    @Test
    public void testCalculateCurrent_p() {
        MyTestClass myTestClass = new MyTestClass();
        assertEquals(9.0, myTestClass.calculateCurrent(45.0, 5.0), 0.0001);
    }


    @Test
    public void testCalculateCurrent_n() {
        MyTestClass myTestClass = new MyTestClass();
        assertEquals(45.0, myTestClass.calculateCurrent(45.0, 0.0), 0.0001);


    }


}