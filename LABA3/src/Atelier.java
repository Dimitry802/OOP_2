public class Atelier {
    public void dressWoman(Clother[] clothes) {
        System.out.println("Одежда для женщины:");
        for (Clother clothing : clothes) {
            if (clothing instanceof WomanClother) {
                System.out.println("Размер: " + clothing.getSize() + ", Цвет: " + clothing.getColor() + ", Цена: " + clothing.getPrice());
            }
        }
    }

    public void dressMan(Clother[] clothes) {
        System.out.println("Одежда для мужчины:");
        for (Clother clothing : clothes) {
            if (clothing instanceof ManClother) {
                System.out.println("Размер: " + clothing.getSize() + ", Цвет: " + clothing.getColor() + ", Цена: " + clothing.getPrice());
            }
        }
    }
}
