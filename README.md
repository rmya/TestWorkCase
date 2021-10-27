## Proje Ödevi

- Proje Java programlama dilinde yazılmalıdır.
- Proje Maven projesi olarak yazılmalıdır.
- Selenium, JUnit ve Log4J kütüphanelerini kullanmanız gerekmektedir.
- Projenizin GitHub üzerinden paylaşılması gerekmektedir
- Projenizin OOP (Object Oriented Programming) prensiplerine uygun yazılması
  gerekmektedir.
- Page Object Pattern kullanmanız gerekmektedir.
  Selenium Web Otomasyon
- https://www.lcwaikiki.com/tr-TR/TR sitesi açılır.
- Ana sayfanın açıldığı kontrol edilir. Siteye login olunur
- Login işlemi kontrol edilir.
- Arama kutucuğuna “pantolan” kelimesi girilir.
- Sayfanın sonuna scroll edilir.
- “Daha fazla ürün gör “ butonuna tıklanır.
- Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
- Seçilen ürün sepete eklenir.
- Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
- Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
- Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.

## Test Steps

|   Test Steps      |    Assertions     |
| ------------------| ------------------|
| LcWaikiki anasayfasına git.| LcWaikiki anasayfasında mıyız?|
| Siteye Login ol | Login işlemi yapıldı mı?|
| Arama çubuğunda ürün ara | Ürün sayfasında mıyız? |
| Sayfa sonuna scroll yap | Sayfa sonunda mıyız? |
| Daha fazla ürün gör butonuna tıkla | Daha fazla ürün geldi mi?|
| Sonuca göre rastgele ürün seç | Ürün seçildi mi? |
|Ürünü sepete ekle | ürün sepete eklendi mi? |
| Ürün sayfasındaki fiyat ile sepet fiyatını karşılaştır | Fiyatlar eşit mi? |
|Ürün adedini arttır 2 yap | Sepette 2 ürün olduğunu doğrula |
| Ürünü sepetten sil | Sepetin boş olduğunu kontrol et. |