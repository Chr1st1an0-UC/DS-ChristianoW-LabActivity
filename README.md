A. Concept Check: 
- Linked list membutuhkan variabel head sebagai titik awal untuk mengakses seluruh node dalam list. Tanpa head, list tidak bisa diakses.
- Setiap node menyimpan referensi next agar dapat terhubung dengan node berikutnya dan membentuk struktur berantai.
- Insertion di awal linked list lebih mudah karena hanya perlu mengubah pointer (O(1)), sedangkan pada array harus menggeser elemen (O(n)).

B. Code Reading :
1. newNode.next = head;
   head = newNode;

harus seperti itu agar node baru tetap terhubung dengan list lama. Jika dibalik, data lama bisa hilang atau terjadi self-loop.

2. while (current.next != null)

maka node terakhir tidak akan ditampilkan karena perulangan berhenti sebelum mencapai node terakhir.

C. Comparison With Array :
- Array lebih baik untuk akses acak (random access) karena memiliki indeks langsung (O(1)).
- Linked list lebih baik untuk penyisipan di awal karena tidak perlu menggeser elemen (O(1)).
- Linked list menggunakan lebih banyak memori karena setiap node menyimpan data dan pointer (next), sedangkan array hanya menyimpan data.