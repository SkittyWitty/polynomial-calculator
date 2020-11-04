
public class TestPoly {
	public static void main(String [] args){
		Polynomial poly1 = new Polynomial();
		Polynomial poly2 = new Polynomial();
		Polynomial poly3 = new Polynomial();
		Polynomial poly4 = new Polynomial();
		Polynomial poly5 = new Polynomial();
		Polynomial poly6 = new Polynomial();
		Polynomial poly7 = new Polynomial();
		Polynomial poly8 = new Polynomial();

		/*
		poly7.insertSortDo(10, 5);
		poly7.insertSortDo(4, 3);
		poly7.insertSortDo(5, 6);
		poly7.insertSortDo(1, 2);
		poly7.insertSortDo(50, 5);
		
		poly7.printPoly();
		System.out.println();
		*/
		
		//sets up poly 1 and 2
		poly2.insert(8, 1);
		poly2.insert(5, 2);
		poly2.insert(6, 3); 
		
		poly1.insert(50, 1);
		poly1.insert(10, 2);
		//poly1.insert(5, 2);
		
		// prints out poly 1 and 2
		
		
		poly1.printPoly();
		System.out.println();

		poly2.printPoly();
		System.out.println();
		

		//poly3.add(poly1, poly2);
		//poly3.printPoly();

		
		//poly4 = Polynomial.derive(poly1);
		//poly4.printPoly();
		
		
		
		poly5 = Polynomial.multiply(poly1, poly2);
		poly5.printPoly();

		//System.out.println();
		//poly6.merge(poly1);
		//poly6.printPoly();
		
		
		
		//poly8.merge(poly7);
		//poly8.printPoly();
	}
}