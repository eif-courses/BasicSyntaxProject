
MyConnection.java klasėje pakeisti duomenų bazės prisijungimo duomenis: 

```java 
......................................................
 String host = "jdbc:mysql://localhost:3306/test"; 
 String user = "root";
 String password = "";
......................................................

```

Data.java 

Pakeisti SQL užklausos sakinius pagal jūsų sukurtas lenteles: 
```java
String sql = "insert into test.animal values (?,?)"; \\ Insert(..) metodas.
PreparedStatement stmt = connection.prepareStatement("select * from test.animal"); \\ Display() metodas. 
```

Gradle naudotojams reikalinga biblioteka skirta komunikacijai su duomenų baze. Prijungti mysql connector build.gradle faile į dependencies dalį įdėti šią eilutę:

dependencies {
    
    compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.17'
    
}

Maven naudotojam į POM.XML failą įdėti dependency ```<dependencies>....</dependencies> ``` tagą jeigu nėra sukurti patiems: 
```XML    <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.17</version>
</dependency>
```

# Programinė įranga
Rekomenduojama įsidiegti programinę įrangą XAMPP: https://www.apachefriends.org/download.html
Taip pat paleidus programą aktyvuoti Apache ir MySQL servisus. 
