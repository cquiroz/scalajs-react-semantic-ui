package react.semanticui.elements

import react.common.EnumValueB

package image {
  sealed trait ImageSpaced extends Product with Serializable
  object ImageSpaced {
    implicit val enum: EnumValueB[ImageSpaced] = EnumValueB.toLowerCaseStringT(Spaced)
    case object Spaced extends ImageSpaced
    case object Left extends ImageSpaced
    case object Right extends ImageSpaced
  }

}

package object image {

  type UnmountedImage = japgolly.scalajs.react.component.Js.UnmountedMapped[
    japgolly.scalajs.react.internal.Effect.Id,
    Image.ImageProps,
    Null,
    japgolly.scalajs.react.component.Js.RawMounted[Image.ImageProps, Null],
    Image.ImageProps,
    Null]
}
