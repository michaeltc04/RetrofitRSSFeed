package exampleapp.com.example.mike.retrofitrssfeed;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import exampleapp.com.example.mike.retrofitrssfeed.response_objects.RSSResponseItem;

class RSSResponseAdapter extends ArrayAdapter {

    private ArrayList<RSSResponseItem> mResponseItems;
    private LayoutInflater mInflater;
    private Context mContext;

    public RSSResponseAdapter(Activity context, ArrayList<RSSResponseItem> responseItems) {
        super(context, R.layout.row_item_title, responseItems);
        this.mResponseItems = responseItems;
        mInflater = context.getLayoutInflater();
        mContext = context;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        RSSResponseItem responseItem = mResponseItems.get(i);
        RSSResponseAdapter.ViewHolder viewHolder = new ViewHolder();

        if (view == null) {
            view = mInflater.inflate(R.layout.row_item_title, viewGroup, false);
            viewHolder.title = (TextView) view.findViewById(R.id.title);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        if (responseItem != null && responseItem.getTitle() != null) {
            viewHolder.title.setText(responseItem.getTitle());
        } else {
            viewHolder.title.setText(mContext.getResources().getString(R.string.title_unknown));
        }
        return view;
    }

    static class ViewHolder {
        TextView title;
    }
}
