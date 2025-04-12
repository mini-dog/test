package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力する
		Dog myDog = new Dog();
		System.out.println(myDog.getDogName());
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力する
		Dog myDog2 = new Dog(10);
		System.out.println(myDog2.getNumDogs());
		
		// Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力する
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("現在の日時: " + formattedDateTime);
		

	}

}
