package entities;

public class Department {
//	atributos
	private String name;
	
//	construtores
	public Department() {
		
	}
	
	public Department(String name) {
		setName(name);
	}
	
//	getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}