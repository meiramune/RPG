package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	public Slime(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントの値は乱数
		setHp(Dice.get(70, 130));
		//攻撃力の値は乱数
		setOffensive(Dice.get(5, 11));
	}
}
