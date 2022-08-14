package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        int numb = 1;
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        while(numb != 0)
        {

            numb = scanner.nextInt();

            if(numb == 0) break;
            if(numb > max) {max = numb;}

        }
        return max;
    }

    public static void main(String[] args) {


        // Get a result of your code

        System.out.println(max());
    }
}
