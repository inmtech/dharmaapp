package app.com.dharmaapp.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.com.dharmaapp.R;
import app.com.dharmaapp.util.CommonUtil;

public class QualityPolicyActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quality_policy);
    }

    public void onclickFirst(View view) {
        CommonUtil.showFullImaggeDialog(this, R.drawable.iso_certificate);
    }

    public void onclickTwo(View view) {
        CommonUtil.showFullImaggeDialog(this, R.drawable.vcci_certificate);
    }
    public void onclickThree(View view) {
        CommonUtil.showFullImaggeDialog(this, R.drawable.vcci_certificate);
    }
}
