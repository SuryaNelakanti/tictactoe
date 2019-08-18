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
		scan.close();
		char pos = 'x';																					//not entirely sure if creating of these characters were necessary
		char pas = 'X';
		char los = 'o';
		char las = 'O';
		char dec=' ';
		if(y==pos||y==pas) {																			
			dec = 'X';																					
		}
		else if(y==los||y==las) {
			dec = 'Y';																						
		}
		else {
			System.out.println("Error: Enter either X or O.");													//incase an invalid character is entered, it will loop back to the input function
			xoro();	
		}
		boardloc(dec);																							//this is the map of the tictactoe table
	}
	
	public static void boardloc(char pip) {
		System.out.println("1 | 2 | 3");
		System.out.println("----------");
		System.out.println("4 | 5 | 6");
		System.out.println("----------");
		System.out.println("7 | 8 | 9");
		
		plrturn(pip);																							//this is to switch the players from comp to ai
	}
	
	
	public static void locfig(char y) {
		int loc=0;
		System.out.println("Enter the location");
		Scanner scan = new Scanner(System.in);
		loc = scan.nextInt();
		if(loc>=10||loc<0) {
			System.out.println("Invalid location\n");
			boardloc(y);
		}
		scan.close();
		loc(loc,y);
	}
	
	public static void complog(char x) {
		Random ai = new Random();
		int comp = ai.nextInt(10);
		loc(comp,x);
	}
	
	public static void plrturn(char x) {
		int i=0;
		while(i<9) {																							//not sure if using while loop is a good idea.
			if(i%2==0) {
				locfig(x);																						//entering location input from user
			}
			else {
				complog(x);																						//computer location
			}
			i++;
		}
	}
	
	public static void loc(int loc, char y){
		char[][] board;
		int x = loc;
		char dec = y;
		board = new char[3][3];
		if(x<4) {
			board[0][x-1]=dec;
		}
		else if(x<7 && x>3) {
			board[1][x-4]=dec;
		}
		else if(x>6&&x<10){
			board[2][x-7]=dec;
		}
		System.out.printf("Entering %c at location %d \n",y,loc);
		dboard(board);
	}
	
	public static void dboard(char[][] brd){																//have to make a way to traverse both j and k at the same time yet hit all of the 9 numbers.
		System.out.printf("%c | %c | %c \n", brd[0][0],brd[0][1],brd[0][2]);
		System.out.println("----------");
		System.out.printf("%c | %c | %c \n", brd[1][0],brd[1][1],brd[1][2]);
		System.out.println("----------");
		System.out.printf("%c | %c | %c \n", brd[2][0],brd[2][1],brd[2][2]);
	}
	

	
}
