@Gratis_US_10
Feature: US_10_Favori_Urunlerim


  Scenario: Hesaba giris

    Given Kullanici Gratis ana sayfasina gider
    When Giris yap butonuna tiklar
    And Gecerli "necmettinkaradeli@gmail.com" girer
    And Gecerli "Necminson.38" bilgisini girer
    And Giris yap kutusuna tiklar
   @Gratis_US_10_TC_01
    Scenario: TC_01 Kullanıcı "Favori Listelerim" modülüne giriş yapar
      Given kullanici Favori Listelerim sayfasina gider
     Then Favori Listelerim sayfasina gittigini dogrular