package react.semanticui

import react.common.EnumValue

package widths {
  sealed trait SemanticWidth extends Product with Serializable
  object SemanticWidth {
    implicit val enum: EnumValue[SemanticWidth] = EnumValue.toLowerCaseString
  }
}

package object widths {
  case object One extends SemanticWidth
  case object Two extends SemanticWidth
  case object Three extends SemanticWidth
  case object Four extends SemanticWidth
  case object Five extends SemanticWidth
  case object Six extends SemanticWidth
  case object Seven extends SemanticWidth
  case object Eight extends SemanticWidth
  case object Nine extends SemanticWidth
  case object Ten extends SemanticWidth
  case object Eleven extends SemanticWidth
  case object Twelve extends SemanticWidth
  case object Thirteen extends SemanticWidth
  case object Fourteen extends SemanticWidth
  case object Fifteen extends SemanticWidth
  case object Sixteen extends SemanticWidth
}
