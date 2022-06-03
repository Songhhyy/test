
public class a_Circle {
	/* 		public	class	Circle
		 	접근 권한	클래스선언	클래스이름
	 	멤버 : 클래스 구성 요소 = 필드(멤버 변수) + 메소드(멤버 함수)
	  	클래스 public : 다른 모든 클래스에서 클래스 사용 허락
	  	멤버 public : 다른 모든 클래스에게 멤버 접근 허용
	*/
	int radius;		// 원의 반지름을 저장하는 멤버 변수
	String name;	// 원의 이름 저장하는 멤버 변수
	
	public double getArea() {	// 멤버 메소드
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a_Circle pizza = new a_Circle();
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+area);
		
		a_Circle donut = new a_Circle();
		
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+donut.getArea());
		
		

	}

}
