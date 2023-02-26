package NoLessonTests.HFDP2E.Chapter2.ObserverFirstEx;

public interface Subject { // only once
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
