import com.atomicscala.AtomicTest._

def trueOrFalse(expression: Boolean): String = {
	if (expression)
		return "True"
	"False"
}

val b = 1

trueOrFalse(b < 3) is "True"
trueOrFalse(b > 3) is "False"

def oneOrTheOther(expression: Boolean): String = {
	if (expression)
		"True"
	else
		"False"
}

val v1 = Vector(1)
val v2 = Vector(3, 4)

oneOrTheOther(v1 == v1.reverse) is "True"
oneOrTheOther(v2 == v2.reverse) is "False"