// Source code is decompiled from a .class file using FernFlower decompiler.
class PrintSubStringsMeth2 {
        public PrintSubStringsMeth2() {
        }
     
        public static void main(String[] var0) {
           String var1 = "abcd";
           printSubstrings(var1, "", 0);
        }
     
        public static void printSubstrings(String var0, String var1, int var2) {
           if (var2 >= var0.length()) {
              System.out.println(var1);
           } else {
              printSubstrings(var0, var1, var2 + 1);
              var1 = var1 + var0.charAt(var2);
              printSubstrings(var0, var1, var2 + 1);
           }
        }
     }