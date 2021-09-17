import java.util.Locale;
import java.util.Scanner;

public class RegistroAluguel {

	private String name;
	private String email;

	public RegistroAluguel(String name, String email, int room) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name : "+this.name
				+ "\nEmail : "+this.email;
	}

}
