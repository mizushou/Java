package bc74;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo2 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String line = br.readLine();
        	System.out.println(line);
        	String line2 = br.readLine();
        	System.out.println(line2);
        	String line3 = br.readLine();
        	String[] line3array = line3.split(" ");
        	for (int i = 0; i < line3array.length; i++) {
        		System.out.print(line3array[i] + " ");
        	}
        }
    }
}
