package node.com.myapplication;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by 孙伟
 * Date: 2018/12/6
 * Email: 1580440730@qq.com
 * Describe:
 */
public class DataViewModul extends ViewModel {

    public MutableLiveData<String> name;

    public MutableLiveData<String> getGetName() {
        if (name == null) {
            name = new MutableLiveData<>();
        }
        return name;
    }
}
