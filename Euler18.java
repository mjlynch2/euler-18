import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Euler18 {

    public static void main(String[] args) throws Exception {
        File fileToRead = new File("/Users/mikelynch/prime/tier4/java/euler-18/triangle.txt");
        Scanner s = new Scanner(fileToRead);
        int[][] triangle = new int[15][];
        for (int i = 0; i < 15; i++) {
            triangle[i] = new int[i + 1];
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = s.nextInt();
            }
        }

        for (int i = triangle.length - 2; i > -1; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (triangle[i + 1][j] > triangle[i + 1][j + 1]) {
                    triangle[i][j] += triangle[i + 1][j];
                } else {
                    triangle[i][j] += triangle[i + 1][j + 1];
                }
            }
        }

        System.out.println(triangle[0][0]);
    }
}