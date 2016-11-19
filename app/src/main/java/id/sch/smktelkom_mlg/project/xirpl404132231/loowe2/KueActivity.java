package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.adapter.CakeAdapter;
import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.model.Cake;


public class KueActivity extends AppCompatActivity {

    ArrayList<Cake> mList = new ArrayList<>();
    CakeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kue);

        setTitle("Cake");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_kue);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new CakeAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.food);
        String[] arDeskripsi = resources.getStringArray(R.array.food_desc);
        TypedArray a = resources.obtainTypedArray(R.array.food_picture);
        Drawable[] arFoto = new Drawable[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            arFoto[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Cake(arJudul[i], arDeskripsi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }
}
