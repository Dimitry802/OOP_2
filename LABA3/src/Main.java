public class Main {
   public static void main(String[] args){
       Clother[] clothes = {
               new Shirt(Size.M, 20.0, Color.BLUE),
               new Trousers(Size.L, 30.0, Color.BLACK),
               new Skirt(Size.S, 15.0, Color.RED),
               new Tie(Size.M, 10.0, Color.WHITE)
       };
       Atelier atelier = new Atelier();
       atelier.dressWoman(clothes);
       System.out.println("--------");
       atelier.dressMan(clothes);
   }
}
