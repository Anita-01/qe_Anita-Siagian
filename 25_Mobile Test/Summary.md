## Mobile Automation Testing with Appium

### Appium Intro

1. Appium

- Appium adalah kerangka kerja otomatisasi seluler untuk menjalankan uji otomatisasi seluler.
- Appium mendukung banyak bahasa pemrograman seperti java, python, javascript, ruby.
- Pustaka Appium dibuat di atas pustaka Selenium
- Mendukung aplikasi Android, iOS, dan Windows

2. Appium High Level Architecture

- XCUITest
- UIAutomator2/ Espreso
- WinAppDriver

3. Appium Components

- Di Appium ada dua komponen utama yang kami gunakan:

1. Server Appium. Appium Server digunakan sebagai jembatan untuk mengontrol perangkat pengujian. Ada dua versi, kita dapat menggunakan appium dekstop atau menginstal perintah appium menggunakan npm.
2. Appium Client Library yang ditulis dalam beberapa bahasa untuk membuat skrip pengujian sehingga kita dapat mengirim perintah ke server appium.

#### Using Maven Archetype

- Pola dasar Maven digunakan untuk menghasilkan proyek dasar dengan semua dependensi dan struktur dasar
- Serenity memiliki perpustakaan pola dasar sehingga Anda dapat menghasilkan proyek sampel baik menggunakan baris perintah atau menggunakan IDE
- https://www.google.com/url?q=https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber-archetype/2.3.2&sa=D&source=editors&ust=1650101893364128&usg=AOvVaw3R65ay-GeH4TFyENdv3nBQ
- Anda dapat mengakses sampel pola dasar yang dihasilkan di github
- Sudah menggunakan versi serenity-core terbaru.

#### Appium basic action and cucumber

1. Kerangka Mentimun

- Mentimun BDD adalah kerangka kerja yang mendukung untuk membuat tes Otomasi pengembangan yang digerakkan oleh perilaku (BDD)
- Menggunakan Sintaks gherkin
- Mendukung berbagai bahasa pemrograman Java, Ruby, JavaScript, Python
- Memiliki fitur dan dukungan hebat dengan Intellij IDEA IDE.

#### Cucumber Tags

- Tag adalah cara yang bagus untuk mengatur fitur dan skenario Anda
- Mereka dapat digunakan untuk dua tujuan
  - Menjalankan subset skenario
  - Membatasi kait ke subste skenario
- Anda dapat meletakkan tag pada kata kunci Fitur atau Skenario di atas pada file fitur
- Tag pada kata kunci Fitur akan mewarisi semua skenario di dalam file fitur/
- Tag pada kata kunci skenario hanya diterapkan pada skenario tunggal

#### The WebdriverWait Object

- Objek WebdriverWait digunakan untuk mengatur waktu tunggu hingga elemen memenuhi kondisi
  Contoh : Tunggu sampai elemen terlihat tunggu sampai elemen hilang.
- Ini adalah bagian dari penantian eksplisit
- Konstruktor itu sendiri memiliki 3 parameter
  1. Parameter pertama untuk Objek AndroidDriver
  2. Parameter ke-2 untuk timeoit (waktu maksimum kita menunggu elemen memenuhi kondisi)
  3. Parameter ke-3 untuk waktu pemungutan suara (periksa setiap dan penggilingan)
- Objek ExoectedConditions menyimpan daftar kondisi yang didukung oleh appium
