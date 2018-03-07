package HarryPotterSpec

import HarryPotter._
import org.scalatest.{MustMatchers, WordSpec}

/**
  * Created by digital032676 on 05/03/18.
  */
class HarryPotterTest extends WordSpec with MustMatchers {

  "HarryPotter" must {

    "return None when no ingredients are given" in {

      Cauldron.brew() mustEqual None
    }

    "return None when one ingredient is given" in {

      Cauldron.brew(Ingredient("Aconite")) mustEqual None
    }

    "return PolyJuice potion when given 'Aconite' and 'Adder's Fork'" in {

      Cauldron.brew(Ingredient("Aconite"), Ingredient("Adder's Fork")) mustEqual Some(new PolyJuicePotion)
    }

    "return PolyJuice potion when given 'Adder's Fork' and 'Aconite'" in {

      Cauldron.brew(Ingredient("Adder's Fork"), Ingredient("Aconite")) mustEqual Some(new PolyJuicePotion)
    }

    "return Draught potion when given 'Niffler's Fancy' and 'Nightshade'" in {

      Cauldron.brew(Ingredient("Niffler's Fancy"), Ingredient("Nightshade")) mustEqual Some(new DraughtPotion)
    }

    "return Draught potion when given 'Nightshade' and 'Niffler's Fancy'" in {

      Cauldron.brew(Ingredient("Nightshade"), Ingredient("Niffler's Fancy")) mustEqual Some(new DraughtPotion)
    }

    "Return None when given 'Adder's Fork' 'Adder's Fork' 'Aconite'" in {

      Cauldron.brew(Ingredient("Adder's Fork"), Ingredient("Adder's Fork"), Ingredient("Aconite")) mustEqual None
    }

    "Return None when given incorrect ingredients" in {

      Cauldron.brew(Ingredient("Eye of Newt"), Ingredient("Troll's Toenail")) mustEqual None
    }

    "Return None when given one ingredient from each potion" in {

      Cauldron.brew(Ingredient("Aconite"), Ingredient("Nightshade")) mustEqual None
    }
  }
}
