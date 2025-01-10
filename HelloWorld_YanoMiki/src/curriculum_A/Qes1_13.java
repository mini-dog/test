package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/*
 * [概要]宣言処理
 * [詳細]ローカル変数として宣言する
 */
	byte num2;
	short num3;
	int num4;
	long num5;
	float num6;
	double num7;
	char ch;
	String str;
	boolean flag;
/*
 * [概要]初期化処理
 * [詳細]ローカル変数の初期値を代入して初期化する
 */
	num2 = 0;
	num3 = 0;
	num4 = 0;
	num5 = 0;
	num6 = 0;
	num7 = 0;
	ch = 'A';
	str = "初期値";
	flag = false;
/*
 * [概要]代入処理
 * [詳細]初期化した変数に指定の値を代入する
 */
	num2 = 10;
	num3 = 100;
	num4 = 1000;
	num5 = 10000L;
	num6 = 9.5f;
	num7 = 10.5;
	ch = 'a';
	str = "ハロー";
	flag = true;
/*
 * [概要]コンソール出力処理
 * [詳細]上記で作成した変数を必ず使用すること
 */
	System.out.println(num2+num3+num4+num5);
	System.out.println(num2+num2);
	System.out.println(ch+str+flag);
	System.out.println(num2+num3+num4+num5+num6+num7);
	System.out.println(num2*num3*num4*num5);
	System.out.println(num7/num3);
	System.out.println(num2-num3);
/*
 *[概要]修正
 *[詳細]「ハローJAVA43」と表示させるために修正する
 */
	String num = "20";
	int num1 = 23;
	System.out.println("ハローJAVA"+(Integer.parseInt(num)+num1));
/*
 * 問題６
 * [概要]コンソール出力処理
 * [詳細]指定の情報を変数にして、formatの通りコンソールに出力する
 */
	String name = "山田太郎";
	int num8 = 18;
	double num9 = 170.5f;
	float num10 = 62.2f;
	String food = "寿司";
	System.out.println("初めまして" + name + "です");
	System.out.println("年齢は" + num8 + "歳です");
	System.out.println("身長は" + num9 + "cmです");
	System.out.println("体重は" + num10 + "kgです");
	System.out.println("好きな食べ物は" + food + "です");
// 問題７　作成した自己紹介に続いてBMIも出力する。ただし変数を使って計算すること
	num9 = num9 / 100;
	double num11 = num10 / (num9 * num9);
	System.out.printf("BMIは%.1fです\n",num11);
// 問題８　再代入
	name = "鈴木一郎";
	num8 = 24;
	num9 = 168.5f;
	num10 = 64.2f;
	food = "オムライス";
	System.out.println("初めまして" + name + "です");
	System.out.println("年齢は" + num8 + "です");
	System.out.println("身長は" + num9 + "cmです");
	System.out.println("体重は" + num10 + "kgです");
	System.out.println("好きな食べ物は" + food + "です");
	num9 = num9 / 100;
	num11 = num10 / (num9 * num9);
	System.out.printf("BMIは%.1fです\n",num11);
// 問題９　上記で使用した変数【年齢・身長・体重】の数値を和算で自己代入し出力する
	num9 = 168.5f;
	System.out.println("初めまして" + name + "です");
	System.out.println("年齢は" + (num8 + num8) + "です");
	num9 = num9 + num9;
	System.out.println("身長は" + num9 + "cmです");
	num10 = num10 + num10;
	System.out.println("体重は" + num10 + "kgです");
	System.out.println("好きな食べ物は" + food + "です");
	num9 = num9 / 100;
	num11 = num10 / (num9 * num9);
	System.out.printf("BMIは%.2fです\n",num11);
// 問題１０　問題８で使用した年齢が２５歳以上ならtrueが出力されるようにする（if文は使わない）
	boolean age = num8 >= 25;
	System.out.println(age);
// 問題１１　問題８で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力する
	num8 = 18;
	num9 = 170.5f;
	num10 = 62.2f;
	String num8Str =  String.valueOf(num8);
	String num9Str = String.valueOf(num9);
	String num10Str = String.valueOf(num10);
	System.out.println(num8Str + num9Str + num10Str);
// 問題１２　問題１１で変換した【年齢・身長】を整数型に変換して出力
	int num8Int = Integer.parseInt(num8Str);
	int num9Int = (int) num9;
	System.out.println(num8Int);
	System.out.println(num9Int);
// 問題１３　問題１２で変換した【年齢・身長】で【年齢が２５もしくは身長が１６０以上】であればtrueを出力する（if文は使わない）
	System.out.println((num8Int >= 25 || num9Int >= 160) ? true : false);
	}

}
