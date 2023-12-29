Feature: US04_Magazalar_linki_aktif_calismasi

  @Gratis_US_04
  Scenario: TC01_Magazalar_linki_aktif_calismasi

    Given Kullanici Gratis ana sayfasina gider
    And Kullanici magazalarimiz butonuna tiklar
    And Kullanici bir sehir ismini arama kutucuguna yazar
    And Kullanici buyutec simgesine tiklar
    And Kullanici sayfayi asagi kaydirir
    And Kullanici bir magazanin ustune tiklar
    Then Kullanici magaza bilgilerini gorur


  Scenario: TC02_Magazalar_linki_aktif_calismasi

    Given Kullanici Gratis ana sayfasina gider
    And Kullanici magazalarimiz butonuna tiklar
    And Kullanici magazalarimiz butonunun altindaki "Konumumu bul"a tiklar
    Then Kullanici bulunulan konumdaki magazalari gorur


  Scenario: TC03_Magazalar_linki_aktif_calismasi

    Given Kullanici Gratis ana sayfasina gider
    And Kullanici magazalarimiz butonuna tiklar
    And Kullanici sayfayi asagi kaydirir
    And Kullanici bir sehrin ustune tiklar
    And Kullanici sayfayi asagi kaydirir
    And Kullanici secilen sehrin bir ilcesine tiklar
    And Kullanici sayfayi asagi kaydirir
    Then Kullanici sectigi magazanin adresini ve konumunu gorur


