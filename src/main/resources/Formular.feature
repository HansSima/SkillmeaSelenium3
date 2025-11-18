Feature: Formular

  Scenario: Kontrola radiobuttonu u pohlavi
    Given Uzivatel je na strance s formularem
    When Uzivatel napise do input jmeno "Jan Sima"
    And Uzivatel napise do input email "email@email.com"
    And Uzivatel klikne na radiobutton "male"
    And Uzivatel klikne na radiobutton female
    Then Uzivatel vidi zaskrtnuty radiobutton female
    And Uzivatel vidi odskrtnuty radiobutton male

  Scenario: Novy Test
    Given Uzivatel je na strance s formularem
    When Uzivatel napise do input jmeno "Petr Novak"
    And Uzivatel klikne na radiobutton female
    Then Uzivatel vidi odskrtnuty radiobutton male

  Scenario Outline: Novy Test pomoci scenario outline
    Given Uzivatel je na strance s formularem
    When Uzivatel napise do input jmeno "<jmeno>"
    And Uzivatel napise do input email "<email>"
    And Uzivatel klikne na radiobutton male
    And Uzivatel klikne na radiobutton female
    Then Uzivatel vidi zaskrtnuty radiobutton female

    Examples:
    | jmeno | email           |
    | Petra | petra@email.com |
    | Jan   | jan@email.com   |
    | Katka | katka@email.com |
    | Jiri  | jiri@email.com  |