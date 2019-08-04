package tictactoe;
import java.util.*;

public class TicTacToe {
	public static void main(String args[]) {
		System.out.println("The locations are:");														//Location of the tictactoe table.
		boardloc();
	}
	
	public static void boardloc() {
		int loc,i=0,j=0,cnt=1;
		char orx;
		Scanner scan = new Scanner(System.in);
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
		System.out.println("Enter the location:");
		loc = scan.nextInt();
		System.out.println("X or O:");
		orx = scan.next().charAt(0);
		locfig(loc,orx);
		scan.close();
	}
	
	public static void locfig(int x, char y) {
		int[][] board;
		char pos = 'x';																					//not entirely sure if creating of these characters were necessary
		char pas = 'X';
		char los = 'y';
		char las = 'Y';
		int dec=0;
		if(y==pos||y==pas) {																			//converted the x and o to 1 and 0 so that it is easier to code the array logic
			dec = 1;																								
		}
		else if(y==los||y==las) {
			dec = 0;
		}
		else {
			System.out.println("Enter either X or O:");													//incase an invalid character is entered, it will loop back to the input function
			boardloc();
		}
		board = new int[3][3];
		if(x<4) {
			board[0][x-1]=dec;
		}
		else if(x<7 && x>3) {
			board[1][x-3]=dec;
		}
		else if(x>7&&x<10){
			board[2][x-7]=dec;
		}
		else {
			System.out.println("Invalid Location\n");
			boardloc();
		}
		dboard(board);
	}
	
	public static void dboard(int[][] brd){
		int i=0,j=0,k=0;
		for(i=0;i<5;i++) {
			if(i==1||i==3) {
				System.out.println("-----");
				continue;
			}
			for(k=0;k<3;k++) {
				for(j=0;j<3;j++) {
					if(j!=2) {
						if(brd[k][j]==1) {																
							System.out.print("X"+"|");
						}
						else if(brd[k][j]==0){
							System.out.print("O"+"|");													//had to use a lot of loops for making the output table		
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
						else if(brd[k][j]==0){
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
