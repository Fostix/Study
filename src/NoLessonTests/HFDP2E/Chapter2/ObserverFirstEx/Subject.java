package NoLessonTests.HFDP2E.Chapter2.ObserverFirstEx;

public interface Subject { // only once
    void registerObserver();
    void removeObserver();
    void notifyObservers();
}
