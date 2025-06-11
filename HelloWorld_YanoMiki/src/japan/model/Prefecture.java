package japan.model;

public class Prefecture {
	// 都道府県名
	private String name;
	// 県庁所在地
    private String capital;
    // 面積
    private double area;
    
    // コンストラクタ（初期設定）
    public Prefecture(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    // 情報を取り出すメソッド（getメソッド）
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    // 情報を表示するメソッド
    public void printInfo() {
        System.out.println("都道府県名：" + name);
        System.out.println("県庁所在地：" + capital);
        System.out.println("面積：" + area + "km2\n");
    }
}
