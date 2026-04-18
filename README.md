# 🏥 Hospital Patient Queue System

Proyek ini adalah sistem berbasis konsol untuk mengelola pasien, antrian perawatan, dan jadwal dokter di sebuah klinik kecil.
Dibangun menggunakan struktur data yang diimplementasikan secara manual dalam Java — tanpa menggunakan built-in library seperti `ArrayList` atau `HashMap`.

---

## 👥 Anggota Kelompok & Pembagian Tugas

| Student | Data Structure | Module Class | Key Methods |
|---------|---------------|--------------|-------------|
| Azza Ummu  | Dynamic Array | `PatientRegistry.java` | `add`, `remove`, `findById`, `findByName`, `listAll`, `size`, `isEmpty` |
| Apta Saniy | Queue (linked nodes) | `TreatmentQueue.java` | `enqueue`, `dequeue`, `peek`, `isEmpty`, `size`, `displayQueue` |
| Naufal Maulid | Stack (linked nodes) | `MedicalHistoryStack.java` | `push`, `pop`, `peek`, `isEmpty`, `size`, `displayHistory` |
| Zahran Hilal | HashMap (array+chaining) | `DoctorScheduleMap.java` | `addAppointment`, `getAppointments`, `removeDoctor`, `listDoctors`, `size` |
| Muhammad Andreana  | Deque (doubly-linked) | `PatientDeque.java` | `addFront`, `addRear`, `removeFront`, `removeRear`, `peekFront`, `peekRear`, `isEmpty`, `size`, `display` |

---

## 🗂️ Shared Entity Classes

Kelas-kelas berikut digunakan bersama oleh seluruh anggota kelompok:

```java
// Patient.java
String id, name;
int age;
String ailment;

// Doctor.java
String id, name, specialization;

// Appointment.java
String patientId, doctorId, notes;
```

---

## 📦 Struktur Folder

Hospital-Patient-Queue-System-Group1
├── shared
│    ├── Patient.java
│   ├── Doctor.java
│    ├── Appointment.java
├── Student-1-[Azza Ummu]
│    ├── PatientRegistry.java       # S1 - Dynamic Array
│    ├── PatientRegistryDemo.java
├── Student-2-[Apta Saniy]
│    ├── TreatmentQueue.java        # S2 - Queue
│    ├── TreatmentQueueDemo.java
├── Student-3-[Naufal Maulid]
│    ├── MedicalHistoryStack.java   # S3 - Stack
│    ├── MedicalHistoryStackDemo.java
├── Student-4-[Zahran Hilal]
│    ├── DoctorScheduleMap.java     # S4 - HashMap
│    ├── DoctorScheduleMapDemo.java
├── Student-5-[Muhammad Andreana]
│    ├── PatientDeque.java          # S5 - Deque
│    ├── PatientDequeDemo.java
└── README.md                      # README File
```

---

## 🔍 Penjelasan Tiap Modul

### S1 — PatientRegistry (Dynamic Array)
Menyimpan daftar semua pasien menggunakan array dinamis yang bisa membesar otomatis.
Memungkinkan pencarian pasien berdasarkan ID atau nama.

### S2 — TreatmentQueue (Queue)
Mengatur antrian perawatan pasien menggunakan struktur Queue (FIFO — First In First Out).
Pasien yang pertama masuk akan pertama dilayani.

### S3 — MedicalHistoryStack (Stack)
Menyimpan riwayat medis pasien menggunakan struktur Stack (LIFO — Last In First Out).
Riwayat terakhir yang ditambahkan akan pertama ditampilkan.

### S4 — DoctorScheduleMap (HashMap + Chaining)
Mengelola jadwal janji temu dokter menggunakan HashMap dengan teknik chaining.
Setiap dokter bisa memiliki banyak janji temu yang disimpan dalam linked list di bucket yang sama.

**Contoh output:**
```
=== Daftar Dokter ===
- Dr. Andi : 2 janji temu
- Dr. Budi : 1 janji temu

=== Jadwal Dr. Andi ===
1. Pasien P001 - pemeriksaan rutin
2. Pasien P002 - kontrol lanjutan

Dr. Budi berhasil dihapus dari jadwal.
Tidak ditemukan jadwal untuk: Dr. Budi
```

### S5 — PatientDeque (Doubly-Linked Deque)
Mengatur antrean pasien prioritas menggunakan Deque (Double-Ended Queue).
Pasien bisa ditambahkan atau diambil dari depan maupun belakang antrean.

---

## ▶️ Cara Menjalankan

1. Clone repository ini
```bash
git clone https://github.com/username/hospital-queue-system.git
```

2. Masuk ke folder project
```bash
cd hospital-queue-system
```

3. Compile semua file Java
```bash
javac *.java
```

4. Jalankan program
```bash
java Main
```

---

## 🌿 Git Workflow

Setiap anggota bekerja di branch masing-masing:

```
main
├── feature/patient-registry      # S1
├── feature/treatment-queue       # S2
├── feature/medical-history       # S3
├── feature/doctor-schedule       # S4
└── feature/patient-deque         # S5
```

Setelah selesai, buat **Pull Request** ke branch `main` dan selesaikan merge conflict jika ada.

---

## 📹 Video Submission

| Video | Judul | Durasi |
|-------|-------|--------|
| Video 1 | Problem Decomposition | 5–8 menit |
| Video 2 | Application Design (Class Diagram) | 5–10 menit |
| Video 3 | Live Coding | Bebas (boleh dibagi beberapa bagian) |
| Video 4 | Git Workflow | 5–8 menit |

---

## 📝 Catatan

- Seluruh struktur data diimplementasikan **dari scratch** tanpa built-in Java collections
- Bahasa yang digunakan: **Bahasa Indonesia / English** (keduanya diterima)
- Dalam proses pengerjaan boleh menggunakan AI, dengan catatan bukan built-in IDE, atau auto completion.
