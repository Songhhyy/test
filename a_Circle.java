
public class a_Circle {
	/* 		public	class	Circle
		 	���� ����	Ŭ��������	Ŭ�����̸�
	 	��� : Ŭ���� ���� ��� = �ʵ�(��� ����) + �޼ҵ�(��� �Լ�)
	  	Ŭ���� public : �ٸ� ��� Ŭ�������� Ŭ���� ��� ���
	  	��� public : �ٸ� ��� Ŭ�������� ��� ���� ���
	*/
	int radius;		// ���� �������� �����ϴ� ��� ����
	String name;	// ���� �̸� �����ϴ� ��� ����
	
	public double getArea() {	// ��� �޼ҵ�
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a_Circle pizza = new a_Circle();
		
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ "+area);
		
		a_Circle donut = new a_Circle();
		
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ "+donut.getArea());
		
		

	}

}
