package com.example.bookkeeping.frag_record;

import androidx.fragment.app.Fragment;

import com.example.bookkeeping.R;
import com.example.bookkeeping.db.DBManager;
import com.example.bookkeeping.db.TypeBean;

import java.util.List;
//记录页面的支出

public class OutcomeFragment extends BaseRecordFragment {

    // 重写
    @Override
    public void loadDateToGV() {
        super.loadDateToGV();
        //获取数据库当中的数据源
        List<TypeBean> outlist = DBManager.getTypeList(0);
        typeList.addAll(outlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.ic_qita_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(0);
        DBManager.insertItemToAccounttb(accountBean);



    }


}