package com.devix.www.mvp_numero_mayor;

/**
 * Created by Carlos Anguiano on 20/07/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface INumeroMayor {

    interface Presenter {

        void sendData(int a, int b, int c);

        void sendErrorModel(String s);

        void sendResult(int x);

        void convertStringtoInt(String a, String b, String c);
    }

    interface Model {

        void checkData(int a, int b, int c);

        void convertData(String a, String b, String c);
    }

    interface View {
        void showData(int x);

        void showError(String error);

    }

}
