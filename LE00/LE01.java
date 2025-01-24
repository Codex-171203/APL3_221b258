/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Palak{
    String Name;
    int Age;
    
    void setAge(int a){
        this.Age = a;  // Corrected this Age to this.Age
    }
    
    void setName(String s){
        this.Name = s;  // Corrected this Name to this.Name
    }
    
    void getName(){
        System.out.println(Name);
    }
    
    void getAge(){
        System.out.println(Age);  // Corrected age to Age (case-sensitive)
    }
}

public class Main {
    public static void main(String[] args) {
        Palak p = new Palak();
        p.setAge(21);
        p.setName("Palak");
        p.getName();
        p.getAge();
    }
}

