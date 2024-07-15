class StringBuilders{

        public static int compress(char[] chars) {
            int cnt=0,pos=0;
            char ch=0;
            StringBuilder sb =new StringBuilder("");
            for(int i=0;i<chars.length;i++){
                if(ch==chars[i]){
                    cnt++;
                }
                else{
                    ch=chars[i];
                    if(cnt>1){
                        sb.append(cnt);
                        
                            //cnt is a big integer whose value is to be stored
                            //in the char array chars, digit by digit.
                            for (char c : Integer.toString(cnt).toCharArray()){
                                chars[pos]=c;

                                pos++;
                            }
                        }
                    sb.append(chars[i]);
                    cnt=1;
                    chars[pos]=chars[i];
                    pos++;
                }
            }
            if(cnt>1){
                sb.append(cnt);
                    for (char c : Integer.toString(cnt).toCharArray()){
                        System.out.println(c);
                        chars[pos]=c;
                        pos++;
                    }
                }

            System.out.println(sb);
            for(int i=0;i<sb.length();i++){
                System.out.println(chars[i]);
            }

            return sb.length();     
        }
    public static void main(String[] args) {
        char[] chs={'a','a','a','b','b','c','c','c','c','c','c','c','c','c','c','c','c','c','c'};
        System.out.println(compress(chs));

    }
}