package app.com.dharmaapp.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import app.com.dharmaapp.R;
import app.com.dharmaapp.util.CommonUtil;

public class PdfViewerActivity extends Activity implements OnPageChangeListener, OnLoadCompleteListener,
        OnPageErrorListener {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        pdfView = findViewById(R.id.pdfView);

        if (getIntent().getExtras() != null) {
            pdfView.fromAsset(getIntent().getStringExtra(getString(R.string.intent_key_path)))
                    .defaultPage(0)
                    .onPageChange(PdfViewerActivity.this)
                    .enableAnnotationRendering(true)
                    .onLoad(this)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(10) // in dp
                    .onPageError((OnPageErrorListener) this)
                    .load();
        }

    }

    @Override
    public void loadComplete(int nbPages) {

    }

    @Override
    public void onPageChanged(int page, int pageCount) {
            
    }

    @Override
    public void onPageError(int page, Throwable t) {
        CommonUtil.displayToast(this, getString(R.string.error_pdf_page));
    }
}
