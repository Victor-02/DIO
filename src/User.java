
public class User {

	private String name;
	private String cpf;
	private Score score;

	public User(String name, String cpf, Score score) {
		this.name = name;
		this.cpf = cpf;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", cpf=" + cpf + ", score=" + score;
	}

}
