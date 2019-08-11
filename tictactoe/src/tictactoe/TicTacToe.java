package tictactoe;
import java.util.*;

public class TicTacToe {
	public static void main(String args[]) {
		xoro();
	}
	
	public static void xoro() {
		char y;
		Scanner scan = new Scanner(System.in);
		System.out.println("X or O:");
		y = scan.next().charAt(0);
		char pos = 'x';																					//not entirely sure if creating of these characters were necessary
		char pas = 'X';
		char los = 'o';
		char las = 'O';
		int dec=0;
		if(y==pos||y==pas) {																			//converted the x and o to 1 and 0 so that it is easier to code the array logic
			dec = 1;																					//dec = 1 means X		
		}
		else if(y==los||y==las) {
			dec = 2;																					//dec = 2 means O	
		}
		else {
			System.out.println("Error: Enter either X or O.");													//incase an invalid character is entered, it will loop back to the input function
			xoro();	
		}
		boardloc(dec);
	}
	
	public static void boardloc(int x) {
		int loc,i=0,j=0,cnt=1,dec;
		dec=x;
		for(i=0;i<5;i++) {																				//5 rows table			
			if(i==1||i==3) {																			//for the horizontal lines
				System.out.println("-----");
				continue;
			}
			for(j=0;j<3;j++) {
				if(j!=2) {																				//the leftmost and the center character in table	
					System.out.print(cnt+"|");
				}
				else
				{
					System.out.print(cnt+"\n");															//the third element in a table			
				}
				cnt++;
			}
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the location:");
		loc = scan.nextInt();
		locfig(loc,dec);
		scan.close();
	}
	
	
	public static void locfig(int y, int j) {
		int[][] board;
		int dec = j;
		int x=y;
		board = new int[3][3];
		if(x<4) {
			board[0][x-1]=dec;
		}
		else if(x<7 && x>3) {
			board[1][x-4]=dec;
		}
		else if(x>6&&x<10){
			board[2][x-7]=dec;
		}
		else {
			System.out.println("Invalid Location\n");
			return;
		}
		dboard(board);
	}
	
	public static void dboard(int[][] brd){																//have to make a way to traverse both j and k at the same time yet hit all of the 9 numbers.
		int i=0,j=0,k=0;
	/*	System.out.print("\033[H\033[2J");  
	    System.out.flush();*/
		for(i=0;i<5;i++) {
			if(i==1||i==3) {
				System.out.println("-----");
				continue;
			}
			else {
				for(k=0;k<brd.length;k++) {
				for(j=0;j<brd[k].length;j++) {
					if(j!=2) {
						if(brd[k][j]==1) {																
							System.out.print("X"+"|");
							
						}
						else if(brd[k][j]==2){
							System.out.print("O"+"|");				
							//had to use a lot of loops for making the output table		
						}
						else {
							System.out.print(" "+"|");
							
						}
					}
					else
					{
						if(brd[k][j]==1) {
							System.out.print("X"+"\n");
							
						}
						else if(brd[k][j]==2){
							System.out.print("O"+"\n");
							
						}
						else {
							System.out.print(" "+"\n");
							
						}
					}
				}	
				}
			}	
		}
	}
	
/*	public static void line(int[][] brd) {
		if(brd[])
	}*/
}
