package com.example.chenming20180107.model;

import com.example.chenming20180107.Bean.CartBean;
import com.example.chenming20180107.Bean.JiaRuGWC;
import com.example.chenming20180107.Bean.MyBean;

/**
 * Created by 九号 on 2018/01/07.
 */

public interface IHome {

    void showHome(Movie movie);

    interface Movie {
        void complete(MyBean myBean);
    }

    void showjr(Movie_jr movie_jr);

    interface Movie_jr {
        void complete(JiaRuGWC jiaRuGWC);
    }
    void showjr2(Movie_jr2 movie_jr2);

    interface Movie_jr2 {
        void complete(CartBean cartBean);
    }

}
