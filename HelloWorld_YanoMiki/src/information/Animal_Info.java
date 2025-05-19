package information;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animal_Info {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");
        
        // 入力を1行読み取る
        String input = scanner.nextLine();
        scanner.close();
        
        // 学名マップ
        Map<String, String> scientificNames = new HashMap<>();
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        scientificNames.put("インコ", "不明");
        
        // 入力を分割して処理
        String[] animals = input.split(",");
        for (String animal : animals) {
            String[] parts = animal.split(":");
            String name = parts[0];
            String height = parts[1];
            String speed = parts[2];

            System.out.println();
            System.out.println("動物名：" + name);
            System.out.println("体長：" + height + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificNames.getOrDefault(name, "不明"));
        }

	}

}
