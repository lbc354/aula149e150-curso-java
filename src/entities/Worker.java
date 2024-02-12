package entities;



import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
//	ATRIBUTOS
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
//	relation 1-department
	private Department department;
//	relation *-hourcontracts (many-hourcontract)
	private List<Contract> contracts = new ArrayList<>();
//	quando tiver uma composição "tem muitos" (que no caso é uma lista), não o incluímos no construtor, simplesmente iniciamos uma lista vazia
	
//	CONSTRUTORES
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		setName(name);
		setLevel(level);
		setBaseSalary(baseSalary);
		setDepartment(department);
	}

//	GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

//	não podemos deixar setContracts pq ele recebe outra lista e a atribui à lista de contratos do worker (trocando uma lista por outra lista)
//	public void setContracts(List<HourContract> contracts) {
//		this.contracts = contracts;
//	}
	
//	MÉTODOS
	public void addContract(Contract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(Contract contract) {
		contracts.remove(contract);
	}
	
//	income é salário
	public double income(int year, int month) {
		double sum = baseSalary;
		for (Contract c : contracts) {
			// (HourContract) ... para que aqui possamos pegar ano e mês
			int c_year = c.getDate().getYear();
			int c_month = c.getDate().getMonthValue();
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}