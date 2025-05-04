package animal;

public class Theme2 {
	
	// フィールド（インスタンス変数）
	private String name;
	private double length;
	private int speed;
	
	// セッター
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// ゲッター
	public String getName() {
		return this.name;
	}
	public double getLength() {
		return this.length;
	}
	public int getSpeed() {
		return this.speed;
	}
	
	// メインメソッド
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Theme2 lion = new Theme2();
		
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		
		System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}
