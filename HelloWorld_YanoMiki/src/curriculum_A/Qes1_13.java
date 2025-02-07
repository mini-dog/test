package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
// 問題１　ローカル変数として宣言のみ行う
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	String str;
	boolean bo;
	
// 改行
	System.out.println();
	
// 問題２　それぞれのローカル変数をローカル内でそれぞれの初期値を代入
	b = 0;
	s = 0;
	i = 0;
	l = 0L;
	f = 0.0f;
	d = 0.0;
	ch = '\u0000';
	str = null;
	bo = false;
	
// 改行
	System.out.println();
		
// 問題３　初期化をしたそれぞれの変数に下記の値を代入
	b = 10;
	s = 100;
	i = 1000;
	l = 10000L;
	f = 9.5f;
	d = 10.5;
	ch = 'a';
	str = "ハロー";
	bo = true;
	
// 改行
	System.out.println();
	
// 問題４　問題の通りにコンソール出力されるようにする
// その際上記で作成した変数を必ず使用する
	System.out.println(b+s+i+l);
	System.out.println(b+b);
	System.out.println(ch+str+bo);
	System.out.println(b+s+i+l+f+d);
	System.out.println(b*s*i*l);
	System.out.println(d/s);
	System.out.println(b-s);
	
// 改行
	System.out.println();
	
// 問題５　「ハローJAVA４３」と表示させるために問題の式を修正する
	String num = "20";
	int num1 = 23;
	System.out.println("ハローJAVA"+(Integer.parseInt(num)+num1));

// 改行
	System.out.println();
	
// 問題６　問題の情報を変数にして、formatの通りコンソール出力する
	String name = "山田太郎";
	int num8 = 18;
	double num9 = 170.5d;
	float num10 = 62.2f;
	String food = "寿司";
	System.out.println("初めまして" + name + "です");
	System.out.println("年齢は" + num8 + "歳です");
	System.out.println("身長は" + num9 + "cmです");
	System.out.println("体重は" + num10 + "kgです");
	System.out.println("好きな食べ物は" + food + "です");
	
// 改行
	System.out.println();
		
// 問題７　作成した自己紹介に続いてBMIも出力する。ただし変数を使って計算すること
	num9 = num9 / 100;
	double num11 = num10 / (num9 * num9);
	System.out.printf("BMIは%.1fです\n",num11);
	
// 改行
	System.out.println();
	
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
	
// 改行
	System.out.println();
	
// 問題９　上記で使用した変数【年齢・身長・体重】の数値を和算で自己代入し出力する
	num9 = 168.5f;
	System.out.println("初めまして" + name + "です");
	num8 = num8 + 24;
	System.out.println("年齢は" + num8 + "です");
	num9 = num9 + num9;
	System.out.println("身長は" + num9 + "cmです");
	num10 = num10 + num10;
	System.out.println("体重は" + num10 + "kgです");
	System.out.println("好きな食べ物は" + food + "です");
	num9 = num9 / 100;
	num11 = num10 / (num9 * num9);
	System.out.printf("BMIは%.2fです\n",num11);
	
// 改行
	System.out.println();
		
// 問題１０　問題８で使用した年齢が２５歳以上ならtrueが出力されるようにする（if文は使わない）
	num8 = 24;
	boolean age = num8 >= 25;
	System.out.println(age);

// 改行
	System.out.println();
		
// 問題１１　問題８で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力する
	num8 = 24;
	num9 = 168.5f;
	num10 = 64.2f;
	String num8Str =  String.valueOf(num8);
	String num9Str = String.valueOf(num9);
	String num10Str = String.valueOf(num10);
	System.out.println(num8Str + num9Str + num10Str);

// 改行
	System.out.println();
		
// 問題１２　問題１１で変換した【年齢・身長】を整数型に変換して出力
	int num8Int = Integer.parseInt(num8Str);
	int num9Int = (int) num9;
	System.out.println(num8Int);
	System.out.println(num9Int);

// 改行
	System.out.println();
		
// 問題１３　問題１２で変換した【年齢・身長】で【年齢が２５もしくは身長が１６０以上】であればtrueを出力する（if文は使わない）
	System.out.println((num8Int >= 25 || num9Int >= 160) ? true : false);
	}

}
