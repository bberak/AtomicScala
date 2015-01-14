import com.atomicscala.AtomicTest._

def acceptAnything(x:Any): String = {
	x match {
		case s: String => s"A String: $s"
		case i: Int if (i < 20) => s"An Int less than 20: $i"
		case i: Int => s"Some other Int: $i"
		case p: Person => s"A Person: ${p.name}"
		case _ => s"NFI: $x"
	}
}

case class Person(name: String)

acceptAnything("abc123") is "A String: abc123"
acceptAnything(5) is "An Int less than 20: 5"
acceptAnything(30) is "Some other Int: 30"
acceptAnything(Person("bob")) is "A Person: bob"
acceptAnything(1.1) is "NFI: 1.1"
