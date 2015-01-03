import com.atomicscala.AtomicTest._

class ClassArgV1(a: Int) {
	println(7)
	def multi(b: Int): Int = { a * b } 
}

val ca = new ClassArgV1(2)

ca.multi(12) is 24
ca.multi(1) is 2

//-- Error
//println(ca.a)

class ClassArgV2(val a: Int) {
	println(7)
	def multi(b: Int): Int = { a * b } 
}

val ca2 = new ClassArgV2(2)

ca2.multi(12) is 24
ca2.multi(1) is 2
ca2.a is 2

//-- Error
//ca2 = 3

class ClassArgV3(var a: Int)

val ca3 = new ClassArgV3(2)

ca3.a is 2
ca3.a = 3
ca3.a is 3

class Sum3(a: Int, b: Int, c: Int){
	def result(): Int = { a + b + c }
}

val s1 = new Sum3(0, 5, 10)

s1.result is 15

class Sum(numbers: Int*) {
	def result(): Int = {
		var result = 0;
		for (i <- numbers)
			result += i
		result

		//-- or simply, numbers.sum
	}
}

val s2 = new Sum(0, 5, 10, 15)
s2.result is 30

class Family(mum: String, dad: String, kids: String*) {
	override def toString(): String = {
		var members = mum + ", " + dad
		for (kid <- kids)
			members += ", " + kid
		members
	}
}

val family = new Family("sandy", "bob")

family.toString is "sandy, bob"

val biggerFamily = new Family("sandy", "bob", "simon", "sarah")

println(biggerFamily)

biggerFamily is "sandy, bob, simon, sarah"