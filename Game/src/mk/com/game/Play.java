package mk.com.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Play {
	static ArrayList<Integer> playerPosition=new ArrayList<Integer>();
	static ArrayList<Integer> cpuPosition=new ArrayList<Integer>();
//Method to print board
	public static  void printBoard(char[][] board) {
		for(char[] row: board ) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}	
	}
	
	//method to place your number
	public static void placeYourElement(char[][] board,String user,int myPlace) {
		char symbol='X';
		if(user.equals("player")) {
			symbol='X';
			playerPosition.add(myPlace);
		}else if(user.equals("CPU")) {
			symbol='0';
			cpuPosition.add(myPlace);
		}
		switch(myPlace) {
		
		case 1:
			board[0][0]=symbol;
			break;
		case 2:
			board[0][2]=symbol;
			break;
		case 3:
			board[0][4]=symbol;
			break;
		case 4:
			board[2][0]=symbol;
			break;
		case 5:
			board[2][2]=symbol;
			break;
		case 6:
			board[2][4]=symbol;
			break;
		case 7:
			board[4][0]=symbol;
			break;
		case 8:
			board[4][2]=symbol;
			break;
		case 9:
			board[4][4]=symbol;
			break;
	
		}
		
	
	}
	
	//method to check winner
	public static String winner() {
		List topRow=Arrays.asList(1,2,3);
		List midRow=Arrays.asList(4,5,6);
		List botRow=Arrays.asList(7,8,9);
		List leftCol=Arrays.asList(1,4,7);
		List midCol=Arrays.asList(2,5,8);
		List rigCol=Arrays.asList(3,6,9);
		List crossx=Arrays.asList(1,5,9);
		List crossy=Arrays.asList(3,5,7);
	
	List<List> winner=new ArrayList<List>();	
	winner.add(topRow);
	winner.add(midRow);
	winner.add(botRow);
	winner.add(leftCol);
	winner.add(midCol);
	winner.add(rigCol);
	winner.add(crossy);
	winner.add(crossx);
	
	for(List l: winner) {
		if(playerPosition.containsAll(l)) {
			return "You are the Winner";
		}else if(cpuPosition.containsAll(l)) {
			return "You lost :(";
		}else if(playerPosition.size() + cpuPosition.size() == 9) {
			return "Fin";
		}
	}
	return "";	
		
	}
}
