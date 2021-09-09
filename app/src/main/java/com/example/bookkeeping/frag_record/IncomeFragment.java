package com.example.bookkeeping.frag_record;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.bookkeeping.R;
import com.example.bookkeeping.R;
import com.example.bookkeeping.db.DBManager;
import com.example.bookkeeping.db.TypeBean;

import java.util.List;
//记录页面的收入


public class IncomeFragment extends BaseRecordFragment {

    @Override
    public void loadDateToGV() {
        super.loadDateToGV();
        //获取数据库当中的数据源
        List<TypeBean> inlist = DBManager.getTypeList(1);
        typeList.addAll(inlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.in_qt_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(1);
        DBManager.insertItemToAccounttb(accountBean);

    }


}