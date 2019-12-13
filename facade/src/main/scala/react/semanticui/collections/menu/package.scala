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

  sealed trait MenuAttached extends Product with Serializable
  object MenuAttached {
    implicit val enum: EnumValueB[MenuAttached] = EnumValueB.toLowerCaseStringT(Attached)

    case object Attached extends MenuAttached
    case object Top extends MenuAttached
    case object Bottom extends MenuAttached
  }

  sealed trait MenuFloated extends Product with Serializable
  object MenuFloated {
    implicit val enum: EnumValueB[MenuFloated] = EnumValueB.toLowerCaseStringT(Floated)

    case object Floated extends MenuFloated
    case object Right extends MenuFloated
  }

  sealed trait MenuFixed extends Product with Serializable
  object MenuFixed {
    implicit val enum: EnumValue[MenuFixed] = EnumValue.toLowerCaseString

    case object Left extends MenuFixed
    case object Right extends MenuFixed
    case object Bottom extends MenuFixed
    case object Top extends MenuFixed
  }

  sealed trait MenuItemPosition extends Product with Serializable
  object MenuItemPosition {
    implicit val enum: EnumValue[MenuItemPosition] = EnumValue.toLowerCaseString

    case object Left extends MenuItemPosition
    case object Right extends MenuItemPosition
  }

  sealed trait MenuIcon extends Product with Serializable
  object MenuIcon {
    implicit val enum: EnumValueB[MenuIcon] = EnumValueB.toLowerCaseStringT(Icon)

    case object Icon extends MenuIcon
    case object Labeled extends MenuIcon
  }

  sealed trait MenuTabular extends Product with Serializable
  object MenuTabular {
    implicit val enum: EnumValueB[MenuTabular] = EnumValueB.toLowerCaseStringT(Tabular)

    case object Tabular extends MenuTabular
    case object Right extends MenuTabular
  }
}

package object menu
