import com.atomicscala.AtomicTest._

class Cup{
	var percentFull = 0;

	def set(newPercent:Int): Unit = {
		percentFull = newPercent
	}

	def get(): Int = {
		percentFull;
	}
}

val c = new Cup

c.percentFull is 0

c.percentFull = 50

c.percentFull is 50

c.get() is 50

c.set(45)

c.get() is 45