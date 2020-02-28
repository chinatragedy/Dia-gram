public interface ISubject {
    void registerOb(IObserver ob);

    void removeOb(IObserver ob);

    void notifyObserver();
}
