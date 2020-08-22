package View.Persistence;

import java.io.IOException;

public interface Writer<T> {
    void add(T object);
    void remove(T object);
}
