package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
	public static void main(String[] args) throws IOException {
		// メッセージ
		System.out.println("文字を入力してください");
		// BufferedReader生成（文字列を渡すため、数字を使いたい場合は変換する）
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
}
