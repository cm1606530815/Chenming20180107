package com.example.chenming20180107.model;

import android.graphics.Movie;

import com.example.chenming20180107.Bean.CartBean;
import com.example.chenming20180107.Bean.JiaRuGWC;
import com.example.chenming20180107.Bean.MyBean;
import com.example.chenming20180107.utils.ApiService;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 九号 on 2018/01/07.
 */

public class HomeModerl implements IHome {
    @Override
    public void showHome(final Movie movie) {
        ApiService.API_SERVICE.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MyBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(MyBean myBean) {
                        movie.complete(myBean);
                    }
                });
    }

    @Override
    public void showjr(final Movie_jr movie_jr) {
        ApiService.API_SERVICE_jr.getDatajr()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<JiaRuGWC>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(JiaRuGWC jiaRuGWC) {
                        movie_jr.complete(jiaRuGWC);
                    }
                });
    }

    @Override
    public void showjr2(final Movie_jr2 movie_jr2) {
        ApiService.API_SERVICE_jr2.getDatajr2()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CartBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(CartBean cartBean) {
                        movie_jr2.complete(cartBean);
                    }
                });
    }
}
