package org.example.cache;

public interface CacheWrite {
    void set(String name, int value);
    void clear();
    void delete(String name);
}
