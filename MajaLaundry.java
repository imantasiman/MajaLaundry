

import java.util.Scanner;


public class MajaLaundry{

	    public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		

		//Deklarasi Variable
		String nama_pegawai, tanggal;
		int i, n, kembali, bayar, total_semua=0;

		//Arraylist
		String kode_barang[]=new String[10];
		String nama_barang[]=new String[10];
		int jmlh_kilo[]=new int[10];
		int harga[]=new int[10];
		int total_harga[]=new int[10];

		//Tampilan Input
		System.out.println("\n");
		System.out.println("\t\t\t\t\tMAJA LAUNDRY");
		System.out.println("============================================================================================");
		System.out.print("Masukan Nama Pegawai Kasir: ");
		nama_pegawai=input.nextLine();
		System.out.print("Tanggal Transaksi Orderan : ");
		tanggal=input.nextLine();
		System.out.print("Jumlah Data Akan Dimasukan: ");
		n=input.nextInt();
		System.out.println("============================================================================================");

		//Perulangan menggunakan For
		for (i=0; i<n; i++){
			int number = i+1;
			System.out.print("Data ke-"+number+" Masukan Kode Barang : ");
			kode_barang[i]=input.next();
			System.out.print("Jumlah Kilo Gram              : ");
			jmlh_kilo[i]=input.nextInt();


		//Percabangan IF Else untuk menentukan pilihan barang
		if (kode_barang[i].equals("ML01")){
			harga[i]=6000;
			nama_barang[i]="Baju\t";

		} 
		else if (kode_barang[i].equals("ML02")){
			harga[i]=7000;
			nama_barang[i]="Celana\t";

		}
		else if (kode_barang[i].equals("ML03")){
			harga[i]=8000;
			nama_barang[i]="Sprei\t";

		}
		else if (kode_barang[i].equals("ML04")){
			harga[i]=8000;
			nama_barang[i]="Boneka\t";

		}
		else if (kode_barang[i].equals("ML05")){
			harga[i]=9000;
			nama_barang[i]="Selimut\t";

		}
		else if (kode_barang[i].equals("ML06")){
			harga[i]=9500;
			nama_barang[i]="Karpet\t";

		}
		else{
			System.out.println("Kode Yang Anda Masukan Salah!!!");
		}

		total_harga[i]=harga[i]*jmlh_kilo[i];
		total_semua=total_semua+total_harga[i];
		

		//Tampilan Output
	}
		System.out.println("\n");
		System.out.println("\t\t\t\t\t MAJA LAUNDRY \n");
		System.out.println("============================================================================================================");
		System.out.println("Nama Petugas Kasir : "+nama_pegawai+"\t\t"+"Tanggal : "+tanggal);
		System.out.println("Jumlah Data        : "+n);

		System.out.println("============================================================================================================");
		System.out.println("Data Ke-\tKode Barang\t\tNama Barang\t\tHarga Barang\tJumlah Kg\tTotal Harga");
		System.out.println("============================================================================================================");

		//Perulangan For
		for(i=0; i<n; i++){
			int number =i+1;
			System.out.println(+number+"\t\t"+kode_barang[i]+"\t\t\t"+nama_barang[i]+"\t\t"+harga[i]+"\t\t"+jmlh_kilo[i]+"\t\t"+total_harga[i]);


}
		System.out.println("============================================================================================================");
		System.out.println("Grantotal Pembayaran: "+total_semua);
		System.out.print("Pembayaran          : ");
		bayar=input.nextInt();
		kembali=bayar-total_semua;
		System.out.println("Kembalian           : "+kembali);
}
}
