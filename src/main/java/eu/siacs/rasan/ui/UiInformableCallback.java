package eu.siacs.rasan.ui;

public interface UiInformableCallback<T> extends UiCallback<T> {
    void inform(String text);
}
