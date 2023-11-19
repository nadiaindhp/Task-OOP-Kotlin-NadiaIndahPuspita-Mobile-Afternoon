package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Inisialisasi list bilangan genap
    val bilanganGenap = mutableListOf<Int>()
    for (i in 1..100){
        if (i % 2 == 0){
            bilanganGenap.add(i)
        }
    }

    print("Bilangan genap dari list : ")
    for (bilangan in bilanganGenap){
        print("$bilangan ")
    }
    print("\n\n")


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Buat di bawah sini**/
    val bulanMap = mapOf(
        "Jan" to "Januari",
        "Feb" to "Februari",
        "Mar" to "Maret",
        "Apr" to "April",
        "May" to "Mai",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "Aug" to "Agustus",
        "Sep" to "September",
        "Oct" to "Oktober",
        "Nov" to "November",
        "Dec" to "Desember"
    )

    /**Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    Buat di bawah sini**/
    bulanMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    /**Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
    Buat di bawah sini**/
    println("It's ${bulanMap["Oct"]} now, I was born in ${bulanMap["Oct"]}")
}