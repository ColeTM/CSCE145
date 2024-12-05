//Cole Morrison

import java.util.Scanner;
import java.util.Random;

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);	//creating a Scanner object
		Random r = new Random();				//creating a randomizer object
		
		System.out.println("Welcome to the temple. Type \"go\" to begin.");
		String go = key.next();
		if (!go.equalsIgnoreCase("go")) {
			System.out.println("Seems like you didn't want to enter the temple... Game over!");
			System.exit(0);
		}
		//user must enter "go" to begin the game. if they don't the program ends
		
		Boolean exploredRight = false;
		Boolean exploredMiddle = false;
		Boolean exploredLeft = false;
		//keeping track of which paths the user chooses -- false by default
		
		System.out.println("You have entered the temple. You find yourself in a big room with three paths. Which tunnel will you follow?");
		System.out.println("Enter \"left\", \"middle\", or \"right\":");
		String path = key.next();
		//takes input from user, who is choosing which path to take
		
		if (path.equalsIgnoreCase("right")) {
			exploredRight = true;		//logs that the user has explored the path to the right
			System.out.println("You have chosen to go right. You walk down the tunnel as it gets darker and darker.");
			System.out.println("It isn't long before you can't see anything at all. You start to get a bad feeling.");
			System.out.println("Do you want to keep going? Enter \"continue\" or \"return\"");
			String decision = key.next();
			//prints the story to the console. user chooses whether to continue down the path or go back
			
			if (decision.equalsIgnoreCase("continue")) {
				System.out.println("You decide to continue down the tunnel. You keep walking through the darkness.");
				System.out.println("At some point when you take a step, you find nothing under your feet. You stumble forward over the ledge.");
				System.out.println("You fall into the abyss. Game over!");
				System.exit(0);
				//if the user chooses to continue, they end up at a "game over" and the program ends
			
			} else if (!decision.equalsIgnoreCase("return")) {
				System.out.println("You did not make a decision. You sit in the tunnel for the rest of time. Game over!");
				System.exit(0);
				//if the user makes a typo, the program ends
			}
			System.out.println("You have decided to turn back. Eventually, you find yourself back in the big room.");
			System.out.println("You can try another path, or you can exit the temple. What will you do?");
			System.out.println("Enter \"left\", \"middle\", or \"exit\".");
			path = key.next();
			//the user returns to the first room and is given the option to choose a new path or exit
		}
	
		if(path.equalsIgnoreCase("exit")) {
			System.out.println("You decide to exit the temple. You step back outside, grateful to see the light of day again.");
			System.out.println("However, you spend the rest of your days wondering what lay deeper in the temple.");
			System.out.println("The end.");
			System.exit(0);
			//if the user chooses to exit the temple, the game ends
		}
		//if the user chooses a new path, the game continues
	
		if (path.equalsIgnoreCase("left")) {
			
			exploredLeft = true;		//logs that the user has explored the left path
			System.out.println("You have chosen to go left. You walk down the dark tunnel, which is lit only with torches on the walls.");
			System.out.println("On the ground lie three weapons: a club, a rifle, and pepper spray. You only can only take one. Which one will you choose?");
			System.out.println("Enter \"club\", \"rifle\", or \"spray\":");
			String weapon = key.next();
		//the user chooses one of the three weapons
			
			System.out.println("You continue through the tunnel. Eventually, you come across three doors.");
			System.out.println("On each door is a picture of an animal. There is a lion, a cobra, and a bear.");
			System.out.println("Which door will you choose? Enter \"lion\", \"bear\", or \"cobra\":");
			String animal = key.next();
			//the user chooses one of the three doors to enter
			
			if (animal.equalsIgnoreCase("lion")) {
				System.out.println("You slowly push open the door with the lion on it and step inside.");
				System.out.println("The door slams shut behind you, and you find yourself face to face with a lion!");
				System.out.println("What will you do? Enter \"weapon\" or \"pray\":");
				String reaction = key.next();
				//the user chooses to either use a weapon on the lion or to pray
				
				if (reaction.equalsIgnoreCase("pray")) {
					System.out.println("You choose to pray, but the lion does not care. It pounces.");
					System.out.println("You are eaten by the lion. Game over!");
					System.exit(0);
					//the user chose to pray, but it results in a game over
				}
				else if (reaction.equalsIgnoreCase("weapon")) {
					System.out.println("You choose to use your weapon.");
					//different outcomes follow based on which weapon was chosen
					if (weapon.equalsIgnoreCase("club")) {
						System.out.println("You swing your club at the lion, but it is not very effective. It still manages to pounce.");
						System.out.println("You are eaten by the lion. Game over!");
						System.exit(0);
						//the club was not the correct choice against the lion. results in a game over
					} else if (weapon.equalsIgnoreCase("rifle")) {
						System.out.println("You raise your rifle and shoot at the lion. It stops in its tracks and slumps to the ground.");
						System.out.println("You walk around the lion's body and through the door at the back of the room.");
						//the rifle was the correct choice for the lion. the game continues
					} else if (weapon.equalsIgnoreCase("spray")) {
						System.out.println("You raise the can of pepper spray and spray the lion. It slows it down for a moment, but then it is able to pounce.");
						System.out.println("You are eaten by the lion. Game over!");
						System.exit(0);
						//the pepper spray was not the correct choice for the lion. results in a game over
					} else {
						System.out.println("You raise your arm... but find yourself empty-handed! You are defensless as the lion pounces.");
						System.out.println("You are eaten by the lion. Game over!");
						System.exit(0);
						//the user did not correctly choose one of the three available weapons. game over
					}
				} else {
					System.out.println("You do nothing, accepting your fate as the lion pounces.");
					System.out.println("You are eaten by the lion. Game over!");
					System.exit(0);
					//the user neither prays nor uses a weapon. game over
				}
			}
			else if (animal.equalsIgnoreCase("cobra")) {
				System.out.println("You slowly push open the door with the cobra on it and step inside.");
				System.out.println("The door slams shut behind you, and you find yourself face to face with a cobra!");
				System.out.println("What will you do? Enter \"weapon\" or \"pray\":");
				String reaction = key.next();
				//the user has chosen the cobra. again choosing whether to use the weapon or pray
				
				if (reaction.equalsIgnoreCase("pray")) {
					System.out.println("You choose to pray, but the cobra does not care. It strikes.");
					System.out.println("You crumple to the ground as the cobra's venom sinks in. Game over!");
					System.exit(0);
					//praying is again ineffective. game over
				}
				else if (reaction.equalsIgnoreCase("weapon")) {
					System.out.println("You choose to use your weapon.");
					//different outcomes again follow based on the weapon chosen
					if (weapon.equalsIgnoreCase("club")) {
						System.out.println("You swing your club at the cobra, and it crumples to the ground.");
						System.out.println("You walk around the cobra's body and through the door at the back of the room.");
					//the club is the correct choice for the cobra. the game continues
					} else if (weapon.equalsIgnoreCase("rifle")) {
						System.out.println("You raise your rifle and shoot at the cobra, but it's too small of a target. You miss the shot and the cobra strikes.");
						System.out.println("You crumple to the ground as the cobra's venom sinks in. Game over!");
						System.exit(0);
						//the rifle was not the correct choice for the cobra. results in a game over
					} else if (weapon.equalsIgnoreCase("spray")) {
						System.out.println("You raise the can of pepper spray and spray the cobra. It only seems to make it angrier. The cobra strikes.");
						System.out.println("You crumple to the ground as the cobra's venom sinks in. Game over!");
						System.exit(0);
						//the pepper spray was not the correct choice for the cobra. results in a game over
					} else {
						System.out.println("You raise your arm... but find yourself empty-handed! You are defensless as the cobra strikes.");
						System.out.println("You crumple to the ground as the cobra's venom sinks in. Game over!");
						System.exit(0);
						//the user did not correctly choose one of the three available weapons. game over
					}
				} else {
					System.out.println("You do nothing, accepting your fate as the cobra strikes.");
					System.out.println("You crumple to the ground as the cobra's venom sinks in. Game over!");
					System.exit(0);
					//the user neither prays nor uses a weapon. game over
				}
			}
			else if (animal.equalsIgnoreCase("bear")) {
					System.out.println("You slowly push open the door with the bear on it and step inside.");
					System.out.println("The door slams shut behind you, and you find yourself face to face with a bear!");
					System.out.println("What will you do? Enter \"weapon\" or \"pray\":");
					String reaction = key.next();
					//the user has chosen the bear. again choosing whether to use the weapon or pray
					
					if (reaction.equalsIgnoreCase("pray")) {
						System.out.println("You choose to pray, but the bear does not care. It attacks.");
						System.out.println("You are mauled by the bear. Game over!");
						System.exit(0);
						//the user chose to pray, but its ineffective. results in a game over
					}
					else if (reaction.equalsIgnoreCase("weapon")) {
						System.out.println("You choose to use your weapon.");
						//different outcomes follow based on which weapon was chosen
						if (weapon.equalsIgnoreCase("club")) {
							System.out.println("You swing your club at the bear, but it bounces right off it. The bear attacks.");
							System.out.println("You are mauled by the bear. Game over!");
							//the club was not the correct choice for the cobra. results in a game over
							System.exit(0);
						} else if (weapon.equalsIgnoreCase("rifle")) {
							System.out.println("You raise your rifle and shoot at the bear, but the bullet does not pierce its skin. The bear attacks.");
							System.out.println("You are mauled by the bear. Game over!");
							System.exit(0);
							//the rifle was not the correct choice for the cobra. results in a game over
						} else if (weapon.equalsIgnoreCase("spray")) {
							System.out.println("You raise the can of pepper spray and spray the bear. The bear stops in its track, stumbling around and clawing at its eyes.");
							System.out.println("You quickly go around the incapacitated bear and through the door in the back of the room.");
							//the pepper spray was the correct choice for the bear. the game continues
						} else {
							System.out.println("You raise your arm... but find yourself empty-handed! You are defensless as the bear attacks.");
							System.out.println("You are mauled by the bear. Game over!");
							System.exit(0);
							//the user chose to pray, but its ineffective. results in a game over
						}
					} else {
						System.out.println("You do nothing, accepting your fate as the bear attacks.");
						System.out.println("You are mauled by the bear. Game over!");
						System.exit(0);
						//the user neither uses a weapon or prays. results in a game over
					}
			} else {
			System.out.println("You do not choose a door. You sit in the tunnel for the rest of time. Game over!");
			System.exit(0);
			//the user did not put in a correct input to choose a door. results in a game over
			}
		} else if (path.equalsIgnoreCase("middle")) {
			exploredMiddle = true;
			System.out.println("You have chosen to go down the middle. As you walk down the tunnel, you begin to see bones scattered across the ground.");
			System.out.println("Eventually you reach an unmarked door. You push it open and step inside, finding yourself in a dark room.");
			System.out.println("The door slams shut behind you. Torches along the walls roar to life, illuminating the room, and you discover that you are face to face with a sphinx!");
			System.out.println("The sphinx grins at you. \"Welcome to my game. If you would like to leave, you're going to have to answer my questions.\"");
			//printing the story to the console
			
			int addend1 = r.nextInt(100, 1000);
			int addend2 = r.nextInt(100, 1000);
			int sum = addend1 + addend2;
			//two random numbers are generated and then added together in the variable "sum"
			
			System.out.println("Solve this equation: " + addend1 + " + " + addend2);
			//the above equation created by the program is asked to the user
			int answer1 = key.nextInt();	//the user's answer is stored in the variable "answer1"
			if (answer1 != sum) {
				System.out.println("\"That's incorrect.\" The sphinx rises, licking its lips and flicking its tail before pouncing on you.");
				System.out.println("Game over!");
				System.exit(0);
				//if the user's answer is incorrect, these lines run to result in a game over
			}
			
			System.out.println("\"Not bad. Here's something a little tougher.\"");
			int factor1 = r.nextInt(10, 100);
			int factor2 = r.nextInt(5, 10);
			int product = factor1*factor2;
			//two random numbers are generated and then multiplied together in the variable "product"
			
			System.out.println("Solve this equation: " + factor1 + " * " + factor2);
			//the above equation created by the program is asked to the user
			int answer2 = key.nextInt();	//the user's answer is stored in the variable "answer2"
			if (answer2 != product) {
				System.out.println("\"That's incorrect.\" The sphinx rises, licking its lips and flicking its tail before pouncing on you.");
				System.out.println("Game over!");
				System.exit(0);
				//if the user's answer is incorrect, these lines run to result in a game over
			}
			
			System.out.println("\"Very well... One more.\"");
			int term1 = r.nextInt(100, 1000);
			int term2 = r.nextInt(10, 100);
			int term3 = r.nextInt(5, 10);
			int solution3 = term1 + term2 * term3;
			//three random numbers are generated and put into an equation, with the answer being stored in the variable "solution3"
			System.out.println("Solve this equation: " + term1 + " + " + term2 + " * " + term3);
			//the above equation created by the program is asked to the user
			int answer3 = key.nextInt();	//the user's answer is stored in the variable "answer3"
			if (answer3 != solution3) {
				System.out.println("\"That's incorrect.\" The sphinx rises, licking its lips and flicking its tail before pouncing on you.");
				System.out.println("Game over!");
				System.exit(0);
				//if the user's answer is incorrect, these lines run to result in a game over
			}
			System.out.println("\"Hm. You're pretty smart. You've earned your right to pass.\"");
			System.out.println("The sphinx rises and steps aside, giving you a path to the exit. You walk past and go through the door in the back of the room.");
			//if the user answers all the questions correctly, the game continues
	} 
		else {
			System.out.println("You do not choose a path. You sit in the room for the rest of time. Game over!");
			System.exit(0);
			//if the user does not correctly choose one of the paths, the program ends
		}
		
		System.out.println("\nYou find yourself in another huge room. It is completely empty aside from a table standing in the center.");
		System.out.println("On the table sits a chest. You approach it and open it. Inside you find a pile of gold and gems.");
		System.out.println("You take as much as you can carry and retrace your steps through the temple.");
		System.out.println("Congratulations! You have escaped the temple with great riches!");
		//if the user successfully gets through whatever room they chose, this text will print to the console
		
		if (exploredMiddle == true && exploredRight == true) {
			System.out.println("You took the path of the wise.");	//achievement if the user went right, then returned, then took the middle path
		} else if (exploredRight == true && exploredLeft == true) {
			System.out.println("You took the path of the resourceful.");	//achievement if the user went right, then returned, then took the middle path
		} else if (exploredLeft == true) {
			System.out.println("You took the path of the hunter.");		//achievement if the user initially took the left path
		} else if(exploredMiddle == true) {
			System.out.println("You took the path of the scholar.");	//achievement if the user initially took the middle path
		}
		//based on which paths the user took, different achievements are displayed
		
		System.out.println("The end.");
		System.exit(0);
		//the game ends.
		
		key.close();
}
}