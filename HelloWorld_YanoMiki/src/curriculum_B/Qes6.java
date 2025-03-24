package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 問題６：入力した商品の残り台数が出力されるシステムを作成
		// ユーザーから入力を受け取る
		Scanner scanner = new Scanner(System.in);
		String input =scanner.nextLine();
		// 「、」区切りで入力された商品を配列に変換
		String[] inputItems = input.split("、");
		// 残り台数のランダム出力
		Random random = new Random();
		// 拡張for文で入力された商品を処理
		for(String item : inputItems) {
			item = item.trim();
			// 商品ごとに残り台数を出力
			switch(item) {
			case "テレビ":
			case "ディスプレイ":
				int remainingStock = 11 - random.nextInt(12);
				System.out.println(item + "の残り台数は" + remainingStock + "台です");
				break;
			case "パソコン":
				System.out.println("パソコンの残り台数は" + random.nextInt(12) + "台です");
				System.out.println();
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + random.nextInt(12) + "台です");
				System.out.println();
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + random.nextInt(12) + "台です");
				System.out.println();
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + random.nextInt(12) + "台です");
				System.out.println();
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + random.nextInt(12) + "台です");
				System.out.println();
				break;
			default:
				System.out.println("『" + item + "』は指定の商品ではありません");
				break;
			
			}
		}
		scanner.close();

	}

}
