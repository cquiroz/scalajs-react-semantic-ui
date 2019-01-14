package react.semanticui.collections

import react.common.EnumValueB

package menu {
  sealed trait MenuItemFitted extends Product with Serializable
  object MenuItemFitted {
    implicit val enum: EnumValueB[MenuItemFitted] = EnumValueB.toLowerCaseStringT(Fitted)

    case object Fitted extends MenuItemFitted
    case object Horizontally extends MenuItemFitted
    case object Vertically extends MenuItemFitted
  }

}

package object menu
