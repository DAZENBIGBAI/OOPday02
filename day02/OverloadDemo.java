package oo.day02;
//方法重载演示
public class OverloadDemo {
	public static void main(String[] args) {
		Aoo o = new Aoo(); //创建对象
		o.pay(); //自动调用无参pay
		o.pay("abc"); //自动调用String参pay
		o.pay(5,5.55);
		o.pay(5.55,5);
	}
}

class Aoo{
	void pay(){}
	void pay(String s){}
	void pay(int i,double d){}
	void pay(double d,int i){}
	
	//int pay(){} //编译错误，与返回值类型无关
	//如下编译错误，与变量名无关，只考虑类型
	//void pay(double o,int m){}
}





