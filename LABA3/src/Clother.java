abstract class Clother {
     Size size;
     double price;
     Color color;
     public Clother(Size s, double p, Color c){
          this.size = s;
          this.price = p;
          this.color = c;
     }
     public Size getSize(){
          return size;
     }

     public double getPrice() {
          return price;
     }
     public Color getColor(){
          return color;
     }
}

