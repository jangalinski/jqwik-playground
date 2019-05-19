import org.gradle.kotlin.dsl.embeddedKotlinVersion

object Versions {
  val kotlin = embeddedKotlinVersion

  object test {
    val jqwik = "1.1.3"

  object junit {
    val platform = "1.4.1"
    val jupiter = "5.4.1"
  }
  }

}