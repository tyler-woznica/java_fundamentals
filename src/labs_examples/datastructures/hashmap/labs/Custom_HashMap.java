package labs_examples.datastructures.hashmap.labs;


import java.util.LinkedList;

public class Custom_HashMap {




    public class CustomHashMap<K, V> {

        // create inner Entry class
        private class Entry<K, V> {
            K key;
            V value;
            Entry<K, V> next;

            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public K getKey() {
                return key;
            }

            public V getValue() {
                return value;
            }

            public void setValue(V value) {
                this.value = value;
            }
        }

        // create the Entry table
        private Entry<K,V>[] table = new Entry[10];

        // hashmod and return the index
        private int hash(K key) {
            int index = Math.abs(key.hashCode() % table.length);
            return index;
        }

        // custom put method
        public void put(K key, V value) {
            int index = hash(key);
            Entry<K, V> entry = new Entry(key, value);

            // check if the table index is empty
            if (table[index] == null) {
                table[index] = entry;
            // if not empty, this means there is a collision and the list
            // must be iterated through to put the entry at the end
            } else {
                // get the first item in the linkedlist at the index
                Entry<K, V> p = table[index];

                while (p.next != null) {
                    p = p.next;
                }
                // p is now at the end of the list
                // the new entry can be added
                p.next = entry;
            }

            // check if hashmap needs to be resized
            if (keys().size() > table.length * .75) {
                resize();
            }
        }

        private void resize() {
            // create copy of existing table name it "old"
            Entry<K,V>[] old = table;
            // create a new table that is twice the size
            table = new Entry[old.length * 2];

            // iterate over length of old array
            for (int i = 0; i < old.length; i++) {
                try {
                    // get entry at index of i from old table
                    Entry entry = old[i];
                    // call put() method passing the k and v to add
                    // to new table
                    put((K) entry.getKey(), (V) entry.getValue());

                    // check if entry is actually start of linkedlist
                    while (entry.next != null) {
                        // traverse if it is is the start
                        entry = entry.next;
                        // then call put() to add the element
                        put((K) entry.getKey(), (V) entry.getValue());
                    }
                } catch (Exception e) {

                }
            }
        }

        // find value of a key
        public V get(K key) {
            // call hash() to get index for the key
            int index = hash(key);


            // return null if nothing at key
            if (table[index] == null) {
                return null;
            }
            // get the entry at the index
            Entry<K, V> entry = table[index];

            // if key is not what you are looking for then
            // it is a linkedlist and must be traversed
            while (entry.getKey() != key) {
                // if end is reached without match return null
                if (entry.next == null) {
                    return null;
                }
                // otherwise, keep traversing
                entry = entry.next;
            }

            // if you get there, the key has been found
            return entry.getValue();
        }

        // remove the pair at given key from hashmap
        public void remove(K key) {
            // ensure key exists by calling get()
            if (get(key) == null) {
                // if get() returns null, there is nothing to delete
                return;
            }

            //otherwise, get index for key by calling hash()
            int index = hash(key);

            // get the Entry at index
            Entry<K, V> entry = table[index];

            // if this entry has the matching key, remove element at this index
            if (entry.getKey().equals(key)) {
                table[index] = null;
            }
            // otherwise, if next element in linkedlist is not null
            while (entry.next != null) {
                // if key of next element in linkedlist is not key you're looking for
                if (entry.next.getKey() != key) {
                    entry = entry.next;
                }
            }

            // exiting the loop, entry.next contains the key you're looking for
            // if deleteing from the middle of a linkedlist you need
            // to link entry.next to entry.next.next
            if (entry.next.next != null) {
                entry.next = entry.next.next;
            }

            // otherwise, entry.next is end of the list so it can be chopped
            else {
                entry.next = null;
            }
        }

        public LinkedList<K> keys() {
            LinkedList<K> keys = new LinkedList<>();

            // iterate through all indexes of the table
            for (int i = 0; i < table.length; i++) {
                // if element at index i is not null
                if (table[i] != null) {
                    // get element at index of i
                    Entry<K, V> p = table[i];
                    // check to see if this is the beginning
                    // of a linked list
                    while (p != null) {
                        // if it is, traverse and add all keys
                        keys.add(p.getKey());
                        p = p.next;
                    }
                }
            }
            return keys;
        }
    }
}
