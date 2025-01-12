public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        System.out.println(sun);

        Sun sun2 = Sun.getInstance();
        System.out.println(sun2);

        TotalDay totalDay = null;
        Date date = new TotalDayAdapter(totalDay);

    }
}