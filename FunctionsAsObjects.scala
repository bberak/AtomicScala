import com.atomicscala.AtomicTest._

def show(n: Int)={ 
	println("> " + n)
}

val v1 = Vector(1,2,3,4,5)

v1.foreach(show) //-- See 'lifting'

v1.foreach(n => println("> " + n)) //-- Anonymous function (or function literal)

val v2 = "duck".toVector

v2.foreach(n => println("> " + n))

var result = "";

v2.foreach(c => {
	result += c + ","
	println(c + ",")
});

result is "d,u,c,k,"

val v3 = Vector(2,1,0,23,6,1,19,4)

v3.sorted is Vector(0,1,1,2,4,6,19,23)

v3.sortWith((x,y) => x < y) is v3.sorted

class Later(val f: () => Unit) {
	def call() = {
		f()
	}
}

var later = new Later(() => println("abc 123 I may be crazy!"))

later.call()

val later2 = () => println("You definitely are crazy!") //-- Cool, C# can't infer the function type - it forces you to define it with the declaration

later2()

