/bin/rm -rf output

mkdir -p output/mlib

mkdir -p output/classes

# Item 2
# Telescoping constructors
#echo "Telescoping Constructors Example"
#echo ""
#echo ""
#javac -d output/classes `find ./src/main/java/com/effectivejava/items/item2 -name 'Player.java' -o -name '*BabsBatterTelescoping.java'`
#java -cp output/classes/ com.effectivejava.items.item2.TestBabsBatterTelescoping

# JavaBean constructors
#echo "JavaBean Constructor Example"
#echo ""
#echo ""
#javac -d output/classes `find ./src/main/java/com/effectivejava/items/item2 -name 'Player.java' -o -name '*BabsBatterJavaBeans.java'`
#java -cp output/classes/ com.effectivejava.items.item2.TestBabsBatterJavaBeans

# Builders
#echo "Builders Constructor Example"
#echo ""
#echo ""
#javac -d output/classes `find ./src/main/java/com/effectivejava/items/item2 -name '*Player.java' -o -name 'BabsBatter.java' -o -name 'TestBabsBatterBuilder.java' -o -name AVERAGE.java -o -name POWER.java -o -name SPEED.java -o -name PLAYINGTIME.java`
#java -cp output/classes/ com.effectivejava.items.item2.TestBabsBatterBuilder


/bin/rm -rf output/classes

# Item 3
#javac -d output/classes `find ./src/main/java/com/effectivejava/items/item3 -name '*.java'`
# Singleton Factory
#echo "Singleton Factory Example"
#echo ""
#echo ""
#javac -d output/classes `find ./src/main/java/com/effectivejava/items/item3 -name '*SingletonFactory.java'`
#java -cp output/classes/ com.effectivejava.items.item3.TestSingletonFactory .

# Singleton Public
#echo "Singleton Public Example"
#echo ""
#echo ""
#javac -d output/classes `find ./src/main/java/com/effectivejava/items/item3 -name '*SingletonPublic.java'`
#java -cp output/classes/ com.effectivejava.items.item3.TestSingletonPublic .

# Enum Singleton
#echo "Singleton Enum Example"
#echo ""
#echo ""
#javac -d output/classes `find ./src/main/java/com/effectivejava/items/item3 -name '*SingletonEnum.java'`
#java -cp output/classes/ com.effectivejava.items.item3.TestSingletonEnum .

# Singleton Public Reflection
#echo ""
#echo "Singleton Public Reflection Example"
#echo ""
#javac -d output/classes `find ./src/main/java/com/effectivejava/items/item3 -name 'SingletonPublic.java' -o -name 'SingletonEnum.java' -o -name 'TestSingletonReflection.java'`
#java -cp output/classes/ com.effectivejava.items.item3.TestSingletonReflection .

# Singleton Public Serialization
echo ""
echo "Singleton Public Serialization Example"
echo ""
javac -d output/classes `find ./src/main/java/com/effectivejava/items/item3 -name 'SerializedSingletonPublic.java' -o -name 'TestSingletonSerialization.java'`
java -cp output/classes/ com.effectivejava.items.item3.TestSingletonSerialization .

/bin/rm -rf output/classes

# Item 4 

# Review the book setting and also show in the Intellij

echo ""
echo ""
