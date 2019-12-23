package cn.edu.hstc.p6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List <File> mlist;


    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textview;
        public ViewHolder(@NonNull View view) {
            super(view);
            textview = ((TextView) itemView.findViewById(R.id.textViewDisplay));
        }
    }


    public MyAdapter(List<File> list){
        mlist=list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
         ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       File file=mlist.get(position);
       holder.textview.setText(file.getName());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }








}
