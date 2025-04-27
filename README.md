# MonthlyRainFall-Estimator
This program creates a class that stores the total rainfall for each of 12 months into an array of doubles, and contains methods to return the total rainfall for the year, the average monthly rainfall, the month with the most and the least rain, the rainfall in any month. And then write an application to demonstrate the service class. 

In this task, I created a RainFall service class that provides various methods to analyze and display rainfall data. Below is a breakdown of the structure and functionality that I implemented:

Class Structure:

I created a class named RainFall, which contains a private data member, a double[] array, to store the monthly rainfall data for a year.

Constructor:

I designed the constructor to accept a double[] array as a parameter. This array is then used to initialize the private data member of the class, allowing the class to access and manipulate the rainfall data.

Return Methods:

I implemented several methods that return specific information based on the rainfall data:

getTotalRainfall(): Calculates and returns the total rainfall for the year.

getAverageRainfall(): Computes and returns the average rainfall for the year.

getMonthWithMostRain(): Returns the month number that received the most rainfall.

getMonthWithLeastRain(): Returns the month number that received the least rainfall.

getRainfallInMonth(int month): Returns the rainfall amount for a specified month.

getMonthName(int month): Returns the name of a month given its number.

Void Method for Searching Above-Average Rainfall:

I created a method called searchAboveAverageRainfall(), which searches for months where the rainfall exceeds the average. This method displays:

The number of months with higher-than-average rainfall.

The name of each month and the corresponding rainfall amount.

Class Design Details:

All methods in the class operate on the rainfall array (the private data member), and no method (except the constructor) requires the array to be passed as a parameter.

I referenced similar class structures, such as Grader.java (P432), SalesData.java (P429), and Practice Problem #1, while designing the class and its methods.

Application Class:

In the application class, I created two arrays:

One array stores data either entered by the user or initialized using an initializer list.

The other array stores rainfall data read from the external rainfallData.txt file, utilizing file input and output operations.

I created two instances of the RainFall class, passing each array to the constructor of the respective objects.

I used these objects to call the methods from the RainFall class and display the output, ensuring all rainfall values are formatted to one or two decimal places.

Test Data:

I tested the program using two sets of data:

The first array contains the following values:

Copy
Edit
2.1, 1.7, 3.5, 2.6, 4.3, 3.7, 3.9, 2.6, 2.9, 1.6, 2.4, 3.7
The second array stores data read from the provided rainfallData.txt file.
