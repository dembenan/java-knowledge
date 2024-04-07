## Les concepts POO en Java

## I) Introduction

Les Object en java
Les objets Java ainsi que les objets du monde réel ont deux caractéristiques : l'état et le comportement.

Par exemple, un objet humain a un état (nom, sexe, dormir ou non…) et un comportement (étudie Java, marche, parle…). Tout objet Java stocke son état dans des champs et expose son comportement via des méthodes.

## II) Les concepts de la POO

La POO classique comprend 4 concepts principaux.

1.  **L'Encapsulation**

    L'encapsulation des données cache les données internes du monde extérieur et n'y accède que par des méthodes exposées publiquement


             Comment ça marche en Java :
                    Les champs sont rendus privés
                    Chaque champ d'une classe reçoit deux méthodes spéciales : un getter et un setter. Les méthodes getter renvoient la valeur du champ. Les méthodes setter vous permettent de modifier la valeur du champ de manière indirecte mais autorisée.
        Exemple d'encapsulation en code Java :
        
        ```
        public class Student {
           private int age;
           private String name;
           
           public int getAge() {
           return age;
           }
           
           public void setAge(int age) {
           this.age = age;
           }
           
           public String getName() {
           return name;
           }
           public void setName(String name) {
           this.name = name;
           }
        }
        
        public class Main {
            public static void main(String[] args) {
                Student student = new Student();
                student.setName("Sidem");
                student.setAge(20);
                System.out.println(String.format("L'etudiant %s a %s ans",student.getName(),student.getAge()));
            }
        }
        
        ```
        
        **Pourquoi utiliser l'encapsulation ?**
        
        L'encapsulation est importante car elle permet de protéger les données d'une classe et de contrôler leur accès depuis l'extérieur. En rendant les champs privés et en fournissant des méthodes pour y accéder et les modifier (getters et setters), on évite que d'autres parties du code ne manipulent directement ces données, ce qui rend le code plus robuste et plus facile à maintenir.
        
        Ainsi l'utilisation de l'encapsulation facilite les modifications ultérieures en permettant de changer la structure interne de la classe sans affecter les autres parties du code qui l'utilisent.



