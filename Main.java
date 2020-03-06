import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Type your name:");
    System.out.println("Hello "+name+" and welcome!");

  }
}