import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long cost=sc.nextLong();
        long ptrain=sc.nextLong();
        long bought=sc.nextLong();
        if(bought>=cost+ptrain){
            System.out.println("2");
        }
        else if(bought>=cost){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        
    }
}
