package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.R;
import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.model.Italian;

/**
 * Created by Angga on 11/20/2016.
 */
public class ItalianAdapter extends RecyclerView.Adapter<ItalianAdapter.ViewHolder> {

    ArrayList<Italian> italianList;

    public ItalianAdapter(ArrayList<Italian> italianList) {
        this.italianList = italianList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Italian italian = italianList.get(position);
        holder.tvJudul.setText(italian.judul);
        holder.tvDeskripsi.setText(italian.deskripsi);
        holder.ivFoto.setImageDrawable(italian.foto);
    }

    @Override
    public int getItemCount() {
        if (italianList != null)
            return italianList.size();
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
