package HarryPotter

/**
  * Created by digital032676 on 05/03/18.
  */
abstract class Potion

case class PolyJuicePotion() extends Potion

case class DraughtPotion() extends Potion




object HarryPotter extends App {

  def potion(ing: String): Option[Potion] = {
    ing match {
      case "Aconite, Adder's Fork" => Some(new PolyJuicePotion)
      case "Niffler's Fancy, Nightshade" => Some(new DraughtPotion)
      case _ => None
    }
  }
}
