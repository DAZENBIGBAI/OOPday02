package oo.day02;
//������
public class Cell {
	int row;   //�к�
	int col;   //�к�
	
	void drop(){  //����1��
		row++;
	}
	void drop(int n){ //����n��
		row += n;
	}
	void moveLeft(){  //����1��
		col--;
	}
	void moveLeft(int n){  //����n��
		col -= n;
	}
	
	
	
	
	String getCellInfo(){  //��ȡ��������
		return row+",,,"+col;
	}

}





