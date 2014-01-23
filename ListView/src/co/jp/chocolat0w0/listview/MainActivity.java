package co.jp.chocolat0w0.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		List<CustomItem> items = new ArrayList<CustomItem>();
//		items.add(new CustomItem("1 : ", "1行目です"));
//		items.add(new CustomItem("2 : ", "2行目です"));
//
//		CustomAdapter adapter = new CustomAdapter(getApplicationContext(), R.layout.listview_item, items);
		
		// 画像付き
		List<CustomImageItem> items = new ArrayList<CustomImageItem>();
		Resources res = getResources();
		Bitmap image = BitmapFactory.decodeResource(res, R.drawable.ic_launcher);
		items.add(new CustomImageItem("1 : ", "1行目ですよ", image));
		items.add(new CustomImageItem("2 : ", "2行目ですよ", image));
		
		CustomImageAdapter adapter = new CustomImageAdapter(getApplicationContext(), R.layout.listview_item_image, items);
		ListView listView = (ListView) findViewById(R.id.listview);
		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
