package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ItalianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);

        setTitle("Italian Food");

        findViewById(R.id.imageViewPasta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianActivity.this, PastaActivity.class));
            }
        });

        findViewById(R.id.imageViewPizza).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianActivity.this, PizzaActivity.class));
            }
        });

        findViewById(R.id.imageViewTorta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalianActivity.this, TortaActivity.class));
            }
        });
    }
}
