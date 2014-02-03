package co.jp.chocolat0w0.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends Activity {
    private static final String TAG = Detail.class.getSimpleName();
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extra = getIntent().getExtras();
        String detailContents = null;
        if (extra != null) {
            detailContents = extra.getString("contents");
        }
        
        TextView contents = (TextView) findViewById(R.id.contents);
        if (detailContents != null) {
            contents.setText(detailContents);
        }
    }
}
