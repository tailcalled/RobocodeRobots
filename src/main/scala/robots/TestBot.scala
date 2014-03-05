package robots

import robocode.{ScannedRobotEvent, AdvancedRobot}

class TestBot extends AdvancedRobot {
	def println(x: Any) = System.out.println(x.toString)

	override def run() {
		turnRight(90)
	}

	override def onScannedRobot(event: ScannedRobotEvent) {
		println(event.toString)
	}
}
