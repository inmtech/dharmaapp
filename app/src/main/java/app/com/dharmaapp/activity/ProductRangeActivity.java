package app.com.dharmaapp.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import app.com.dharmaapp.R;
import app.com.dharmaapp.adapter.CatalogListAdapter;
import app.com.dharmaapp.adapter.ProductRangeListAdapter;
import app.com.dharmaapp.util.EqualSpacingItemDecoration;

public class ProductRangeActivity extends Activity {

    private RecyclerView recyclerviewProductList;
    private ArrayList<Integer> arrayListProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_range);
        loadData();
        findviews();
    }

    private void loadData() {
        arrayListProductList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayListProductList.add(R.drawable.range_one);
        }
    }

    private void findviews() {
        recyclerviewProductList = findViewById(R.id.recyclerviewProductList);
        recyclerviewProductList.setLayoutManager(new GridLayoutManager(ProductRangeActivity.this, 2));
        recyclerviewProductList.addItemDecoration(new EqualSpacingItemDecoration(30));
        recyclerviewProductList.setAdapter(new ProductRangeListAdapter(ProductRangeActivity.this, arrayListProductList));
    }
}
