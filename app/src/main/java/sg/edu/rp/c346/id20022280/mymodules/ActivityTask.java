package sg.edu.rp.c346.id20022280.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTask extends AppCompatActivity {

    TextView tvModCode;
    TextView tvModName;
    TextView tvAcadYear;
    TextView tvSem;
    TextView tvModCred;
    TextView tvVenue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        tvModCode=findViewById(R.id.textViewModCode);
        tvModName=findViewById(R.id.textViewModName);
        tvAcadYear=findViewById(R.id.textViewAcadYear);
        tvSem=findViewById(R.id.textViewSem);
        tvModCred=findViewById(R.id.textViewModCred);
        tvVenue=findViewById(R.id.textViewVenue);
        btnReturn=findViewById(R.id.buttonReturn);

        Intent intentRecieved = getIntent();
        tvModCode.setText("Module Code: "+intentRecieved.getStringExtra("ModCode"));
        tvModName.setText("Module Name: "+intentRecieved.getStringExtra("ModName"));
        tvAcadYear.setText("Academic Year: "+intentRecieved.getStringExtra("AcadYear"));
        tvSem.setText("Semester: "+intentRecieved.getStringExtra("Sem"));
        tvModCred.setText("Module Credit: "+intentRecieved.getStringExtra("ModCred"));
        tvVenue.setText("Venue: "+intentRecieved.getStringExtra("Venue"));

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReturn = new Intent(ActivityTask.this,MainActivity.class);
                startActivity(intentReturn);
            }
        });

    }
}