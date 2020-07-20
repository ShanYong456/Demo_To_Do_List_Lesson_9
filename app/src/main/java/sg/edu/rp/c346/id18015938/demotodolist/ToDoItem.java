package sg.edu.rp.c346.id18015938.demotodolist;


import java.util.Calendar;


public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR)+"("+getDay(date.get(Calendar.DAY_OF_WEEK))+")";
    }

    private String getDay(int day) {
        String dow = "";
        if (day == Calendar.MONDAY) {
            dow = "Monday";
        }else if (day == Calendar.TUESDAY){
            dow = "Tuesday";
        }else if (day == Calendar.WEDNESDAY){
            dow = "Wednesday";
        }else if (day == Calendar.THURSDAY){
            dow = "Thursday";
        }else if (day == Calendar.FRIDAY){
            dow ="Friday";
        }else if (day == Calendar.SATURDAY){
            dow = "Saturday";
        }else if (day == Calendar.SUNDAY){
            dow = "Sunday";
        }

        return dow;
    }
}
