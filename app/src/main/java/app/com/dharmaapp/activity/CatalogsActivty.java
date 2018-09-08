package app.com.dharmaapp.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

import app.com.dharmaapp.R;
import app.com.dharmaapp.adapter.CatalogListAdapter;
import app.com.dharmaapp.model.CatalogModel;
import app.com.dharmaapp.util.EqualSpacingItemDecoration;

public class CatalogsActivty extends Activity {


    private RecyclerView recyclerviewCatalog;
    private ImageView imgviewHeader;
    private ArrayList<CatalogModel> arrayListDiagnosisTerm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogs_activty);
        loadData();
        findviews();
    }

    private void loadData() {
        arrayListDiagnosisTerm = new ArrayList<>();
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.acSection), R.mipmap.ic_launcher, "A C Section.pdf"));
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.architecural_section), R.mipmap.ic_launcher, "Architectural Section.pdf"));
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.hardware_section), R.mipmap.ic_launcher, "Hard Ware Section.pdf"));
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.other_section), R.mipmap.ic_launcher, "Other Section.pdf"));
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.special_section), R.mipmap.ic_launcher, "Special Section.pdf"));
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.sutecase_section), R.mipmap.ic_launcher, "Sute Case Section.pdf"));
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.texil_section), R.mipmap.ic_launcher, "Textil Section.pdf"));
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.transport_section), R.mipmap.ic_launcher, "Transport Section.pdf"));
        arrayListDiagnosisTerm.add(new CatalogModel(getString(R.string.tub_section), R.mipmap.ic_launcher, "Tub Section.pdf"));
    }

    private void findviews() {
        recyclerviewCatalog = findViewById(R.id.recyclerviewCatalog);
        imgviewHeader = findViewById(R.id.imgviewHeader);
        recyclerviewCatalog.setLayoutManager(new GridLayoutManager(CatalogsActivty.this, 1));
        recyclerviewCatalog.addItemDecoration(new EqualSpacingItemDecoration(16));
        recyclerviewCatalog.setAdapter(new CatalogListAdapter(CatalogsActivty.this, arrayListDiagnosisTerm));
    }
}
