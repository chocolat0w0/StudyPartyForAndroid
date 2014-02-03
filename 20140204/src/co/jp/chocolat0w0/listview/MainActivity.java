package co.jp.chocolat0w0.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 画像付き
        List<CustomItem> items = new ArrayList<CustomItem>();
        Resources res = getResources();
        Bitmap image = BitmapFactory.decodeResource(res, R.drawable.ic_launcher);
        items.add(new CustomItem("1 : ", "1行目ですよ", image));
        items.add(new CustomItem("2 : ", "2行目ですよ", image));
        
        adapter = new CustomAdapter(getApplicationContext(), R.layout.listview_item, items);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, Detail.class);
        intent.putExtra("contents", adapter.getItem(position).getRight());
        startActivity(intent);
    }

}
