import com.atomicscala.AtomicTest._

class Test {
	def doSomething: String = {
		"123123"
	}
}

var t = new Test
t.doSomething is "123123"

var result = ""
for (i <- 0 to 9) {
	result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 "

result = ""
for (i <- 0 until 10) {
	result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 "

result = ""
for (i <- Range(0, 10)) {
	result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 "

result = ""
for (i <- Range(0, 10).inclusive) {
	result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 10 "

result = ""
for (i <- Range(0, 10, 2)) {
	result += i + " "
}
result is "0 2 4 6 8 "

var sum = 0
for( i <- Range(0, 10, 2)) {
	println("adding " + i + " to " + sum)
	sum += i
}
sum is 20