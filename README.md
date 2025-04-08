# Medya Veritabanı Yönetim Sistemi

## Proje Genel Bakış

Bu Java tabanlı program, kullanıcıların **film** ve **müzik** medya öğelerini yönetmelerine olanak tanır. Kullanıcılar, komut satırı arayüzü üzerinden medya öğelerini ekleyebilir, arayabilir, oynatabilir ve türlerine göre listeleyebilir. Program, başlık, yönetmen, sanatçı, kategori ve daha fazla bilgi gibi medya bilgilerini keşfetmeye olanak sağlar.

## Özellikler

- **Medya Ekleyin**: Yeni filmler ve müzik albümleri ekleyebilirsiniz. Bu eklemelerde başlık, sanatçı, yönetmen, yıl ve kategori gibi bilgiler yer alır.
- **Başlıkla Arama**: Bir medya öğesini başlığıyla arayabilir ve detaylarını görebilirsiniz.
- **Medya Oynat**: Bir medya öğesini (film veya müzik albümü) simüle edilmiş şekilde oynatabilirsiniz.
- **Tüm Medyayı Listele**: Veritabanındaki tüm medya öğelerini listeleyebilirsiniz.
- **Medya Türüne Göre Listele**: Medya türüne (örneğin, müzik veya film) göre filtreleme yaparak tüm medya öğelerini listeleyebilirsiniz.

## Kullanılan Teknolojiler

- **Java**: Bu projede ana programlama dili olarak Java kullanılmıştır.
- **ArrayList**: Medya öğelerinin saklanması için kullanılmıştır.
- **Nesne Yönelimli Programlama (OOP)**: `Media`, `Movie`, `Music` ve `MyMediaDatabase` gibi sınıflarla OOP prensipleri kullanılmıştır.
- **Scanner**: Komut satırından kullanıcı girdisini almak için kullanılmıştır.

## Sınıflar

- **Media**: Medya öğesini temsil eden soyut bir sınıftır. Bu sınıf, medya türü, başlık, konum, yıl ve kategori gibi özellikleri içerir. Ayrıca, medya öğesini oynatmayı sağlayan soyut `playMedia` metodunu da içerir.
- **Movie**: `Media` sınıfından türetilmiş ve film medya öğelerini temsil eden bir sınıftır. Yönetmen ve oynatma süresi gibi filmle ilgili özel özellikleri içerir ve `playMedia` metodunu uygular.
- **Music**: `Media` sınıfından türetilmiş ve müzik albümlerini temsil eden bir sınıftır. Sanatçı ve şarkı sayısı gibi müzikle ilgili özel özellikleri içerir ve `playMedia` metodunu uygular.
- **MyMediaDatabase**: `MediaDatabase` arayüzünü uygular ve medya öğelerini bir `ArrayList` içinde saklar. Medya öğelerini ekleme, arama ve listeleme işlemleri yapılır.
- **MDConsoleIO**: Kullanıcı ile etkileşime giren ve komutları işleyen sınıftır. Komutlar, medya ekleme, başlıkla arama ve medya oynatma gibi işlemleri içerir.

## Örnek Kullanım

Veritabanına Hoşgeldiniz Bir seçenek girin (0-5) Seçenek 0: Medya Ekle Seçenek 1: Medya Detaylarını Al Seçenek 2: Medya Oynat Seçenek 3: Tüm Medyayı Listele Seçenek 4: Türlere Göre Medya Listele Seçenek 5: Çıkış

### Bir Müzik Albümü Ekleme
Medya türü girin (music/movie): music Başlık girin: Thriller Sanatçı girin: Michael Jackson Konum girin: /path/to/thriller.mp3 Yıl girin: 1982 Kategori girin: Pop Şarkı sayısı girin: 9 Müzik medya başarıyla eklendi!

### Bir Film Araması Yapma
Başlık girin: The Matrix Film detayları: The Matrix, yönetmen: Wachowski, 1999, Aksiyon, 136 dakika

## Programı Çalıştırma

1. Proje dosyalarını indirin veya klonlayın.
2. Projeyi bir Java IDE'sine (örneğin IntelliJ IDEA veya Eclipse) açın.
3. `MDConsoleIO` sınıfını çalıştırarak programı başlatın ve komut satırından veritabanı ile etkileşimde bulunun.