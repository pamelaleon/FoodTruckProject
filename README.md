# Food Truck Project

##Description 
	This program was designed to have the user create 5 food trucks. The user inputs the name, food type, and rating from 1-5 for each food truck. All of the users input is encapsulated to ensure any changes made do not affect the original data already input. The user can input up to five trucks but if they only want to input 2 trucks total then the system allows for that by having user input "quit" and program follows up with a menu from them to choose from. 
	
	The program has 5 menu choices to choose from.From listing each food type, seeing the average of rated food trucks, displaying highest rated food truck and quitting the program. All choices are displayed and repeats until the user chooses #4 for "Quit the program" and then program says "Goodbye".

##Lessons Learned
	While creating the program I discovered how much easier and cleaner my code looks when using constructors. How by using logic to call out the methods made the code seem easy to write but also made it confusing during times if my code were to break and I had to re-read my program over to see if it made sense logically to find the error. 
	
	I had problems with my code when there was an error because it only read the user's input from 2 out 5. The program would not compile and I was stumped for a bit. Thats when I remembered that in an array, if there was an empty spot then the computer will compile "null". The reason for the problem is because when the user is inputting the number of food trucks, they have the option to stop after inputting 2 food trucks. Thats when I looked back at my code and realize I did not specify to the program what to do if it encounters a "null", meaning if that user does not input all five food trucks. Fixing the program and adding that if the program does not find a "null", to add the numbers given for calculating average and to find the the highest rated food truck.



##Technologies Used
-Github
-Java
-Eclipse 


