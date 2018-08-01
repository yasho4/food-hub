package com.example.lenovo.internshp_project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.List;
import java.util.zip.Inflater;

import static android.view.View.inflate;

/**
 * Created by lenovo on 04-06-2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Context ctx;
    private ArrayList<Product> products;
    Callback callback;
    private ArrayList<Product> selectedList = new ArrayList<>();


    public ItemAdapter(Context ctx, ArrayList<Product> products,Callback callback) {
        this.ctx = ctx;
        this.products = products;
        this.callback=callback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.menu_items, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final Product product = products.get(holder.getAdapterPosition());

        holder.imageView.setImageResource(product.getProductImage());
        holder.textView1.setText(product.getProductName());
        holder.textView2.setText(product.getProductDesc());
        holder.textView3.setText(product.getPrice());
        holder.checkBox.setOnCheckedChangeListener(null);
        holder.checkBox.setChecked(product.getItemsSelected());

        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

             if(holder.checkBox.isChecked())
             {
                 product.setItemsSelected(true);
                 //holder.checkBox.setChecked(true);
                 notifyDataSetChanged();
                 //getCount();
                 //selectedList=new ArrayList<>();
                 if(product.getItemsSelected()){
                     selectedList.add(product);
                 }

                 if(callback!=null){
                     callback.onCallback(selectedList);
                 }
             }
             else {
                 product.setItemsSelected(false);
                // getCount2();
                 //holder.checkBox.setChecked(false);
                 notifyDataSetChanged();
                 //selectedList=new ArrayList<>();
                 if(!product.getItemsSelected()){
                     selectedList.remove(product);
                 }
                 if(callback!=null){
                     callback.onCallback(selectedList);
                 }
             }
            }
        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1, textView2, textView3;
        CheckBox checkBox;

        public ViewHolder(View view)
        {
            super(view);
            this.setIsRecyclable(false);
            imageView = (ImageView) view.findViewById(R.id.iv1);
            textView1 = view.findViewById(R.id.tv1);
            textView2 = view.findViewById(R.id.tv2);
            textView3 = view.findViewById(R.id.tv3);
            checkBox = view.findViewById(R.id.checkBox);
        }

    }
}
