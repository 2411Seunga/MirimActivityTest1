package kr.hs.emirim.s2019w34.mirimactivitytest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btnGoBack = findViewById(R.id.btn_goback2);
        btnGoBack.setOnClickListener(btnGobackListener);
    }

    View.OnClickListener btnGobackListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}