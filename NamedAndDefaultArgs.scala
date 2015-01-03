import com.atomicscala.AtomicTest._

class Color(val red: Int, val blue: Int, val green: Int)

val c1 = new Color(10, 20, 30)

c1.red is 10
c1.blue is 20
c1.green is 30

val c2 = new Color(red = 80, blue = 90, green = 100)

c2.red is 80
c2.blue is 90
c2.green is 100

val c3 = new Color(80, 90, green = 101)

c3.red is 80
c3.blue is 90
c3.green is 101

class Color2(val red: Int = 100, 
	val blue: Int = 100, val green: Int = 100)

val c4 = new Color2(green = 99)

c4.red is 100
c4.blue is 100
c4.green is 99

val c5 = new Color2(77)

c5.red is 77
c5.blue is 100
c5.green is 100

class Family(mum: String, dad: String, kids: String*) {
	override def toString(): String = {
		var members = mum + ", " + dad
		for (kid <- kids)
			members += ", " + kid
		members
	}
}

val f1 = new Family(mum = "sandy", dad = "bob")

f1.toString is "sandy, bob"

val f2 = new Family(mum = "sandy", dad = "bob", "rattus", "maggot")

f2.toString is "sandy, bob, rattus, maggot"

val f3 = new Family(mum = "sandy", dad = "bob", kids = "rattus", "maggot")

f3.toString is "sandy, bob, rattus, maggot"

class Family2(mum: String = "matilda", dad: String = "shamus") {
	override def toString(): String = {
		var members = mum + ", " + dad
		//for (kid <- kids)
		//	members += ", " + kid
		members
	}
}

val f4 = new Family2()

f4.toString is "matilda, shamus"
