package www.ltbx.in.practicederekbanas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter extends ArrayAdapter<String>{
    MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2, values);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        @SuppressLint("ViewHolder") View theView = theInflater.inflate(R.layout.row_layout2, parent, false);
        String tvShow = getItem(position);
        TextView theTextView = theView.findViewById(R.id.textView1);
        theTextView.setText(tvShow);
        ImageView theImageView = theView.findViewById(R.id.imageView1);
        theImageView.setImageResource(R.drawable.dot);
        return theView;
    }
}
