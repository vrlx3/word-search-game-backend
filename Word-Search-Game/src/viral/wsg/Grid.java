package viral.wsg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Grid {

	int GRID_SIZE;
	char[][] contents;
	List <Coordinate> coordinates = new ArrayList<>();
	
	
	
	
	
	private class Coordinate {
		int x;
		int y;
		

		Coordinate (int x, int y) {
			this.x = x;
			this.y = y;
			
		}
		
	}

	Grid(int gridSize) {
		this.GRID_SIZE = gridSize;
		contents = new char[GRID_SIZE][GRID_SIZE];
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int j = 0; j < GRID_SIZE; j++) {
				contents[i][j] = '_';
				coordinates.add(new Coordinate (i,j));
			}
		}
		Collections.shuffle(coordinates);
	}

	public void fillGrid(List<String> words) {
		
		for (String word : words) {
			
		
			int x = ThreadLocalRandom.current().nextInt(0, GRID_SIZE);
			int y = ThreadLocalRandom.current().nextInt(0, GRID_SIZE);
			
			if (word.length() + y > GRID_SIZE) continue;
			
			for (char c : word.toCharArray()) {
				contents[x][y++] = c;
			}

		}
	}

	void printGrid() {
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int j = 0; j < GRID_SIZE; j++) {
				System.out.print(contents[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
