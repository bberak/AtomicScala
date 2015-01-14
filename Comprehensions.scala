import com.atomicscala.AtomicTest._

def eventAndGreaterThanFive(v: Vector[Int]): Vector[Int] = {
	var result = Vector[Int]()
	for {
		n <- v
		if n > 5
		if n % 2 == 0
	} result = result :+ n
	result
}

val v1 = Vector(1,2,3,4,5,6,7,8,9,10,11,12)

eventAndGreaterThanFive(v1) is Vector(6,8,10,12)

def yielding(v: Vector[Int]): Vector[Int] = {
	val result = for {
		n <- v
		isGreaterThanFive = n > 5
		if n % 2 == 0
		if isGreaterThanFive
	} yield n
	result
}

def yielding2(v: Vector[Int]): Vector[Int] = {
	for {
		n <- v
		isGreaterThanFive = n > 5
		if n % 2 == 0
		if isGreaterThanFive
	} yield n
}

def yielding3(v: Vector[Int]): Vector[Int] = {
	for {
		n <- v
		isGreaterThanFive = n > 5
		if n % 2 == 0
		if isGreaterThanFive
	} yield {
		val r = n * 2
		r + 2
	}
}

def yielding4(v: Vector[Int]) = { //-- Implicit return type
	for {
		n <- v
		isGreaterThanFive = n > 5
		if n % 2 == 0
		if isGreaterThanFive
	} yield {
		for (m <- Range(0, n))
			yield m
	}
}

yielding(v1) is Vector(6,8,10,12)

yielding2(v1) is Vector(6,8,10,12)

yielding3(v1) is Vector(14,18,22,26)

yielding4(v1) is Vector(
	Vector(0,1,2,3,4,5),
	Vector(0,1,2,3,4,5,6,7),
	Vector(0,1,2,3,4,5,6,7,8,9),
	Vector(0,1,2,3,4,5,6,7,8,9,10,11)
)
