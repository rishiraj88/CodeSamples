import java.util.List;

public class NullPointerExceptionPlus {
	public static void main(String[] args) {
		System.out.println(UserProfile.newInstance().getRoleClass().getPrivileges().toString());
	}
}


class UserProfile {

	public static UserProfile newInstance() {
		return new UserProfile();
	}

	private UserProfile() {
		this.setRoleClass(new RoleClass());
	}
	private void setRoleClass(RoleClass roleClass) {
		this.roleClass = roleClass;
	}

	private RoleClass roleClass;

	public RoleClass getRoleClass() {
		return this.roleClass;
	}

}
class RoleClass {
	
	private List<Privilege> privileges;

	public List<Privilege> getPrivileges() {
		return privileges;
	}
	
	RoleClass() {
		//this.setPrivileges(Arrays.asList(new Privilege()));
		this.setPrivileges(null);
	}

	private void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}
}
class Privilege {
	private String privilegeLevel;

	public Privilege() {
		this.privilegeLevel = "USER";
	}
	
	@Override
	public String toString() {
		return "P[\""+privilegeLevel+"\"]";
	}
}
