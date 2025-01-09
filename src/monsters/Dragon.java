package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	public Dragon(String name, String weapon) {
		super(name, weapon);
		// ヒットポイントの値は乱数
		setHp(Dice.get(270, 330));
		// 攻撃力の値は乱数
		setOffensive( Dice.get(12, 18));
	}
}
