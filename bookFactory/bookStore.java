

public abstract  class bookStore {
   protected String  isbn;
   protected String title;
   protected double price;
   protected int year;
protected String author;
public bookStore(String isbn,String title,double price,int year, String author){
    this.isbn=isbn;
    this.title=title;
    this.price=price;
    this.year=year;
    this.author=author;
}

   public String getIsbn(){
    return isbn;
   }
   public double getPrice(){
    return price;
   }
   public int getYear(){
    return year;
   }

    public abstract boolean isAviliable(int quantity);
 public abstract  double buyBook(String isbn,int quantatiy,String email,String address);
}
