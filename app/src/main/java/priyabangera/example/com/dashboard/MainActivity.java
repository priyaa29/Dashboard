package priyabangera.example.com.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView androidGridView;
    String[] gridViewString = {"PageOne","PageTwo","PageThree","PageFour ","PageFive","PageSix",} ;
    int[] gridViewImageId = {R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout);


        ImageAdapter adapterViewAndroid = new ImageAdapter(MainActivity.this, gridViewString, gridViewImageId);
        androidGridView = (GridView) findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                switch (i)
                {
                    case 0:
                        Intent myintent = new Intent(MainActivity.this,
                                SampleActivity.class);
                        startActivity(myintent);
                        Toast.makeText(MainActivity.this, " Page One ", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Intent myintent1 = new Intent(MainActivity.this,
                                SampleActivity.class);
                        startActivity(myintent1);
                        Toast.makeText(MainActivity.this, " Page Two ", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Intent myintent2 = new Intent(MainActivity.this,
                                SampleActivity.class);
                        startActivity(myintent2);
                        Toast.makeText(MainActivity.this, "Page Three", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Intent myintent3 = new Intent(MainActivity.this,
                                SampleActivity.class);
                        startActivity(myintent3);
                        Toast.makeText(MainActivity.this, " Page Four ", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Intent myintent4 = new Intent(MainActivity.this,
                                SampleActivity.class);
                        startActivity(myintent4);
                        Toast.makeText(MainActivity.this, " Page Five ", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Intent myintent5 = new Intent(MainActivity.this,
                                SampleActivity.class);
                        startActivity(myintent5);
                        Toast.makeText(MainActivity.this, " Page Six ", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}
