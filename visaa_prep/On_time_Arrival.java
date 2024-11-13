import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            if(value>=30){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        
    }
}
