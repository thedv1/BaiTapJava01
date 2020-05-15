package org.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App app = new App();

    /**
     * Test task 1
     */
    @Test
    public void task_1()
    {
        //Assume
        ArrayList<Integer> arrInput = new ArrayList<>(Arrays.asList(1,2,3,2,3,4,4,5,6,7,8,9));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,5,6,7,8,9));

        //Action
        ArrayList<Integer> actualList = app.task_1(arrInput);

        //Assertion
        Assert.assertEquals(expected, actualList);
    }

    /**
     * Test task 2
     */
    @Test
    public void task_2()
    {
        //Assume
        ArrayList<Integer> arr =
                new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,4,4,5,6,7,8,9));
        //Action
        int expected = 6;
        int result = app.task_2(arr);

        //Assertion
        Assert.assertEquals(expected, result);
    }

    /**
     * Test task 3
     */
    @Test
    public void task_3()
    {
        //Assume
        int n = 6;
        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(2,3,5,7,11,13));

        //Action
        ArrayList<Integer> actualList = app.task_3(n);

        //Assertion
        Assert.assertEquals(expected, actualList);
    }

    /**
     * Test task 4
     */
    @Test
    public void task_4()
    {
        //Assume
        int n = 3579;
        int expected = 24;

        //Action
        int result = app.task_4(n);

        //Assertion
        Assert.assertEquals(expected, result);
    }

    /**
     * Test task 5
     */
    @Test
    public void task_5()
    {
        //Assume
        int n = 3000;
        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(2,2,2,3,5,5,5));

        //Action
        ArrayList<Integer> actualList = app.task_5(n);

        //Assertion
        Assert.assertEquals(expected, actualList);
    }

    /**
     * Test task 6
     */
    @Test
    public void task_6()
    {
        //Assume
        int n = 100;
        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(1,2,3,5,8,13,21,34,55,89));

        //Action
        ArrayList<Integer> actualList = app.task_6(n);

        //Assertion
        Assert.assertEquals(expected, actualList);
    }
}
