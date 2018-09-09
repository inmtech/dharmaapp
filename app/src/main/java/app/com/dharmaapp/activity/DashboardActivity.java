package app.com.dharmaapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import app.com.dharmaapp.R;


public class DashboardActivity extends Activity implements View.OnClickListener {

    private ImageView imgviewHeader;
    private Button btnAboutUs;
    private Button btnProductRange;
    private Button btnQualityPolicy;
    private Button btnCatalogs;
    private Button btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        findViews();
    }


    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2018-09-08 13:32:50 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        imgviewHeader = (ImageView) findViewById(R.id.imgviewHeader);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnProductRange = (Button) findViewById(R.id.btnProductRange);
        btnQualityPolicy = (Button) findViewById(R.id.btnQualityPolicy);
        btnCatalogs = (Button) findViewById(R.id.btnCatalogs);
        btnContact = (Button) findViewById(R.id.btnContact);

        btnAboutUs.setOnClickListener(this);
        btnProductRange.setOnClickListener(this);
        btnQualityPolicy.setOnClickListener(this);
        btnCatalogs.setOnClickListener(this);
        btnContact.setOnClickListener(this);
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2018-09-08 13:32:50 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if (v == btnAboutUs) {
            startActivity(new Intent(DashboardActivity.this, AboutUsActivity.class));
            // Handle clicks for btnAboutUs
        } else if (v == btnProductRange) {
            startActivity(new Intent(DashboardActivity.this, ProductRangeActivity.class));
            // Handle clicks for btnProductRange
        } else if (v == btnQualityPolicy) {
            // Handle clicks for btnQualityPolicy
        } else if (v == btnCatalogs) {
            startActivity(new Intent(DashboardActivity.this, CatalogsActivty.class));
        } else if (v == btnContact) {
            // Handle clicks for btnContact
        }
    }
}
