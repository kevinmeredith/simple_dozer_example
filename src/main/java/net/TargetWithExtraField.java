package net;

public class TargetWithExtraField {

	private String name;
	private Boolean flag;

	public TargetWithExtraField() {}

	public TargetWithExtraField(String name, Boolean flag) {
		this.name = name;
		this.flag = flag;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public Boolean getFlag() {
		return this.flag;
	}	

	@Override
	public String toString() {
		return "Target(" + this.name + "," + this.flag + ")";
	}
}