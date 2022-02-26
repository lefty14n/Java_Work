package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {

	public static void main(String args[]) throws IOException {
		//メッセージ
		System.out.println("整数を昇順で並べ替えます。"); 
		//メッセージ
		System.out.println("5個の整数を入力してください。"); 
		// BufferedReader生成（文字列を渡すため、数字を使いたい場合は変換する）
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int j, k, l;
		//値を5つ格納
		int num[] = new int[5]; 
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "個目の整数 : "); //メッセージ
			String str = br.readLine(); // キーボードから文字力入力
			int tmp = Integer.parseInt(str); // 入力文字列をint型に変換
			num[i] = tmp;
		}

	}
}
