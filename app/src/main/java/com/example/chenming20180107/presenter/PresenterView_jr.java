package com.example.chenming20180107.presenter;

import com.example.chenming20180107.Bean.CartBean;
import com.example.chenming20180107.model.HomeModerl;
import com.example.chenming20180107.model.IHome;
import com.example.chenming20180107.utils.IPresenter;
import com.example.chenming20180107.view.IbeanView_jr;

import java.lang.ref.SoftReference;

/**
 * Created by 九号 on 2018/01/07.
 */

public class PresenterView_jr implements IPresenter<IbeanView_jr> {

    IHome home;
    SoftReference<IbeanView_jr> softReference;

    public PresenterView_jr(IbeanView_jr veiw) {
        attch(veiw);
        home = new HomeModerl();
    }

    public void showjr2() {
        home.showjr2(new IHome.Movie_jr2() {
            @Override
            public void complete(CartBean cartBean) {
                softReference.get().showButtonjr(cartBean);
            }
        });
    }

    @Override
    public void attch(IbeanView_jr view) {
        softReference = new SoftReference<IbeanView_jr>(view);
    }

    @Override
    public void datach() {
        softReference.clear();
    }
}
