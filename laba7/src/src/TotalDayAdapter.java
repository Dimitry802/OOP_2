public class TotalDayAdapter implements Date{
    private TotalDay totalDay;

    public TotalDayAdapter(TotalDay totalDay){
        this.totalDay = totalDay;
    }

    @Override
    public int getDay() {
        return totalDay.getTotalDay() % 30;
    }

    @Override
    public int getMonth() {
        return (totalDay.getTotalDay() / 30) % 12;
    }

    @Override
    public int getYear() {
        return totalDay.getTotalDay() / 360;
    } 
}
