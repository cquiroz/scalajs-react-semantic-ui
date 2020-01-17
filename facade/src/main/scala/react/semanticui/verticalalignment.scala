package react.semanticui

import react.common.EnumValue

trait VerticalAlignment {
  sealed trait SemanticVerticalAlignment extends Product with Serializable
  object SemanticVerticalAlignment {
    implicit val enum: EnumValue[SemanticVerticalAlignment] = EnumValue.toLowerCaseString
    case object Bottom extends SemanticVerticalAlignment
    case object Middle extends SemanticVerticalAlignment
    case object Top extends SemanticVerticalAlignment
  }
}

object VerticalAlignment extends VerticalAlignment
