package cn.edu.gdaib.autoupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUpdate=(Button)findViewById(R.id.btn_view);
        btnUpdate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                checkVersion();
            }
        });

        checkVersion();
    }

    /**
     * 检查是否有新版本可用
     */
    private void checkVersion(){
        //comm
    }
}
