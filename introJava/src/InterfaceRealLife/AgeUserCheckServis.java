package InterfaceRealLife;

public class AgeUserCheckServis implements IUserCheckServis{
	//Methods
	@Override
	public boolean chechUser(User user) {
		if(user.getAge() >= 18) {
			return true;
		}
		return false;
	}
}
