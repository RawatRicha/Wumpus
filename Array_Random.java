import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array_Random {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Gold g=new Gold();
		Pit p=new Pit();
		Wumpus w=new Wumpus();
		ClearGround cg=new ClearGround();
		String[][] board=new String[4][4];
		int player_life=1;
		
		List<String> game_item=new ArrayList<>();
		board[0][0]="*";
		for(int i=0;i<3;i++)
		{
			game_item.add(p.return_items());
			
		}
		for(int i=0;i<2;i++)
		{
			game_item.add(g.return_item());
		}
		for(int i=0;i<1;i++)
		{
			game_item.add(w.return_gameItem());
		}
		
		
		for(int i=0;i<10;i++)
		{
			game_item.add(cg.return_item());
		}
		
		Collections.shuffle(game_item);
		List<String> game_item2=new ArrayList<String>();
		game_item2.addAll(game_item);
		/*for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				board[i][j]=game_item.get(i*4+j);
			}
		}*/
		
		try{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				if(i==0&&j==0)
				{
					System.out.print("\t");
					board[i][j]="*";
					System.out.print(board[i][j] );
					System.out.print("\t");
					System.out.print("|");
					
				}
				else{
				board[i][j]=game_item.get(i*4+j);
				System.out.print("\t");
				//System.out.print(board[i][j] );
				System.out.print("\t");
				System.out.print("|");
				
			}}
			System.out.print("\n-----------------------------------------------------------------\n");
			
		}}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Wumpus World!!!");	
		}
		int px=0;
		int py=0;
		while(player_life==1){
		System.out.println("Enter 1 for moving down,2 for moving up,3 for moving left and 4 for moving right");
		int key=sc.nextInt();
		if(key==1)
		{
			
			String temp=board[px][py];
			px=px+1;
			if(px>3)
			{
				px=0;
				board[px+3][py]=board[px][py];
				board[px][py]=temp;
			}
			board[px-1][py]=board[px][py];
			board[px][py]=temp;
			
			for(int i=0;i<board.length;i++)
			{
				for(int j=0;j<board.length;j++)
				{
					if(i==px)
					if(i==px&&j==py){
						System.out.print("\t");	
						System.out.print(board[px][py]);
						System.out.print("\t");
						System.out.print("|");
						continue;
					}
					
					if(i==(px-1)&&j==py)
					{
						System.out.print("\t");	
						//System.out.print(board[px-1][py]);
						System.out.print("\t");
						System.out.print("|");
					}
					
					
					else{	
					board[i][j]=game_item2.get(i*4+j);
					System.out.print("\t");
					//System.out.print(board[i][j] );
					System.out.print("\t");
					System.out.print("|");
					
				}}
				System.out.print("\n-----------------------------------------------------------------\n");
				
			}
			}
		if(key==2)
			{
			
			String temp=board[px][py];
			px=px-1;
			if(px<0)
			{
				px=3;
				board[px-3][py]=board[px][py];
				board[px][py]=temp;
			}
			else{
			board[px+1][py]=board[px][py];
			board[px][py]=temp;
			}
			for(int i=0;i<board.length;i++)
			{
				for(int j=0;j<board.length;j++)
				{
					if(i==px)
					if(i==px&&j==py){
						System.out.print("\t");	
						System.out.print(board[px][py]);
						System.out.print("\t");
						System.out.print("|");
						continue;
					}
					
					if(i==(px+1)&&j==py)
					{
						System.out.print("\t");	
						//System.out.print(board[px+1][py]);
						System.out.print("\t");
						System.out.print("|");
					}
					
					
					else{	
					board[i][j]=game_item2.get(i*4+j);
					System.out.print("\t");
					//System.out.print(board[i][j] );
					System.out.print("\t");
					System.out.print("|");
					
				}}
				System.out.print("\n-----------------------------------------------------------------\n");
				
			
			}
			}
		if(key==3)
		{
		
		String temp=board[px][py];
		py=py-1;
		if(py<0)
		{
			py=3;
			board[px][py-3]=board[px][py];
			board[px][py]=temp;
		}
		else{
		board[px][py+1]=board[px][py];
		board[px][py]=temp;
		}
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				if(i==px)
				if(i==px&&j==py){
					System.out.print("\t");	
					System.out.print(board[px][py]);
					System.out.print("\t");
					System.out.print("|");
					continue;
				}
				
				if(i==(px)&&j==py+1)
				{
					System.out.print("\t");	
					//System.out.print(board[px][py+1]);
					System.out.print("\t");
					System.out.print("|");
				}
				
				
				else{	
				board[i][j]=game_item2.get(i*4+j);
				System.out.print("\t");
				//System.out.print(board[i][j] );
				System.out.print("\t");
				System.out.print("|");
				
			}}
			System.out.print("\n-----------------------------------------------------------------\n");
			
		
			
			}
			}
		if(key==4)
		{
		
		String temp=board[px][py];
		py=py+1;
		if(py>3)
		{
			py=0;
			board[px][py+3]=board[px][py];
			board[px][py]=temp;
		}
		else{
		board[px][py-1]=board[px][py];
		board[px][py]=temp;
		}
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				if(i==px)
				if(i==px&&j==py){
					System.out.print("\t");	
					System.out.print(board[px][py]);
					System.out.print("\t");
					System.out.print("|");
					continue;
				}
				
				if(i==(px)&&j==py-1)
				{
					System.out.print("\t");	
					//System.out.print(board[px][py-1]);
					System.out.print("\t");
					System.out.print("|");
				}
				
				
				else{	
				board[i][j]=game_item2.get(i*4+j);
				System.out.print("\t");
				//System.out.print(board[i][j] );
				System.out.print("\t");
				System.out.print("|");
				
			}}
			System.out.print("\n-----------------------------------------------------------------\n");
		}}}
	}}


