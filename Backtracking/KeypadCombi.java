/* Keypad Combinations Given a string containing digits from 2-9 inclusive,print all possible letter combinations that the number could represent. You can print the answer in any order.A mapping ofdigits tol etters(just like on the telephone buttons)is given below.Note that 1 does not map to any letters.Sample Input 1: digits = "23"Sample Output 1: "ad", "ae", "af", "bd", "be", "bf","cd", "ce", "cf"Sample Input 2: digits = "2"Sample Output 2: "a", "b", "c"Sample Input 3: digits = ""Sample Output 3: ” */

public class KeypadCombi {
    public static void main(String[] args) {
        String[] arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printCombi(arr,"25","");
    }
    public static void printCombi(String[] arr,String str,String temp){
        if(str.length()==0){
            System.out.println(temp);
            return;
        }
        int n=(int)str.charAt(0)-48;
        str=str.substring(1, str.length());
        char[] chArray=arr[n-2].toCharArray();
        for(int i=0;i<chArray.length;i++){
            temp=temp+chArray[i];
            printCombi(arr, str, temp);
            temp=temp.substring(0,temp.length()-1);
        }
    }
}

