package oo.day02;
//����������ʾ
public class OverloadDemo {
	public static void main(String[] args) {
		Aoo o = new Aoo(); //��������
		o.pay(); //�Զ������޲�pay
		o.pay("abc"); //�Զ�����String��pay
		o.pay(5,5.55);
		o.pay(5.55,5);
	}
}

class Aoo{
	void pay(){}
	void pay(String s){}
	void pay(int i,double d){}
	void pay(double d,int i){}
	
	//int pay(){} //��������뷵��ֵ�����޹�
	//���±��������������޹أ�ֻ��������
	//void pay(double o,int m){}
}





