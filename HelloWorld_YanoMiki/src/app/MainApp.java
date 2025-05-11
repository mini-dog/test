package app;

import java.util.Random;
import java.util.Scanner;

import model.Player;

public class MainApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        int hp = random.nextInt(1000) + 1;
        int mp = random.nextInt(1000) + 1;
        int attack = random.nextInt(500) + 1;
        int speed = random.nextInt(1000) + 1;
        int defense = random.nextInt(100) + 1;

        Player player = new Player(name, hp, mp, attack, speed, defense);

        System.out.println("\nこんにちは 「 " + player.getName() + " 」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + player.getHp());
        System.out.println("MP：" + player.getMp());
        System.out.println("攻撃力：" + player.getAttack());
        System.out.println("素早さ：" + player.getSpeed());
        System.out.println("防御力：" + player.getDefense());

        scanner.close();
    }
}
