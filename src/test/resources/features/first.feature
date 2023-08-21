Feature: Начальный тест для изучения Cucumber

  Scenario: Протой тест без тела


  Scenario: Простой тест с Given
    Given отрыт браузер

  Scenario: Простой тест с Given и When
    Given отрыт браузер
    When страница логина открыта

  Scenario: Простой тест со всеми ключевыми словами
    Given отрыт браузер
    When страница логина открыта
    Then поле username отображается

  Scenario: Использование AND
    Given отрыт браузер
    And  страница логина открыта
    Then поле username отображается
    And поле password отображается


  Scenario: Использование BUT
    Given отрыт браузер
    And страница логина открыта
    Then поле username отображается
    But поле password не отображается

  Scenario: Замена AND на *
    Given отрыт браузер
    * страница логина открыта
    * поле username отображается
    * поле password не отображается