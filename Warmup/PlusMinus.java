import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float positive = 0;
        float negative = 0;
        float zero = 0;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(temp<0)
                negative++;
            else if(temp>0)
                positive++;
            else
                zero++;
        }
        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(zero/n);
    }
}
