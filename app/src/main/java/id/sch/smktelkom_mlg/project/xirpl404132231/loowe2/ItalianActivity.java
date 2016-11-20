package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.adapter.ItalianAdapter;
import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.model.Italian;

public class ItalianActivity extends AppCompatActivity {

    ArrayList<Italian> mList = new ArrayList<>();
    ItalianAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);

        setTitle("Italian Food");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_italian);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new ItalianAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.italian);
        String[] arDeskripsi = resources.getStringArray(R.array.decs);
        TypedArray a = resources.obtainTypedArray(R.array.italian_foto);
        Drawable[] arFoto = new Drawable[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            arFoto[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Italian(arJudul[i], arDeskripsi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }
}
