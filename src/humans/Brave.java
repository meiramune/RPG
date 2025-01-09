package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	public Brave(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントの値は乱数
		setHp(Dice.get(170,230)) ; 
		//攻撃力の値は乱数
		setOffensive(Dice.get(7,13));
	}
}
