# Trail
### 2D Grid Based Game with Custom Data Structure and Algorithms

### Gameplay:

*Purpose*: Complete one of the three objectives that allows you to reach an end game
* Two player game in a 16 x 16 grid
* Players are allowed to move, attack and use items on their turn
* Possible Winning Strategies
  * Kill the other player
  * Collect 10 point value worth of fruit
  * Control a majority of the capture points
### Rules & Restrictions:
  * Basic Gameflow
    * Player rotates turns with the computer
    * Each player can move, attack and use items on its turn
    * A player can attack an enemy (regardless if user or boss) one time
    * A player must move before it attacks
    * Items must be used before a player moves
    * Attacking
      * Each character in the game has a attack and defense value assigned
      * This can be change from equipping armor and weapons
      * Using weapons and armor will change crit chance, which does not exist with regular PvP
    * Capturing
      * Capture points are randomly generated but it can be guaranteed that there will be one in each of the four quadrants (8 x 8) space
      * The boss must be defeated in order to
      * Bosses randomly move to a square within a certain range that is centered at the capture point
      * If a boss spots a player, it will continuously teleport to a spot that can reach the player unless the player moves out of its attacking range
    * Collecting Fruit
      * Fruit will spawn randomly
      * There is no guarantee of how much fruit is generated per match
### End Game Explanations
* Death
  * Each player has a attack, range and defense value which determines PvP mechanics
    * Attacking a player can reduce its health
    * Killing a player (reducing character health to zero or less) will result in a win for the killer
* Found Fruit
  * Fruits randomly spawn in every game
  * Each fruit contains a certain value
  *  When a player has a combined fruit value of 10 or more, they will immediately end the game and win
* Capture Points
  * At certain spots on the map, there will be capture points (3)
  * Each capture point is guarded by a boss
  * The boss must be killed in order to win
  * A capture point is controlled by the last player to be on the square after the boss has been killed
  * A player has the capture 2 of them to win the game
### Definitions & Relevant Variables:
  * **Character**:
    * Moves: How many spaces in the vertical and horizontal direction (no diagonal) can a character move
    * Health: How much damage a character can take before dying
    * Attack: How much damage a character does when attacking
    * Defense: Percentage of taking half damage
    * Range: How far away can a target be so the character itself can attack it
    * Storage: The items that a character has.
* **Enemy**: Subclass of character
  * SpawnRate: How often this enemy will spawn
  * Tier: How strong of a boss this enemy is, relative to other enemies
  * Ability: Whether or not the boss has an ability or not
  * Vision: How many squares away can the boss see you and start attacking you from
* **Item**: 
  * Equipped: Whether or not the user is using the item or not
  * Storage Size: How many spaces in the storage does this item take up
  * Rarity: What are the chances that this item is dropped
  * Armour: Subclass of Item
  * Crit Reduction: How much is the crit chance from an attack reduced when player is attacked
  * Damage Reduction: How much less damage will be taken from an attack
* **Weapon**: Subclass of Item
  * Damage Boost: How much more damage is created from equipping the item
  * Crit Chance: What is the percentage of critical damage occurring?
  * Booster: How much more damage will the weapon cause if used by its specialized clas
  * Boosted: Is the correct user class using this item?
* **Fruit**: Subclass Enum of Item
  * Score: How many points is the fruit worth
  * Equipped: Always false
  * StorageSize: Will always be 1
  * Rarity: What percentage will


