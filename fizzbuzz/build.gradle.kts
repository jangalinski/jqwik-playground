plugins {
  kotlin("jvm") version Versions.kotlin
  `java-library`
}

dependencies {
  compile(kotlin("stdlib-jdk8"))


  testCompile("net.jqwik:jqwik-api:${Versions.test.jqwik}")
  testRuntime("net.jqwik:jqwik-engine:${Versions.test.jqwik}")


  // Add if you also want to use the Jupiter engine or Assertions from it
  testCompile("org.junit.jupiter:junit-jupiter-engine:${Versions.test.junit.jupiter}")

  testCompile("org.assertj:assertj-core:3.9.1")
}



tasks.withType<Test> {
  useJUnitPlatform {
    includeEngines("jqwik")
  }

  include("**/*Properties.class")
  include("**/*Test.class")
  include("**/*Tests.class")

}
