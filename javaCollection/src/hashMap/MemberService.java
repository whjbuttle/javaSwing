package hashMap;

public interface MemberService {
	public void join(String name, String addr, int age, String id, String password);
	public String login(String id, String password);
}
