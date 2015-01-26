import com.atomicscala.AtomicTest._

def filterWithYield1(v: Vector[Int]): Vector[Int] = {
	val result = for {
		n <- v
		if n > 10
		if n % 2 != 0
	} yield n
	result
}

//-- Eliminate intermediate results

def filterWithYield2(v: Vector[Int]) = {
	for {
		n <- v
		if n > 10
		if n % 2 != 0
	} yield n
}

//-- Omit unnecessary curly braces

def filterWithYield3(v: Vector[Int]) = 
	for {
		n <- v
		if n > 10
		if n % 2 != 0
	} yield n

//-- Should you use semicolons?

def filterWithYield4(v: Vector[Int]) = 
	for { n <- v; if n > 10; if n % 2 != 0 } 
		yield n

val v = Vector(2,4,10,11,13,14,17)

filterWithYield1(v) is Vector(11,13,17)
filterWithYield2(v) is Vector(11,13,17)
filterWithYield3(v) is Vector(11,13,17)
filterWithYield4(v) is Vector(11,13,17)

//-- Remove unnecessary arguments

"OttoBoughtAnAuto".foreach(c => print(c))

println

"OttoBoughtAnAuto".foreach(print(_))

println

"OttoBoughtAnAuto".foreach(print)

//-- Use type inference for return types

def explicitReturnType(): Vector[Int] =
	Vector(1,2,3)

def inferredReturnType() =
	Vector(1,2,3)

def unitReturnType() {
	Vector(1,2,3)
}

explicitReturnType() is Vector(1,2,3)
inferredReturnType() is Vector(1,2,3)
//unitReturnType() is ()

//-- Aliasing names with type

case class LongUnrulyNameFromSomeone()

type Short = LongUnrulyNameFromSomeone

new Short is LongUnrulyNameFromSomeone()


val s = new Short

s is LongUnrulyNameFromSomeone()
