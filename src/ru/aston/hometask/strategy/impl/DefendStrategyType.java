package ru.aston.hometask.strategy.impl;

public enum DefendStrategyType {
	PERSONAL {
		@Override
		public void defend() {
			System.out.println("Personal defending");
		}
	},
	ZONE {
		@Override
		public void defend() {
			System.out.println("Zone defending");
		}
	},
	PRESSING {
		@Override
		public void defend() {
			System.out.println("Pressing only");

		}
	};

	public abstract void defend();
}
