import sbtassembly.Plugin.AssemblyKeys._

scalaVersion := "2.10.3"

assemblySettings

excludedJars in assembly <<= (fullClasspath in assembly) map { cp =>
	cp filter { x =>
		val name = x.data.getName
		(name startsWith "robocode.") || (name startsWith "picocontainer.")
	}
}

mainClass in Compile := Some("robocode.Robocode")
