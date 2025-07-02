package self_introduction_1;

public class Person {
    // インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	
	// クラス変数：人数カウント
	static int count = 0;
	
    // コンストラクタを定義しインスタンスフィールドに値をセット
    public Person(String name, int age, double height, double weight){
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    
	    // インスタンスが作られるたびに1人追加
	    count++;
    }
    
    // BMI
    public double BMI() {
    	// 体重（kg）÷（ 身長（m）× 身長（m））
    	return weight / (height * height);
    }
    
    public void printInfo() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "才です");
	    System.out.println("BMIは" + String.format("%.1f", this.BMI()) + "です");
    }
    public static void printTotal() {
    	System.out.println("合計" + count + "人です");
	
    }
}