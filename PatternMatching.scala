import com.atomicscala.AtomicTest._

def matchColor(color: String): String = {
	color match {
		case "red" => "RED"
		case "blue" => "BLUE"
		case "green" => "GREEN"
		case _ => "UNKNOWN" //-- Optional, but you could get bitten in the ass
	}
}

matchColor("white") is "UNKNOWN"
matchColor("red") is "RED"
matchColor("yellow") is "UNKNOWN"
matchColor("green") is "GREEN"