public class Reader {
    private String fio;
    private int numberBillet;
    private String faculty;
    private String birthday;
    private String numberPhone;
    public Reader(String fio, int numberBillet, String faculty, String birthday, String numberPhone){
        this.fio = fio;
        this.numberBillet = numberBillet;
        this.faculty = faculty;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
    }
    public Reader(){}

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberBillet() {
        return numberBillet;
    }

    public void setNumberBillet(int numberBillet) {
        this.numberBillet = numberBillet;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void takeBook(int quantity){
        if(quantity < 0) {
            System.out.println("Количество не может быть отрицательным");
            return;
        }
        System.out.println(this.fio + " взял(а) " + quantity + " книги");
    }

    public void takeBook(String... books){
        System.out.print(this.fio + " взял(а): ");
        System.out.print(books[0]);
        for(int i = 1; i < books.length; i++){
            System.out.print(", " + books[i]);
        }
        System.out.println();
    }

    public void takeBook(Book... books){
        System.out.print(this.fio + " взял(а): ");
        books[0].viewBook();
        for(int i = 1; i < books.length; i++){
            System.out.print(", ");
            books[i].viewBook();
        }
        System.out.println();
    }

    public void returnBook(int quantity){
        if(quantity < 0) {
            System.out.println("Количество не может быть отрицательным");
            return;
        }
        System.out.println(this.fio + " вернул(а) " + quantity + " книги");
    }

    public void returnBook(String... books){
        System.out.print(this.fio + " вернул(а): ");
        System.out.print(books[0]);
        for(int i = 1; i < books.length; i++){
            System.out.print(", " + books[i]);
        }
        System.out.println();
    }

    public void returnBook(Book... books){
        System.out.print(this.fio + " вернул(а): ");
        books[0].viewBook();
        for(int i = 1; i < books.length; i++){
            System.out.print(", ");
            books[i].viewBook();
        }
        System.out.println();
    }

}
