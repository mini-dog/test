package basicClass;

public class Dog {
	
		// Q1:フィールドに動物の名前の変数を定義
		private String dogName;
		
		// Q2:フィールドに動物の数の変数を定義
		private int numDogs;
		
		// Q3:Q1で作成した変数に「犬」を代入するコンストラクタを作成
		// Q4:Q2で作成した変数に引数を代入するコンストラクタを作成
		public Dog() {
			// Q3
			this.dogName = "犬";
		}
		// Q4
		public Dog(int numDogs) {
			this.numDogs = numDogs;
		}
		// Q3
		public String getDogName() {
			return dogName;
		}
		// Q4
		public int getNumDogs() {
			return numDogs;
		}
		
		public static void main(String[] args) {
	
	}
}
	



