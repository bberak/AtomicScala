import com.atomicscala.AtomicTest._

case class Passenger(firstName: String, lastName: String)

case class Train(passengers: Vector[Passenger], line: String)

case class Bus(passengers: Vector[Passenger], capacity: Int)

def travel(transport: Any): String = {
	transport match {
		case Train(passengers, line) => s"Train $line $passengers"
		case Bus(travellers, capacity) => s"Bus $capacity $travellers"
		case Passenger => "Walking alone"
		case what => s"I don't know what the hell $what is.." //-- You can use an identifier instead of a _ wildcard if you want to use the matched value
	}
}

val passengers = Vector(
	Passenger("Rick", "Ross"),
	Passenger("Guy", "Winklevoss")
);

val trip = Vector(
	Train(passengers, "Western"),
	Bus(passengers, 35)
);

travel(trip(0)) is "Train Western " + Vector(Passenger("Rick", "Ross"), Passenger("Guy", "Winklevoss"));
travel("Nowhere") is "I don't know what the hell Nowhere is.."

