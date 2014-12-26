
println(multi(5, 2))

def multi(x: Int, y: Int): Int = {
	x * y
}

def printName(firstName: String, lastName: String): Unit = {
	println(firstName + " " + lastName)
}

printName("Boris", "Berak")


def addMulti(x: Int, y: Double, s: String): Double = {
	println(s)
	(x + y) * 2.1
}

def test(x: Int, y: Double, s: String, expected: Double): Unit = {
	val result = addMulti(x, y, s)
	assert(result == expected, 
		"Expected " + expected + ", " +
		"Got " + result)
	println("result: " + result)
}

test(7, 9, "Inside addMulti", 33.6)
test(6, 9, "Inside addMulti", 37.6)