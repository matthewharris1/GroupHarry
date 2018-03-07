package HarryPotter

/**
  * Created by digital032676 on 07/03/18.
  */
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
