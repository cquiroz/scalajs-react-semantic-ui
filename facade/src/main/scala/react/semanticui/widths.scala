package react.semanticui

import react.common.EnumValue

trait Widths {
  sealed trait SemanticWidth extends Product with Serializable
  object SemanticWidth {
    implicit val enum: EnumValue[SemanticWidth] = EnumValue.toLowerCaseString
    case object One      extends SemanticWidth
    case object Two      extends SemanticWidth
    case object Three    extends SemanticWidth
    case object Four     extends SemanticWidth
    case object Five     extends SemanticWidth
    case object Six      extends SemanticWidth
    case object Seven    extends SemanticWidth
    case object Eight    extends SemanticWidth
    case object Nine     extends SemanticWidth
    case object Ten      extends SemanticWidth
    case object Eleven   extends SemanticWidth
    case object Twelve   extends SemanticWidth
    case object Thirteen extends SemanticWidth
    case object Fourteen extends SemanticWidth
    case object Fifteen  extends SemanticWidth
    case object Sixteen  extends SemanticWidth
  }

}

object Widths extends Widths {

  val allWidths: Map[Int, SemanticWidth] =
    Map(
      1  -> SemanticWidth.One,
      2  -> SemanticWidth.Two,
      3  -> SemanticWidth.Three,
      4  -> SemanticWidth.Four,
      5  -> SemanticWidth.Five,
      6  -> SemanticWidth.Six,
      7  -> SemanticWidth.Seven,
      8  -> SemanticWidth.Eight,
      9  -> SemanticWidth.Nine,
      10 -> SemanticWidth.Ten,
      11 -> SemanticWidth.Eleven,
      12 -> SemanticWidth.Twelve,
      13 -> SemanticWidth.Thirteen,
      14 -> SemanticWidth.Fourteen,
      15 -> SemanticWidth.Fifteen,
      16 -> SemanticWidth.Sixteen
    )
}
