package viral.wsg;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class App {

	public static void main(String[] args) {
		final int GRID_SIZE = 10;

		char[][] grid = new char[GRID_SIZE][GRID_SIZE];
		
		for (int i=0; i < GRID_SIZE; i++) {
			for (int j =0; j < GRID_SIZE; j++) {
				
				grid [i][j] = '_';
				
			}
			
		}
		
		
		List<String> words = Arrays.asList("ONE", "TWO", "THREE");

		
		
		for (int i=0; i<words.size(); i++ ) {
			int x = ThreadLocalRandom.current().nextInt(0, GRID_SIZE);
			int y = ThreadLocalRandom.current().nextInt(0, GRID_SIZE);
			
			grid[x][y] = words.get(i).charAt(0);
		}
	
		for (int i=0; i < GRID_SIZE; i++) {
			for (int j =0; j < GRID_SIZE; j++) {
				System.out.print(grid[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		
		

	}

}
