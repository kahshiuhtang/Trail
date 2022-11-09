package Structures.List;

public interface List<T, S>{
    public T get(int index);
    public void remove(int index);

    public void add(S node);
}
