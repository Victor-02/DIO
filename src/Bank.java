
public class Bank {

	private String agency;
	private String name;

	public Bank(String agency, String name) {
		this.agency = agency;
		this.name = name;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
