package node.com.myapplication;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 孙伟
 * Date: 2018/12/7
 * Email: 1580440730@qq.com
 * Describe:
 */
public class RoundAdpater extends RecyclerView.Adapter<RoundAdpater.ViewHolder> {
    Activity activity;
    ArrayList<Data> data;

    public RoundAdpater(Activity activity, ArrayList<Data> data) {
        this.activity = activity;
        this.data = data;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(activity).inflate(R.layout.roundadpater, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvTextView.setText(data.get(i).getTitle());
        Round_ViewAdapter round_viewAdapter = new Round_ViewAdapter(activity, data.get(i).getBean());
        viewHolder.mRecyclerView.setLayoutManager(new GridLayoutManager(activity, 4));
//        viewHolder.mRecyclerView.addItemDecoration(new MarginDecoration());
        viewHolder.mRecyclerView.setAdapter(round_viewAdapter);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView mRecyclerView;
        TextView tvTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mRecyclerView = itemView.findViewById(R.id.mRecyclerView);
            tvTextView = itemView.findViewById(R.id.tvTextView);
        }
    }


    interface setOnclickRoundListener {
        void onclickRoundListener();
    }
}
