package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
		public static void main(String[] args)  throws IOException {
			// BufferedReader生成（文字列を渡すため、数字を使いたい場合は変換する）
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try { // 正常な処理を指定
				System.out.println("0〜6の数字を入力してください。対応した曜日を表示します。"); // メッセージ
				// キーボードから文字力入力
				String line = br.readLine();
				// 入力文字列をint型に変換
				int n = Integer.parseInt(line);
				switch (n) { //曜日指定
				case 0:
					System.out.println("日曜日");
					break;
				case 1:
					System.out.println("月曜日");
					break;
				case 2:
					System.out.println("火曜日");
					break;
				case 3:
					System.out.println("水曜日");
					break;
				case 4:
					System.out.println("木曜日");
					break;
				case 5:
					System.out.println("金曜日");
					break;
				case 6:
					System.out.println("土曜日");
					break;
				default: //0〜6の範囲外を指定した場合の処理
					System.out.println("0〜6の範囲で入力してください。");
					break;
				}
			} catch (IOException e) {
				System.out.println(e);
			} catch (NumberFormatException e) { //数字以外を指定した場合の処理
				System.out.println("数字を入力してください。");
			}
		}
	}