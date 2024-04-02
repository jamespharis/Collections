# Collections
4th assignment of the FastTrack program. Using Java to implement multiple classes that implement an interface.

Employee Interface has no default methods, it is a true interface. It just defines methods which have to be implemented in the child classes (Worker & Manager). 
The classes are pretty straightforward, they are data classes--objects that store data.
They are “POJOs” - Plain Old Java Objects - they just store data, they don't have a ton of extra helper methods. These do have 1 helper method: getChainOfCommand


TODO’s at the bottom are importing***
If you are going to use a HashSet or HashMap, you need to implement HashCode & Equals
Generate these methods using Eclipse (Source -> generate), after adding fields***

Manager & Worker need private fields (look at the getters/setters & constructors to determine what fields you need). Create fields, implement constructors, implement getters/setters, then with getChainOfCommand…
Add all of the managers in a chain to a List of managers
Each manager object should keep track of its manager object.
Private Manager manager; this manager object could be null, which means the Manager object, which has a null manager inside of it, does not have a Manager;

Your Manager (object) stores your manager (field) inside of it. Same with Worker.
Need a while or for loop - Need a variable that represents the current manager you have 
current manager will change until it is null

Manager & Worker are almost the same in implementation, but workers cannot have another worker inside of them.
The real challenge of this assignment is implementing OrgChart
This class needs 1 single field. (List, Set, or Map)
You can solve the problem using any collection type
addEmployee - If the given {@code Employee} has a {@code Manager} and that {@code Manager} is not part of the {@code OrgChart} yet, add that {@code Manager} first and then add the given {@code Employee}, and return true.
This should be done in a Loop (recursively) - check for manager, if there is one (that is not in the set), check if that manager has a manager, etc… Add the highest authority manager first, then go down the list until we get to what we were originally looking for
DO NOT FORGET: if they have a manager in the set, I still need to add the employee
WE ARE NOT ADDING WORKERS THAT DO NOT HAVE A MANAGER
USE getChainOfCommand METHOD TO HELP

