Feature: US_10_Favori_Urunlerim


  Scenario: Hesaba giris

    Given Kullanici Gratis ana sayfasina gider
    When Giris yap butonuna tiklar
    And Gecerli "necmettinkaradeli@gmail.com" girer
    And Gecerli "Necminson.38" bilgisini girer
    And Giris yap kutusuna tiklar