package me.ledovec.session;

public interface Session<I, P> {

    I getSessionId();

    P getSessionSubject();

}
