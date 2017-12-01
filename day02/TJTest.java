package oo.day02;
//T型、J型测试类
public class TJTest {
	public static void main(String[] args) {
		System.out.println("原始:");
		T t = new T(2,3);
		t.print();
		
		System.out.println("下落:");
		t.drop();
		t.print();
	}
}
