package com.devix.www.mvp_numero_mayor;

/**
 * Created by Carlos Anguiano on 20/07/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

class NumeroMayorPresente implements INumeroMayor.Presenter {

    private INumeroMayor.View view;
    private INumeroMayor.Model model;

    public NumeroMayorPresente(INumeroMayor.View view) {
        this.view = view;
        model = new NumeroMayorModel(this);
    }

    @Override
    public void sendData(int a, int b, int c) {
        if (view != null) {
            model.checkData(a, b, c);
        }
    }

    @Override
    public void sendErrorModel(String s) {
        if (view != null) {
            view.showError(s);
        }
    }

    @Override
    public void sendResult(int x) {
        if (view != null) {
            view.showData(x);
        }
    }

    @Override
    public void convertStringtoInt(String a, String b, String c) {
        if (view != null) {
            model.convertData(a,b,c);
        }
    }
}
