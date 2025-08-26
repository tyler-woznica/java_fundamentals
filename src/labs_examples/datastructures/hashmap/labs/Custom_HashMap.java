package labs_examples.datastructures.hashmap.labs;


public class Custom_HashMap {




    public class CustomHashMap<K, V> {

        // create inner Entry class
        private class Entry<K, V> {
            K key;
            V value;
            Entry<K, V> next; // useful for handling collisions with chaining

            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private Entry<K, V>[] table = new Entry[10];

        private int hash(K key) {
            int index = Math.abs(key.hashCode() % table.length);
            return index;
        }

        public void put(K key, V value) {
            int index = hash(key);
            Entry<K, V> entry = new Entry(key, value);

            if (table[index] == null) {
                table[index] = entry;
            } else {
                Entry<K, V> p = table[index];
            }

        }

    }

}
