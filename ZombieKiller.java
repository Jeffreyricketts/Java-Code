import java.util.Arrays;

public class ZombieKiller {
	public static void main(String[] args) {
		System.out.println("Well to our zombie killer program!!!");

		String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
		String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
		int numbersZombiesHATE[] = {4, 90, 70, 123, 12, 4, 561, 1};


		numbersZombiesHATE[6] = 897;
		System.out.println(Arrays.toString(numbersZombiesHATE));

		/*System.out.println("Backpack items!");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);

		System.out.println("Zombie Types!!!");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);*/
	}
}
