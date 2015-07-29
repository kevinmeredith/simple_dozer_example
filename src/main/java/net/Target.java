package net;

public class Target {

	private String name;

	public Target() {}

	public Target(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Target(" + this.name + ")";
	}
}