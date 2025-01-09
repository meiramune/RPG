package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	public Wizard(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントの値は乱数
		setHp(Dice.get(120, 180));
		//攻撃力の値は乱数
		setOffensive(Dice.get(12, 18));
	}
}
