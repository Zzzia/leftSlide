package com.zia.leftslide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

/**
 * Created by zia on 2017/11/9.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private Context context;

    public Adapter(Context context){
        this.context = context;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class Holder extends RecyclerView.ViewHolder {
        private FrameLayout content,cancel;
        public Holder(View itemView) {
            super(itemView);
            content = itemView.findViewById(R.id.content);
            cancel = itemView.findViewById(R.id.item_cancel);
        }
    }
}
