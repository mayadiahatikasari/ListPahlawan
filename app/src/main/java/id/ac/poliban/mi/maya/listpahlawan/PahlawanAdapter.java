package id.ac.poliban.mi.maya.listpahlawan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class PahlawanAdapter extends BaseAdapter {
    private List<Pahlawan> data = new ArrayList<>();
    public PahlawanAdapter(List<Pahlawan>data) {this.data = data;}

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_hero;
        TextView tvPahlawanName;
        TextView tvPahlawanDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_pahlawan, parent, false);

        img_hero = convertView.findViewById(R.id.img_hero);
        tvPahlawanName = convertView.findViewById(R.id.tv_pahlawan_nama);
        tvPahlawanDesc = convertView.findViewById(R.id.tv_pahlawan_description);

        Glide.with(parent.getContext())
                .load(data.get(position).getHero())
                .apply(new RequestOptions().override(60,60))
                .into(img_hero);
        tvPahlawanName.setText(data.get(position).getNamaPahlawan());
        tvPahlawanDesc.setText(data.get(position).getDescPahlawan());
        return convertView;
    }
}
