
//This puts Monomial into a linkedlist

public class MonomialList{
	public Monomial first;
	public Monomial last;

	public MonomialList(){
		first = last = null;
	}

	public void printMonomialList(){
		Monomial current = first;
		while(current != null){
			current.printMonomial();
			current = current.getNext();
		}
		System.out.println();
	}

	public boolean isEmpty(){
		return(first == null); 
	}


	public void insertSort(int coef, int exp){
		Monomial temp = new Monomial(coef, exp, null);
		if (first == null){
			first = temp;
		}
		else {
			Monomial blank = null;
			Monomial a = first;

			if (temp.getPower() > a.getPower()){
				temp.setNext(first);
				first = temp;
			} 
			else {
				while (a != null && a.getPower() > temp.getPower()){
					blank = a;
					a = a.getNext();
				}

				blank.setNext(temp);
				temp.setNext(a);

			}
		}
	}


	public void sort(){
		Monomial temp = new Monomial(first.getCoef(), first.getPower());
		Monomial one = null;
		Monomial two = first;
		if (temp.getPower() > two.getPower()){
			temp.setNext(first);
			first = temp;
		} 
		else {
			while (two != null && two.getPower() > temp.getPower()){
				one = two;
				two = two.getNext();
			}

			one.setNext(temp);
			temp.setNext(one);
		}
	}

	public void insertAtBack(int co, int ex){
		if(isEmpty()){
			first = last = new Monomial(co, ex, null); 	
		}	
		else{
			Monomial temp = first;
			while(temp.getNext()!= null){
				temp = temp.getNext();
			}
			temp.setNext(new Monomial(co, ex));
			last = temp.getNext();
		}
	}

	public void insertAtFront(int co, int ex){
		if(isEmpty()){
			first = last = new Monomial(co, ex); 
		}	
		else{
			first = new Monomial(co, ex, first); 
		}
	}


}