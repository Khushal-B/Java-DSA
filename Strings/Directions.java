//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Directions
{
    public static String shortestPath (String S)
    {
        int n=0,s=0,e=0,w=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='N')
            n++;
            else if(S.charAt(i)=='S')
            s++;
            else if(S.charAt(i)=='E')
            e++;
            else if(S.charAt(i)=='W')
            w++;
        }
        if(n>s){
        n=n-s;
        s=0;
        }
        else{
        s=s-n;
        n=0;
        }
        if(e>w){
        e=e-w;
        w=0;
        }
        else{
        w=w-e;
        e=0;
        }
        String str="";
        int sum=n+s+e+w;
        for(int i=0;i<sum;i++){
            
            if(e>0){
                str=str+'E';
                e--;
            }
            else if(n>0){
                str=str+'N';
                n--;
            }else if(s>0){
                str=str+'S';
                s--;
            }else if(w>0){
                str=str+'W';
                w--;
            }
        }
        return str;
        
        // your code here
    }
    public static void main(String[] args) {
        String str="SSSNEEEW";
        System.out.println(shortestPath(str));
    }
}