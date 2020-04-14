package InterfaceRealLife;

public class Main {

	public static void main(String[] args) {
		SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckServis());
		signUpManager.signUp(new User(1, "ferdi", 23));

	}

}
