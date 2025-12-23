package ru.aston.hometask.strategy.entities;

import static ru.aston.hometask.utils.ConstantUtils.SEMICOLON_SEPARATOR;

import ru.aston.hometask.strategy.impl.DefendStrategyType;

public class Player {
	private final String name;
	private final int age;
	private DefendStrategyType defStrategy;

	public Player(String name, int age, DefendStrategyType defStrategy) {
		this.name = name;
		this.age = age;
		this.defStrategy = defStrategy;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public DefendStrategyType getDefStrategy() {
		return defStrategy;
	}

	public void setDefStrategy(DefendStrategyType defStrategy) {
		this.defStrategy = defStrategy;
	}

	public void defend() {
		defStrategy.defend();
	}

	@Override
	public String toString() {
		return name + SEMICOLON_SEPARATOR + age;
	}

}
