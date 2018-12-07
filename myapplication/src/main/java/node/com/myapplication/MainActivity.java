package node.com.myapplication;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button btnOnclick;
    TextView tvContent;
    DataViewModul dataViewModul;
    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataViewModul = new ViewModelProvider.NewInstanceFactory().create(DataViewModul.class);

        btnOnclick = findViewById(R.id.btnOnclick);
        tvContent = findViewById(R.id.tvContent);


        Observer<String> observer = new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tvContent.setText(s);
            }
        };
        dataViewModul.getGetName().observe(this, observer);

        btnOnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                dataViewModul.getGetName().postValue(pos + "");
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
