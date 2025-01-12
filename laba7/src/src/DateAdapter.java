public class DateAdapter implements TotalDay {
    Date date;

    public DateAdapter(Date date){
        this.date = date;
    }

    @Override
    public int getTotalDay() {
        return date.getDay() + date.getMonth() * 30 + date.getYear() * 360;
    }
}
