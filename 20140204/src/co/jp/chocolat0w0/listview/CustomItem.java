package co.jp.chocolat0w0.listview;

import android.graphics.Bitmap;

public class CustomItem {
    private static final String TAG = CustomItem.class.getSimpleName();
    private String left;
    private String right;
    private Bitmap image;
    
    public CustomItem(String left, String right, Bitmap image) {
        this.left = left;
        this.right = right;
        this.image = image;
    }
    
    
    public String getLeft() {
        return left;
    }
    
    public String getRight() {
        return right;
    }
    
    public Bitmap getImage() {
        return image;
    }
}
