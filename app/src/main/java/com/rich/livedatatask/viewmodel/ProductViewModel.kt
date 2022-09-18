package com.rich.livedatatask.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rich.livedatatask.R
import com.rich.livedatatask.model.Product

class ProductViewModel : ViewModel() {
    val listData = arrayListOf(
        Product(R.drawable.prod1,"Iphone 14 Pro Max",14000000,100,"The iPhone 14 Pro Max was announced at Apple's \"Far Out\" event on September 7, 2022. Launching this September, the phone is the company’s largest and most advanced ever. It will be succeeding the iPhone 13 Pro Max as the crown jewel in Apple’s portfolio and will carry a premium price tag.\n" +
                "\n" +
                "The iPhone 14 Pro Max comes with a large 6.7-inch Samsung-made OLED display with 1-120Hz refresh rate and an always-on display functionality. The phone comes Apple's new A16 Bionic chipset, 6GB of LPDDR5 RAM, and will available in the following storage variants: 128GB, 256GB, 512GB, and the range-topping 1TB version.\n" +
                "\n" +
                "Another big selling point of the iPhone 14 Pro Max might be its camera and its new 48MP sensor. It uses an 1/1.3-inch sensor and utilizes quad-binning in order to achieve much better detail and low-light image quality in comparison with Apple’s 12MP cameras of old.\n" +
                "\n" +
                "The front-facing FaceTime camera now also has autofocusing capabilities as well as a larger F1.9 aperture that lets more light hit the sensor, which would improve the overall image detail and sharpness."),
        Product(R.drawable.prod2,"MacBook Pro M2 13.3 inch",21999000,100,"MacBook Pro 13 inci lebih andal dari sebelumnya. Bertenaga super berkat chip M2 generasi berikutnya, MacBook Pro ini merupakan laptop pro Apple yang paling portabel, dengan kekuatan baterai hingga 20 jam.\n" +
                "\n" +
                "\n" +
                "Poin-poin fitur utama \n" +
                "* Chip M2 dengan performa CPU, GPU, dan pembelajaran mesin generasi berikutnya \n" +
                "* CPU 8-core dan GPU 10-core yang lebih cepat untuk menyelesaikan berbagai alur kerja yang intens\n" +
                "* Neural Engine 16-core untuk berbagai tugas pembelajaran mesin canggih \n" +
                "* Memori terintegrasi lebih cepat hingga 24GB menjadikan segala yang Anda lakukan terasa lancar \n" +
                "* Penggabungan gambar ke dalam panorama hingga 43 persen lebih cepat\n" +
                "* Performa bermain game hingga 39 persen lebih cepat\n" +
                "* Sistem pendingin aktif menopang performa luar biasa \n" +
                "* Lakukan banyak hal sepanjang hari dengan kekuatan baterai hingga 20jam \n" +
                "* Layar Retina 13,3 inci dengan kecerahan 500 nit dan warna luas P3 untuk gambar yang cemerlang dan detail luar biasa\n" +
                "* Kamera FaceTime HD dengan prosesor sinyal gambar canggih agar Anda tampil menawan dalam panggilan video \n" +
                "* Deretan tiga mikrofon berkualitas studio menangkap suara Anda dengan lebih jernih \n" +
                "* Koneksi nirkabel Wi-Fi 6 yang kencang \n" +
                "* Dua port Thunderbolt untuk pengisian daya dan aksesori\n" +
                "* Magic Keyboard berlampu latar dengan Touch Bar dan Touch ID untuk membuka kunci dan melakukan pembayaran dengan aman \n" +
                "* Penyimpanan SSD super cepat membuka aplikasi dan file dalam sekejap \n" +
                "* macOS Monterey memungkinkan Anda terhubung, berbagi, dan berkreasi dengan cara yang benar-benar baru — di semua perangkat Apple Anda \n" +
                "* Tersedia dalam warna abu-abu dan perak"),
        Product(R.drawable.prod3,"iPad Pro 5th Gen 12.9-inch (2021)",41399000,100,"Teks fitur\n" +
                "iPad Pro dilengkapi dengan chip Apple M1 yang bertenaga untuk performa tingkat selanjutnya dan kekuatan baterai sepanjang hari. (3) Layar Liquid Retina XDR 12,9 inci yang menghanyutkan untuk melihat dan mengedit foto serta video. (1) Model Cellular memungkinkan Anda tetap terhubung saat tidak ada Wi-Fi. (2) Dan kamera depan dengan Center Stage memudahkan Anda melakukan panggilan video. iPad Pro memiliki kamera pro dan LiDAR Scanner untuk foto dan video memukau, serta AR yang menghanyutkan. Thunderbolt untuk terhubung dengan aksesori berperforma tinggi. Dan Anda bisa menambahkan Apple Pencil untuk menulis catatan, menggambar, serta menandai dokumen, dan Magic Keyboard untuk trackpad dan pengalaman mengetik yang responsif. (4)\n" +
                "\n" +
                "\n" +
                "Poin-poin fitur utama\n" +
                "• Chip Apple M1 untuk performa tingkat selanjutnya\n" +
                "• Layar Liquid Retina XDR 12,9 inci cemerlang1 dengan ProMotion, True Tone, dan warna luas P3\n" +
                "• Sistem kamera TrueDepth memiliki kamera Ultra Wide dengan Center Stage\n" +
                "• Kamera Wide 12 MP, kamera Ultra Wide 10 MP, \u2028dan LiDAR Scanner untuk AR yang imersif\n" +
                "• Tetap terhubung dengan Wi-Fi 6 ultra cepat dan LTE (2)\n" +
                "• Selangkah lebih maju dengan kekuatan baterai sepanjang hari (3)\n" +
                "• Port Thunderbolt untuk terhubung ke penyimpanan eksternal cepat, \u2028layar, dan dock\n" +
                "• Face ID untuk autentikasi aman\n" +
                "• Audio empat speaker dan lima mikrofon kualitas studio\n" +
                "• Dukungan untuk Apple Pencil (generasi ke-2), Magic Keyboard, dan Smart Keyboard Folio (4)\n" +
                "• iPadOS begitu andal, intuitif, dan dirancang khusus untuk iPad\n" +
                "• Lebih dari satu juta aplikasi di App Store khusus untuk iPad"),
        Product(R.drawable.prod4,"Apple Watch Series 7",8499000,100,"MKMX3ID/A Details:\n" +
                "Layar Retina Selalu Aktif paling besar dan paling canggih menjadikan segala hal yang Anda lakukan dengan Apple Watch Series 7 lebih besar dan menakjubkan. Series 7 adalah Apple Watch paling tahan lama yang pernah dibuat, dengan kristal depan yang lebih tahan retakan. Berbagai fitur canggih memungkinkan Anda mengukur kadar oksigen darah,1 mendapatkan pemberitahuan kesehatan jantung, dan mengakses aplikasi pelacakan tidur dan kesadaran. Anda juga dapat memantau puluhan olahraga, termasuk yang baru seperti pilates dan tai chi.\n" +
                "\n" +
                "Poin-poin fitur utama\n" +
                "• Layar Retina Selalu Aktif memiliki area layar hampir 20 persen lebih besar dibandingkan Series 6,\n" +
                "sehingga segalanya lebih mudah dilihat dan digunakan\n" +
                "• Kristal depan yang paling tahan retakan di Apple Watch, tahan debu dengan level IP6X, dan desain yang\n" +
                "siap dipakai berenang1\n" +
                "• Ukur kadar oksigen darah Anda dengan sensor dan aplikasi andal2\n" +
                "• Dapatkan pemberitahuan untuk detak jantung tinggi dan rendah\n" +
                "• Sadari momen saat ini dengan aplikasi Kesadaran baru, dan capai target tidur Anda dengan aplikasi Tidur\n" +
                "• Pantau olahraga baru tai chi dan pilates, selain olahraga favorit seperti berlari, yoga, berenang, dan\n" +
                "menari\n" +
                "• Pantau aktivitas harian Anda melalui Apple Watch dan lihat tren Anda di aplikasi Kebugaran di iPhone\n" +
                "• Selaraskan musik dan podcast favorit Anda\n" +
                "• Kekuatan baterai sepanjang hari dan pengisian daya yang lebih cepat3\n" +
                "• watchOS 8 memperkenalkan jenis olahraga baru, aplikasi Kesadaran, wajah jam Potret baru, dan\n" +
                "penyempurnaan pada Pesan\n" +
                "\n" +
                "Legal\n" +
                "Apple Watch Series 7 memerlukan iPhone 6s atau lebih baru dengan iOS 15 atau lebih baru.\n" +
                "*Pengukuran aplikasi Oksigen Darah bukan untuk tujuan medis, termasuk diagnosis mandiri atau konsultasi dengan dokter, dan hanya dirancang untuk tujuan kebugaran dan kesehatan secara umum."),
        Product(R.drawable.prod5,"AirPods (3rd generation)",3499000,100,"MME73ID/A Details: Memperkenalkan AirPods yang sepenuhnya baru. Dilengkapi audio spasial yang menghadirkan suara yang mengelilingi Anda, EQ Adaptif yang secara otomatis mengatur musik sesuai telinga Anda, dan kekuatan baterai lebih lama. Tahan air dan keringat serta menghadirkan pengalaman yang menakjubkan.\n" +
                "\n" +
                "Poin-poin fitur utama:\n" +
                "* Audio spasial dengan pelacakan gerakan kepala dinamis menghadirkan suara yang mengelilingi Anda \n" +
                "* EQ Adaptif secara otomatis mengatur musik sesuai telinga Anda \n" +
                "* Desain berkontur sepenuhnya baru \n" +
                "* Sensor tekanan memudahkan Anda mengontrol hiburan, menjawab atau mengakhiri panggilan, dan lainnya \n" +
                "* Tahan air dan keringat \n" +
                "* Waktu dengar hingga 6 jam dengan sekali pengisian daya\n" +
                "* Waktu dengar total hingga 30 jam dengan Casing Pengisian Daya MagSafe\n" +
                "* Pengaturan mudah, deteksi di telinga, dan peralihan otomatis untuk pengalaman menakjubkan\n" +
                "* Bagikan audio dengan mudah di antara dua set AirPods pada iPhone, iPad, iPod touch, atau Apple TV Anda \n" +
                "\n" +
                "Legal:�1. Audio spasial berfungsi dengan film, TV, dan video dalam aplikasi yang didukung. Memerlukan iPhone atau iPad.�2. Kekuatan baterai bervariasi tergantung penggunaan dan konfigurasi. Lihat apple.com/batteries untuk informasi selengkapnya. �3. AirPods (generasi ke-3) tahan air dan keringat untuk aktivitas dan olahraga non-air. AirPods (generasi ke-3) diuji dalam kondisi laboratorium terkontrol, dan memiliki level IPX4 menurut standar IEC 60529. Ketahanan terhadap keringat dan air tidak berlaku secara permanen, dan daya tahan mungkin berkurang akibat penggunaan sehari-hari. Jangan coba untuk mengisi daya AirPods (generasi ke-3) saat basah; lihat petunjuk untuk membersihkan dan mengeringkan di https://support.apple.com/kb/HT210711. �4. Memerlukan akun iCloud dan macOS 15.1, iOS 15.1, iPadOS, watchOS 8.1, atau tvOS 15.1 atau lebih baru."),
        Product(R.drawable.prod6,"MAC MINI M1 (2020)",11699000,100,"MGNR3ID/A Details:\n" +
                "\n" +
                "Chip Apple M1 membawa Mac mini, desktop Mac paling serbaguna yang mampu melakukan semua, ke tingkat performa yang sepenuhnya baru. Dengan performa CPU hingga 3x lebih cepat, grafis hingga 6x lebih cepat, Neural Engine bertenaga untuk pembelajaran mesin hingga 15x lebih cepat, dan memori terintegrasi super cepat — semua dalam desain ultraringkas.(2) Jadi Anda dapat bekerja, bermain, dan berkreasi pada Mac mini dengan kecepatan dan tenaga yang tidak terbayangkan sebelumnya.\n" +
                "\n" +
                " \n" +
                "\n" +
                "• Chip M1 yang didesain Apple untuk lompatan besar dalam performa CPU, GPU, dan pembelajaran mesin\n" +
                "• CPU 8-core menghadirkan performa hingga 3x lebih cepat untuk menuntaskan berbagai tahapan kerja lebih cepat(2)\n" +
                "• GPU 8-core dengan grafis hingga 6x lebih cepat untuk aplikasi dan game kaya grafis(2)\n" +
                "• Neural Engine 16-core untuk pembelajaran mesin canggih\n" +
                "• Memori terintegrasi 8 GB menjadikan segala yang Anda lakukan terasa cepat dan lancar\n" +
                "• Penyimpanan SSD super cepat membuka aplikasi dan file dalam sekejap\n" +
                "• Sistem pendingin canggih menopang performa terobosan\n" +
                "• Wi-Fi 6 generasi baru untuk konektivitas yang lebih cepat\n" +
                "• Dua port Thunderbolt/USB 4, satu port HDMI 2.0, dua port USB-A, dan Gigabit Ethernet\n" +
                "• macOS Big Sur dengan desain baru yang tegas dan pembaruan aplikasi besar-besaran untuk Safari, Pesan, dan Peta\n" +
                "• Desain persegi 19,7 cm ultraringkas berwarna perak"),
    )

    val dataProducts : MutableLiveData<ArrayList<Product>> = MutableLiveData()

    fun getProducts(){
        dataProducts.value = listData
    }
}