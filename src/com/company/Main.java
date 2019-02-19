package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static private int specialProblemSearch(int k, int[] arr) {

        int pageNum =1;
        int specialProb=0;
        for(int x:arr)
        {

            for(int i =1; i<=x;i++)
            {
                if(i==pageNum)
                    specialProb++;
                if(i%k==0 && i!=x)
                    pageNum++;
            }
            pageNum++;
        }

        return specialProb;

    }


    public static void main(String[] args) throws IOException {


        try (Scanner scanner = new Scanner(new FileReader("tests.txt"))) {


            int chapters = scanner.nextInt();
            int problemPerPage = scanner.nextInt();

            int [] problemPerChapter = new int[chapters];
            for(int i =0; i<chapters; i++)
            {
                problemPerChapter[i]= scanner.nextInt();
            }

            System.out.println(specialProblemSearch(problemPerPage, problemPerChapter));
        }
    }

}
