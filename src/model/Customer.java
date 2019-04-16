package model;

public class Customer {

	// ATTRIBUTS
	public int id;
	public String name;

	// GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// CONSTRUCTORS
	public Customer() {
		this.name= "default name";
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

}
