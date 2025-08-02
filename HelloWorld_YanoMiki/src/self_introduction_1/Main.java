package self_introduction_1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木太郎",20,1.7,57.8);
		
		System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
	    
	    System.out.println();
	    
	    // インスタンスメソッドで詳細出力
	    person1.printInfo();
	    
	    System.out.println();
	    
	    // 合計人数
	    Person.printTotal();

	}

}
