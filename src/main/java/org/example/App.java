package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        boolean isPrime = check_prime(6);
        ArrayList<Integer> result = task_5(12);
    }

    /**
     * Task 1
     */
    public static  ArrayList<Integer> task_1(ArrayList<Integer> a)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Integer ptu1 = a.get(0);
        arr.add(ptu1);
        for (int i = 1; i < a.size(); i++) {
            if ((arr.contains(a.get(i))) == false) {
                arr.add(a.get(i));
            } else {
                arr.remove(a.get(i));
            }
        }
        return arr;
    }

    /**
     * Task 2
     */
    public int task_2(ArrayList<Integer> a)
    {
        ArrayList<Integer> arr = task_1(a);;
        return a.size() - arr.size();
    }

    /**
     * Task 3
     */
    public ArrayList<Integer> task_3(int n)
    {

        if (n < 0) {
            return null;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int check = 0;
        int i = 0;
        while (check < n) {
            if (check_prime(i) == true) {
                check += 1;
                result.add(i);
            }
            i += 1;
        }
        return result;
    }

    /**
     * Task 4
     */
    public int task_4(int number) {
        String str = String.valueOf(number);
        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            String value = String.valueOf(str.charAt(i));
            sum += Integer.parseInt(value);
        }
        return sum;
    }

    /**
     * Task 5
     */
    public static ArrayList<Integer> task_5(int n) {
        int i = 2;
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }

    /**
     * Task 6
     */
    public ArrayList<Integer> task_6(int n)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        for (int i = 2; i < n; i++) {
            int ai = arr.get(i -1) + arr.get(i - 2);
            if (ai < n) {
                arr.add(ai);
            } else {
                break;
            }
        }
        return  arr;
    }

    /**
     * Check prime
     */
    private static boolean check_prime(int n) {
        int i, m=0;
        m=n/2;
        if(n==0||n==1){

            return false;
        } else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
