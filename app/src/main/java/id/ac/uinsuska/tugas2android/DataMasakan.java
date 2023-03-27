package id.ac.uinsuska.tugas2android;

import java.util.ArrayList;

public class DataMasakan{
    private static String[] Namamasakan = {
        "Nasi Goreng",
            "Rendang",
            "Sate Padang",
            "Ketupat Opor",
            "Ayam Pop",
            "Ikan Bakar",
            "Gado-Gado",
            "Pecel Ayam",
            "Pecel Lele"

    };
    private static String [] DetailMasakan ={
                "Nasi Goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan yang menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica, rempah-rempah tertentu dan kecap manis.",
                "Rendang atau Randang/Rondang dalam bahasa Minangkabau adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatera Barat, Indonesia. Masakan merupakan olahan daging (biasanya sapi atau kerbau) atau telur yang dimasak dalam suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan. ",
                "Sate padang adalah sebutan untuk tiga jenis varian sate di Sumatera Barat, yaitu Sate Padang, Sate Padang Panjang dan Sate Pariaman Sate Padang memakai bahan daging sapi, lidah, biji atau jeroan (jantung, usus, dan tetelan) dengan bumbu kuah kacang kental yang ditambah dengan cabai yang banyak sehingga rasanya pedas.",
    } ;


    private static int[] GambarMasakan= {
            R.drawable.nasigoreng,
            R.drawable.rendang,
            R.drawable.satepadang,

    };

    static ArrayList<Masakan>getlistData(){
        ArrayList<Masakan> list = new ArrayList<>();
        for (int position = 0; position < Namamasakan.length; position++){
            Masakan masakan = new Masakan();
            masakan.setName(Namamasakan[position]);
            masakan.setDeskripsi(DetailMasakan[position]);
            masakan.setGambar(GambarMasakan[position]);
            list.add(masakan);
        }
            return list;
    }
}
