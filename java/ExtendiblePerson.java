/**
 * 
 * Extendible Person
 * 
 * Bring in all of the code from your simple person class
 * 
 * Let's make some changes.  
 * 
 * - Gender we only really want to be able to be Male or Female.  We don't want cases of M, m, male, and Male.
 * 		So what's a good way to handle something like this?  Create a Gender enum with Male and Female options and then update the class
 * 		to change gender from a string to an enum.
 * 
 * - Let's take this chance to learn about classes extending other classes.  There are some important concepts to take notice of while we do this.
 *    1. Child classes(subclass) depend on parent classes(superclass), but parent classes should never depend on child classes.  This is a simple
 *       introduction to one of the main principles within the SOLID principles and is known as the dependency inversion principle.  
 *    2. To continue the previous point, the higher level classes will be more generic and the lower level classes will be more specific
 *    
 *    So what we are going to do is create another class called American.
 *    The American class will extend the Person class
 *    The American class constructor should call the constructor in the Person class(hint, Super)
 *    The American class can add an attribute specific to them like Social Security Number
 *    The American class will have a getter and setter for that attribute
 *    
 *    Choose another country that speaks something other than English. Something like a Japanese class.
 *    Since they do not speak English, we need to change what the greet method does when called via a Japanese person. (Hint, override)
 *    Have the greet method print something that works with their language i.e "Watashi wa Light Yagami desu.  Nihon jin desu."
 *    
 *    Create a class called Community and move the main method from person to community. 
 *    Within the main method, create a person, an American, and one of the other class you made
 *    Call some methods on each of the instances and play around with what works.
 */

public class ExtendiblePerson {
    
}
