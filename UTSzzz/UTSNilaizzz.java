import java.util.Scanner;

public class UTSNilaizzz {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // --- INPUT DATA MAHASISWA ---
    System.out.println("===== INPUT DATA MAHASISWA =====");
    System.out.print("Nama : ");
    String nama = input.nextLine();
    System.out.print("NIM  : ");
    String nim = input.nextLine();

    // --- Mata Kuliah 1: Algoritma dan Pemrograman ---
    System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
    System.out.print("Nilai UTS   : ");
    double uts1 = input.nextDouble();
    System.out.print("Nilai UAS   : ");
    double uas1 = input.nextDouble();
    System.out.print("Nilai Tugas : ");
    double tugas1 = input.nextDouble();

    // --- Mata Kuliah 2: Struktur Data ---
    System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
    System.out.print("Nilai UTS   : ");
    double uts2 = input.nextDouble();
    System.out.print("Nilai UAS   : ");
    double uas2 = input.nextDouble();
    System.out.print("Nilai Tugas : ");
    double tugas2 = input.nextDouble();

        // --- Mata Kuliah 3: Matematika ---
    System.out.println("\n--- Mata Kuliah 3: Matematika ---");
    System.out.print("Nilai UTS   : ");
    double uts3 = input.nextDouble();
    System.out.print("Nilai UAS   : ");
    double uas3 = input.nextDouble();
    System.out.print("Nilai Tugas : ");
    double tugas3 = input.nextDouble();

    input.close();

    // --- CALCULATIONS ---
    // Pembobotan : 30% UTS, 40% UAS, 30% Tugas
    double nilaiAkhir1 = (0.30 * uts1) + (0.40 * uas1) + (0.30 * tugas1);
    double nilaiAkhir2 = (0.30 * uts2) + (0.40 * uas2) + (0.30 * tugas2);
    double nilaiAkhir3 = (0.30 * uts3) + (0.40 * uas3) + (0.30 * tugas3);

    // nilai untuk matkul 1
    String nilaiHuruf1;
    if (nilaiAkhir1 >= 81 && nilaiAkhir1 <= 100) {
      nilaiHuruf1 = "A";
    } else if (nilaiAkhir1 >= 73 && nilaiAkhir1 < 81) {
      nilaiHuruf1 = "B+";
    } else if (nilaiAkhir1 >= 65 && nilaiAkhir1 < 73) {
      nilaiHuruf1 = "B";
    } else if (nilaiAkhir1 >= 60 && nilaiAkhir1 < 65) {
      nilaiHuruf1 = "C+";
    } else if (nilaiAkhir1 >= 50 && nilaiAkhir1 < 60) {
      nilaiHuruf1 = "C";
    } else if (nilaiAkhir1 >= 39 && nilaiAkhir1 < 50) {
      nilaiHuruf1 = "D";
    } else {
      nilaiHuruf1 = "E";
    }

    // nilai untuk matkul 2
    String nilaiHuruf2;

    if (nilaiAkhir2 >= 81 && nilaiAkhir2 <= 100)
      nilaiHuruf2 = "A";
    else if (nilaiAkhir2 >= 73 && nilaiAkhir2 < 81) {
      nilaiHuruf2 = "B+";
    } else if (nilaiAkhir2 >= 65 && nilaiAkhir2 < 73) {
      nilaiHuruf2 = "B";
    } else if (nilaiAkhir2 >= 60 && nilaiAkhir2 < 65) {
      nilaiHuruf2 = "C+";
    } else if (nilaiAkhir2 >= 50 && nilaiAkhir2 < 60) {
      nilaiHuruf2 = "C";
    } else if (nilaiAkhir2 >= 39 && nilaiAkhir2 < 50) {
      nilaiHuruf2 = "D";
    } else {
      nilaiHuruf2 = "E";
    }

        // nilai untuk matkul 2
    String nilaiHuruf3;

    if (nilaiAkhir3 >= 81 && nilaiAkhir3 <= 100)
      nilaiHuruf3 = "A";
    else if (nilaiAkhir3 >= 73 && nilaiAkhir3 < 81) {
      nilaiHuruf3 = "B+";
    } else if (nilaiAkhir3 >= 65 && nilaiAkhir3 < 73) {
      nilaiHuruf3 = "B";
    } else if (nilaiAkhir3 >= 60 && nilaiAkhir3 < 65) {
      nilaiHuruf3 = "C+";
    } else if (nilaiAkhir3 >= 50 && nilaiAkhir3 < 60) {
      nilaiHuruf3 = "C";
    } else if (nilaiAkhir3 >= 39 && nilaiAkhir3 < 50) {
      nilaiHuruf3 = "D";
    } else {
      nilaiHuruf3 = "E";
    }

    // passing grade matkul 1
    String status1;
    if (nilaiAkhir1 < 60) {
      status1 = "TIDAK LULUS";
    } else {
      status1 = "LULUS";
    }

    // passing grade matkul 2
    String status2;
    if (nilaiAkhir2 < 60) {
      status2 = "TIDAK LULUS";
    } else {
      status2 = "LULUS";
    }

        // passing grade matkul 3
    String status3;
    if (nilaiAkhir3 < 60) {
      status3 = "TIDAK LULUS";
    } else {
      status3 = "LULUS";
    }

    double rataRataNilaiAkhir = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3;

    // status semester
    String statusSemester;
    if (status1.equalsIgnoreCase("LULUS") && status2.equalsIgnoreCase("LULUS") && status3.equalsIgnoreCase("LULUS")) {
      if (rataRataNilaiAkhir >= 70) {
        statusSemester = "LULUS";
      } else {
        statusSemester = "TIDAK LULUS";
      }
      System.out.println("\nSelamat! Anda Lulus Semua Mata Kuliah.");
    } else {
      statusSemester = "TIDAK LULUS";
    }

    // --- HASIL PENILAIAN AKADEMIK ---
    System.out.println("\n\n========== HASIL PENILAIAN AKADEMIK ==========");
    System.out.println("Nama : " + nama);
    System.out.println("NIM  : " + nim);
    System.out.println();

    // Print table header
    System.out.format("%-25s %-10s %-10s %-10s %-15s %-15s %-10s\n",
        "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
    System.out.println(
        "-------------------------------------------------------------------------------------------------------");

    // Print results for course 1
    System.out.format("%-25s %-10.0f %-10.0f %-10.0f %-15.2f %-15s %-10s\n",
        "Algoritma Pemrograman", uts1, uas1, tugas1, nilaiAkhir1, nilaiHuruf1, status1);

    // Print results for course 2
    System.out.format("%-25s %-10.0f %-10.0f %-10.0f %-15.2f %-15s %-10s\n",
        "Struktur Data", uts2, uas2, tugas2, nilaiAkhir2, nilaiHuruf2, status2);

   // Print results for course 3
    System.out.format("%-25s %-10.0f %-10.0f %-10.0f %-15.2f %-15s %-10s\n",
        "Matematika", uts3, uas3, tugas3, nilaiAkhir3, nilaiHuruf3, status3);

    System.out.println(
        "\n-------------------------------------------------------------------------------------------------------");
    System.out.format("Rata-rata Nilai Akhir: %.2f\n", rataRataNilaiAkhir);
    System.out.println("Status Semester      : " + statusSemester);
    System.out.println(
        "=======================================================================================================");
  }
}