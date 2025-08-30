package self_introduction_2;

public class Person {
    // インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	
	// クラスフィールド count を追加
    private static int count = 0;
    
    // コンストラクタ
	Person(String name, int age, double height, double weight){
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	 
	    // インスタンス生成時にcountを増加させる
	    count++;
	}
	
	// BMIを計算
	public double bmi(){
	    return this.weight / this.height / this.height;
	}
	
	// 名前と年齢を出力するメソッド
	public void print(){
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	}
	// countの値を取得するためのメソッド
    public static int getCount() {
        return count;
	}
    
    // printCountメソッドを追加
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}











