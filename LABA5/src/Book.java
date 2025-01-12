public class Book {
    private String name;
    private String author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    public void viewBook(){
        System.out.print(name + " " + author);
    }
}
