public abstract class Pet
{
	protected String Name;
	protected double weight;
	public Pet(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	public abstract String makeSound();
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getweight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
}
