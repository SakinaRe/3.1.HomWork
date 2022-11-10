package entites;

public class Courses {
	private int id;
	private String name;
	private double Price;
	
	public Courses(int id, String name, double Price) {
		this.id=id;
		this.name=name;
		this.Price=Price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
	
	

}
