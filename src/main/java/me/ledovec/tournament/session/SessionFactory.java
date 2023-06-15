package me.ledovec.tournament.session;

import java.util.Set;

/*
    I - session id type
    T - type of session
    P - for who
 */
public interface SessionFactory<I, T extends Session<I, P>, P> {

    T create(P p);

    void remove(T t);

    void removeBySubject(P p);

    Set<T> getSessions();

}
