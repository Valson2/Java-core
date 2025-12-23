package ru.aston.hometask.strategy;

import ru.aston.hometask.strategy.entities.Player;
import ru.aston.hometask.strategy.impl.DefendStrategyType;

public class Runner {
	public static void main(String[] args) {
		Player player = new Player("Rooney", 25, DefendStrategyType.PERSONAL);
		player.defend();
		player.setDefStrategy(DefendStrategyType.PRESSING);
		player.defend();
	}
}
