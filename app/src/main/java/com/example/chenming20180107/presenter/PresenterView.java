//package com.example.chenming20180107.presenter;
//
//import com.example.chenming20180107.Bean.JiaRuGWC;
//import com.example.chenming20180107.Bean.MyBean;
//import com.example.chenming20180107.model.HomeModerl;
//import com.example.chenming20180107.model.IHome;
//import com.example.chenming20180107.utils.IPresenter;
//import com.example.chenming20180107.view.IbeanVeiw;
//
//import java.lang.ref.SoftReference;
//
///**
// * Created by 九号 on 2018/01/07.
// */
//
//public class PresenterView implements IPresenter<IbeanVeiw> {
//
//
//    IHome home;
//    SoftReference<IbeanVeiw> softReference;
//
//    public PresenterView(IbeanVeiw view) {
//        attch(view);
//        home = new HomeModerl();
//    }
//
//    public void showMoie() {
//        home.showHome(new IHome.Movie() {
//            @Override
//            public void complete(MyBean myBean) {
//                softReference.get().showModerl(myBean);
//            }
//        });
//    }
//
//    public void showjr() {
//        home.showjr(new IHome.Movie_jr() {
//            @Override
//            public void complete(JiaRuGWC jiaRuGWC) {
//                softReference.get().showButtonjr(jiaRuGWC);
//            }
//        });
//    }
//
//    @Override
//    public void attch(IbeanVeiw view) {
//        softReference = new SoftReference<IbeanVeiw>(view);
//    }
//
//    @Override
//    public void datach() {
//        softReference.clear();
//    }
//}
