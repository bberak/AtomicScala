
val c = {
	val x = 3
	val y = 4 / x
	x * y / 0.34
}

// println(x)

println(c)

val d: Unit = {
	println("printing c from the d unit " + c)
}

println(d)

val hour = 11

val isOpen = {
	val opens = 9
	val closes = 20
	println("Operating hours between " + opens + " and " + closes)
	if (hour >= opens && hour <= closes)
		true
	else
		false
}

println(isOpen)

val result = println("???")