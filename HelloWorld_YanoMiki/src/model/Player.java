package model;

public class Player extends CharacterBase {
	 private String name;

	    public Player(String name, int hp, int mp, int attack, int speed, int defense) {
	        super(hp, mp, attack, speed, defense);
	        this.name = name;
	    }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }
	}
