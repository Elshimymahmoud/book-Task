public class ebook extends bookStore {
    private String fileType;

    public ebook(String isbn, String title, double price, int year, String author, String fileType) {
        super(isbn, title, price, year, author);
        this.fileType = fileType;
    }

   

    @Override
    public double buyBook(String isbn, int quantity, String email, String address) {
        MailService.send(this, email);
        System.out.println("Quantum Bookstore: Sent eBook " + title + " to " + email);
        return price * quantity;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    @Override
    public boolean isAviliable(int quantity) {
return true;    }
}
