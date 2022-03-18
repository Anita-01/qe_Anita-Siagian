## RESUME

### From Manual To Automation Testing
Pada saat mengembangkan software akan sering ditemukan error untuk meminimalisir kerusakan pada software tersebut diperlukan testing yang dilakukan dengan cara Manual Testing dan Automation Testing.

#### Manual Testing 
Pengujian manual adalah langkah untuk mencari cacat/bug pada program perangkat lunka. Pada metode ini tester berperan penting untuk pengecekan aplikasi apakah bekerja dengan benar. Penguji melakukan pengecekan secara manual tanpa tools/script untuk memastikan aplikasi berjalan dengan baik tanpa ditemukan error. Pengujian testing bersifat visual karena langsung menguji cara kerja aplikasi tersebut.

- User Interface/UI adalah feedback atau hal yang tidak dapat ditemukan oleh automation testing.

1. Kelebihan Manual Testing
    - Mendapat visual feedback dimana tools tidak dapat membantu atau memberikan opini terhadap tampilan UI suatu software
    - Test Manual tidak memerlukan menggunakan tools atau software yang mahal.
    - Saat menguji perubahan kecil, tes otomatisasi akan membutuhkan pengkodean yang bisa memakan waktu. Sementara Anda bisa menguji secara manual dengan cepat.

2. Kekurangan Manual Testing
    - Kurang teliti dikarenakan kemungkinan akan terjadi Human Error.
    - Jika mendapat perubahan maka harus ditest secara awal.
    - Kelelahan dari kesalahan yang akan melewatkan dari kesalahan.

#### Automation Testing 
Automation testing merupakan testing yang membutuhkan automation tools yang digunakan untuk mengeksekusi test case kita untuk melakukan proses automation testing. Quality Assurance perlu membuat code atau script testing. Script yang sudah ditulis dengan benar akan melakukan validasi untuk membandingkan hasil yang diharapkan dengan hasil yang ada pada saat proses script berjalan. Quality Assurance akan mengecek apakah aplikasi yang sudah dijalankan apakah sudah berjalan atau tidak.

1. Kelebihan menggunakan Automation Testing
- Dapat menemukan bug pada manual tester dimana script dalam mencari lebih dalam dari manual biasa.
- Script lebih cepat dari tester 
- Test dapat dilakukan secara berulang dan berkala 

2. Kekurangan Menggunakan Automation Testing
- Penggunaan Automation Testing relatif mahalnamun dapat menghemat waktu serta utibilitas
- Kurangnya human element 
- Tidak adanya feedback dengan UI.

3. Kenapa harus menggunakan Automation Testing 
- Cara terbaik untuk meningkatkan efeksitivitas, cakupan pengujian.
- Sulit untuk menguji situs multi bahasa secara manual.
- Automation test dalam perangkat lunak dapat dilakukan tanpa kerja tangan manusia dimana dalam melakukan automation testing tidak perlu dilakukan pengawasan.
- Automation test meningkatkan kecepatan eksekusi test.
- Automation test membantu meningkatkan scope dari test tersebut.

4. Which Test Case to Automate 
- Kasus uji yang dieksekusi berulang kali
- Uji kasus yang sangat membosankan atau sulit dilakukan secara manual
- Uji kasus yang memakan waktu untuk dilakukan secara manual.

5. Which Test Case NOT to Automate?
- Test case yang baru dirancang dan belum pernah dieksekusi sama sekali 
- Test case yang sering berubah 

## Automate Testing Process 
1. Test Tool Selection 
- Usabilty
- Simplicity
- Cost 

2. Define Scope of Automation 
    ** Ada beberapa poin yang digunakan untuk menentukan scope dari pengujian sebuah software antara lain : 
    - Fitur fitur yang penting untuk bisnis
    - Scenario yang memiliki banyak data
    - Functional umum di seluruh aplikasi bisnis 
    - Kelayakan Teknis
    - Sejauh mana komponen bisnis digunakan kembali
    - Kompleksitas test case  
    - Kemampuan untuk menggunakan test case yang sama untuk pengujian lintas browser 

3. Planning, Design dan Development
Pada fase ini akan dirancang strategi yang nantinya akan berisi berupa tools automation yang dipilih, desain kerangka dan fitur-fiturnya, item automation di dalam dan diluar cakupan, persiapan test plan automation, jadwal dan timeline dari scripting yang dieksekusi serta timeline dari script yang telah dirancang.

4. Test Execution 
Script yang telah dibuat akan dijalankan pada fase ini. Script membutuhkan input test data sebelum dijalankan dan setelah dijalankan kita akan mendapatkan sebuah record dengan menggunakan bantuan trigger manajemen tools.

5. Maintenance 
Maintenance perlu dilakukan ketika Automation Script perlu ditambahkan, direview untuk meningkatkan automation testing di script yang berurutan.

#### Automation Best Practices
1. Scope of automation
2. Select the right automation tool
3. Scripting Standars
4. Measure metrics 

Task 
1. Deksripsikan hasil pengujian secara otomatis berikut ini :

Gambar diatas adalah pengujian automation yang dilakukan di sebuah framework dimana pengujian yang dilakukan adalah Test CRUD methods in Sample REST API , ada beberapa method yang digunakan dalam pengujian antara lain : 
1. POST post example = Adalah method yang digunakan untuk menambah data pada post example 
2. GET post example = Adalah method yang digunakan untuk menampilkan data di post example 
3. UPDATE post example = Adalah method yang digunakan untuk mengupdate data yang ada pada post example pada proses pengupdatean akan diubah dalam body 
4. DELETE posts example = Adalah method yang digunakan untuk menghapus data pada post example.

Pada gambar diatas kita dapat melihat urutan eksekusi yang dilakukan framework yang 1 adalah DELETE post example proses eksekusi berhasil dimana pada proses tersebut framework memakan waktu sebanyak 880ms
- Urutan kedua adalah GET post example pada urutan ini method berhasil dieksekusi dengan proses waktu eksekusi sebesar 212ms
- Urutan ketiga adalah POST post example method ini berhasil dieksekusi dengan proses waktu eksekusi sebesar 766ms.
- Urutan keempat adalah UPDATE post exampe method ini berhasil dieksekusi dengan proses waktu eksekusi sebesar 764ms. 

Dari proses waktun eksekusi kita dapat melihat bahwa proses eksekusi yang memakan waktu paling lama adalah method DELETE posts example dengan waktu sebesar 880 ms, diikuyi dengan POST , UPDATE dan waktu paling cepat adalah GET. Dapat disimpulkan dalam 4 method tersebut method DELETE memerlukan waktu yang paling lama.

2. Deksripsikan hasil pengujian secara otomatis berikut ini : 
Pada gambar dapat dilihat pada Related Tags yang dimana merupakan collection task yang dikerjakan
Pada bagian ini terjadi collection task ada 3 antara lain : 
1. Petstore 
2. Search 
3. Shopping Cart 

- Test collection pertama adalah Petstore yang memiliki satu test case dimana status test case tersebut adalah Passed.
- Test Collection kedua adalah Search memiliki 4 test case dan ketika dijalankan ada 75% yang berhasil sedangkan 25% lagi framework menerima script yang dimasukkan tetapi tidak dapat memproses perintah yang diminta.
- Test Collection yang ketiga terdiri dari 2 test case yaitu 1 passed dan 1 failed yang berarti % annya adalah 50% dan 50%.