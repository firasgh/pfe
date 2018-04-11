package com.example.khaireddine.mygreenhouse;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by FIRAS on 03/04/2018.
 */

public class serreadapter extends BaseAdapter {
    private Context mContext;

    public serreadapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
     TextView T;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(100, 100));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 5, 5, 5);
        } else {
            imageView = (ImageView) convertView;

        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {

            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre, R.drawable.seerre, R.drawable.seerre,
            R.drawable.seerre, R.drawable.seerre
              };


}