package lection_3;

@FunctionalInterface
public interface Supplier<T> {
    T get(T a, T b, T c);
}
