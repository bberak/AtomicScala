import com.atomicscala.AtomicTest._

case class Point(x: Double, y: Double)

case class Point3D(x: Double, y: Double, var z: Double)

val p1 = new Point(10.0, 20.0) //-- New keyword is optional for case classes

p1.x is 10.0
p1.y is 20.0

println(p1)

val p2 = Point3D(10.0, 20.0, 30.0)
p2.z = 40.0

p2.x is 10.0
p2.y is 20.0
p2.z is 40.0

println(p2)