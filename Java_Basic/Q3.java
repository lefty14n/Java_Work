package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		// BufferedReader生成（文字列を渡すため、数字を使いたい場合は変換する）
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// メッセージ
		System.out.println("整数を入力してください");
		// キーボードから文字力入力
		String input = br.readLine();
		// 入力文字列をint型に変換
		int num = Integer.parseInt(input);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j == (i)) {
					System.out.print("*");
				} else {
					System.out.print("•");
				}
			}
			System.out.println();
		}
	}
}
