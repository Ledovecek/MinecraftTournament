package me.ledovec.session.provider;

public interface Provider<T> {

    void beginPrepared();

    void prepare(T t);

    void pauseCurrent();

    void stopCurrent();

    T getPrepared();

}
