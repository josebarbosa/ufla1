package br.com.josebarbosa.ufla1;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private Integer id;
	private String type;
	
	

	public Laptop() {
		System.out.println("Laptop criado...");
	}

	public Laptop(Integer id, String type) {

		this.id = id;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void showingData() {
		System.out.println("Showing laptop...");
	}
	
}
