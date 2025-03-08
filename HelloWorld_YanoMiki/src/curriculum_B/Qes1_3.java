package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 問題１：ログイン時の入力チェックシステムを作成
		Scanner scanner = new Scanner(System.in);
		// 問題１：コンソールにユーザー名を入力できるようにする
			String name = scanner.nextLine();
			// 問題１：ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
			if (name.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」");
			}
			// 問題１：ユーザー名の文字数が０文字以下もしくはnullの場合「名前を入力してください」と出力
			else if (name == null || name.isEmpty()) {
				System.out.println("「名前を入力してください」");
			}
			// 問題２：ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
			else if (!name.matches("^[a-zA-z0-9]+$")){
				System.out.println("半角英数字のみで名前を入力してください");
			}
			// 問題１：ユーザー名が正常な値だった場合『ユーザー名「入力したユーザー名」を登録しました』と出力
		    else {
		    	System.out.println("ユーザー名「" + name +"」を登録しました");
			}
		// 問題３：じゃんけんのシステムを作成
	    Random random = new Random();
		// 問題３：じゃんけんの表示用配列
		String[] hands = {"グー", "チョキ", "パー"};
		// 問題３：勝つまでループ
		int count = 0;
		while (true) {
			count++;
			// 問題３：相手の手を入力
			int playerHand = scanner.nextInt();
			// 問題３：コンピュータの手
			int computerHand = random.nextInt(3);
			// 問題３：それぞれの手を表示
			System.out.println(name + "の手は「" + hands[playerHand] + "」");
			System.out.println("相手の手は「" + hands[computerHand] + "」");
			// 問題３：自分がじゃんけんに勝った場合
			if ((playerHand == 0 && computerHand == 1)||(playerHand == 1 && computerHand == 2)||(playerHand == 2 && computerHand == 0)) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				break;
			// 問題３：自分がじゃんけんでグーに負けた場合
			} else if ((playerHand == 1 && computerHand == 0)) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			// 問題３：自分がじゃんけんでチョキに負けた場合
			} else if ((playerHand == 2 && computerHand == 1)) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
			// 問題３：自分がじゃんけんでパーに負けた場合
			} else if ((playerHand == 0 && computerHand == 2)) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
			// 問題３：あいこの場合
			} else {
				System.out.println("DRAW あいこ もう一回しましょう！");
			}
		}
		// 問題３：じゃんけんを行った回数を表示
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
		scanner.close();
	}
}
		
			
		
	


