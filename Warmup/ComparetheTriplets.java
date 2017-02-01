import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Alice=0,Bob=0;
        int a[] = new int[3];
        int b[] = new int[3];
        for(int i=0;i<3;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<3;i++)
            b[i] = sc.nextInt();
        for(int i=0;i<3;i++){
            if(a[i]>b[i])
                Alice++;
            else if(a[i]<b[i])
                Bob++;
        }
        System.out.println(Alice+" "+Bob);
    }
}

