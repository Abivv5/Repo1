package abstract_package;

public class Abstract_ex2_child extends Abstract_ex1 {

	public static void main(String[] args) {
		Abstract_ex2_child obj=new Abstract_ex2_child();
		obj.display();
		obj.add();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}

}
