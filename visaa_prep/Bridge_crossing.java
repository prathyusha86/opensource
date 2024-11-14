import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int mweight=z-y;
        int no_of_mangoes=mweight/x;
        System.out.println(no_of_mangoes);
    }
}
