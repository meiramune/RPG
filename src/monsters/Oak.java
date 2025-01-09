package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	public Oak(String name, String weapon) {
		super(name, weapon);
		// ヒットポイントの値は乱数
		setHp(Dice.get(170, 230));
		// 攻撃力の値は乱数
		setOffensive(Dice.get(9, 15));
	}

}
