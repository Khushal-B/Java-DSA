public class complexNo {
    public static void main(String[] args) {
        int a=3,b=5,c=2,d=8;
        Initialize obj1=new Initialize(a,b);
        Initialize obj2=new Initialize(c,d);
        Solution obj3=new Solution();
        obj3.sum(obj1,obj2);
        obj3.diff(obj1,obj2);
        obj3.prod(obj1,obj2);
    }
}
class Initialize{
    int real,imag;
    Initialize(int a, int b){
        this.real=a;
        this.imag=b;
    }
}
class Solution{
    int realans, imagans;
    public void sum(Initialize a, Initialize b){
        realans=a.real+b.real;
        imagans=a.imag+b.imag;
        System.out.println("Sum is: "+realans+"+"+imagans+"i");
    }
    public void diff(Initialize a, Initialize b){
        realans=a.real-b.real;
        imagans=a.imag-b.imag;
        System.out.println("Diff is: "+realans+"+"+imagans+"i");

    }
    public void prod(Initialize a, Initialize b){
        realans=(a.real*b.real)-(a.imag*b.imag);
        imagans=(a.real*b.imag)+(a.imag*b.real);
        System.out.println("Diff is: "+realans+"+"+imagans+"i");

    }
}