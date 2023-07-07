package com.ing.travelalpha.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.ing.travelalpha.Adapters.CategoryAdapter;
import com.ing.travelalpha.Adapters.PopularAdapter;
import com.ing.travelalpha.Domains.CategoryDomain;
import com.ing.travelalpha.Domains.PopularDomain;
import com.ing.travelalpha.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular, adapterCat;
    private RecyclerView recyclerViewPopular, recyclerViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items= new ArrayList<>();
        items.add(new PopularDomain("Mar caible, avendia lago","Miami Beach","2 twin bed, 1 bath, balkony, sea view...",2,true,4.8,"pic1",true,200));
        items.add(new PopularDomain("Passo Rolle, TN","Hawaii Beach","1 queen bed, deluxe room, 2 wc, 1 bath, b.b, sea view",1,true,5,"pic2",false,250));
        items.add(new PopularDomain("Mar caible, avendia lago","Miami Beach","extra spa, jakuzi ...",3,true,4.3,"pic3",true,300));

        recyclerViewPopular = findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        adapterPopular = new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

        ArrayList<CategoryDomain> catsList = new ArrayList<>();
        catsList.add(new CategoryDomain("Beaches","cat1"));
        catsList.add(new CategoryDomain("Camps","cat2"));
        catsList.add(new CategoryDomain("Forest","cat3"));
        catsList.add(new CategoryDomain("Desert","cat4"));
        catsList.add(new CategoryDomain("Mountain","cat5"));

        recyclerViewCategory = findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        adapterCat = new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);










    }
}