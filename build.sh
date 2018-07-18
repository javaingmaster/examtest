cd MyMap
mvn clean
mvn package
mvn install
java -jar target/one.jar
cd ..
cd AbstractFactory
mvn clean
mvn package
mvn install
java -jar target/two.jar
cd ..
cd LoL
mvn clean
mvn package
mvn install
java -jar target/three.jar
cd ..
cd lambda
mvn clean
mvn package
mvn install
java -jar target/four.jar
cd ..
cd stream
mvn clean
mvn package
mvn install
java -jar target/five.jar
cd ..