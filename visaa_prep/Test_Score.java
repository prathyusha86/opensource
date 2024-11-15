import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char f=sc.next().charAt(0);
        char s=sc.next().charAt(0);
        if(f==s) System.out.println("NULL");
        else if((f=='R' && s=='S') || (f=='S' && s=='P') || (f=='P' && s=='R')) System.out.println("Vignesh");
        else System.out.println("Charan");
    
    }
}
