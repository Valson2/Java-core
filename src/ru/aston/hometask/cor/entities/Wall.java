package ru.aston.hometask.cor.entities;

public class Wall {
	private final int startEndurance;
	private final Material material;

	public Wall(int endurance, Material material) {
		this.startEndurance = endurance;
		this.material = material;
	}

	public enum Material {
		CARTON(5), BRICK(20), STONE(10);

		private int endurance;

		Material(int endurance) {
			this.endurance = endurance;
		}
	}

	public Material getMaterial() {
		return material;
	}

	public int getEndurance() {
		return startEndurance * material.endurance;
	}

}
