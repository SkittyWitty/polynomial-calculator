//easier use of multiple linked lists together

public class Polynomial {
	private MonomialList List;

	public Polynomial(){
		List = new MonomialList();
	}

	public void printPoly(){
		List.printMonomialList();;
	}

	public void insert(int co, int ex){
		List.insertAtBack(co, ex);
	}
	
	public void insertSortDo(int co, int ex){
		List.insertSort(co, ex);
	}
	
	public void add(Polynomial poly1,Polynomial poly2){  
		int co;
		int ex;
		Monomial one = poly1.List.first;  
		Monomial two = poly2.List.first;  
		while(one != null && two != null){  
			if(one.getPower() == two.getPower()){  
				co = one.getCoef() + two.getCoef();  
				ex = one.getPower();  
				one = one.getNext();  
				two = two.getNext();  
			}  
			else if(one.getPower() > two.getPower()){  
				co = one.getCoef();  
				ex = one.getPower();  
				one = one.getNext();  
			}  
			else {  
				co = two.getCoef();  
				ex = two.getPower();  
				two = two.getNext();  
			}  
			List.insertAtBack(co, ex);  
		}  
		while(one != null){  
			co = one.getCoef();  
			ex = one.getPower();  
			one = one.getNext();  
			List.insertAtBack(co, ex);  
		}  
		while(two != null){  
			co = two.getCoef();  
			ex = two.getPower();  
			two = two.getNext();  
			List.insertAtBack(co, ex);  
		}  
	}  	

	public void merge(Polynomial poly){  
		int co;
		int ex;
		Monomial one = poly.List.first;  
		Monomial two = poly.List.first.getNext();  
		while(one != null && two != null){ 
			if(one.getPower() == two.getPower()){  
				co = one.getCoef() + two.getCoef();  
				ex = one.getPower();  
				one = one.getNext();  
				two = two.getNext();  
				List.insertAtBack(co, ex);  
			}  
			else if(one.getPower() != two.getPower()){  
				co = one.getCoef();  
				ex = one.getPower();  
				two = two.getNext();
				one = one.getNext();
				List.insertAtBack(co, ex);  
			}  	
		}   
	}  	

	
	public void sub(Polynomial poly1,Polynomial poly2){  
		int co;
		int ex;
		Monomial one = poly1.List.first;  
		Monomial two = poly2.List.first;  
		while(one != null && two != null){  
			if(one.getPower() == two.getPower()){  
				co = one.getCoef() - two.getCoef();  
				ex = one.getPower();  
				one = one.getNext();  
				two = two.getNext();  
			}  
			else if(one.getPower() > two.getPower()){  
				co = one.getCoef();  
				ex = one.getPower();  
				one = one.getNext();  
			}  
			else {  
				co = two.getCoef();  
				ex = two.getPower();  
				two = two.getNext();  
			}  
			List.insertAtBack(co, ex);  
		}  
		while(one != null){  
			co=one.getCoef();  
			ex=one.getPower();  
			one=one.getNext();  
			List.insertAtBack(co, ex);  
		}  
		while(two != null){  
			co = two.getCoef();  
			ex = two.getPower();  
			two = two.getNext();  
			List.insertAtBack(co, ex);  
		}  
	}  

	public static Polynomial multiply(Polynomial uno, Polynomial dos){
		Polynomial temp = new Polynomial();
		Monomial a = uno.List.first;
		while (a != null ){
			Monomial b = dos.List.first;
			while(b != null){
				temp.insert((a.getCoef()*b.getCoef()),(a.getPower() + b.getPower()));
				b = b.getNext();
			}
			a= a.getNext();
		}
		return temp;
	}

	public static Polynomial derive(Polynomial uno){
		Polynomial temp = new Polynomial();
		Monomial a = uno.List.first;
		while(a != null){
			temp.insert(a.getCoef()*a.getPower(), a.getPower()-1);
			a = a.getNext();
		}
		return temp;
	}
}