**L'Héritage**

   Ce principe est plus facile à comprendre même sans aucune expérience pratique. Ne vous répétez pas (DRY) pourrait être la devise du concept d'héritage. L'héritage vous permet de créer une classe enfant qui hérite des champs et des méthodes de la classe parent sans les redéfinir. Bien sûr, vous pouvez remplacer les champs et les méthodes de la classe parent dans la classe enfant, mais ce n'est pas une nécessité. De plus, vous pouvez ajouter de nouveaux états et comportements dans la classe enfant. Les classes parentes sont parfois appelées superclasses ou classes de base, et les classes enfants sont appelées sous-classes. Le mot clé extend de Java est utilisé pour implémenter le principe d'héritage dans le code.

        **Comment ça marche en Java :**
        
        Créez la classe mère et la classe enfant.
        Faire heriter les champs et methodes de la classe parent a la classe enfant à l'aide du mot clé extend .
        Dans le constructeur de la classe Child, utilisez la méthode super(parentField1, parentField2, ...) pour définir les champs du parent.
   **Un constructeur** est une méthode spéciale utilisée pour initialiser un objet nouvellement créé. Un constructeur porte le même nom que son nom de classe. Il existe deux types de constructeurs : par défaut (constructeur sans argument) et constructeur paramétré. Une classe doit avoir au moins un constructeur (elle a le constructeur par défaut si aucun autre constructeur n'a été défini) et elle peut en avoir beaucoup.
   
   Chaque fois que vous créez un nouvel objet, vous appelez son constructeur. Dans l'exemple ci-dessus, vous faites cela dans cette ligne :
   
       Student firstStudent = new Student();
   
   Vous utilisez le mot clé new pour appeler le constructeur par défaut de la classe Student : tudent() .
   
## Certaines règles:

1. [ ] Une classe ne peut avoir qu'un seul parent.
2. [ ] Une classe parent peut avoir plusieurs classes enfant.
3. [ ] Une classe enfant peut avoir ses propres classes enfant.
5. [ ] Tous les membres non privés sont hérités : Les membres (méthodes et champs) non privés (c'est-à-dire publics, protégés ou sans modificateur d'accès) d'une classe de base sont hérités par la classe dérivée. Les membres privés ne sont pas hérités, bien qu'ils restent accessibles via des méthodes publiques de la classe de base. 
7. [ ] Les constructeurs ne sont pas hérités : Les constructeurs ne sont pas hérités par les classes dérivées. Cependant, la première instruction dans le corps du constructeur de la classe dérivée doit être un appel explicite au constructeur de la classe de base, soit à l'aide de super(), soit à l'aide d'un autre constructeur de la classe de base. 
9. [ ] Le mot-clé **super** est utilisé pour accéder aux membres de la classe de base : Le mot-clé super est utilisé pour accéder aux membres hérités de la classe de base à l'intérieur de la classe dérivée. Il est utilisé pour appeler des méthodes de la classe de base, accéder à des champs hérités masqués par des champs de même nom dans la classe dérivée, et appeler le constructeur de la classe de base à partir du constructeur de la classe dérivée.
11. [ ] La relation "est-un" : L'héritage en Java représente la relation "est-un". Par exemple, si une classe Chien hérite de la classe Animal, cela signifie qu'un Chien est un type d'Animal.

Exemples d'illustration en code Java

1. En appliquant l'encapsulation

       public class User {
           private String name;
           private int age;
    
            public int getAge() {
                return age;
            }
        
            public String getName() {
                return name;
            }
        
            public void setName(String name) {
                this.name = name;
            }
        
            public void setAge(int age) {
                this.age = age;
            }

        }

       public class Employee extends User{
            private double salary;
    
            public double getSalary() {
                return salary;
            }
        
            public void setSalary(double salary) {
                this.salary = salary;
            }

            public void setSlary(double salary){
                this.salary = salary;
            }
       }

        Employee employee = new Employee();
        employee.setName("Sidem");
        employee.setAge(20);
        employee.setSalary(75000);
        String salaryFormated = String.format("%,.0f", employee.getSalary());
        System.out.println(String.format("L'employe %s age de %s ans a un salaire de %s $ par ans",employee.getName(),employee.getAge(),salaryFormated));


2. Sans encapsulation avec utilisation du mot cle super
       
        public class Phone {
           int price;
           double weight;
        
            // Constructor
            public Phone(int price, double weight) {
                this.price = price;
                this.weight = weight;
            }
            public void orderPhone(){
                System.out.println("Ordering phone...");
            }
        }
    Bien sûr, il existe différents types de téléphones, créons donc deux classes enfants : une pour les téléphones Android et une seconde pour les iPhones. Ensuite, nous ajouterons des champs et des méthodes que le parent n'a pas. Et nous utiliserons super() pour appeler les constructeurs afin d'initialiser les champs que la classe parent possède.

        public class Android extends Phone {

                // Some new fields
                String androidVersion;
                int screenSize;
         
                String secretDeviceCode;
   
               // Constructor
               public Android(int price, double weight, String androidVersion, int screenSize, String secretDeviceCode) {
                     super(price, weight); // Android inherits Phone’s fields
                    //this - reference to the current object
                    //super - reference to the parent object
         
                    this.androidVersion = androidVersion;
                    this.screenSize = screenSize;
                    this.secretDeviceCode = secretDeviceCode;
               }
   
                // New Android-specific method, does not exist in the Phone class
                public void installNewAndroidVersion() {
                    System.out.println("installNewAndroidVersion invoked...");
            
                }

        }

         public class IPhone extends Phone {
         
             boolean fingerPrint;

             public IPhone(int price, double weight, boolean fingerPrint) {
                 super(price, weight);
                 System.out.println("IPhone constructor was invoked...");
                 this.fingerPrint = fingerPrint;
             }
         
             public void deleteIPhoneFromDb() {
                 System.out.println("deleteIPhoneFromDb invoked...");
             }
         
            @Override // This is about polymorphism, see below
            public void orderPhone(){
              System.out.println("Ordering my new iPhone and deleting the old one...");
            }
         }
        Iphone iphone = new Iphone(500,20,true);
        iphone.orderPhone();
        iphone.deleteIPhoneFromDb();
        Android android = new Android(300,30,"10.1",20,"xxxxxx");
        android.orderPhone();
        android.installNewAndroidVersion();


Donc, pour répéter : en Java, l'héritage vous permet d'étendre une classe avec des classes enfants qui héritent des champs et des méthodes de la classe parent. C'est un excellent moyen d'atteindre la réutilisabilité du code.




4. **Polymorphisme**

Le polymorphisme est le mécanisme qui permet de modifier le comportement d’une classe fille par rapport à sa classe mère. Le polymorphisme permet d’utiliser l’héritage comme un mécanisme d’extension en adaptant le comportement des objets.   

   ## Par Remplacement de méthode
   
   Vous pouvez remplacer la méthode d'une classe parent dans une classe enfant, la forçant à fonctionner différemment. Créons une classe parent Musician avec une méthode play() .

**comment cela fonctionne en Java** :

En général, cela signifie que vous pouvez utiliser le même nom de méthode à des fins différentes. Il existe deux types de polymorphisme en Java : le remplacement de méthode (polymorphisme dynamique) et la surcharge de méthode (polymorphisme statique).
Exemple de polymorphisme par Remplacement de méthode

      public class Animal {

         @Override
         public void crier() {
            System.out.println("un cri d'animal");
         }
      }
      public class Chat extends Animal {

         @Override
         public void crier() {
            System.out.println("Miaou !");
         }
      }

      public class Chien extends Animal {

         @Override
         public void crier() {
            System.out.println("Whouaf whouaf !");
         }
      
      }

      Animal animal = new Animal();
      animal.crier(); // affiche "un cri d'animal"
      
      Chat chat = new Chat();
      chat.crier();   // affiche "Miaou !"
      
      Chien chien = new Chien();
      chien.crier();  // affiche "Whouaf whouaf !"
      
      animal = chat;
      animal.crier(); // affiche "Miaou !"
      
      animal = chien;
      animal.crier(); // affiche "Whouaf whouaf !"

L’exemple de code ci-dessus montre que l’implémentation de la méthode crier dépend du type réel de l’objet et non pas du type de la variable qui le référence.

## Exemple Par Surcharge de méthode
La surcharge de méthodes consiste à utiliser différentes méthodes portant le même nom dans la même classe. Ils doivent être différents en termes de nombre, d'ordre ou de types de leurs paramètres.
Supposons que pour un chien il ya deux sorte de cri. Un cri simple et un cri en presence du maitre chien.

      public class Chien extends Animal{
      
          @Override
          public void crier() {
              System.out.println("Whouaf whouaf !");
          }
          public void crier(boolean maitreIsHere){
              if (maitreIsHere) {
                  System.out.println("Whouaf whouaf en presence du maitre! ");
              }else{
                  System.out.println("Whouaf whouaf !");
              }
          }
      }

## Une exception : les méthodes privées
Les méthodes de portée private ne supportent pas le polymorphisme. En effet, une méthode de portée private n’est accessible uniquement que par la classe qui la déclare. Donc si une classe mère et une classe fille définissent une méthode private avec la même signature, le compilateur les traitera comme deux méthodes différentes.

5. **Abstraction**











