import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int t=sc.nextInt();
        if((t<=(x+y))||(t<=(y+z))||(t<=(x+z))) System.out.println("YES");
        else System.out.println("NO");
    }
}
