package Lesson10;

import java.io.Serializable;
import java.util.*;

public class MyHashMap<K,V> extends HashMap<K,V>
        implements Map<K,V>, Cloneable, Serializable {
    @Override
    public V get(Object key) {
        return super.get(key);
    }

    public void add(String name, String number) {
        List<String> list = new ArrayList<>();
        if (this.containsKey(name)) {
            list.addAll((List) this.get(name));
        }
        list.add(number);
        this.put((K) name, (V) list);

    }
}
