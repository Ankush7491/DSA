package datastructures.hashtable;

public class HTAPP  {
    public static void main(String[] args) {
        HashTable hashTable=new HashTable();
        hashTable.set("Suzuki",1);
        hashTable.set("Hyundai",2);
        hashTable.set("TATA",3);
        hashTable.set("Lexus",89);
        hashTable.printTable();
        System.out.println(hashTable.get("TATA"));
    }
}
