Feature: Use background and Rules

  Rule: rule 1

    Background: блок повторяющихся шагов
      Given отрыт браузер
      * страница логина открыта

    Scenario: scenario 1
      When user "atrostyanko@gmail.com" whit password "Qwertyu_1" logged in
      Then title is "All Projects"
      And project id is 123

    Scenario: scenario 2
      When user "atrostyanko@gmail.com" whit password "Qwertyu_1" logged in
      Then error id displayed
      And project id is 123

  Rule: rule 2

    Background: блок повторяющихся шагов
      Given отрыт браузер
      * страница логина открыта
      * user "atrostyanko@gmail.com" whit password "Qwertyu_1" logged in

    Scenario: scenario 1
      Then title is "All Projects"
      And project id is 123

    Scenario: scenario 2
      Then error id displayed