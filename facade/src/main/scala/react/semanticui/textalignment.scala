package react.semanticui

package textalignment {
  sealed trait SemanticTextAlignment {
    val value: String
  }
  object SemanticTextAlignment
}

package object textalignment {

  case object Left extends SemanticTextAlignment {
    val value = "left"
  }
  case object Center extends SemanticTextAlignment {
    val value = "center"
  }
  case object Right extends SemanticTextAlignment {
    val value = "right"
  }
  case object Justified extends SemanticTextAlignment {
    val value = "justified"
  }
}
