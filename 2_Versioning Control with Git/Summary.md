# Versioning Control with GIT

## Resume
Git adalah version control system yang diciptakan agar tim developer dapat mengembangkan software secara bersama sama menyimpan delta yang dimana GIT dapat memungkinkan kembali ke versi yang diinginkan.

### 1.Versioning 
    Versioning adalah sistem yang merekam perubahan dari waktu ke waktu 
    
### 2. TOOLS
    1. Version Control System (VCS)
	  2. Source Code Manager (SCM)
	  3. Revision Control System (RCS)
    
### 3. Penginstallan GITHUB (WINDOWS 10)
    1. Download versi terakhir dari github
    2. Siapkan command promt
    3. Instal aplikasi berdasarkan panduan yang diberikan
    4. Untuk memeriksa apakah GIT sudah berhasil diinstalasi buka CMD dan ketikkan perintah git -- version
    
 
 ### Setting Up GIT 
    1. Untuk meloginkan akun github ke dalam komputer pertama buka CMD 
    2. Ketikkan perintah git config --global user.name "Anita01"
    3. Berikutnya ketikkan perintah git config --global user.email "anitasiagian11@gmail.com"
    4. Selanjutnya kita akan masuk ke dalam proses INIT
    
  ### Sebelum melakukan proses INIT terlebih dahulu harus membuat repositori pada akun github anda 
	  1.Langkah pertama ketikkan perintah git init ke file yang ingin anda push 
	  2. Setelah proses init berhasil masukkan perintah git remote add <url (URL repositori yang telah anda buat>
	  3. Masukkan perintah git commit -m "pesan anda"
	  4. Selanjutnya ketikkan perintah git push -u origin master

   ### BRANCHES 
    Ada beberapa perintah yang digunakan dalam branch antara lain :
    - git branch -- list = Menampilkan list branch yang telah kita buat
    - git branch <branh> = Membuat branch baru
    - git branch -D <branch> = Menghapus branch 
    - git branch -a = Menunjukkan lokasi branch

   ### Merge 
    Ada beberapa perintah yang digunakan dalam pembuatan master 
    - git checkout "nama feature" untuk memindahkan direktori ke dalam nama branch yang digunakan
    - git add . = menambahkan semua file
    - git add "nama file" = menambahkan file sesuai nama yang diinginkan 
    - git commit -m "pesan" = memasukkan pesan ke dalam file yang ingin dipush

   ### Perintah yang digunakan untuk memerge 
    - git checkout master
    - git merge new-feature
    - git branch  -d new-feature

   ### Branch yang digunakan agar kolaborasi para developer dapat berjalan dengan lancar
     - master
     - develop
     - feature
     - feature



Hasil Praktikum Section 2 : 

![Gambar pertama](https://github.com/Anita-01/qe_Anita-Siagian/blob/master/2_Versioning%20Control%20with%20Git/screenshot/1.png)

![git add . = Berfungsi untuk membuat repository pada file lokal yang nantinya ada folder .git [perintah yang diketikkan adalah GIT INIT]
(https://github.com/Anita-01/qe_Anita-Siagian/blob/master/2_Versioning%20Control%20with%20Git/screenshot/2.png)

![git remote add origin https://github.com/Anita-01/qe_Anita-Siagian.git = Berfungsi untuk harus menambahkan remote  ]
(https://github.com/Anita-01/qe_Anita-Siagian/blob/master/2_Versioning%20Control%20with%20Git/screenshot/3.png)
