# RESUME

## ITERABLE DATA STUCTURE

Iterable merupakan Sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan.

### Java Iterable

1.  Iterable adalah struktur tertinggi dalam hirarki dalam bahasa pemograman java
2.  Collection
    Collection adalah sebuah objek yang mewakili kumpulan dari suatu objek. Java menyediakan framework collection yang berfungsi untuk mengolah kumpulan data yang dapat digunakan dalam program kita.
3.  - Set (SortedSet, NavigableSet)

    * List

    1. List adalah jenis array yang membolehkan adanya value duplicate atau nilai yang sama dalam index yang berbeda. List memiliki beberapa fungsi-fungsi yang cukup membantu dalam proses pengolahan nilai-nilai seperti fungsi clear() untuk menghapus semua element atau value pada list, melakukan insert value pada index element tertentu dengan fungsi add(int index, Object element), menghapus value pada index element tertentu dengan fungsi remove(int index).
    2. Antarmuka Daftar menyediakan cara untuk menyimpan koleksi yang dipesan.
    3. Ini adalah antarmuka anak Koleksi
    4. Ini adalah kumpulan objek yang dipesan di mana nilai duplikat dapat disimpan
    5. Sejak Daftar mempertahankan urutan penyisipan memungkinkan akses posisi dan penyisipan elemen.

    - Queue
      Queue adalah sekumpulan data yang mana penambahan elemen hanya bisa dilakukan pada suatu ujung yang disebut sisi belakang (rear), dan penghapusan (pengambilan elemen) dilakukan lewat ujung lain.

    1.  Antrian dapat didefinisikan sebagai daftar terurut yang memungkinkan operasi penyisipan dilakukan di satu ujung yang disebut REAR dan operasi hapus dilakukan di ujung lain yang disebut FRONT.
    2.  Antrian disebut sebagai daftar First In First Out.
    3.  Misalnya, orang yang mengantri untuk mendapatkan tiket kereta api membentuk antrian.

    - Deque

    * Deque adalah koleksi linier yang mendukung penyisipan dan penghapusan elemen dari kedua ujungnya. Nama 'deque' adalah singkatan dari double-ended queue.

### Java List Implementation

1. Abstract Collection
   Abstract Collection digunakan untuk menerapkan koleksi yang tidak dapat dimodifikasi, yang hanya perlu memperluas Kelas AbstractCollection ini dan hanya mengimplementasikan iterator dan metode ukuran.

2. Abstract List

- Abstract List digunakan untuk mengimplementasikan koleksi yang tidak dapat dimodifikasi, di mana seseorang hanya perlu memperluas Kelas Koleksi Abstrak ini dan hanya mengimplementasikan iterator dan metode ukuran.

- Kelas ini menyediakan implementasi kerangka antarmuka Daftar untuk meminimalkan upaya yang diperlukan untuk mengimplementasikan antarmuka ini yang didukung oleh penyimpanan data Akses Acak (seperti larik). Untuk data akses sekuensial (seperti daftar tertaut), AbstractSequentialList harus digunakan dalam preferensi untuk kelas ini.

3. Array List
   Array List digunakan pada saat memberi array dinamis di Java. Padahal, ini mungkin lebih lambat dari array standar tetapi dapat membantu dalam program di mana banyak manipulasi dalam array diperlukan.\

4. Abstract SequentialList
   Digunakan untuk mengimplementasikan daftar yang tidak dapat dimodifikasi, di mana seseorang hanya perlu memperluas Kelas AbstractList ini dan hanya mengimplementasikan metode get() dan size()

5. LinkedList

- Linked List adalah suatu struktur data linier. Berbeda dengan array yang juga merupakan struktur data linier dan tipe data komposit, linked list
  dibentuk secara dinamik.
- Tidak seperti array, data tidak disimpan dalam satu blok memori yang berdekatan dan tidak memiliki ukuran yang tetap.
- Sebaliknya, ini terdiri dari beberapa blok memori di alamat yang berbeda.

6. Stack

- Kelas Stack mewakili tumpukan objek terakhir masuk pertama keluar (LIFO). Ini memperluas kelas Vektor dengan lima operasi yang memungkinkan vektor diperlakukan sebagai tumpukan.
- Operasi push dan pop yang biasa disediakan, serta metode untuk mengintip item teratas pada tumpukan, metode untuk menguji apakah tumpukan kosong, dan metode untuk mencari tumpukan item dan menemukan seberapa jauh adalah dari atas.
- Serangkaian operasi tumpukan LIFO yang lebih lengkap dan konsisten disediakan oleh antarmuka Deque dan implementasinya, yang harus digunakan dalam preferensi untuk kelas ini.

7. HashSet

- HashSet merupakan class yang sering digunakan untuk menyimpan collection yang bebas duplikasi.
- HashSet menyimpan elemen dengan menggunakan mekanisme yang disebut hashing
- HashSet hanya berisi elemen unik. HashSet memungkinkan nilai nol. Kelas HashSet tidak disinkronkan.
- HashSet tidak mempertahankan urutan penyisipan. Di sini, elemen dimasukkan berdasarkan kode hashnya.
- HashSet adalah pendekatan terbaik untuk operasi pencarian. Kapasitas default awal HashSet adalah 16, dan faktor bebannya adalah 0,75.

8. JavaLinkedHashSet

- Java LinkedHashSet adalah pengimplementasian set antarmuka dan memperluas kelas HashSet. Ini menggunakan penerapan daftar tertaut ganda pada hashtable. Artinya, ia mempertahankan urutan penyisipan saat melakukan iterasi melalui elemen
- Kelas Java LinkedHashSet berisi elemen unik hanya seperti HashSet.
- Kelas Java LinkedHashSet menyediakan semua opsional
- Mengatur operasi dan mengizinkan elemen nol.
- Kelas Java LinkedHashSet tidak disinkronkan. Kelas Java LinkedHashSet mempertahankan urutan penyisipan.

9. EnumSet

- EnumSet dapat berisi nilai enum dan semua nilai harus dimiliki oleh enum yang sama
- Itu tidak memungkinkan untuk menambahkan nilai nol, melemparkan, NullPointerException dalam upaya untuk melakukannya Itu tidak aman untuk thread, jadi kami perlu menyinkronkannya secara eksternal jika diperlukan
- Elemen disimpan mengikuti urutan di mana mereka dideklarasikan di enum
- Ini menggunakan iterator gagal-aman yang berfungsi pada salinan, sehingga tidak akan mengeluarkan Pengecualian ConcurrentModification jika koleksi dimodifikasi saat mengulanginya.

10. Sorted Set

- Sebuah Set yang selanjutnya memberikan pemesanan total pada elemen-elemennya.
- Elemen-elemen diurutkan baik dengan menggunakan pengurutan alami atau dengan menggunakan Pembanding. Semua elemen yang dimasukkan ke dalam set yang diurutkan harus mengimplementasikan antarmuka Sebanding.

Drive : https://docs.google.com/document/d/1JlkzRcwN3_OupCAv-3J4vI2eCRkcPdED/edit?usp=sharing&ouid=105039406774266227522&rtpof=true&sd=true
