package com.example.multilanguages;

import android.support.v4.app.Fragment;

import com.example.multilanguages.utils.LocalManageUtil;

public class BaseFragment extends Fragment {
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        LocalManageUtil.setLocal(getActivity());
    }
}
