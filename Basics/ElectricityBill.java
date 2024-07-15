

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int sum=0;
        if(units>300)
            sum=100*10+100*15+100*20+(units-300)*25;
        else if (units>200 && units<301)
            sum=100*10+100*15+(units-200)*20;
        else if (units>100 && units<201)
            sum=100*10+(units-100)*15;
        else if (units<101)
            sum=units*10;
        System.out.println(sum);
    }
}
