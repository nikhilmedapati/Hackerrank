import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int primarydiagsum = 0,secondarydiagsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp = sc.nextInt();
                if(i==j)
                    primarydiagsum+=temp;
                if(i+j==n-1)
                    secondarydiagsum+=temp;
            }
        }
        int diff = primarydiagsum-secondarydiagsum;
        if(diff<0)
            System.out.println(diff*-1);
        else
            System.out.println(diff);
    }
}
