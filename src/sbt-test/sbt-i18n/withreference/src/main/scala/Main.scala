package simple

/**
  * A simple class and objects to write tests against.
  */
class Main {
  val text = tech.ant8e.i18n.Bundle.fr.test
  val text2 = tech.ant8e.i18n.Bundle.fr.test2("hi")
  val text3 = tech.ant8e.i18n.Bundle.fr.test3(new java.util.Date())
  val text4 = tech.ant8e.i18n.Bundle.fr.sub.test4
  val text5 = tech.ant8e.i18n.Bundle.de.test
}

object Main {

  def main(args: Array[String]): Unit = {
    val m = new Main()
    println(m.text)
    println(m.text2)
  }
}
