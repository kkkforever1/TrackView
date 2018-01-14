package io.chengguo.track;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

/**
 * Created by FingerArt on 2018/1/12.
 */
class Utils {
    /**
     * 创建LayoutParams
     *
     * @return
     */
    @NonNull
    static <T extends ViewGroup> T.LayoutParams createMPLayoutParams() {
        return new T.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, T.LayoutParams.MATCH_PARENT);
    }
}
