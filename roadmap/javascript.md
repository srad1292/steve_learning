# JavaScript

[Table of Contents](../readme.md)

Learning JavaScript:  
Go to: <https://www.codecademy.com/learn/introduction-to-javascript>  
Go through all of the free sections  
  
Go to: <https://eloquentjavascript.net/>
This is a free to go through online version of the book  
Go through all of the chapters and read the text.  Anything you learned in code academy you can read through for supplemental learning. Anything that's new, you can code out along with the book for experience. When you get to this point where you are doing it yourself you can do one of two things depending on the complexity of what you are programming.  For simple things like seeing what 0.1 * 0.2 is in Javascript, you can use the developer console by using ctrl+shift+j while in a browser or opening it through the browser toolbar.  For more complex things, you can create an HTML file and use the "script" tag to load in a javascript file with your code.  This book also has you creating a simple platformer using canvas, which I think you will enjoy doing.

Mini Assignments

* Using array forEach (print to console)
  * Take this array of numbers and print out each number and each number squared like "Number: x, Square: y"
  * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

* Using array map (print to console)
  * Take this array of activities and time and convert the time from minute to seconds using map, then print using console.table
  * [{activity: "Walking", time: 40}, {activity: "Walking", time: 60}, {activity: "Programming", time: 35}, {activity: "Programming", time: 72}, {activity: "Cooking", time: 15}]

* Chaining methods: array sort and array find (print to console)
  * Take this array of people and find the person who is closest to 50 years old without being older, then print the name and age
  * [{name: "Sam", age: 28}, {name: "Sally", age: 10}, {name: "Tim", age: 60}, {name: "Sarah", age: 31}, {name: "Isabella", age: 48}, {name: "Alex", age: 10}, {name: "Alyssa", age: 27}, {name: "Arnold", age: 88}]

* Repeat the valid palindrome assignment from the Java section, but do it using Javascript
  * Have the user input a word using either an input field and a button or a prompt
  * Check if it's a palindrome and display an alert with the appropriate response.  
  
* Use javascript to create a multiplication table that displays in the browser.

* Update your login page again:
  * Create a list of users in your javascript file
  * On the form submission do one of the following:  
    * Username and password are correct -> Navigate to a new page on the site with a welcome message and fake details about the site.
    * Username is correct but password is not -> Show an invalid password alert
    * Username not found -> Show a username not found alert
  * Things to think about when validating. Do you care about case sensitivity for usernames?  How about passwords?

* Promises and Async/Await
  * Create an HTML page with a start button.  
  * Add an async function to this button that starts a guessing game by replacing the button with a User Score display
  * The computer will choose a random number between 1-100
  * This function will then call another function that will return a promise
  * The promise will prompt the user to enter a number between 1-100 and will handle the following cases:
    * User guessed correctly, 1 point.
    * User guessed incorrectly, 0 point.
    * User entered something other than a number, reject.
  * Have place for some text under the score to show some appropriate message after the previous guess
  * If they guessed correctly, prompt to play again, if they guessed incorrectly or entered the wrong input type, prompt them to see if they want to continue, and if so, continue with the next guess

* Retrieve some facts about cats using an external API (Also this will use promise syntax)
  * Use the javascript fetch to retrieve some facts about cats from "<https://cat-fact.herokuapp.com/facts>"  
  * When the page loads, show a "Loading..." text for two seconds and then, using javascript replace that text with a list of cat facts
  
Project  
  
* Go to <https://github.com/public-apis/public-apis> for a list of public APIs  
* Find something that seems interesting to you and build a page around it.  This could be having a search bar for movie titles and building a paginated table using JavaScript with the results of the search or getting some news data and building out a news website.  
* Try to build at least one part of the page using JavaScript to go along with the use of the API
