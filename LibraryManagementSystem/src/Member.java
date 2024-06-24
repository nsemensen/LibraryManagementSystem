import java.util.Objects;

public class Member {
	private String memberID;
	private String name;
	private String email;
	private String phone;

	public Member(String memberID, String name, String email, String phone) {
		this.memberID = memberID;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getMemberID() {
		return memberID;
	}

	@Override
	public String toString() {
		return "memberID=" + memberID +", name=" + name + ", email=" + email + ", phone="+ phone ;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Member member = (Member) o;
		return memberID.equals(member.memberID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberID);
	}
}
