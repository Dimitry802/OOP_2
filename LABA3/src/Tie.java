class Tie extends Clother implements ManClother {
    Size size;
    double price;
    Color color;

    public Tie(Size s, double p, Color c){
        super(s,p,c);
    }

    @Override
    public void wearMan() {
        System.out.println("Мужчина одет в галстук.");
    }
}