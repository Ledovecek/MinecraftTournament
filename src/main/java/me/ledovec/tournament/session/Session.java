package me.ledovec.tournament.session;

public interface Session<I, P> {

    I getSessionId();

    P getSessionSubject();

}
