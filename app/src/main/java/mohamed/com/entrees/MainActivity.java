package mohamed.com.entrees;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    String s1[] , s2[];
    int images[] = {R.drawable.chickenvegetablesoup,R.drawable.mozzarellasticks,R.drawable.grapeleaves
    ,R.drawable.butterscotchwings,R.drawable.maccheesepasta,R.drawable.kebba,R.drawable.salad,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.N_Entrees);
        s2 = getResources().getStringArray(R.array.E_prices);

        MyAdapter4 myAdapter = new MyAdapter4(this , s1 , s2   , images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}