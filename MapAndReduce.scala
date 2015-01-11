import com.atomicscala.AtomicTest._

val v1 = Vector(1, 2, 3)

v1.map(n => n + 1) is Vector(2, 3, 4)

v1.map(n => n.toString) is Vector("1", "2", "3")

v1.reduce((sum, n) => sum + n) is 6

(1 to 100).reduce((sum, n) => sum + n) is 5050

val v2 = Vector("d", "u", "c", "k")

v2.reduce((sum, n) => sum + n) is "duck"