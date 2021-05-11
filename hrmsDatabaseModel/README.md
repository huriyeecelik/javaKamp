Bugün HRMS sistemimize baþlýyoruz.

Aþaðýdaki isterlere göre veri tabaný modellemesi yapýnýz. (Araþtýrma: PostgreSql'de tablo ve kolon ekleme) Veritabaný isminiz hrms olabilir.

Sistemimiz üç temel kullanýcý türüne sahiptir. Sistem personeli, Ýþ Arayanlar ve Ýþ verenler. Sistem personeli : Projenizde çalýþan kiþiler. Örneðin Kariyer.Net personeli.

ÖNEMLÝ : Burada ilk etapta veri tabaný modeli istiyorum. Kod yazmanýzý istemiyorum.

Req 1 : Ýþ Arayanlar sisteme kayýt olabilmelidir.

Kabul Kriterleri:

Kayýt sýrasýnda kullanýcýdan ad, soyad, tcno, doðum yýlý, e-Posta, þifre, þifre tekrarý bilgileri istenir.
Tüm alanlar zorunludur. Kullanýcý bilgilendirilir.
Mernis doðrulamasý yapýlarak sisteme kayýt gerçekleþtirilir.
Doðrulama geçerli deðilse kullanýcý bilgilendirilir.
Daha önce kayýtlý bir e-posta veya tcno var ise kayýt gerçekleþmez. Kullanýcý bilgilendirilir.
Kayýdýn gerçekleþmesi için e-posta doðrulamasý gerekir.
Req 2 : Ýþ verenler sisteme kayýt olabilmelidir.

Kabul Kriterleri:

Kayýt sýrasýnda kullanýcýdan þirket adý, web sitesi, web sitesi ile ayný domaine sahip e-posta, telefon, þifre, þifre tekrarý bilgileri istenir. Burada amaç sisteme þirket olmayanlarýn katýlmasýný engellemektir.
Tüm alanlar zorunludur. Kullanýcý bilgilendirilir.
Þirket kayýtlarý iki þekilde doðrulanýr. Kayýdýn gerçekleþmesi için e-posta doðrulamasý gerekir. HRMS personelinin (bizim :)) onayý gerekmektedir.
Daha önce kayýtlý bir e-posta var ise kayýt gerçekleþmez. Kullanýcý bilgilendirilir.
Req 3 : Sisteme genel iþ pozisyonu isimleri eklenebilmelidir. Örneðin Software Developer, Software Architect.

Kabul Kriterleri:

Bu pozisyonlar tekrar edemez. Kullanýcý uyarýlýr.