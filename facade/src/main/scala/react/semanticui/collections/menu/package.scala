package react.semanticui.collections

import react.common.EnumValue
import react.common.EnumValueB

package menu {
  sealed trait MenuItemFitted extends Product with Serializable
  object MenuItemFitted {
    implicit val enum: EnumValueB[MenuItemFitted] = EnumValueB.toLowerCaseStringT(Fitted)

    case object Fitted extends MenuItemFitted
    case object Horizontally extends MenuItemFitted
    case object Vertically extends MenuItemFitted
  }

  sealed trait MenuMenuPosition extends Product with Serializable
  object MenuMenuPosition {
    implicit val enum: EnumValue[MenuMenuPosition] = EnumValue.toLowerCaseString

    case object Left extends MenuMenuPosition
    case object Right extends MenuMenuPosition
  }

}

package object menu
