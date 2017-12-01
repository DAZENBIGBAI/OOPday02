package oo.day02;
//J型
public class J {
	Cell[] cells;
	J(){
		this(0,0);
	}
	J(int row,int col){
		cells = new Cell[4];
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row,col+1);
		cells[2] = new Cell(row,col+2);
		cells[3] = new Cell(row+1,col+2);
	}

	void drop(){  //下落
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	void moveLeft(){  //左移
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	void moveRight(){ //右移
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	void print(){ //打印每个格子的坐标
		for(int i=0;i<cells.length;i++){
			String s = cells[i].getCellInfo();
			System.out.println(s);
		}
	}
	
}
