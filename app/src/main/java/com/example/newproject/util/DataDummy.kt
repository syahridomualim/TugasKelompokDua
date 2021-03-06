package com.example.newproject.util

import com.example.newproject.data.Person
import com.example.newproject.data.University

object DataDummy {
    fun generateDummyUniversity(): List<University> {
        val universities = ArrayList<University>()

        universities.add(
            University(
                "Universitas Indonesia",
                "Jl. Margonda Raya, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
                "Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok, Jawa Barat tepat di perbatasan antara Depok dengan wilayah Jakarta Selatan, dan kampus utama lainnya terdapat di daerah Salemba di Jakarta Pusat. Universitas Indonesia adalah kampus modern, komprehensif, terbuka, multibudaya, dan humanis yang mencakup disiplin ilmu yang luas. Telah menghasilkan lebih dari 400.000 alumni. Secara umum dianggap sebagai salah satu dari tiga perguruan tinggi papan atas di Indonesia bersama dengan Universitas Gadjah Mada dan Universitas Airlangga.[9][10] Cikal-bakal terbentuknya Universitas Indonesia adalah ketika pemerintah kolonial Belanda mendirikan sebuah sekolah yang bertujuan untuk menghasilkan asisten dokter tambahan yang memegang sertifikat untuk melakukan perawatan-perawatan tingkat dasar serta mendapatkan gelar Dokter Jawa (Javanese doctor). Secara resmi Universitas Indonesia memulai kegiatannya pada 2 Februari 1950 dengan presiden (saat ini disebut rektor) pertamanya Ir. R.M. Pandji Soerachman Tjokroadisoerio.[11] Kantor Presiden Universitas Indonesia mula-mula berkedudukan di Jakarta, di gedung Fakultas Kedokteran di Jl Salemba Raya no. 6, kemudian dipindahkan ke Jl. Salemba Raya no. 4, Jakarta. Tanggal 2 Februari 1950 dijadikan hari kelahiran Universitas Indonesia.",
                "https://upload.wikimedia.org/wikipedia/id/9/95/Makara_UI.png",
                ""
            )
        )

        universities.add(
            University(
                "Universitas Negeri Jakarta",
                "Jl. R.Mangun Muka Raya, RT.11/RW.14, Rawamangun, Kec. Pulo Gadung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13220",
                "Melalui Keputusan Presiden RI No. 1 tahun 1963 tanggal 3 Januari 1963, ditetapkan integrasi sistem kelembagaan pendidikan guru. Salah satu butir pernyataan Keppres tersebut adalah bahwa surat keputusan ini berlaku sejak 16 Mei 1964, yang kemudian dinyatakan sebagai hari lahirnya IKIP Jakarta. FKIP dan IPG diubah menjadi IKIP (Institut Keguruan dan Ilmu Pendidikan). FKIP Universitas Indonesia dan IPG Jakarta diintegrasikan menjadi IKIP Jakarta. Dalam perkembangan selanjutnya IKIP diberi perluasan mandat untuk mengembangkan ilmu kependidikan dan non kependidikan dalam wadah universitas. IKIP Jakarta sejak tanggal 4 Agustus 1999 berubah menjadi Universitas Negeri Jakarta (UNJ) berdasarkan Keppres 093/1999 tanggal 4 Agustus 1999, dan peresmiannya dilaksanakan oleh Presiden Republik Indonesia pada tanggal 31 Agustus 1999 di Istana Negara.",
                "https://upload.wikimedia.org/wikipedia/id/6/6e/Logo-unj.png",
                ""
            )
        )

        universities.add(
            University(
                "Institut Teknologi Bandung",
                "Jl. Ganesa No.10, Lb. Siliwangi, Kecamatan Coblong, Kota Bandung, Jawa Barat 40132",
                "nstitut Teknologi Bandung (ITB) adalah sebuah perguruan tinggi negeri yang berkedudukan di Kota Bandung. Nama ITB diresmikan pada tanggal 2 Maret 1959. Sejak tanggal 14 Oktober 2013 ITB menjadi Perguruan Tinggi Negeri Badan Hukum (PTN BH) yang memiliki otonomi pengelolaan dalam akademik dan nonakademik. ITB telah memiliki 27 program studi yang terakreditasi secara internasional (sebelas dari ABET, sebelas dari ASIIN)",
                "https://upload.wikimedia.org/wikipedia/id/9/95/Logo_Institut_Teknologi_Bandung.png",
                ""
            )
        )

        universities.add(
            University(
                "Universitas Gajah Mada",
                "Bulaksumur, Blimbing Sari, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
                "Universitas Gadjah Mada (Hanacaraka: ????????????????????????????????????\u200B?????????\u200B??????; disingkat UGM) merupakan universitas negeri di Indonesia yang didirikan oleh Pemerintah Republik Indonesia pada tanggal 19 Desember 1949 berdasarkan Peraturan Pemerintah Nomor 23 Tahun 1949 tentang Peraturan Tentang Penggabungan Perguruan Tinggi Menjadi Universiteit tanggal 16 Desember 1949.",
                "https://addyrachmat.files.wordpress.com/2018/12/Logo-UGM.png",
                ""
            )
        )

        return universities
    }

    fun generateDummyPerson(): List<Person> {
        val person = ArrayList<Person>()

        person.add(
            Person(
                "Mu'alim",
                "Hidul berawal dari tidur",
                "0857-7886-2232",
                "https://style.anu.edu.au/_anu/4/images/placeholders/person.png"
            )
        )

        person.add(
            Person(
                "Alvin",
                "Rebahan is my live",
                "0895-3243-41230",
                "https://style.anu.edu.au/_anu/4/images/placeholders/person.png"
            )
        )

        person.add(
            Person(
                "Tanto",
                "Rebahan is my live",
                "0895-3243-41230",
                "https://style.anu.edu.au/_anu/4/images/placeholders/person.png"
            )
        )

        person.add(
            Person(
                "Alfan",
                "Rebahan is my live",
                "0895-3243-41230",
                "https://style.anu.edu.au/_anu/4/images/placeholders/person.png"
            )
        )

        person.add(
            Person(
                "Imam",
                "Rebahan is my live",
                "0895-3243-41230",
                "https://style.anu.edu.au/_anu/4/images/placeholders/person.png"
            )
        )

        person.add(
            Person(
                "Akbar",
                "Rebahan is my live",
                "0895-3243-41230",
                "https://style.anu.edu.au/_anu/4/images/placeholders/person.png"
            )
        )
        return person
    }
}