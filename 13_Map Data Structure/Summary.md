# RESUME

## Map Data Structure

- Map merupakan sturuktur yang ada di java yang dapat digunakan untuk menyimpan data di dalamnya.
  Data yang tersimpan di dalam map akan disimpan dalam Queue, setiap Queue akan memiliki datanya sendiri atau value.

### Method yang dapat digunakan dalam Map

1. size(); int
2. isEmpty(); boolean
3. containsKey(Object): boolean
4. containsValue(Object) : boolean
5. get(Object):V
6. put(K,V) :V
7. remove(Object): V
8. putAll(Map)

### Implementasi Map

1. Map
   - HashMap
   - WeakHashMap
   - IdentifyHashMap
   - LinkedHashMao
   - EnumHashMap

#### HashMap

Merupakan implementasi map yang menggunakan algoritma struktur data hashtable

Implementasi :
public class MapDataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> bulan = new HashMap<>();
        bulan.put("Januari", 1);
        bulan.put("Februari", 2);
        bulan.put("Agustus", 8);
        System.out.println(bulan);


    }

    Hasil Run Program :
    {Agustus=8, Januari=1, Februari=2}

### WeakHashMap

Adalah pengimplementasian hashtable akan tetapi key dapat dihilangkan jika sudah tidak digunakan sehingga key yang tidak digunakan maka data akan hilang.

Implementasi :
\*/
public class MapDataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> bulan = new WeakHashMap<>();
        bulan.put("Januari", 1);
        bulan.put("Februari", 2);
        bulan.put("Agustus", 8);
        System.out.println(bulan);


    }

}

### IdentityHashMap

IdentityHashMap masih menerapkan hash table tetapi key memiliki referensi pada memori yang berbeda maka akan dianggap sebagai data yang berbeda.

### LinkedHashMap

LinkedHashMap menerapkan doubly linked list dan juga hash table sebagai struktur data di map nya.

### ImmutableMap

ImmutableMap tidak dapat diubah isinya baik ditambah atau mengubah data yang sudah ada.

## SortedMap

Link yang dapat diurutkan baik secara ascending maupun descending

1. Method yang dapat digunakan pada sorted map

1. Method List

   - addAll(int, Collection<? extends E>); boolean
   - replaceAll(UnaryOperator<E>); void
   - sort(Comparator<? super E>); void
   - get(int): E
   - set(int, E);
   - add (int, E); void
   - remove (int): E
   - indexOf(Object): int
   - lastIndexOf(Object) : int
   - listIterator(): ListIterator

1. Navigable Map
   Navigable map masih termasuk sorted map tetapi dengan method-method untuk menavigasi yang lebih lengkap.

### Link Tugas : https://docs.google.com/document/d/1oQ_JGOTVXXvERaOEfJFY_3IGGHLZDTCV/edit?usp=sharing&ouid=105039406774266227522&rtpof=true&sd=true

