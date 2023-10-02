package entities;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double ValeuPerHour;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valeuPerHour) {
		super();
		this.name = name;
		this.hours = hours;
		ValeuPerHour = valeuPerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValeuPerHour() {
		return ValeuPerHour;
	}

	public void setValeuPerHour(Double valeuPerHour) {
		ValeuPerHour = valeuPerHour;
	}
	
	//cálculo de pagamento pelas horas trabalhadas
	public double payment() {
		return hours * ValeuPerHour;
	}

}
