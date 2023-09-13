package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] cibi = { "pathong", "pizza", "Burgir", "budino", "gelato", "tiramisù" };
		
		System.out.println("cibo al primo posto: " + cibi[0]);

		System.out.println("cibo all'ultimo posto: " + cibi[cibi.length -1]);
		
		boolean isListEven = cibi.length % 2 == 0;
		
		int middle = (cibi.length - 1) / 2;
		
		if(isListEven)
		{
			middle = cibi.length / 2;
		}
			

		System.out.println("cibo mediano: " + cibi[middle]);
	}
}
