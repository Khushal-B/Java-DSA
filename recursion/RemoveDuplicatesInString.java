public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String str="appnnacollege";
        System.out.println(removeDuplicates(str,str.length()));
    }
    public static String removeDuplicates(String s,int i){
        if(i==1)
            return s;
            
        String str=removeDuplicates(s.substring(0,s.length()-1),i-1);

      if(str.indexOf(s.charAt(i-1))==-1){
        str=str+(s.charAt(i-1));
      }
      return str;  
    } 
    
}
