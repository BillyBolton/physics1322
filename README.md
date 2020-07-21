# PHY1322 - Calculating Minimmum and Maximum Wavelengths

 ## How to Use

 1) Download minMaxWave.java file onto your **Desktop**.

 ### For Windows Machines:

 2) Open the application: "Command Prompt"

 3) Change directory to desktop by typing the following:
 (Note: change "MyName" is your account name for your PC)

 ```
 cd C:\Users\MyName\Desktop
 ```

 4) Copy and paste the following code:

 ```
 javac minMaxWave.java && java minMaxWave 525 2 10 7.9 400 700
 ```

 ### For Apple/UNIX Machines:

 2) Open the application: "Terminal"

 3) Change directory to desktop by typing the following:

 ```
 cd desktop
 ```

 4) Copy and paste the following code:

 ```
 javac minMaxWave.java && java minMaxWave 525 2 10 7.9
 ```

 ### Expected Output with inputs 525 2 10 7.9 400 700:
 ```
 username@MyMac desktop % java minMaxWave 525 2 10 7.9 400 700

Question 1a): 
Young's double-slit experiment is performed with 525.0-nm light
and a distance of 2.0 m between the slits and the screen.
The 10.0th interference minimum is observed 7.9 mm from the central maximum.

1a) Determine the spacing of the slits (in mm).


Lambda: 525.0 nm
L: 2000.0 mm
m: 9.0
y: 7.9 mm
d: 1.2626582278481011 mm

Answer 1a): 
d = 1.2626582278481011 mm


1b): 
What If? What are the smallest and largest wavelengths of
visible light that will also produce interference minima at this location?
Give your answers, in nm, to at least three significant figures.
Assume the visible light spectrum ranges from 400 nm to 700 nm.

Answer 1b): 
Minimum waveLength: 433.69565217391306 nm
        (Minimum Order  23)

Maximum waveLength: 665.0 nm
        (Largest Order = 15)
 ```
 ### Expected Output with inputs 530 2 10 7.10 400 700:
 ```
 username@MyMac desktop % java minMaxWave 530 2 10 7.10 400 700

****************************************************
Calculations:
****************************************************

Question 1a): 
Young's double-slit experiment is performed with 530.0-nm light
and a distance of 2.0 m between the slits and the screen.
The 10.0th interference minimum is observed 7.1 mm from the central maximum.

1a) Determine the spacing of the slits (in mm).


Lambda: 530.0 nm
L: 2000.0 mm
m: 9.0
y: 7.1 mm
d: 1.4183098591549295 mm

Answer 1a): 
d = 1.4183098591549295 mm


1b): 
What If? What are the smallest and largest wavelengths of
visible light that will also produce interference minima at this location?
Give your answers, in nm, to at least three significant figures.
Assume the visible light spectrum ranges from 400 nm to 700 nm.

Answer 1b): 
Minimum waveLength: 402.8 nm
        (Minimum Order  25)

Maximum waveLength: 671.3333333333334 nm
        (Largest Order = 15)

 ```


 ## Notes:

 Change the numbers in the code above to reflect the parameters of the question.
 Be mindful that the numbers should be inputted **as represented in the question**.

 For example:
 * 525 = waveLength (in nm)
 * 2 = distance between the slit and the screen (in m)
 * 10 = order of interference (without subtracting 1)
 * 7.9 = minimum distance that the interference is observed
 * 400 = the low range of the light spectrum as per question
 * 700 = the high range of the light spectrum as per question

 ## Troubleshooting:
 ### Java is not installed on my Windows PC:
 Follow installation instructions here:
 * https://docs.oracle.com/en/java/javase/13/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA

 ### Java is not installed on my Mac:
 Follow installation instructions here:
 * https://www.oracle.com/java/technologies/javase-downloads.html
