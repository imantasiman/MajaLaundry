
//Import untuk memanggil Scanner
import java.util.Scanner;

public class MajaLaundry {

	// Scanner;
	Scanner input = new Scanner(System.in);

	// Deklarasi Variable
	String nama_pegawai, tanggal;
	int i, n, kembali, bayar, total_semua = 0;

	// Deklarasi variable Arraylist
	String kode_barang[] = new String[10];
	String nama_barang[] = new String[10];
	int jmlh_kilo[] = new int[10];
	int harga[] = new int[10];
	int total_harga[] = new int[10];

	// Method Data barang
	public void setdata() {
		System.out.println("\n");
		System.out.println(
				"============================================================================================================");
		System.out.println("\t\t\t\t\tSELAMAT DATANG DI MAJA LAUNDRY");
		System.out.println("\t\t\t\t\t      CABANG MAJALENGKA");
		System.out.println(
				"============================================================================================================");
		System.out.print("Masukan Nama Pegawai Kasir: ");
		nama_pegawai = input.nextLine();
		System.out.print("Tanggal Transaksi Orderan : ");
		tanggal = input.nextLine();
		System.out.print("Jumlah Data Akan Dimasukan: ");
		n = input.nextInt();
		System.out.println(
				"============================================================================================================");

		// Perulangan menggunakan For untuk menentukan jumlah data barang
		for (i = 0; i < n; i++) {
			int number = i + 1;
			System.out.print("Data ke-" + number + " Masukan Kode Barang : ");
			kode_barang[i] = input.next();
			System.out.print("Jumlah Kilo Gram              : ");
			jmlh_kilo[i] = input.nextInt();

			// Percabangan IF Else untuk menentukan pilihan barang
			if (kode_barang[i].equals("ML01")) {
				harga[i] = 6000;
				nama_barang[i] = "Baju\t";

			} else if (kode_barang[i].equals("ML02")) {
				harga[i] = 7000;
				nama_barang[i] = "Celana\t";

			} else if (kode_barang[i].equals("ML03")) {
				harga[i] = 8000;
				nama_barang[i] = "Sprei\t";

			} else if (kode_barang[i].equals("ML04")) {
				harga[i] = 8000;
				nama_barang[i] = "Boneka\t";

			} else if (kode_barang[i].equals("ML05")) {
				harga[i] = 9000;
				nama_barang[i] = "Selimut\t";

			} else if (kode_barang[i].equals("ML06")) {
				harga[i] = 9500;
				nama_barang[i] = "Karpet\t";

			} else {
				nama_barang[i] = "-";
				harga[i] = 0;
				jmlh_kilo[i] = 0;

			}
			// Perhitungan total harga dan total semua
			total_harga[i] = harga[i] * jmlh_kilo[i];
			total_semua = total_semua + total_harga[i];

		}
		// Tampilan Output atau struk
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t MAJA LAUNDRY");
		System.out.println("\t\t\t\t\t\t    KASIR");
		System.out.println(
				"============================================================================================================");
		System.out.println("Nama Pegawai Kasir : " + nama_pegawai + "\t\t\t\t\t\t" + "Tanggal : " + tanggal);
		System.out.println("Jumlah Data        : " + n + "\t\t\t\t\t\t\t\tCabang  : Majalengka");

		System.out.println(
				"============================================================================================================");
		System.out.println("Data Ke-\tKode Barang\t\tNama Barang\t\tHarga Barang\tJumlah Kg\tTotal Harga");
		System.out.println(
				"============================================================================================================");

		// Perulangan For untuk menentukan jumlah data barang
		for (i = 0; i < n; i++) {
			int number = i + 1;
			System.out.println(+number + "\t\t" + kode_barang[i] + "\t\t\t" + nama_barang[i] + "\t\t" + harga[i]
					+ "\t\t" + jmlh_kilo[i] + "\t\t" + total_harga[i]);
		}
		System.out.println(
				"============================================================================================================");
		System.out.println("Grantotal Pembayaran: Rp." + total_semua);
		System.out.print("Pembayaran          : Rp.");
		bayar = input.nextInt();

		// Percabangan If Else untuk menentukan jumlah pembayaran
		if (bayar >= total_semua) {
			kembali = bayar - total_semua;
			System.out.println("Kembalian           : Rp." + kembali);
			System.out.println(
					"\t\t\t\t   TERIMA KASIH SUDAH MAMPIR KE MAJA LAUNDRY");
			System.out.println(
					"\t\t\t\t    SEMOGA ANDA PUAS DENGAN PELAYANAN KAMI:)");
			System.out.println("");

		} else if (bayar < total_semua) {
			System.out.println("\t\t\t\t\tMAAF UANG ANDA TIDAK CUKUP!!!");
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// Scanner
		Scanner getint = new Scanner(System.in);

		// Deklarasi Variable
		int x = 0, menu = 0;
		String maja;

		// Deklarasi variable array object MajaLaundry untuk dicari
		MajaLaundry[] mln = new MajaLaundry[100];

		// Perulangan While untuk menentukan pilihan menu
		while (menu != 2) {
			System.out.print("MENU UTAMA");
			System.out.print("\n1. Login\n2. Logout\nMASUKAN PILIHAN : ");
			menu = getint.nextInt();
			// Percabangan IF Else untuk pilihan menu
			if (menu == 1) {
				x++;
				mln[x] = new MajaLaundry();
				mln[x].setdata();
			} else if (menu == 2) {
				System.out.print("");
				System.out.println("ANDA TELAH LOGOUT DARI PROGRAM");
			} else {
				System.out.print("");
				System.out.println("MAAF PILIHAN MENU TIDAK TERSEDIA");
			}
		}
	}
}
