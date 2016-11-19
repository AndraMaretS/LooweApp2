package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.R;
import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.model.Cake;

/**
 * Created by Andra Maret on 19/11/2016.
 */
public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.ViewHolder> {

    ArrayList<Cake> cakeList;

    public CakeAdapter(ArrayList<Cake> cakeList) {
        this.cakeList = cakeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Cake cake = cakeList.get(position);
        holder.tvJudul.setText(cake.judul);
        holder.tvDeskripsi.setText(cake.deskripsi);
        holder.ivFoto.setImageDrawable(cake.foto);
    }

    @Override
    public int getItemCount() {
        if (cakeList != null)
            return cakeList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
