package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// N人の生徒の成績を管理するプログラムを作成
		Scanner scanner = new Scanner(System.in);
		// 生徒の人数を入力
		int numStudents;
		while (true) {
			System.out.print("生徒の人数を入力してください（２以上）：");
			numStudents = scanner.nextInt();
			if (numStudents >= 2) {
				break;
			} 
			
		}
		
		// 生徒の成績を格納する配列（英語、数学、理科、社会）
		int[][] scores = new int[numStudents][4];
		
		// 生徒の成績を入力
		for (int i = 0; i < numStudents; i++) {
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください：");
			scores[i][0] = scanner.nextInt();
			
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください：");
			scores[i][1] = scanner.nextInt();
			
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください：");
			scores[i][2] = scanner.nextInt();
			
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください：");
			scores[i][3] = scanner.nextInt();
			System.out.println();
		}
		
		// 科目の合計点を保持する配列
		double[] subjectSums = new double[4];
		double totalSum = 0;
		
		// 生徒の平均点
		for (int i = 0; i < numStudents; i++) {
			double studentSum = 0;
			for (int j = 0; j < 4; j++) {
				studentSum += scores[i][j];
				subjectSums[j] += scores[i][j];
			}
			double studentAverage = studentSum / 4.0;
			System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverage);
			totalSum += studentSum;
		}
		System.out.println();
		
		// 各教科の平均点
		String[] subjects = {"英語","数学","理科","社会"};
		for (int j = 0; j < 4; j++) {
			double subjectAverage = subjectSums[j] / numStudents;
			System.out.printf("%sの平均点は%.2f点です。\n",subjects[j],subjectAverage);
		}
		// 全体の平均点
		double totalAverage = totalSum / (numStudents * 4);
		System.out.printf("全体の平均点は%.2f点です。\n", totalAverage);
		
		scanner.close();
		
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
