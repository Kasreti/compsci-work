import java.util.Arrays;
import java.util.Scanner;

public class tictactoe {
	public static void main (String[] args) {
		System.out.println("welcoming you to tictactoeington");
		char[][] table = new char[3][3];
		setup(table);
		printtable(table);
		int col;
		int row;
		char victor = ' ';
		do{
			System.out.println("O's turn.");
			do{
				row = IBIO.inputInt("Row: ");
				col = IBIO.inputInt("Column: ");
				row--;
				col--;
				if(!isempty(table,row,col)){
					System.out.println("Try again! Space is taken.");
				} else if (row > 2 || row < 0 || col > 2 || col < 0){
					System.out.println("Out of bounds!");
				}
			}while(!isempty(table,row,col) || row > 2 || row < 0 || col > 2 || col < 0);
			table[row][col] = 'O';
			if(lineformed(table) || isfull(table)){
				victor = 'O';
				break;
			}
			printtable(table);
			System.out.println("X's turn.");
			do{
				row = IBIO.inputInt("Row: ");
				col = IBIO.inputInt("Column: ");
				row = row-1;
				col = col-1;
				if(!isempty(table,row,col)){
					System.out.println("Try again! Space is taken.");
				} else if (row > 2 || row < 0 || col > 2 || col < 0){
					System.out.println("Out of bounds!");
				}
			}while(!isempty(table,row,col) || row > 2 || row < 0 || col > 2 || col < 0);
			table[row][col] = 'X';
			if(lineformed(table) || isfull(table)){
				victor = 'X';
				break;
			}
			System.out.println("\n");
			printtable(table);
		}while(!isfull(table));
		printtable(table);
		if(lineformed(table)){
			System.out.println(victor + "'s victory.");
		}else{
			System.out.println("Tie!");
		}
	}
	public static char[][] setup(char[][] table){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				table[i][j] = '-';
			}
		}
	return table;
	}
	public static void printtable(char[][] table){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	return;
	}
	
	public static boolean isempty(char[][] table, int row, int col){
		return(table[row][col] == '-');
	}
	
	public static boolean isfull(char[][] table){
		int count = 0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(table[i][j] != '-'){
					count++;
				}
			}
		}
		return(count == 9);
	}
	
	public static boolean lineformed(char[][] table){
		for(int i=0; i<3; i++){
			if(table[i][0] == table[i][1] && table[i][0] == table[i][2] && table[i][0] != '-'){
				return true;
			}
			if(table[0][i] == table[1][i] && table[0][i] == table[2][i] && table[0][i] != '-'){
				return true;
			}
		}
		if(table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[0][0] != '-'){
			return true;
		} else if (table[2][0] == table[1][1] && table[1][1] == table[0][2] && table[2][0] != '-'){
			return true;
		}
		return false;
	}
}

