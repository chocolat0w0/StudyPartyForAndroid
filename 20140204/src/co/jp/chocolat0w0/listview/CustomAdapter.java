package co.jp.chocolat0w0.listview;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<CustomItem> {
    private static final String TAG = CustomAdapter.class.getSimpleName();
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, int resource, List<CustomItem> objects) {
        super(context, resource, objects);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Log.d("CustomAdapter", "Constructor");
    }
    
    @Override
     public View getView(int position, View convertView, ViewGroup parent) {
        CustomItem item = (CustomItem)getItem(position);
     
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.listview_item, null);
        }
        
         TextView left;
         left = (TextView)convertView.findViewById(R.id.left);
         left.setText(item.getLeft());
         
         TextView right;
         right = (TextView)convertView.findViewById(R.id.right);
         right.setText(item.getRight());
         
         ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view);
         imageView.setImageBitmap(item.getImage());

         
         return convertView;
     }
}
