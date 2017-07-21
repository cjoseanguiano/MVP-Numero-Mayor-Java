package com.devix.www.mvp_numero_mayor;

/**
 * Created by Carlos Anguiano on 20/07/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

class NumeroMayorModel implements INumeroMayor.Model {
    private INumeroMayor.Presenter presenter;
    private int x;

    public NumeroMayorModel(INumeroMayor.Presenter presente) {
        this.presenter = presente;
    }

    @Override
    public void checkData(int a, int b, int c) {
        if (a >= 0 || b >= 0 || c >= 0) {
            if (a > b && a > c) {
                x = a;
            } else {
                if (b > a && b > c) {
                    x = b;
                } else {
                    x = c;
                }
            }
            presenter.sendResult(x);
        } else {
            presenter.sendErrorModel("Error dentro del model");
        }
    }

    @Override
    public void convertData(String a, String b, String c) {
        if (!(a.equals("") || b.equals("") || c.equals(""))) {
            int dataA = Integer.parseInt(a);
            int dataB = Integer.parseInt(b);
            int dataC = Integer.parseInt(c);
            presenter.sendData(dataA, dataB, dataC);
        } else {
            presenter.sendErrorModel("Ingresa datos");

        }

    }
}
