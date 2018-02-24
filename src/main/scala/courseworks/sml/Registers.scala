package courseworks.sml

/**
  * This class ....
  * <p>
  * An instance contains 32 registers and methods to access and change them
  *
  * @author someone
  */
case class Registers(size: Int) {
  val registers: Array[Int] = new Array(size)

  override def toString: String =
    registers.mkString(" ")

  // Set register i to v.
  // Precondition: 0 <= i <= NUMBEROFREGISTERS

  def update(k: Int, v: Int): Unit = registers(k) = v

  def apply(k: Int): Int = registers(k)
}