

val r1 = Range(0, 10)
var r2 = Range(5, 10)

println(r1, r2)

class Giraffe
class Bear
class Hippo

val g1 = new Giraffe
val g2 = new Giraffe
val b = new Bear
val h = new Hippo

println(g1)
println(g2)
println(b)
println(h)

class Hyena {
	println("A Hyena has been created")
}

val hyena = new Hyena

class Dog {
	def bark(): String = {
		"Woof woof!"
	}
}

class Cat {
	def meow(): String = {
		"Meow, meow"
	}
}

val dog = new Dog
val cat = new Cat


println(dog.bark())
println(cat.meow())

class Hamster {
	def speak(): String = { "Squeak!" }
	def exercise(): String = {
		speak() + " Running on wheel"
	}
}

val hamster = new Hamster;

println(hamster.exercise) // () are optional here
















