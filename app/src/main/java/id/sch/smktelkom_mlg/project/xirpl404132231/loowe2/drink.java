package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Erron on 11/19/2016.
 */

public class drink extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.drink, container, false);

        Button cake = (Button) v.findViewById(R.id.buttoncocktail);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CocktailActivity.class);
                startActivity(intent);
            }
        });

        Button tes = (Button) v.findViewById(R.id.buttoncofee);
        tes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CofeeActivity.class);
                startActivity(intent);
            }
        });

        Button italian = (Button) v.findViewById(R.id.buttonice);
        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), IceActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}
