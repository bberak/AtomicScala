import com.atomicscala.AtomicTest._

val v1 = 11
val v2 = "a String"

// "Natural" syntax for test expressions
v1 is 11
v2 is "a String"
v2 is "produces Error"

println "print this out using infix notation"