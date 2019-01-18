package react.semanticui

import react.common.EnumValue

package verticalalignment {
  sealed trait SemanticVerticalAlignment extends Product with Serializable
  object SemanticVerticalAlignment {
    implicit val enum: EnumValue[SemanticVerticalAlignment] = EnumValue.toLowerCaseString
  }
}

package object verticalalignment {
  case object Bottom extends SemanticVerticalAlignment
  case object Middle extends SemanticVerticalAlignment
  case object Top extends SemanticVerticalAlignment
}
