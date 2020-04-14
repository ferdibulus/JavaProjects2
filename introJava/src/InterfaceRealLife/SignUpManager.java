package InterfaceRealLife;

public class SignUpManager {
	private IUserCheckServis iUserCheckServis;
	
	public SignUpManager(IUserCheckServis iUserCheckServis) {
	
		this.iUserCheckServis = iUserCheckServis;
	}

	public void signUp(User user){
		//AgeUserCheckServis ageUserCheckServis = new AgeUserCheckServis();
		if(iUserCheckServis.chechUser(user)) {
			System.out.println("Kullanici Kayit oldu: " + user.getName());
		}
		else {
			System.out.println("Kullanici kayit olmadi");
		}
	}
}
