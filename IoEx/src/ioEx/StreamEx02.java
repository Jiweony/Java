package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx02 {
		public static void main(String[] args) throws IOException {
		
			String filename = "C:\\temp\\koreait.txt";
			File f = new File(filename); //준비
			
			//FileOut~ : 기본 false(덮어쓰기), true(이어적기)
			OutputStream os = new FileOutputStream(f);
			//byte(1), char(1)로 처리가 기본 
			
			String str = "koreait"; //어떻게 처리?
			//byte[] -> 배열명.getBytes();
			//개행
			
			//더 이상 출력할 것이 없으면 -> -1을 만남 
			byte[] b = str.getBytes();
			os.write(b);
			os.write('\n');
			os.flush();
			os.close();
	}
}
