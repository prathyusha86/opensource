import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int assign=sc.nextInt();
        int eachmin=sc.nextInt();
        int days=sc.nextInt();
        if(assign*eachmin<=days*1440) System.out.println("YES");
        else System.out.println("NO");
        
    }
}
