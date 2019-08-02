package tictactoe;
import java.util.*;

public class TicTacToe {
	public static void main(String args[]) {
		System.out.println("The locations are:");
		boardloc();
	}
	
	public static void boardloc() {
		int loc,i=0,j=0,cnt=1;
		char orx;
		Scanner scan = new Scanner(System.in);
		for(i=0;i<5;i++) {
			if(i==1||i==3) {
				System.out.println("-----");
				continue;
			}
			for(j=0;j<3;j++) {
				if(j!=2) {
					System.out.print(cnt+"|");
				}
				else
				{
					System.out.print(cnt+"\n");
				}
				cnt++;
			}
		}
		System.out.println("Enter the location:");
		loc = scan.nextInt();
		System.out.println("X or O:");
		orx = scan.next().charAt(0);
		locfig(loc,orx);
	}
	
	public static void locfig(int x, char y) {
		char[][] board;
		board = new char[3][3];
		if(x<4) {
			board[0][x-1]=y;
		}
		else if(x<7 && x>3) {
			board[1][x-3]=y;
		}
		else if(x>7&&x<10){
			board[2][x-7]=y;
		}
		else {
			System.out.println("Invalid Location\n");
			boardloc();
		}
		dboard(board);
	}
	
	public static void dboard(char[][] brd){
		int i=0,j=0,k=0;
		for(i=0;i<5;i++) {
			if(i==1||i==3) {
				System.out.println("-----");
				continue;
			}
			for(k=0;k<3;k++) {
				for(j=0;j<3;j++) {
/*					if(j!=2) {
						System.out.print(brd[k][j]+"|");
					}
					else
					{
						System.out.print(brd[k][j]+"\n");
					} */
					System.out.println(brd[k][j]);
				}
			}	
		}
		
	}
}
