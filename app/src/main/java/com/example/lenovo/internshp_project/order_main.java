package com.example.lenovo.internshp_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class order_main extends AppCompatActivity implements Callback {
    int count = 0;



    RecyclerView recyclerView;
    Product product;
    ItemAdapter itemAdapter;
    Button button;
    TextView textView;
    TextView textView1;
    ArrayList<Product> productslist = new ArrayList<>();
    ArrayList<Product> selectedlist=null;
    private int totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_order_main);
        button = findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.cart);
        textView1=(TextView) findViewById(R.id.tvprice);
        recyclerView = findViewById(R.id.rv);
        setItems();
        adapterCall();
        //getCount();

    }

    private void adapterCall() {
        itemAdapter = new ItemAdapter(order_main.this, productslist,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(order_main.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemAdapter);
    }

    private void getCount() {
        int price = 0;
        for (int i = 0; i < selectedlist.size(); i++) {
            Product product = selectedlist.get(i);


            if(product.getItemsSelected()){
                count =i+1;
                price = price+Integer.parseInt(product.getPrice());
            }
            /*if(!product.getItemsSelected()){
                count= count-1;
            }*/
        }

        totalPrice =price;
        //String c=String.valueOf(count);
        textView.setText(String.valueOf(count));
        textView1.setText("Total price is: "+ String.valueOf(totalPrice));
    }

    private void setItems() {
        product = new Product(R.drawable.salad, "Salad", "Fresh veggies used", "100", false);
        productslist.add(product);

        product = new Product(R.drawable.pizza, "Pizza", "Stuffed Pan", "300", false);
        productslist.add(product);

        product = new Product(R.drawable.hamburger, "Burger", "With extra cheese", "150", false);
        productslist.add(product);

        product = new Product(R.drawable.fries, "French Fries", "Fresh and crispy", "60", false);
        productslist.add(product);
        product = new Product(R.drawable.spaghetti, "Pasta", "White/Red sauce", "200", false);
        productslist.add(product);
        product = new Product(R.drawable.drink, "Cold drinks", "With extra ice", "50", false);
        productslist.add(product);

        product = new Product(R.drawable.mojito, "Mojito", "Fresh and chilled", "120", false);
        productslist.add(product);
        product = new Product(R.drawable.pastry, "Chocolate Pastry", "Double cream layer", "100", false);
        productslist.add(product);

        product = new Product(R.drawable.icecream, "Ice Cream", "With amazing toppings", "100", false);
        productslist.add(product);
    /*LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    linearLayoutManager.setOrientation(LinearLayout.VERTICAL);*/
    }

    public void order(View view) {

        Intent intent=new Intent(getApplicationContext(),Final.class);
        //String s=editText1.getText().toString();
        //intent.putExtra("extra",s);

        intent.putExtra("items",textView.getText().toString());
        intent.putExtra("price",textView1.getText().toString());
        startActivity(intent);
        // Toast.makeText(this,"You have placed your order successfully",Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Total price to be paid is: " + totalPrice, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onCallback(ArrayList<Product> arrayList) {
        selectedlist=new ArrayList<>();
        selectedlist=arrayList;
        getCount();
    }
}
