import com.atomicscala.AtomicTest._

class Simple(val s: String){
	def getA() = s
	def getB = s
}

val s = new Simple(s="123")

s.getA is "123"
s.getA() is "123"
s.getB is "123"
//s.getB() is "123" -- this won't work

/*

Here’s the style question: Since Scala is flexible about the way you call a method that doesn’t have arguments, does it matter? 

Yes: Parentheses have stylistic meaning in the Scala community. If calling a method modifies the internal state of the object – that is, 
if there are internal variables that change when the method is called – then you should leave the parentheses on in the method definition. 

This signals the reader that this is a mutating method (it causes the object to change). Ideally, when you call the method you also include 
the parentheses to send the same message (although you’ve seen that Scala doesn’t require it).

On the other hand, if calling the method produces a result without changing the state of the object, the convention is to leave the 
parentheses off the method definition, indicating to the reader that this method reads data from the object without mutating it. 
Since both methods simply return the stored value of s, getB is the preferred form.

Why is it preferable to leave the parentheses off methods that don’t change an object? Programmers who call getB should not have 
to care whether getB is a field (val) or a method (def). The only thing the caller needs to care about is that getB does produce 
the desired value, not how (this is the Uniform Access Principle).

*/

