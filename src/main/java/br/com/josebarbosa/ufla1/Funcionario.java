package br.com.josebarbosa.ufla1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Funcionario {

	private Integer id;
	private String name;
	private Double salary;
	@Autowired
	private Laptop laptop; 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Nome do funcionário..." + this.getName());
	} 
	
	public Funcionario() {
		System.out.println("Funcionário criado...");
		this.laptop.showingData();

	}
	public Funcionario(Integer id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
