//Monomials = nodes

public class Monomial{
	private int coef;
	private  int power;
	private Monomial next;  
	
	public void printMonomial(){
		//if coef is a negative number
		if(coef < 0){	
			System.out.println(coef+"x^"+power);
		}
	
		if(coef == 0){
			System.out.println(coef);
		}
		//if not we will give it a plus
		else{		
			System.out.println("+"+coef+"x^"+power);
		}
	}
	
		public Monomial(int co, int ex, Monomial nextMonomial) {
			coef = co;
			power = ex;
			next = nextMonomial;
		}
		
		public Monomial(int co, int ex) {
			coef = co;
			power = ex;
		}
		
		public void setCoef(int co){
			coef = co;
		}
	
		public void setPower(int ex){
			power = ex; 
		}
		
		public void setNext (Monomial nextMonomial){ 
			next = nextMonomial;
		}
		
		public int getCoef(){
				return coef; 
		}
		
		public int getPower(){
			return power;
		}
	
	
		public Monomial getNext(){
			return next;
		}
	}
	