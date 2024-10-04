package Array_Basic;
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MinMaxElements {
    public Pair<Long, Long> getMinMax(int[] arr) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num<min){
                min = num;
            }
            if(num>max){
                max=num;
            }
        }
        return new Pair<>(min,max);
    }
}
