# SampleWebTest

This repo consists a customized automation framework for executing the test cases on web browser , 
the framework uses Serenity BDD libraries for integrating Jbehave, REST-Assured, Selenium and Appium.
This maven project demonstrates various styles of writing jbehave scenarios within Serenity BDD framework


Please Install below
> Install java
> Install brew or home-brew:
> Install Maven


Set up instructions :

1. Download and install IntelliJ Idea Community version 


2. Clone the below repository in IntelliJ Idea : https://github.com/vinodpasalkar/SampleWebTest/ (Just clone this project in InteliJ idea community Edition 
and Go to Menu > Build > Build Project Once the build is completed/compiled successfully)

3. Ensure you have maven installed in your system - command from terminal -> brew install maven

4. Install below IntelliJ plugins by going to below navigation

IntelliJ Idea > Menu > IntelliJ Idea > Preferences > Plugins > Marketplace 

Search below plugins one by one and install them 
>Cucumber for java 
>Gherkin
>Jbehave BDD Plugin
>Jbehave Support 


5. Running your first test

To execute a particular test by tag run below command on terminal by going to the project directory

mvn clean verify -Dmetafilter="+onlinePurchase"

Below are sample report snapshots


