package sg.edu.rp.c346.id20022280.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWAD;
    TextView tvSDP;
    TextView tvUIUX;
    TextView tvMAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWAD = findViewById(R.id.textViewWAD);
        tvSDP = findViewById(R.id.textViewSDP);
        tvUIUX = findViewById(R.id.textViewUIUX);
        tvMAD = findViewById(R.id.textViewMAD);

        tvWAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTask.class);
                intent.putExtra("ModCode", "C203");
                intent.putExtra("ModName","Web Appln Development in php");
                intent.putExtra("AcadYear","2021");
                intent.putExtra("Sem","1");
                intent.putExtra("ModCred","4");
                intent.putExtra("Venue","W67M");
                startActivity(intent);

            }
        });

        tvSDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTask.class);
                intent.putExtra("ModCode", "C206");
                intent.putExtra("ModName","Software Development Process");
                intent.putExtra("AcadYear","2021");
                intent.putExtra("Sem","1");
                intent.putExtra("ModCred","4");
                intent.putExtra("Venue","W65D");
                startActivity(intent);

            }
        });
        tvUIUX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTask.class);
                intent.putExtra("ModCode", "C218");
                intent.putExtra("ModName","UI/UX Design for Apps");
                intent.putExtra("AcadYear","2021");
                intent.putExtra("Sem","1");
                intent.putExtra("ModCred","4");
                intent.putExtra("Venue","W64G");
                startActivity(intent);

            }
        });
        tvMAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTask.class);
                intent.putExtra("ModCode", "C346");
                intent.putExtra("ModName","Mobile App Development");
                intent.putExtra("AcadYear","2021");
                intent.putExtra("Sem","1");
                intent.putExtra("ModCred","4");
                intent.putExtra("Venue","E62E");
                startActivity(intent);

            }
        });
    }
}