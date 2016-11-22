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

public class home extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home, container, false);

        Button cake = (Button) v.findViewById(R.id.cake);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BirthdayActivity.class);
                startActivity(intent);
            }
        });
        Button cok = (Button) v.findViewById(R.id.cocktail);
        cok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CocktailActivity.class);
                startActivity(intent);
            }
        });
        Button sate = (Button) v.findViewById(R.id.sate);
        sate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SatayActivity.class);
                startActivity(intent);
            }
        });
        Button pasta = (Button) v.findViewById(R.id.pasta);
        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PastaActivity.class);
                startActivity(intent);
            }
        });
        Button ch = (Button) v.findViewById(R.id.christmas);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ChrismastActivity.class);
                startActivity(intent);
            }
        });
        Button kopi = (Button) v.findViewById(R.id.kopi);
        kopi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CofeeActivity.class);
                startActivity(intent);
            }
        });
        Button buntut = (Button) v.findViewById(R.id.buntut);
        buntut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BuntutActivity.class);
                startActivity(intent);
            }
        });
        Button torta = (Button) v.findViewById(R.id.torta);
        torta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TortaActivity.class);
                startActivity(intent);
            }
        });
        Button wedding = (Button) v.findViewById(R.id.wedding);
        wedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WeddingActivity.class);
                startActivity(intent);
            }
        });
        Button ice = (Button) v.findViewById(R.id.ice);
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), IceActivity.class);
                startActivity(intent);
            }
        });
        Button nasgor = (Button) v.findViewById(R.id.nasgor);
        nasgor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NasiActivity.class);
                startActivity(intent);
            }
        });
        Button pizza = (Button) v.findViewById(R.id.pizza);
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PizzaActivity.class);
                startActivity(intent);
            }
        });

        return v;

    }


}
