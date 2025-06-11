package application.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 他パッケージのクラスを使う
import japan.model.Prefecture;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);

        // データ定義（都道府県のデータ11個）
        String[] rawData = {
                "北海道:札幌市:83424",
                "青森県:青森市:9646",
                "岩手県:盛岡市:15275",
                "宮城県:仙台市:7282",
                "秋田県:秋田市:11638",
                "山形県:山形市:9323",
                "福島県:福島市:13784",
                "茨城県:水戸市:6097",
                "栃木県:宇都宮市:6408",
                "群馬県:前橋市:6362",
                "埼玉県:さいたま市:3798"
        };

        // データを都道府県オブジェクトに変換
        List<Prefecture> allPrefectures = new ArrayList<>();
        for (String data : rawData) {
            String[] parts = data.split(":");
            allPrefectures.add(new Prefecture(parts[0], parts[1], Double.parseDouble(parts[2])));
        }

        // 入力：番号選択
        System.out.print("番号をカンマ区切りで入力してください（例：8,5,9）：");
        String[] inputNumbers = scanner.nextLine().split(",");

        // 選ばれた番号の都道府県をリストに追加
        List<Prefecture> selected = new ArrayList<>();
        for (String num : inputNumbers) {
            try {
                int index = Integer.parseInt(num.trim());
                selected.add(allPrefectures.get(index));
            } catch (Exception e) {
                System.out.println("無効な番号：" + num);
            }
        }

        // 昇順or降順の選択
        System.out.print("昇順（asc）または降順（desc）を入力してください：");
        String order = scanner.nextLine().trim();

        // 並べ替え（面積順）
        if (order.equalsIgnoreCase("asc")) {
            selected.sort(Comparator.comparingDouble(Prefecture::getArea));
        } else if (order.equalsIgnoreCase("desc")) {
            selected.sort(Comparator.comparingDouble(Prefecture::getArea).reversed());
        } else {
            System.out.println("並び順が無効です。ascまたはdescを指定してください。");
            return;
        }

        // 出力
        for (Prefecture p : selected) {
            p.printInfo();
        }
    }
}
