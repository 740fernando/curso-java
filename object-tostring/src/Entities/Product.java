package Entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price *quantity;
	}
	public void addProducts(int quantity) {
		this.quantity+=quantity;// this - é uma auto referencia a variavel da classe "Products"
	}
	public void removeProducts(int quantity) {
		this.quantity-=quantity;
	}
	public String toString() {
		return "Name : "+name
				+" Preço: $"+String.format("%.2f", price)
				+" Quantidade: "+quantity
				+" Total: $"+String.format("%.2f", totalValueInStock());
	}
}
