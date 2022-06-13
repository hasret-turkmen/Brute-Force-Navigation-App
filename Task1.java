import java.util.Scanner;

//Locations is a helper class to store coordinates
class Locations {
	int x, y;

	//constructor
	public Locations(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//This method calculates the distance between any point and 0,0
	double distance(Locations b) {
		double dist;
		dist = Math.sqrt((b.y - y) * (b.y - y) + (b.x - x) * (b.x - x));
		return dist;

	}

}

public class Task1 {

	public static void main(String[] args) {
		
		Scanner bili = new Scanner(System.in);

		//Creates a location for starting point
		int userX = 0;
		int userY = 0;
		Locations start = new Locations(userX, userY);
		
		
		System.out.println("Enter locations: ");
		String input = bili.nextLine();
		
		//Removes paranthesis so that I can use the coordinates as int
		String input1= input.replaceAll("[()]", "");
		
		//Splits the string when there is comma so that they are only integers now
		String[] split = input1.split(",");
		
		//2D array to store the coordinates
		int[][] has = new int[3][2];
		
		//location array to store the coordinates as locations
		Locations[] arr = new Locations[has.length];
		int j=1;
		
		
		for(int a=0; a<has.length; a++) {
			//Turns the string into integers
			has[a][0] = Integer.parseInt(split[j-1]);
			has[a][1] = Integer.parseInt(split[j]);
			//Creates locations at every coordinate
			arr[a]= new Locations(has[a][0],has[a][1]);
			j++;
			j++;
		}
	
		//an array to store the distances
		double distances[] = new double[has.length];
		

		System.out.println("How many locations do you want to see?");
		int number = bili.nextInt();

		//Updates the distances while calculating every coordinate with 0,0
		for (int i = 0; i < distances.length; i++) {
			distances[i] = start.distance(arr[i]);
		}
		
		//Sorts the distances
		InsertionSort(distances);	
		
		//A location array to store the wanted number of closest locations
		Locations[] results = new Locations[number];
	
		for (int i = 0; i < number; i++) {
			for (int k = 0; k <= number; k++) {
				//if the first n sorted distance is equal to the calculated distance
				//add it to the results array
				if (distances[i]==start.distance(arr[k])) {
					results[i] = arr[k];
				}
			}
		}
		
		//prints the result
		System.out.println("Here are the closest " + number + " points:");
		for (int i = 0; i < number-1; i++) {
			System.out.print("(("+results[i].x + "," + results[i].y + "), ");
		}
		System.out.print( "("+results[number-1].x + "," + results[number-1].y + "))");
	}

	//An insertion sort method to sort locations in order
	private static void InsertionSort(double[] dist) {
		for (int i = 0; i < dist.length; ++i) {
			int j = i;
			while (j > 0 && dist[j - 1] > dist[j]) {
				double a = dist[j];
				dist[j] = dist[j - 1];
				dist[j - 1] = a;
				j = j - 1;

			}
		}
	}

}
