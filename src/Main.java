import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	static int count = 0;
	static long NW = 1000000;
	static int x = 0;
	static int y = 0;
	static int numSteps =40;
	static int final_x =0;
	static int final_y =0;
	static long square_distance =0;
	static String tempPosition = "";
	static ArrayList<String> finalList = new ArrayList<String>();

	public static void main(String[] args) {

	for(int iwalk =0; iwalk< NW; iwalk++) {
		ArrayList<String> myList = new ArrayList<String>();
		x=0;
		y=0;
		String home = "(" + x + "," + y + ")";
		System.out.println("pass "+ (iwalk+1));
		myList.add(home);
		for (int i = 0; i < numSteps; i++) {
			nextStep();
			if(myList.contains(tempPosition)) {
				System.out.println("non-SAW");
				myList.clear();
				break;
			}
			else if(!myList.contains(tempPosition)) {
			myList.add(tempPosition);
			}
			if(i == numSteps -1) {
				final_x = x;
				final_y= y;
				
				square_distance = (final_x * final_x) + (final_y * final_y) ;
				System.out.println("square_distance = " + square_distance);
				count++;
			}
		}
		
		for(int i =0; i< myList.size(); i++) {
			System.out.print(myList.get(i));
		}
		System.out.println();
	}
	System.out.println();
	System.out.println(count);
}
	
	public static void nextStep() {
		int randomNum = ThreadLocalRandom.current().nextInt(4);
		switch(randomNum) {
		case 0:
			x+=1;
			y+=0;
			tempPosition = "(" + x + "," + y+ ")";
			break;
		
		case 1:
			x-=1;
			y+=0;
			tempPosition = "(" + x + "," + y+ ")";
			break;
			
		case 2:
			x+=0;
			y+=1;
			tempPosition = "(" + x + "," + y+ ")";			
			break;
			
		case 3:
			x+=0;
			y-=1;
			tempPosition = "(" + x + "," + y+ ")";
			break;
		}

	}
}
