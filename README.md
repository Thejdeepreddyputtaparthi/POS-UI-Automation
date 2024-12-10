# POS-UI-Automation

UI Automation

Implemented project in POM framework and structure is in below format

1.	UI Framework  : common  methods and reused methods are placed here
2.	Page Object Model  :  Pages and objects are create here with web elements. Any reused methods can also be placed here
3.	Tests : Test cases are created here and can be executed as testng Tests
![image](https://github.com/user-attachments/assets/5a27593d-7da3-4002-ae38-a5f317d340c3)

Failure screenshots :

Implemented a custom method where it will capture auto screenshot for every test failure. This will help to trouble shoot the issue and create any bug (if any). It will auto generate methodname.png file 

![image](https://github.com/user-attachments/assets/9b15587b-a4ac-46ff-8699-be5d898a1ae6)

Used Testng Annotations:

1.	@Test
2.	@AfterTest
3.	@BeforeTes
4.	@AfterMethod
5.	@BeforeMethod


How to Run Tests:

1.	Clone the repository from github 
2.	Import the project
3.	Right click on pom.xml file and update Project to add required dependencies to the project
4.	Navigate to Tests folder and right click on any test and run as TestNg test

Tests will be triggered and executed successfully with report generated ( test-output folder)

![image](https://github.com/user-attachments/assets/e781b2db-06b3-4b50-9e48-57fd369764b5)


