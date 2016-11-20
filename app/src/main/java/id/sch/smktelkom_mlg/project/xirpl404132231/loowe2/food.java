package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Erron on 11/19/2016.
 */

public class food extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.food, container, false);
        Button cake = (Button) v.findViewById(R.id.button);
        cake.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity().getApplication(), KueActivity.class);
        startActivity(intent);
    }
}