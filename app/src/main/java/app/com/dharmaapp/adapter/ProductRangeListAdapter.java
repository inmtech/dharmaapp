package app.com.dharmaapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import app.com.dharmaapp.R;
import app.com.dharmaapp.util.CommonUtil;

public class ProductRangeListAdapter extends RecyclerView.Adapter<ProductRangeListAdapter.ProductRangeHolder> {
    private ArrayList<Integer> arrayListTerm;

    private Context context;

    public ProductRangeListAdapter(Context activity, ArrayList<Integer> arrayListDiagnosisTerm) {
        this.arrayListTerm = arrayListDiagnosisTerm;
        this.context = activity;
    }

    @Override
    public ProductRangeListAdapter.ProductRangeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.raw_product_range, parent, false);
        return new ProductRangeListAdapter.ProductRangeHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductRangeListAdapter.ProductRangeHolder holder, int position) {
        final Integer obj = arrayListTerm.get(position);
        holder.imgviewTerm.setImageResource(obj);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.showFullImaggeDialog(context, obj);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTerm.size();
    }

    class ProductRangeHolder extends RecyclerView.ViewHolder {

        private ImageView imgviewTerm;
        private TextView txtviewName;
        private TextView txtviewFullName;

        public ProductRangeHolder(View itemView) {
            super(itemView);
            imgviewTerm = itemView.findViewById(R.id.imgviewProduct);
        }
    }

}
