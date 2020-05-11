package react.semanticui.modules

import react.common.EnumValue
import react.common.EnumValueB

package modal {
  sealed trait ModalDimmer extends Product with Serializable
  object ModalDimmer {
    implicit val enum: EnumValueB[ModalDimmer] = EnumValueB.toLowerCaseStringT(Dimmer)

    case object Dimmer   extends ModalDimmer
    case object Blurring extends ModalDimmer
    case object Inverted extends ModalDimmer
  }

  sealed trait ModalSize extends Product with Serializable
  object ModalSize {
    implicit val enum: EnumValue[ModalSize] = EnumValue.toLowerCaseString

    case object Mini       extends ModalSize
    case object Tiny       extends ModalSize
    case object Small      extends ModalSize
    case object Large      extends ModalSize
    case object Fullscreen extends ModalSize
  }
}

package object menu
