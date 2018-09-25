package BF.Observer;

public interface Subject {
    void registerObserver (Observer observer);
    void removeobserver (Observer observer);
    void notifyObservers();
}
