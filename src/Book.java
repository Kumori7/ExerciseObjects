public class Book {
    private String name;
    private String author;
    private double price;

    Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public String getBookDetails(){
        return name + " :"+ author + " :"+ price;
    }
}// end of book class
