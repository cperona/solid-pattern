The Ghost class, a child of Character class, 
the method takeDamage() that it inherits should not exist in Ghost class.
Use the Strategy Pattern to define an interface DamageBehavior that is implemented in DamageAllowedBehavior
and DamageNotAllowedBehavior, and then use them inside Warrior and Ghost.