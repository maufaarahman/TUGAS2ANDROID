package id.ac.uinsuska.tugas2android;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListmasakanAdapter extends RecyclerView.Adapter<ListmasakanAdapter.ListViewHolder> {
    private ArrayList<Masakan> listMasakan;

    public ListmasakanAdapter(ArrayList<Masakan>list){
        this.listMasakan = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_masakan,parent,false);

        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Masakan masakan = listMasakan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(masakan.getGambar())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgGambar);
        holder.tvNama.setText(masakan.getName());
        holder.tvDeskripsi.setText(masakan.getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return listMasakan.size();

    }



    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;
        TextView tvNama;
        TextView tvDeskripsi;

         ListViewHolder(View itemview) {
            super(itemview);
            imgGambar = itemview.findViewById(R.id.img_item_makanan);
             tvNama = itemview.findViewById(R.id.material_hour_tv_name_item);
             tvDeskripsi= itemview.findViewById(R.id.material_hour_tv_Deskripsi);
        }
    }
}
