package HarryPotter

/**
  * Created by digital032676 on 05/03/18.
  */
trait Potion

case class PolyJuicePotion() extends Potion

object PolyJuicePotion {
  val ingredients = Set(Ingredient("Adder's Fork"), Ingredient("Aconite"))
}

case class DraughtPotion() extends Potion

object DraughtPotion {
  val ingredients = Set(Ingredient("Niffler's Fancy"), Ingredient("Nightshade"))
}

case class Ingredient(name : String)

object HarryPotter extends App {

  Cauldron.brew(Ingredient("Aconite"), Ingredient("Adder's Fork"))
  Cauldron.brew(Ingredient("Niffler's Fancy"), Ingredient("Nightshade"))
  Cauldron.brew(Ingredient("anything else"))
}

object Cauldron {
  def brew(ing: Ingredient*): Option[Potion] = {
    val ingSet = ing.toSet

    ing.toList match {
      case _@List(_,_) if ingSet == PolyJuicePotion.ingredients => Some(new PolyJuicePotion)
      case _@List(_,_) if ingSet == DraughtPotion.ingredients => Some(new DraughtPotion)
      case _ => None
    }
  }
}
