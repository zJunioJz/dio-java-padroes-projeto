package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @author zJunioJz
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {

        private static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}

