Feature: As a user, I should be able to send  message by clicking on Message tab under Active Stream.

  Scenario: 1.User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from Symmetrix, and create files to upload.
    Given user is on the landing page
    And user logs in as "hr"
    # when we adding double quote we get method with argument in step definition
    And user navigates to "Activity Stream"
    When user clicks on send message button
    And uploads following file
    |File path|src/test/resources/testData/testPhoto.jpg|
    Then user click on send button