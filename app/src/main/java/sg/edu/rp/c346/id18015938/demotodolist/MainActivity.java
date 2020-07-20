package sg.edu.rp.c346.id18015938.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvList;
    ArrayList<ToDoItem> ToDoList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.listViewList);
        ToDoList = new ArrayList<>();

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.DAY_OF_MONTH,1);
        time1.set(Calendar.MONTH, 8);
        time1.set(Calendar.YEAR, 2020);

        time2.set(Calendar.DAY_OF_MONTH,2);
        time2.set(Calendar.MONTH, 8);
        time2.set(Calendar.YEAR, 2020);

        ToDoItem item1 = new ToDoItem("Go for movie",time1 );
        ToDoItem item2 = new ToDoItem("Go for haircut", time2);

        ToDoList.add(item1);
        ToDoList.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, ToDoList);

        lvList.setAdapter(adapter);



    }
}
