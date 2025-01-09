class Skirt extends Clother implements WomanClother {
    Size size;
    double price;
    Color color;

    public Skirt(Size s, double p, Color c){
        super(s,p,c);
    }

    @Override
    public void wearWoman() {
        System.out.println("Женщина одета в юбку.");
    }
}
