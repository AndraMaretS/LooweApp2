package id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.R;
import id.sch.smktelkom_mlg.project.xirpl404132231.loowe2.model.Traditional;

/**
 * Created by Briggita on 11/20/2016.
 */

public class TraditionalAdapter extends RecyclerView.Adapter<TraditionalAdapter.ViewHolder>
{
    ArrayList<Traditional> traditionalList;

    public TraditionalAdapter(ArrayList<Traditional> traditionalList)
    {
        this.traditionalList = traditionalList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Traditional traditional = traditionalList.get(position);
        holder.tvJudul.setText(traditional.judul);
        holder.tvDeskripsi.setText(traditional.deskripsi);
        holder.ivFoto.setImageDrawable(traditional.foto);
    }

    @Override
    public int getItemCount()
    {
        if (traditionalList!=null)
            return traditionalList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView)
        {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
