package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 問題５：for文を使って掛け算を表示
				for(int j = 1; j <= 9; j++) {
					for(int i = 1; i <= 20; i++) {
						System.out.printf("%03d*%03d=%03d",i ,j ,(i*j));
						if (i < 20) {
							System.out.print("||");
						}
					}
					System.out.println();
				}
	}
}
				
