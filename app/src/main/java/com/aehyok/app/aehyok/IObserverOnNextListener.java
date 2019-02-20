package com.aehyok.app.aehyok;

public interface IObserverOnNextListener<T> {
    void onNext(T t);

    void onError(Throwable e);

}
