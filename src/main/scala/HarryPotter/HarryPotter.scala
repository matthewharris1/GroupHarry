package HarryPotter

/**
  * Created by digital032676 on 05/03/18.
  */
trait Potion

case class PolyJuicePotion() extends Potion

case class DraughtPotion() extends Potion

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
      case _@List(_,_) if ingSet == Set(Ingredient("Adder's Fork"), Ingredient("Aconite")) => Some(new PolyJuicePotion)
      case _@List(_,_) if ingSet == Set(Ingredient("Niffler's Fancy"), Ingredient("Nightshade")) => Some(new DraughtPotion)
      case _ => None
    }
  }
}
