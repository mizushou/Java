package bc74;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            // 一行づつ読み込んで処理
            // 標準入力でEnterを押すことで改行文字が入り、一行の読み込みが完了する。ただし、改行文字は読み込まれない
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int a = Integer.parseInt(tokens[0]);
                int b = Integer.parseInt(tokens[1]);
                System.out.println(a + " " + b);
            }
            br.close();
        }
    }
}
