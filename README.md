# LC Waikiki Final Case Projesi

Bu proje, bir **LC Waikiki** web sitesi için uçtan uca (E2E) test otomasyonu gerçekleştirmek amacıyla geliştirilmiştir. Selenium ve TestNG kullanılarak, kullanıcı etkileşimleri ve iş akışları otomatikleştirilmiştir.

## Özellikler

- **Page Object Model (POM)** tasarım deseni ile oluşturulmuş yapı.
- WebElement yönetimi için **Page Factory** kullanımı.
- Tek bir WebDriver örneğini yöneten **Singleton Design Pattern** ile **WebDriver** yönetimi.
- Kullanıcı girişi, ürün arama, sepet işlemleri ve favoriler gibi uçtan uca işlemler.
- TestNG ile paralel test desteği.
- Log4j kullanılarak test akışı sırasında detaylı loglama.

## Kurulum: 

- git clone https://github.com/melisaisitir/FinalCase.git

### Gereksinimleri Yükleyin:

- IntellijIdea 2021 veya üstü
- Java Development Kit (JDK) 11 veya üstü
- Maven 3.6.0 veya üstü
- https://mvnrepository.com/ gerekli dependencyler için buradan edinebilirsiniz.

## Proje Yapısı
- `src/main/java/com/lcw/pages/`: Sayfa nesneleri (Page Objects) ve her bir sayfa için oluşturulan yöntemleri içerir.

- `src/main/java/com/lcw/utilities/`: Yardımcı sınıflar (Singleton WebDriver, Log yönetimi, yardımcı metotlar vb.).

- `src/test/java/com/lcw/tests/`: Test sınıflarını içerir. Testler, sayfa nesnelerinden yararlanarak yazılmıştır.

- `pom.xml`: Maven bağımlılıklarını yöneten yapılandırma dosyası.

## Singleton WebDriver

Proje, **Singleton Design Pattern** kullanılarak bir WebDriver örneği yönetir. Bu yaklaşım:

- Tüm testlerde tek bir WebDriver örneğinin kullanılmasını sağlar.
- Kaynak kullanımını optimize eder.
- Yanlışlıkla birden fazla WebDriver örneği oluşturulmasını önler.

## Page Object Model ve Page Factory

**Page Object Model (POM)**, bir web uygulamasının her bir sayfasını bir sınıf olarak modelleyerek, sayfa üzerindeki öğeleri ve işlemleri kapsüllemeye olanak tanır. Bu, kodun daha okunabilir ve sürdürülebilir olmasını sağlar.

**Page Factory** ile WebElement tanımlamaları, **@FindBy** anotasyonu kullanılarak yapılır. Bu, elemanların yalnızca ihtiyaç duyulduğunda yüklenmesini sağlar.

![Ekran görüntüsü 2025-01-18 005234](https://github.com/user-attachments/assets/02f574e8-955e-459f-b41f-ac6aeca621f1)

![İsimsiz video ‐ Clipchamp ile yapıldı](https://github.com/user-attachments/assets/058df967-b3fc-4b38-a256-b7cbc416f636)


![Ekran görüntüsü 2025-01-19 164848](https://github.com/user-attachments/assets/ccfab4f4-394e-4049-8d79-aef11ca770dd)

![image](https://github.com/user-attachments/assets/2d8a852e-39d1-4955-b0aa-cd008eb9687e)

