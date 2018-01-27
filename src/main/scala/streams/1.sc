import scala.util.Try

case class Pos(row: Int, col: Int) {
  /** The position obtained by changing the `row` coordinate by `d` */
  def deltaRow(d: Int): Pos = copy(row = row + d)

  /** The position obtained by changing the `col` coordinate by `d` */
  def deltaCol(d: Int): Pos = copy(col = col + d)
}

val level =
  """------
    |--ST--
    |--oo--
    |--oo--
    |------""".stripMargin
def terrainFunction(levelVector: Vector[Vector[Char]]): Pos => Boolean = a => Try(levelVector.apply(a.row)(a.col)).map(_ != '-').getOrElse(false)

val v = Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o'))
terrainFunction(v)(Pos(1,1))
terrainFunction(v)(Pos(2,1))