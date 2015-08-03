package net;

public class TargetWithPerson {

	private Person person;

	public void setPerson(Person p) {
		this.person = p;
	}

	public Person getPerson() {
		return this.person;
	} 

	@Override
	public String toString() {
		return "Target(" + this.person.getName() + ")";
	}
}