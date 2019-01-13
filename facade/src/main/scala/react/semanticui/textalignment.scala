package react.semanticui

import react.common.EnumValue

package textalignment {
  sealed trait SemanticTextAlignment extends Product with Serializable
  object SemanticTextAlignment {
    implicit val enum: EnumValue[SemanticTextAlignment] = EnumValue.toLowerCaseString
  }
}

package object textalignment {

  case object Left extends SemanticTextAlignment
  case object Center extends SemanticTextAlignment
  case object Right extends SemanticTextAlignment
  case object Justified extends SemanticTextAlignment
}
