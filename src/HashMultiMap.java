import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMultiMap<K,V> {

    private Map<K, List<V>> map = new HashMap<>();

    private int total = 0;

    public HashMultiMap(){

    }

    public int size(){
        return total;
    }

    public boolean isEmpty(){
        return total == 0;
    }

    Iterable<V> get(K key){
        List<V> temp = map.get(key);
        if(temp != null){
            return temp;
        }
        return new ArrayList<>();
    }

}
