package designpatterns.creational.builder.mutable

case class Car(var carType: String) {
  private var bodyStyle: String = _
  private var power: String = _
  private var engine: String = _
  private var breaks: String = _
  private var seats: String = _
  private var windows: String = _
  private var fuelType: String = _


  def getBodyStyle: String = bodyStyle

  def setBodyStyle(bodyStyle: String) {
    this.bodyStyle = bodyStyle
  }

  def getPower: String = power

  def setPower(power: String) {
    this.power = power
  }

  def getEngine: String = engine

  def setEngine(engine: String) {
    this.engine = engine
  }

  def getBreaks: String = breaks

  def setBreaks(breaks: String) {
    this.breaks = breaks
  }

  def getSeats: String = seats

  def setSeats(seats: String) {
    this.seats = seats
  }

  def getWindows: String = windows

  def setWindows(windows: String) {
    this.windows = windows
  }

  def getFuelType: String = fuelType

  def setFuelType(fuelType: String) {
    this.fuelType = fuelType
  }

  override def toString: String = {
    val sb: StringBuilder = new StringBuilder
    sb.append("--------------" + carType + "--------------------- \n")
    sb.append(" Body: ")
    sb.append(bodyStyle)
    sb.append("\n Power: ")
    sb.append(power)
    sb.append("\n Engine: ")
    sb.append(engine)
    sb.append("\n Breaks: ")
    sb.append(breaks)
    sb.append("\n Seats: ")
    sb.append(seats)
    sb.append("\n Windows: ")
    sb.append(windows)
    sb.append("\n Fuel Type: ")
    sb.append(fuelType)
    sb.toString
  }
}
