package node.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    RecyclerView mRecyclerView;
    RoundAdpater roundAdpater;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.mRecyclerView);
        roundAdpater = new RoundAdpater(this, getData());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(roundAdpater);

    }


    private ArrayList<Data> getData() {
        ArrayList<Data> dataArrayList = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("美食");
        arrayList.add("中餐");
        arrayList.add("快餐");
        arrayList.add("火锅");
        arrayList.add("咖啡厅");
        arrayList.add("肯德基");
        arrayList.add("自助餐");
        arrayList.add("小吃");
        arrayList.add("蛋糕房");
        dataArrayList.add(new Data.Builder().title("吃").bean(arrayList).build());
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("酒店");
        arrayList2.add("快捷酒店");
        arrayList2.add("冰棺");
        arrayList2.add("青年旅社");
        arrayList2.add("星际酒店");
        arrayList2.add("旅馆");
        arrayList2.add("主题酒店");
        arrayList2.add("商务酒店");
        arrayList2.add("快捷连锁");
        dataArrayList.add(new Data.Builder().title("住").bean(arrayList2).build());

        return dataArrayList;
    }
}
