package metodosabstratos;

public abstract class Shape {
	private Color color;
	
	public Shape() {
	
	}
	public Shape(Color color) {
		
		this.color = color;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
    public abstract double area();//quando o metodo eh abstrato, eh obrigatorio que a classe tbm seja

}
