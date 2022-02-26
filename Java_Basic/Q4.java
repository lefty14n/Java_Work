package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
	public static void main(String[] args)  throws IOException {
		// BufferedReader生成（文字列を渡すため、数字を使いたい場合は変換する）
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try { // 正常な処理を指定
			System.out.println("数字を入力してください"); // メッセージ
			// キーボードから文字力入力
			String line = br.readLine();
			// 入力文字列をint型に変換
			int n = Integer.parseInt(line);
		}
	}
}