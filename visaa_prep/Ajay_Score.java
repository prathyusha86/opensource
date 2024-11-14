import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int m=sc.nextInt();
            System.out.println(m*(x/10));
        }
        
    }
}
