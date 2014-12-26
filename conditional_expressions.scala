val x: Boolean = { 1 > 0 }
val y = 2 > 1

if (x) {
	println("1 is greater than 0")
} 

if (y)
	println("2 is greater than 1")
else
	println("2 is not greater than 1???")

val result = { 
	if (99 > 100) { 4 }
	else { 42 }
}

println(result)