Bug�n HRMS sistemimize ba�l�yoruz.

A�a��daki isterlere g�re veri taban� modellemesi yap�n�z. (Ara�t�rma: PostgreSql'de tablo ve kolon ekleme) Veritaban� isminiz hrms olabilir.

Sistemimiz �� temel kullan�c� t�r�ne sahiptir. Sistem personeli, �� Arayanlar ve �� verenler. Sistem personeli : Projenizde �al��an ki�iler. �rne�in Kariyer.Net personeli.

�NEML� : Burada ilk etapta veri taban� modeli istiyorum. Kod yazman�z� istemiyorum.

Req 1 : �� Arayanlar sisteme kay�t olabilmelidir.

Kabul Kriterleri:

Kay�t s�ras�nda kullan�c�dan ad, soyad, tcno, do�um y�l�, e-Posta, �ifre, �ifre tekrar� bilgileri istenir.
T�m alanlar zorunludur. Kullan�c� bilgilendirilir.
Mernis do�rulamas� yap�larak sisteme kay�t ger�ekle�tirilir.
Do�rulama ge�erli de�ilse kullan�c� bilgilendirilir.
Daha �nce kay�tl� bir e-posta veya tcno var ise kay�t ger�ekle�mez. Kullan�c� bilgilendirilir.
Kay�d�n ger�ekle�mesi i�in e-posta do�rulamas� gerekir.
Req 2 : �� verenler sisteme kay�t olabilmelidir.

Kabul Kriterleri:

Kay�t s�ras�nda kullan�c�dan �irket ad�, web sitesi, web sitesi ile ayn� domaine sahip e-posta, telefon, �ifre, �ifre tekrar� bilgileri istenir. Burada ama� sisteme �irket olmayanlar�n kat�lmas�n� engellemektir.
T�m alanlar zorunludur. Kullan�c� bilgilendirilir.
�irket kay�tlar� iki �ekilde do�rulan�r. Kay�d�n ger�ekle�mesi i�in e-posta do�rulamas� gerekir. HRMS personelinin (bizim :)) onay� gerekmektedir.
Daha �nce kay�tl� bir e-posta var ise kay�t ger�ekle�mez. Kullan�c� bilgilendirilir.
Req 3 : Sisteme genel i� pozisyonu isimleri eklenebilmelidir. �rne�in Software Developer, Software Architect.

Kabul Kriterleri:

Bu pozisyonlar tekrar edemez. Kullan�c� uyar�l�r.