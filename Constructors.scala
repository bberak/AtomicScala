import com.atomicscala.AtomicTest._

class Person(val name: String, val age: Int) {

	println("Primary constructor: " + name + " " + age)

	def this(){
		this("John Doe", 1)
	}

	def this(name: String){
		this(name, 1)
	}
}

val p1 = new Person("Bob", 10)

p1.name is "Bob"
p1.age is 10

val p2 = new Person

p2.name is "John Doe"
p2.age is 1

val p3 = new Person("Sarah")

p3.name is "Sarah"
p3.age is 1