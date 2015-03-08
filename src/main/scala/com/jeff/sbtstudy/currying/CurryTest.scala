package com.jeff.sbtstudy.currying

/**
 * Created by winniewang on 8/3/15.
 */
object CurryTest extends App {
  def _2StepMethod(firstName: String)(lastName: String): String = {
    firstName concat " " concat lastName
  }

  /*
   * Only 1StepMethod can use "Named parameter", those currying method cannot
   */
  def _1StepMethod(firstName: String, lastName: String): String = {
    firstName concat " " concat lastName
  }

  def printTheFullName() {
    println(getLastName(_2StepMethod(provideFirstName)))
  }

  def printReverseFullName() = {
    /*
     * cannot use Named-parameter to use currying method, below code will not be compiled. Seems like named parameter
     * only apply to _1StepMethod kind of methods. Consider raising an SIP to Scala, because if you must always
     * strictly follow the parameter sequence rather the symbol, it limits the biz application -- for example you might
     * have 2 usecases to provide lastName and firstName, but usecase-A can only provide firstName followed by lastName,
     * whereas usecase-B can only provide lastName followed by firstName. You have to design the _2StepMethod()
     * referring to usecase-A, and when applying to usecase-B you have to use it in this way as the first step:
     *
     * _2StepMethod(_: String, "Zhou")
     *
     * It may seems fine when the parameter list is not that complicated but it does confuse the client code programmer
     * when the parameter list is long and biz logic is complicated.
     *
     * Suggestion is, similar to named parameter rule, as long as ONE parameter is set by named parameter, ALL the
     * currying parameters must be set via named parameter (to reduce the inferring complicity)
     */
    //_2StepMethod(lastName = provideFirstName)(firstName: String)

    println(getLastName(_2StepMethod(_: String)("Jeff")))
  }

  def provideFirstName: String = "Jeff"

  def getLastName(p: (String) => String): String = p("Zhou")



  printTheFullName()

  printReverseFullName()
}
