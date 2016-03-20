package com.jinjunhang.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;

/**
 * Created by lzn on 16/3/19.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
