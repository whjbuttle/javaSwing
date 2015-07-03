package syntax;
/*
 Date: 20150618
 Author: itbank
 Story: 접근제한자 문법
 */
public class AccessModifierSyntax {
	/*
	 인스턴스 변수(=멤버변수 중에서 클래스 변수를 제외한 것)의 접근제한자
	 - 필드나 메소드에 접근 권한을 지정할 수 있다.
	 - 효율적인 접근 권한은 컴포넌트의 독립성을 향상시킨다.
	 - 컴포넌트는 하나의 클래스 또는 유관한 클래스 그룹을 의미한다.

	 접근제한자			같은 클래스		같은패키지		상속관계다른패키지		무관한패키지
	 public			가능			가능			가능					가능
	 default(생략)	가능			가능			가능					불가능
	 protected		가능			가능			불가능				불가능
	 private		가능			불가능		불가능				불가능
	 */
	
}
