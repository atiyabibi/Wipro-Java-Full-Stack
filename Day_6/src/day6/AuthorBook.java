package day6;
class Author{
	String name;
	String email;
	char gender;
	Author(String name,String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book{
	String name;
	Author author;
	double price;
	int qtyInstock;
	Book(String name, Author author, double price, int qtyInstock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInstock=qtyInstock;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.qtyInstock=quantity;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public Author getAuthor() {
		return author;
	}
	public int getQuantity() {
		return qtyInstock;
	}
}
public class AuthorBook {
	public static void main(String args[]) {
		Author a = new Author("William", "william@email.com", 'M');
		Book b=new Book("Java programming",a,250,1);
		System.out.println("Book Name: " + b.getName());
		System.out.println("Price: " + b.getPrice());
		System.out.println("Quantity: " + b.getQuantity());
		System.out.println("Author Name: " + b.getAuthor().name);
		System.out.println("Author Email: " + b.getAuthor().email);
		System.out.println("Author Gender: " + b.getAuthor().gender);
		b.setname("Python programming");
		System.out.println("Book Name: " + b.getName());
	}
}
