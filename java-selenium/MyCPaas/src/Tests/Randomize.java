package Tests;

import java.util.Random;

public class Randomize {
	public static String generateMobileNumber() {
		Random random = new Random();
        int firstDig = 7 + random.nextInt(3);
        int nextFour = 1000 + random.nextInt(8999);
        int lastFive = 10000 + random.nextInt(89999);
        String phone = String.valueOf(firstDig) + String.valueOf(nextFour) + String.valueOf(lastFive);
        return phone;
    }
	
	//public static String generateFullName() {
		//return generateName() + " " + generateName();
	//}
	
	public static String generateName() {
		 String[] firstNames = {"Amit", "Ravi", "Sita", "John", "Priya", "Neha", "Rahul", "Sara", "Mohit", "Lily"};
	     String[] lastNames = {"Sharma", "Tandon", "Verma", "Smith", "Patel", "Singh", "Roy", "Brown", "Lee", "Gupta"};

	     Random random = new Random();
	     String first = firstNames[random.nextInt(firstNames.length)];
	     String last = lastNames[random.nextInt(lastNames.length)];

	     String name =  first + " " + last;
	     
        return name;
	}
	
	public static String generate12DigitId() {
		Random random = new Random();
        int firstDig = 1 + random.nextInt(8);
        int nextFive = 10000 + random.nextInt(8999);
        int lastSix = 100000 + random.nextInt(89999);
        String entity = String.valueOf(firstDig) + String.valueOf(nextFive) + String.valueOf(lastSix);
        return entity;
    }
	
	public static String generateSenderId() {
		String[] firstNames = {"Amita", "Raviraj", "Sitamani", "Johnray", "Priyaraj", "Nehagupta", "Rahulraj", "Sarabjit", "Mohite", "Lilyput"};

	     Random random = new Random();
	     String first = firstNames[random.nextInt(firstNames.length)];

	     String name =  first;
       return name;
    }
}
