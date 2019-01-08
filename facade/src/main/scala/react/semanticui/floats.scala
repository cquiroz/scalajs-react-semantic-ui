package react.semanticui

package floats {
  sealed trait SemanticFloats {
    val value: String
  }
  object SemanticFloats
}

package object floats {
  case object Left extends SemanticFloats {
    val value = "left"
  }
  case object Right extends SemanticFloats {
    val value = "right"
  }
}
