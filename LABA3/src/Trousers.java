class Trousers extends Clother implements ManClother,WomanClother{
    Size size;
    double price;
    Color color;

    public Trousers(Size s, double p, Color c){
        super(s,p,c);
    }

    @Override
    public void wearMan() {
        System.out.println("Мужчина одет в брюки.");
    }

    @Override
    public void wearWoman() {
        System.out.println("Женщина одета в брюки.");
    }
}
