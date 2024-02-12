package entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Contract {
//	atributos
	private Date date; // armazena no tipo date...
	private Double valuePerHour;
	private Integer hours;
	
//	contrutores
	public Contract() {
		
	}

	public Contract(Date date, Double valuePerHour, Integer hours) {
		setDate(date);
		setValuePerHour(valuePerHour);
		setHours(hours);
	}

//	getters and setters
	public LocalDate getDate() {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); // ... mas retorna no tipo LocalDate ... (-> Worker)
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
//	métodos
	public double totalValue() {
		return valuePerHour * hours;
	}
}