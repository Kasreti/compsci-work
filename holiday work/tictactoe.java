public class tictactoe{
	public static int size;
	public static char turn;
	public static boolean win = false;
	
	public static char[][] setupGrid(char[][] grid){
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				grid[i][j] = '-';
			}
		}
		return grid;
	}
	
	public static void printGrid(char[][] grid){
		System.out.println();
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		return;
	}
	
	public static void place(char[][] grid){
		int row;
		int col;
		boolean done = false;
		do{
			do{
				row = IBIO.inputInt("Row number: ");
				row--;
				if(row < 0 || row >= size){
					System.out.println("Out of bounds number -- please re-enter.");
				}
			} while(row <0 || row >= size);
			do{
				col = IBIO.inputInt("Column number: ");
				col--;
				if(col < 0 || row >= size){
					System.out.println("Out of bounds number -- please re-enter.");
				}
			} while(col <0 || row >= size);
			if(grid[row][col] == '-'){
				grid[row][col] = turn;
				done = true;
			} else{
				System.out.println("Spot is already taken!");
			}
		} while (done == false);
		return;
	}
	
	public static boolean win(char[][] grid){
		boolean row = true;
		boolean col = true;
		boolean ddia = true;
		boolean udia = true;
		
		row:
		for(int i=0; i<size; i++){
			row = true;
			for(int j=0; j<size; j++){
				if(grid[i][j] != turn){
					row = false;
					break row;
				}
			}
			if(row=true){
				break row;
			}
		} 
		
		col:
		for(int i=0; i<size; i++){
			col=true;
			for(int j=0; j<size; j++){
				if(grid[j][i] != turn){
					col = false;
					break col;
				}
			}
			if(col=true){
				break col;
			}
		}
		for(int i=0; i<size; i++){
			if(grid[i][i] != turn){
				ddia = false;
				break;
			}
		}
		for(int i=0; i<size; i++){
			if(grid[size-1-i][i] != turn){
				udia = false;
				break;
			}
		}
		// System.out.println(row + ", " + col + ", " + ddia + ", " + udia);
		return(row || col || ddia || udia);
	}	
	
	public static boolean isFull(char[][] grid){
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(grid[i][j] == '-'){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		size = IBIO.inputInt("Enter the dimensions for your Tic Tac Toe grid: ");
		System.out.println(size);
		char[][] grid = new char[size][size];
		grid = setupGrid(grid);
		do{
			turn = 'O';
			System.out.println("O's turn to play.");
			printGrid(grid);
			place(grid);
			if(win(grid) == true){
				win = true;
				break;
			}
			if(isFull(grid)){
				break;
			}
			
			turn = 'X';
			System.out.println("X's turn to play.");
			printGrid(grid);
			place(grid);
			if(win(grid) == true){
				win = true;
				break;
			}
		} while(!isFull(grid));
		printGrid(grid);
		if(win == true){
			System.out.println("\n" + turn + "'s victory!");
		} else{
			System.out.println("\nDraw...");
		}
	}
}
