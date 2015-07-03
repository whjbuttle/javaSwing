package inheritance;

public class AndroidPhone extends Iphone {
	public static final String BRAND = "안드로이드";
	public static boolean TRUE = true;
	private String data;
	
	public String getData() {
		return data;
	}
	
	@Override
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany() + "\t" + 
				super.getCall() + "\t" +
				data + " : 카카오톡 메시지 전달";
	}
	
	
	
	
}
