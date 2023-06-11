package me.ledovec.session;

public interface TimedSession<I, P> extends Session<I, P>{

    void startTimer();

    void stopTimer();

}
