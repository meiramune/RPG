package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	public Fighter(String name, String weapon) {
		super(name, weapon);
		// ヒットポイントの値は乱数
		setHp(Dice.get(240, 300));
		//攻撃力の値は乱数
		setOffensive(Dice.get(17, 23));
	}
}
