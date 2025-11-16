Design Patterns Project  
Course Assignment — Java Implementation

This project demonstrates the practical application of several structural and behavioral design patterns in Java, following clean code principles, SOLID, and proper project structuring.

The implementation includes interactive console-based demos, allowing users to choose actions and observe how each pattern works in practice.


Implemented Design Patterns

1. Bridge Pattern 
Separates abstraction from implementation, allowing both to vary independently.  
Used to decouple different types of players from the game mechanics.

Example functionality:
Players with different roles (Mage, Warrior, Archer)
Different ability implementations
Unified interface for executing abilities


2. Visitor Pattern
Adds new operations to existing object structures without modifying them.  
Applied to various in-game items and objects that accept different types of visitors.

Example functionality:
Item hierarchy (`Weapon`, `Armor`, `Potion`)
Visitors that apply effects (`BuffVisitor`, `DamageVisitor`)
Extensible without changing item classes


3. Strategy Pattern
Defines a family of interchangeable algorithms and encapsulates them.  
Used for different attack and movement strategies.

Example functionality:
Attack strategies (MeleeAttack, MagicAttack, RangedAttack)
Movement strategies (Aggressive, Defensive, Balanced)
Dynamic strategy switching during runtime

Team Members & Contributions

Student 1 — Kalzhanov Zhansultan
Responsible for:
- Project structure and base architecture  
- Implementation of initial interfaces and abstract classes  
- Integration of game entities used across all patterns  
- Writing supporting classes used by the demo  
- Documentation and minor refactoring  


Student 2 — Amanzhol Aldiyar
Responsible for implementation of three major design patterns:

Visitor Pattern
- Complete visitor hierarchy  
- Implementations of item behaviors  
- Accept/visit logic  
- Demo, testing, and interactive examples  

Bridge Pattern
- Abstractions and implementations for players & abilities  
- Full demonstration logic  
- Clean separation of player roles and mechanics  

Strategy Pattern
- Attack and movement strategy hierarchy  
- Runtime switching logic  
- Integration into game character system  
- Console demo with selectable strategies  


Additional Responsibilities of Student 2
Amanzhol Aldiyar also contributed significantly to the practical execution of the project:

- Wrote the entire `Main` class, including:
  - Interactive terminal menu  
  - Navigation through pattern demos  
  - Pattern selection logic (“tracks”)  
  - User input handlers  
  - Output formatting and flow control  

- Designed and structured the user experience
  Ensured that the project runs clearly and smoothly when launched,  
  presenting each pattern in an understandable and educational format.

- Improved code readability and cleanliness (Clean Code)
  Renamed confusing classes, removed duplication, refactored long functions.

- Final debugging
  Ensured the application works end-to-end, fixed mismatched class calls,  
  and unified output formatting across all patterns.


Summary of Student 2 Role
Amanzhol Aldiyar served as the core developer responsible for all behavioral and structural logic in the project.  
He not only implemented the key patterns (Visitor, Bridge, Strategy),  
but also developed the interactive main program that ties the entire system together.  
His work made the project functional, testable, and ready for presentation.

