# CircleProject

Step 1:

This Project needs the IntelliJ Idea application.
From the following website download IntelliJ application: https://www.jetbrains.com/idea/download/?section=windows
Then, in your file manager open the ideaIU-2023.3.6 file to setup the Integrated Develop Environment(IDE).


Step 2:

A pop-up should appear asking if you want this app to make changes to your device, click yes.
Then the setup window should appear, click Next to continue. Choose where to store this application.
In the Installation Options, under' Create a Desktop Shortcut' click 'IntelliJ IDEA' and under 'Create Associations' click '.java', and click 'Next'.
Then, click 'Install'.


Step 3:

Download the entire folder Knowles_Lab3 from this github
Now, unzip or extract the zip file: Knowles_Lab3
Then, open IntelliJ. 
Go to File > Open > Downloads > Knowles_Lab3 (or wherever you downloaded the folder Knowles_Lab3)


Step 4:
Now, go to the following website to download the JavaFX SDK: https://openjfx.io/
Scroll until you see the download button under JavaFX and click ‘Download’.
Scroll until you see ‘Downloads’, under Downloads ensure that the ‘JavaFX Version’ is 22.
Under ‘Supported Platforms’ choose your respective OS, Version, and Architecture. 
Ensure that the ‘Type’ is SDK when you click ‘Download’.
Unzip or extract the file that begins with ‘openjfx-22…’.


Step 5:

Then, go to File > Project Structure.
Under ‘Project Setting’ click ‘Libraries’. 
Then in the second column click the plus symbol, then click ‘Java’.
Then go to your downloads and in the extracted folder that begins with ‘openjfx-22…’ go to the following path: javafx-sdk-22 > lib. 
Select the ‘lib’ folder and click ‘OK’ twice.


Step 6:

In the IntelliJ Java IDE, on the top click where it says ‘Current File’, in the dropdown box click ‘Edit Configurations’.
Now, click ‘Add new run configuration…’, then click ‘Application’.
Where it says ‘Unnamed’ you can name it ‘JavaFX’. A name is optional, but recommended.
Then, click ‘Modify options’, in the dropdown box under ‘Java’ click ‘Add VM options’.
Under ‘Build and run’, in the textbox where it says ‘VM options’, copy and paste the following:

--module-path
"C:\JavaLibrary\javafx-sdk-21.0.2\lib"
--add-modules
javafx.controls,javafx.fxml

In the textbox that says ‘Main class’, type in Main.
Click ‘Apply’, then ‘OK’.


Step 7:

In the left-hand side under ‘Project’, click the arrows on the left-hand side of the folders to go to the following path: Knowles_Lab3 > src > Main
Double-click Main so that it pop-ups on the right-hand side.
Then, to run ensure that ‘JavaFX’, or the name you chose for the Application is next to the run button, that looks like a sideways triangle.
Then, click the run button.


Step 8:

You should be able to move the circle by using the arrow keys.
You can left-click or right-click inside of the circle and it will turn black. You can hold down on either left-click or right-click 
to keep the circle black until you release.

