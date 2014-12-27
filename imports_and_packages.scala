//import util.Random
//import util.Properties

//import util.Random, util.Properties

//import util.{ Random, Properties }

//import util._

import util.{ Random => Bob, Properties => Jill}

val r = new Bob

println(r.nextInt(10))
println(r.nextInt(10))
println(r.nextInt(10))

val props = Jill
val props2 = util.Properties

println(props.javaHome)
println(props2.jdkHome)
println("Is Mac? " + util.Properties.isMac)
