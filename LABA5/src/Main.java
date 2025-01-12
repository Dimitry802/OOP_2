public class Main {
    public static void main(String[] args) {
        Phone user1 = new Phone("9583754831", "Nokia 3310", "0.1");
        Phone user2 = new Phone("9654543672", "Iphone Galaxy C69 Ultra Pro 228 Maxim");
        Phone user3 = new Phone();
        System.out.println(user1.getNumber() + " " + user1.getModel() + " " + user1.getWeight());
        user1.receiveCall("Бабуля", "97544339854");
        user1.sendMessage("9876543210", "9546382432", "9514347835");
        int n = 5;
        Reader[] readers = new Reader[n];
        readers[0] = new Reader("Петров В. В.", 1121, "Математики и ИТ", "14.08.2001", "9561345322");
        readers[1] = new Reader("Смирнова Ю. Б.", 1042, "Юридический", "22.12.1999", "9754561092");
        readers[2] = new Reader("Черчилль У. Л.", 1234, "Юридический", "30.11.2005", "9765432764");
        readers[3] = new Reader("Зотников Ю. С.", 2314, "Экономический", "18.02.2006", "9561234543");
        readers[4] = new Reader();
        readers[4].setFio("Борисова Л. З.");
        readers[4].setNumberBillet(1432);
        readers[4].setFaculty("Лицей");
        readers[4].setBirthday("12.09.2008");
        readers[4].setNumberPhone("9651236543");
        readers[0].takeBook(52);
        readers[2].takeBook("Тарас Бульба", "Алгоритмы и структуры данных в Паскале", "Как говорить красиво");
        Book[] books = new Book[4];
        books[0] = new Book("Братья Карамазовы", "Ф. М. Достоевский");
        books[1] = new Book("Отцы и дети", "И. С. Тургенев");
        books[2] = new Book("Нос", "Н. В. Гоголь");
        books[3] = new Book("Преступление и наказание", "Ф. М. Достоевский");
        readers[1].returnBook(books);
        readers[4].takeBook(books);
    }
}