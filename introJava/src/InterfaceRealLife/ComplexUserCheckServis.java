package InterfaceRealLife;

public class ComplexUserCheckServis implements IUserCheckServis {
	@Override
	public boolean chechUser(User user) {
		if(user.getAge() >= 18 && user.getName().startsWith("fe")) {
			return true;
		}
		return false;
	}
}
