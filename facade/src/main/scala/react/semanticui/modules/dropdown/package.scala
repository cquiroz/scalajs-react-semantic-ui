package react.semanticui.modules

import react.common.EnumValue

package dropdown {
  sealed trait MenuDirection extends Product with Serializable
  object MenuDirection {
    implicit val enum: EnumValue[MenuDirection] = EnumValue.toLowerCaseString
    case object Left extends MenuDirection
    case object Right extends MenuDirection
  }

}

package object dropdown
