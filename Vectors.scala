import com.atomicscala.AtomicTest._

val v1 = Vector(1, 3, 5, 7, 11, 13)
v1 is Vector(1, 3, 5, 7, 11, 13)

v1(4) is 11

var result = ""
for (i <- v1){
	result += i + ", "
}
result is "1, 3, 5, 7, 11, 13, "

val v2 = Vector(1.1, 2.2, 3.3, 4.4)
v2.reverse is Vector(4.4, 3.3, 2.2, 1.1)

val v3 = Vector("e", "d", "c", "b", "a")
v3 is Vector("e", "d", "c", "b", "a")
v3.sorted is Vector("a", "b", "c", "d", "e")
v3.head is "e"
v3.tail is Vector("d", "c", "b", "a")

val v4 = Vector(1.1, 2.2, 3.3, 4.4)
v2 is v4