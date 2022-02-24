# Software Testing Fundamental

## Resume

### Session Category

1. Definition of Software Testing
2. How Important Software Testing
3. Testing Platform
4. Types of Software Testing
5. Level of Testing

Software Testing adalah proses dalam menganalisis item perangkat lunak dalam mendeteksi perbedaan antara
kondisi yang ada dan yang diperlukan (cacat) dan mengevaluasi fitur item perangkat lunak.Software Testing penting dikarenakan dapat mencek kesalahan aplikasi dimana jika ada satu bug error yang ditemukan bisa jadi berakibat fatal
seperti Suncorp Bank pada Februari 2017 terdapat kegagalan pemakaian setelah melakukan upgrade versi software
yang menyebabkan hilang uang dari rekening bank pelanggan. Pada tahun 1985 terdapat bug halus race condition.

### Software Testing Important

1. Saves Money
2. Product Quality
3. Security
4. Customer Satisfaction
   Bugs yang ditemukan dalam software bisa mahal dan sangat berbahaya yang dapat menyebabkan kerugian moneter dan manusia.

### Testing Platform

1. API
2. Web
3. Mobile
4. Dekstop

### Types of Software Testing

-Functional Testing

1. Manual
2. Automate

### Non-Functional Testing

1. Perfomance Testing
   - Maintenance
   - Regression

### FUNCTIONAL TESTING

Manual:
Pada proses manual penguji perangkat lunak merancang test case dan menjalankan hasil test case dan
hasil dari test case yang sudah dijalankan akan didokumentasikan dan metode ini adalah metode klasik yang membantu menemukan bug dalam sistem dalam perangkat lunak.

Automate

1. Tester menuliskan kode/script yang akan digunakan ke dalam automate test execution
2. Tester menggunakan alat otomatisasi yang sesuai dengan mengembangkan skrip pengujian untuk memvalidasi perangkat lunak.

### NON-FUNCTIONAL TESTING

Pengujian kinerja yang didefinisikqn sebagai jenis pengujian perangkat lunak untuk memastikan aplikasi perangkat lunak akan bekerja
dengan baik di bawah beban kerja yang diharapkan.
PERFOMANCE TESTING
-Speed
-Scability
-Stability

### MAINTENANCE TESTING

Regression Testing jenis pengujian perangkat lunak untuk mengkonfirmasi bahwa fitur baru atau perubahan kode tidak mempengaruhi fitur yang ada.

### LEVELS of Testing

1. Unit Testing
   Tingkat pengujian perangkat lunak dimana yang diuji adalah komponen individu dari suatu perangkat lunak.
2. Integration Testing
   Integration Testing adalah pengujian perangkat lunak tingkat di mana unit individu digabungkan dan diuji sebagai sebuah kelompok
3. System Testing
   System Testing adalah pengujian perangkat lunak tingkat di mana perangkat lunak yang lengkap dan terintegrasi diuji
4. Acceptance Testing
   Acceptance Testing adalah tingkat pengujian perangkat lunak di mana suatu sistem diuji untuk dapat diterima

### Task

1. Program nomor satu
   Berdasarkan gambar di atas dapat kita ketahui bahwa gambar tersebut adalah hasil mutation testing. Pada mutation testing kita fokus untuk mengukur kelayakan dari sebuah test case. Tujuan dari mutation testing adalah menyebabkan program mutant program mutant fail, atau menghasilkan output yang tidak sesuai dengan expected output.
   Dari gambar tersebut dapat kita lihat bahwa :

- Terdapat line coverage, dimana line coverage merupakan jumlah baris yang dieksekusi dibagi dengan jumlah total baris. Line coverage pada test dengan name com.hascode.tutorial.entity menunjukkan 67% dari baris code kita berhasil diekseskusi. Kemudian terdapat mutation coverage yang menunjukkan mutation score, untuk mutation coveragenya menunjukkan 67% artinya test case ini kurang layak. Suatu test case dikatakan baik apabila memperoleh mutation score 100%. Mutation score dapat kita hitung dengan menggunakan rumus :
  _100 _ D / (N - E)\*
- Untuk test case dengan name com.hascode.tutorial.service ditunjukkan bahwa 100% dari baris code kita berhasil dieksekusi, sedangkan untuk mutation coverage adalah 75% artinya test case ini belum layak.

2. Program nomor dua
   Diberikan potongan code dengan nama class CalculatorServiceImpl yang berisi dua function yaitu:

- function add dengan tipe int yang menampung parameter int a dan b dan memiliki operator yaitu a + b
- function subtract dengan tipe int yang menampung parameter int a dan b dan memiliki operator a-b
  Dalam gambar tersebut pada function add diberikan tanda hijau. Tanda hijau dalam mutation testing PIT mengartikan original program.

Function substract diberikan tanda merah. Tanda merah dalam mutation testing PIT mengartikan mutant program yang artinya program yang sudah dimUBAH dari original program. Tujuan utama dalam mutant program adalah menghasilkan output yang berbeda dari original program atau yang biasa disebut kill mutant.
