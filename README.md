# CircleProject

Step 1:

This Project needs the IntelliJ Idea application.
From the following website download IntelliJ application: https://www.jetbrains.com/idea/download/?section=windows
Then, in your file manager open the ideaIU-2023.3.6 file to setup the Integrated Develop Environment(IDE).


Step 2:

A pop-up should appear asking if you want this app to make changes to your device, click yes.
Then the setup window should appear, click Next to continue. Choose where to store this application.
In the Installation Options, under' Create a Desktop Shortcut' click 'IntelliJ IDEA' and under 'Create Associations' click '.java', 
and click 'Next'. Then, click 'Install'.


Step 3:

In the github Circle project go to Knowles_Lab3 > src > Main.java.
Download the Main.java file.


Step 4:

Open IntelliJ, then create a new project by going to File > New > Project.
Name it ‘Circle’, and  for the location place it wherever you prefer.
Then, click ‘Create’.


Step 5:

On your left-hand side you should see the folder ‘src’ in the file path Circle > src. 
Now, in your file manager go to where you downloaded the ‘Main.java’ file, then drag that file into the src folder. 
Then, click the arrow to the left of the src folder to ensure that you placed the file in the correct place. 
Then, double-click the ‘Main’ class.


Step 6:

Now, go to the following website to download the JavaFX SDK: https://openjfx.io/
Scroll until you see the download button under JavaFX and click ‘Download’.
Scroll until you see ‘Downloads’, under Downloads ensure that the ‘JavaFX Version’ is 22.
Under ‘Supported Platforms’ choose your respective OS, Version, and Architecture. 
Ensure that the ‘Type’ is SDK when you click ‘Download’.
Unzip or extract the folder that begins with ‘openjfx-22…’.


Step 7:

Then, go to File > Project Structure.
Under ‘Project Setting’ click ‘Libraries’. 
Then in the second column click the plus symbol, then click ‘Java’.
Then go to your downloads and in the extracted folder that begins with ‘openjfx-22…’ 
go to the following path: javafx-sdk-22 > lib. Select the ‘lib’ folder and click ‘OK’ twice. 
Then, click ‘Apply’ and then click ‘OK’.


Step 8:

In the IntelliJ Java IDE, on the top click where it says ‘Current File’, in the dropdown box click ‘Edit Configurations’.
Now, click ‘Add new run configuration…’, then click ‘Application’.
Where it says ‘Unnamed’ you can name it ‘JavaFX’. A name is optional, but recommended.
Where it says ‘Main class’, type ‘Main’.  It is required that you put a class name there.
Then, click ‘Modify options’, in the dropdown box under ‘Java’ click ‘Add VM options’.
Under ‘Build and run’, in the textbox where it says ‘VM options’, copy and paste the following:

--module-path
"YOUR SDK LIB Location"
--add-modules
javafx.controls,javafx.fxml

Go to where you downloaded and extracted the folder that begins with ‘openjfx-22…’ and go to file path javafx-sdk-22 > lib. 
Then, copy the entire file path and replace "YOUR SDK LIB Location" with your file path and ensure that your file path has double quotes. 
An example is below:

--module-path
"C:\JavaLibrary\javafx-sdk-21.0.2\lib"
--add-modules
javafx.controls,javafx.fxml


Click ‘Apply’, then ‘OK’.


Step 9:

Then, to run ensure that ‘JavaFX’, or the name you chose for the Application is next to the run button, 
that looks like a sideways triangle. Then, click the run button.


Step 10:

You should be able to move the circle by using the arrow keys.
You can left-click or right-click inside of the circle and it will turn black. 
You can hold down on either left-click or right-click to keep the circle black until you release.

