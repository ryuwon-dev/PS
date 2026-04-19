import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String str = br.readLine();
            int count = 0;
            boolean isVPS = true;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(') {
                    count++;
                } else {
                    count--;
                }

                if (count < 0) {
                    isVPS = false;
                    break;
                }
            }

            if (count == 0 && isVPS) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}