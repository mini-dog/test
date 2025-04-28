package logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2 {
	private String greeting;
    private String sushiTaste;
    private String sushiCulture;
    private String currentDateTime;
    
    // 適切なファイルにフィールドで変数を必要な数作る
    public Theme2() {
    	this.greeting = "こんにちは！ここは日本です！";
        this.sushiTaste = "この寿司はうまい";
        this.sushiCulture = "寿司は和食です";
        
        // 今日の日時を取得
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.currentDateTime = "今の現在日時は" + now.format(formatter) + "です";
    }
    
    // Nullチェック
    public void printMessages() {
    	if (this.greeting != null) {
            System.out.println(this.greeting);
        } else {
            System.out.println("挨拶メッセージがありません。");
        }

        if (this.sushiTaste != null) {
            System.out.println(this.sushiTaste);
        } else {
            System.out.println("寿司の味についての情報がありません。");
        }

        if (this.sushiCulture != null) {
            System.out.println(this.sushiCulture);
        } else {
            System.out.println("寿司の文化についての情報がありません。");
        }

        if (this.currentDateTime != null) {
            System.out.println(this.currentDateTime);
        } else {
            System.out.println("現在日時が取得できませんでした。");
        }
    }
}
