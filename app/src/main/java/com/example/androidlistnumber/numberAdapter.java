package com.example.androidlistnumber;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class numberAdapter  extends RecyclerView.Adapter<numberAdapter.ListNumberViewHolder>{
    public  int[] array;

    public numberAdapter(MainActivity mainActivity, int[] array) {
        this.array = array;
    }

    @NonNull
    @Override
    public ListNumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ListNumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListNumberViewHolder holder, int position) {

        holder.tvView.setText((position+1)+"");
    }

    @Override
    public int getItemCount() {
        return array.length;
    }

    class ListNumberViewHolder extends RecyclerView.ViewHolder{
        TextView tvView;

        public ListNumberViewHolder(@NonNull View itemView) {
            super(itemView);
            tvView = itemView.findViewById(R.id.tvView);
        }
    }
}
