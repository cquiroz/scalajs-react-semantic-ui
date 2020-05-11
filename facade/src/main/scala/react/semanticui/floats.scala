package react.semanticui

import react.common.EnumValue

trait Floats {
  sealed trait SemanticFloat extends Product with Serializable
  object SemanticFloat {
    implicit val enum: EnumValue[SemanticFloat] = EnumValue.toLowerCaseString
    case object Left  extends SemanticFloat
    case object Right extends SemanticFloat
  }
}

object Floats extends Floats
