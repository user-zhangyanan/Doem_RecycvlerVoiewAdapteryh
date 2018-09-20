package com.bawei.dome_recyvlerviewadapteryh.adapter;

import android.support.v7.widget.RecyclerView;

import com.bawei.dome_recyvlerviewadapteryh.R;
import com.bawei.dome_recyvlerviewadapteryh.baen.Meizi;
import com.bawei.dome_recyvlerviewadapteryh.base.BaseRecyclerAdapter;
import com.bawei.dome_recyvlerviewadapteryh.base.RecyclerHolder;

import java.util.Collection;

/**
 * Created by hasee on 2018/9/20.
 */

public class ExampleAdapter extends BaseRecyclerAdapter<Meizi> {
    public ExampleAdapter(RecyclerView v, Collection<Meizi> datas, int itemLayoutId) {
        super(v, datas, itemLayoutId);
    }

    @Override
    public void convert(RecyclerHolder holder, Meizi item, int position) {
        holder.setImageResource(R.id.iv_item,item.getUrl());
        holder.setText(R.id.tv_item,item.getWho());
    }
}
