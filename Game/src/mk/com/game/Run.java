package mk.com.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Run {
	static ArrayList<Integer> playerPosition=new ArrayList<Integer>();
	static ArrayList<Integer> cpuPosition=new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		
		char[][] board= {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}};
		System.out.println("Enter your name: ");
		String user=sc.nextLine();
		System.out.println("Welcome "+user+" let`s play");
		while(true) {
			System.out.println("Enter your placement:(1-9) ");
			int myPlace=sc.nextInt();
			
			System.out.println(myPlace);
		while (playerPosition.contains(myPlace) || cpuPosition.contains(myPlace)) {
			System.out.println("Position is already taken :( , please enter a new number 0-9");
			 myPlace=sc.nextInt();	
		}
		int cpuPlace=rnd.nextInt(9)+1;
		while (playerPosition.contains(cpuPlace) || cpuPosition.contains(cpuPlace)) {
			System.out.println("Position is already taken :( , please enter a new number 0-9");
			cpuPlace=rnd.nextInt(9)+1;	
		}
			Play.placeYourElement(board, "player", myPlace);
			Play.placeYourElement(board, "CPU", cpuPlace);
			Play.printBoard(board);
			String rezult=Play.winner();
			System.out.println(rezult);
			}
	}

}
