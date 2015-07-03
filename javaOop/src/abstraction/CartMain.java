package abstraction;

public class CartMain {
	public static void main(String[] args) {
		TV samsungTV = new TV();
		samsungTV.setInfo("삼성", "와이드TV", "123-456", "42인치", "LCD");
		//samsungTV.getInfo();
		Notebook lgNotebook = new Notebook();
		lgNotebook.setInfo("LG", "노트북", "12345", "i7", "8G", "1T");
		//lgNotebook.getInfo();
		
		// 생성자를 사용하지 않는 배열선언은 인터페이스 타입으로도 가능하다
		Product cart[] = new Product[2];
		cart[0] = samsungTV;
		cart[1] = lgNotebook;
		
		for(Product product : cart){
			product.getInfo();
		}
	}
}
