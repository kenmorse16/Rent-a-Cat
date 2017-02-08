import java.text.NumberFormat;

public class Cat
{
    private String name = new String("");
    private double cost = 0;
	private boolean isRented = false;
	
	
	public Cat(String n, double p){
			setName(n);
			setCost(p);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		if (n instanceof String){
			name = (String) n;
		}
	}
	
	public double getCost(){
		return cost;
	}
	
	public void setCost(double p){
		if (p < 0){
			IllegalArgumentException iae = new IllegalArgumentException("Cost must be positive.");
            throw iae;
		}
		cost = p;
	}
	
	public void rentCat(){
		isRented = true;
	}
	
	public void returnCat(){
		isRented = false;
	}
	
	public String toString(){
		return (name+": $" + cost + " / day");
	}
}