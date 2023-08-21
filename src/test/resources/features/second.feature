Feature: Параметризированные тесты

  Scenario: Параметризация степов
    Given отрыт браузер
    * страница логина открыта
    When user "atrostyanko@gmail.com" whit password "Qwertyu_1" logged in
    Then title is "All Projects"
    And project id is 123

  Scenario: Параметризация степов RegExp
    Given отрыт браузер
    * страница логина открыта
    When admin atrostyanko@gmail.com whit password "Qwertyu_1" logged in
    Then title is "All Projects"
    And project id is 123
    And all elements "are not" visible

  Scenario Outline: Параметризация при помощи таблицы значений
    Given отрыт браузер
    * страница логина открыта
    When admin <username> whit password "<password>" logged in
    Then project id is <prtId>
    Examples:
      | username               | password  | prtId  |
      | atrostyanko@gmail.com  | Qwertyu_1 | 123456 |
      | atrostyanko1@gmail.com | Qwertyu_2 | 1234   |

  Scenario: Параметризация шага через Map
    Given отрыт браузер
    * страница логина открыта
    When users logged in
    | username | atrostyanko@gmail.com |
    | password | Qwertyu_1             |
    Then title is "All Projects"
    And project id is 123