package me.ledovec.session;

/*
    I - session id type
    T - type of session
    P - for who
 */
@FunctionalInterface
public interface SessionFactory<I, T extends Session<I, P>, P> {

    T create(P p);

}
