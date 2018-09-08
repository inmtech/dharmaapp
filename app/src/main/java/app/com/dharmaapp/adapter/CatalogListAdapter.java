package app.com.dharmaapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import app.com.dharmaapp.R;
import app.com.dharmaapp.activity.PdfViewerActivity;
import app.com.dharmaapp.model.CatalogModel;
import app.com.dharmaapp.util.CommonUtil;

public class CatalogListAdapter extends RecyclerView.Adapter<CatalogListAdapter.DiagnosisTermHolder> {
    private ArrayList<CatalogModel> arrayListTerm;

    private Context context;

    public CatalogListAdapter(Context activity, ArrayList<CatalogModel> arrayListDiagnosisTerm) {
        this.arrayListTerm = arrayListDiagnosisTerm;
        this.context = activity;
    }

    @Override
    public DiagnosisTermHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.raw_catalogitem, parent, false);
        return new DiagnosisTermHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DiagnosisTermHolder holder, int position) {
        final CatalogModel obj = arrayListTerm.get(position);
        holder.txtviewName.setText(obj.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.displayToast(context, obj.getPath());
                Intent intent = new Intent(context, PdfViewerActivity.class);
                intent.putExtra(context.getString(R.string.intent_key_path), obj.getPath());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTerm.size();
    }

    class DiagnosisTermHolder extends RecyclerView.ViewHolder {

        private ImageView imgviewTerm;
        private TextView txtviewName;
        private TextView txtviewFullName;

        public DiagnosisTermHolder(View itemView) {
            super(itemView);
            imgviewTerm = itemView.findViewById(R.id.imgviewIcon);
            txtviewName = itemView.findViewById(R.id.txtviewCatalogName);
        }
    }

}
