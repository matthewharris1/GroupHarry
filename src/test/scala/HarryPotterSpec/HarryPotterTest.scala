package HarryPotterSpec

import HarryPotter._
import org.scalatest.{MustMatchers, WordSpec}

/**
  * Created by digital032676 on 05/03/18.
  */
class HarryPotterTest extends WordSpec with MustMatchers {

  "HarryPotter" must {

    "return error message when no ingredients are given" in {

      HarryPotter.potion("") mustEqual None
    }

    "return Polyjuice potion when given 'Aconite' and 'Adder's Fork'" in {

      HarryPotter.potion("Aconite, Adder's Fork") mustEqual Some(new PolyJuicePotion)
    }

    "return Draught potion when given 'Niffler's Fancy' and 'Nightshade'" in {

      HarryPotter.potion("Niffler's Fancy, Nightshade") mustEqual Some(new DraughtPotion)
    }

  }
}
