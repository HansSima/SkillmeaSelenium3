Feature: Formular

  Scenario: Kontrola radiobuttonu u pohlavi
    Given Uzivatel je na strance s formularem
    When Uzivatel napise do input jmeno "Jan Sima"
    And Uzivatel napise do input email "email@email.com"
    And Uzivatel klikne na radiobutton male
    And Uzivatel klikne na radiobutton female
    Then Uzivatel vidi zaskrtnuty radiobutton female
    And Uzivatel vidi odskrtnuty radiobutton male