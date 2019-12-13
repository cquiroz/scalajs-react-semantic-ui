package react.semanticui.elements

import react.common.EnumValueB

package button {
  sealed trait ButtonAnimated extends Product with Serializable
  object ButtonAnimated {
    implicit val enum: EnumValueB[ButtonAnimated] = EnumValueB.toLowerCaseStringT(Animated)
    case object Animated extends ButtonAnimated
    case object Fade extends ButtonAnimated
    case object Vertical extends ButtonAnimated
  }

  sealed trait ButtonAttached extends Product with Serializable
  object ButtonAttached {
    implicit val enum: EnumValueB[ButtonAttached] = EnumValueB.toLowerCaseStringT(Attached)
    case object Attached extends ButtonAttached
    case object Top extends ButtonAttached
    case object Bottom extends ButtonAttached
    case object Right extends ButtonAttached
    case object Left extends ButtonAttached
  }
}

package object button
