package pointofsales.entities.repositories;

import java.util.List;

public interface Repository<T> {
    public void add(T entity) throws Exception;

    public void delete(T entity);

    public T get(String id);

    public List<T> getAll();

    public void update(T entity);
}
