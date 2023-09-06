Feature: Searching world functionality
  @Gl
  Scenario: Searching world in browser
    Given User open the browser
    When  User fill the word "Messi" and click on button search
    Then  Messi result should be dispayed