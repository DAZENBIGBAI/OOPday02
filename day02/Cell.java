package oo.day02;
//������
public class Cell {
	int row;   //�к�
	int col;   //�к�
	
	Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	Cell(int n){
		this(n,n);  //���ù��췽��
	}
	Cell(){
		this(0,0);  //���ù��췽��
	}
	
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





