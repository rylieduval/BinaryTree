package pack;
import java.util.Random;
import java.util.Scanner;


public class driver {
	public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      
      // Insert 10 unique random numbers into the binary tree
      Random random = new Random();
      
      for (int i = 0; i < 10; i++) {
          int randomNumber;
          boolean isDuplicate;

          do {
              randomNumber = random.nextInt(10); // Numbers from 0 to 9
              isDuplicate = tree.search(randomNumber) != null;
          } while (isDuplicate);

          Node newNode = new Node(randomNumber);
          tree.insert(newNode);
      }
      
      // Show the tree
      System.out.println("Initial tree:");
      System.out.println(BSTPrint.treeToString(tree.getRoot()));
      System.out.println();
      
      for (int i = 0; i < 3; i++) {
          int removeNumber;
          Node nodeToRemove;
          removeNumber = random.nextInt(10); // Numbers from 0 to 9
          nodeToRemove = tree.search(removeNumber);


          System.out.println("Removing: " + removeNumber);
          tree.remove(removeNumber);
      }
      
      System.out.println(BSTPrint.treeToString(tree.getRoot()));
      

      int first = random.nextInt(10);
      int second = random.nextInt(10);
      int third = random.nextInt(10);
      
      System.out.println("searching for: " + first + " and found: " + tree.search(first));
      System.out.println("searching for: " + second + " and found: " + tree.search(second));
      System.out.println("searching for: " + third + " and found: " + tree.search(third));
	}
}
