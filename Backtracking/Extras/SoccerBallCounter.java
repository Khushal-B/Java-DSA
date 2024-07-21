import java.util.*;
import java.io.*;

public class SoccerBallCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int n = Integer.parseInt(br.readLine().trim());
        
        for (int t = 0; t < n; t++) {
            int x = Integer.parseInt(br.readLine().trim());
            String[] passesStr = br.readLine().trim().split(" ");
            long[] passes = new long[x];
            
            for (int i = 0; i < x; i++) {
                passes[i] = Long.parseLong(passesStr[i]);
            }
            
            out.println(minimumBalls(passes));
        }
        
        out.flush();
        out.close();
        br.close();
    }
    
    private static long minimumBalls(long[] passes) {
        long totalPasses = 0;
        long maxPasses = 0;
        
        for (long pass : passes) {
            totalPasses += pass;
            maxPasses = Math.max(maxPasses, pass);
        }
        
        if (totalPasses == 0) {
            return 0;
        }
        
        return Math.max(1, maxPasses - (totalPasses - maxPasses));
    }
}