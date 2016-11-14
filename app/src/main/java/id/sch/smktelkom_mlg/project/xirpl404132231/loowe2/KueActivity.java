package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class KueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kue);

        setTitle("Cake");

        findViewById(R.id.imageViewBirthday).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KueActivity.this, BirthdayActivity.class));
            }
        });

        findViewById(R.id.imageViewChrismast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KueActivity.this, ChrismastActivity.class));
            }
        });

        findViewById(R.id.imageViewWedding).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KueActivity.this, WeddingActivity.class));
            }
        });
    }
}
