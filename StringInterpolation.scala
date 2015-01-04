import com.atomicscala.AtomicTest._

def cubed(numx: Int): Int = {
	num * num * num //-- This will actually compile, it will use num = 2
}

val num = 2

val expr = { num * num }

s"num is $num" is "num is 2"
s"expr is $expr" is "expr is 4"
s"3 cubed is ${cubed(3)}" is "3 cubed is 27"