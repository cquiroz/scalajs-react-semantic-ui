package react.semanticui

import react.common.EnumValue

package floats {
  sealed trait SemanticFloats extends Product with Serializable
  object SemanticFloats {
    implicit val enum: EnumValue[SemanticFloats] = EnumValue.toLowerCaseString
  }
}

package object floats {
  case object Left extends SemanticFloats
  case object Right extends SemanticFloats
}
