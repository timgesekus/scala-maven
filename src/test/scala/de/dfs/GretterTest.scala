package de.dfs

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class GretterSpec extends Spec with ShouldMatchers {
  describe("Greeter") {
    describe("when greeted by Tim") {
      it("should greet Tim") {
        val greeter = new Greeter()
        greeter.hello("Tim") should equal("hello Tim")
      }
    }
  }

}