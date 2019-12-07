import maths.PascalsTriangle
import org.scalatest.{FlatSpec, Matchers}

import PascalsTriangle._

class PascalsTriangleSpec extends FlatSpec with Matchers {

  "triangle" should "return List(1) if called with row 0" in {
    val output = triangle(0)

    output shouldBe List(1)
  }

  it should "return List(1,1) if called with row 1" in {
    val output = triangle(1)

    output shouldBe List(1,1)
  }

  it should "return List(1,2,1) if called with row 2" in {
    val output = triangle(2)

    output shouldBe List(1,2,1)
  }

  it should "return List(1,7,21,35,35,21,7,1) if called with row 7" in {
    val output = triangle(7)

    output shouldBe List(1,7,21,35,35,21,7,1)
  }
}
