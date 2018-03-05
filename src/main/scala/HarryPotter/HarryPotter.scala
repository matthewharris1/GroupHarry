package HarryPotter

/**
  * Created by digital032676 on 05/03/18.
  */
trait Potion

case class PolyJuicePotion() extends Potion

case class DraughtPotion() extends Potion

case class Ingredient(name : String)



object HarryPotter extends App {
}

object Cauldron {
  def brew(ing: Ingredient*): Option[Potion] = {
    val ingList = ing.toList
    ingList match {

      case List(Ingredient("Aconite"), Ingredient("Adder's Fork")) => Some(new PolyJuicePotion)
      case List(Ingredient("Niffler's Fancy"), Ingredient("Nightshade")) => Some(new DraughtPotion)
      case _ => None
    }

  }
}
