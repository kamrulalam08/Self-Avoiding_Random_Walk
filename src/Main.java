import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
	static long NW = 1000000;
	static int x = 0;
	static int y = 0;
	static String home = "(" + x + "," + y + ")";
	static String tempPosition = "";
	static ArrayList<String> myList = new ArrayList<String>();
	public static void main(String[] args) {

	for(int iwalk =0; iwalk< NW; iwalk++) {
		myList.add(home);
		for (int i = 0; i < 3; i++) {
			nextStep();
			if(myList.contains(tempPosition)) {
				System.out.println("non - SAW");
				return;
			}
			else if(!myList.contains(tempPosition)) {
			myList.add(tempPosition);
			}
		}
		
		for(int i =0; i< myList.size(); i++) {
			System.out.print(myList.get(i));
		}
	}
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
