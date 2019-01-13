package react.semanticui.elements

import react.common._
import react.common.syntax._
import react.semanticui.sizes._
import react.semanticui.sizes
import react.semanticui.colors._
import scala.scalajs.js

package icon {
  sealed trait IconFlip extends Product with Serializable
  object IconFlip {
    implicit val enum: EnumValue[IconFlip] = EnumValue.toLowerCaseString

    case object Horizontally extends IconFlip
    case object Vertically extends IconFlip
  }

  sealed trait IconRotated extends Product with Serializable
  object IconRotated {
    implicit val enum: EnumValue[IconRotated] = EnumValue.toLowerCaseString
    case object Clockwise extends IconRotated
    case object CounterClockwise extends IconRotated
  }

}

package object icon {

  type UnmountedIcon = japgolly.scalajs.react.component.Js.UnmountedMapped[
    japgolly.scalajs.react.internal.Effect.Id,
    Icon.IconProps,
    Null,
    japgolly.scalajs.react.component.Js.RawMounted[Icon.IconProps, Null],
    Icon.IconProps,
    Null]

  implicit class CopyIconOps(val i: UnmountedIcon) extends AnyVal {

    def copy: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def size(s: SemanticSize): UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size =
            if (s == sizes.Medium) js.undefined
            else s.toJs
        ))

    def color(s: SemanticColor): UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = s.toJs,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def flipped(s: IconFlip): UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = s.toJs,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def rotated(s: IconRotated): UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = s.toJs,
          size      = i.props.size
        ))

    def bordered: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = true,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def circular: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = true,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def className(c: String): UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = c,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def corner: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = true,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def disabled: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = true,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def fitted: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = true,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def inverted: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = true,
          link      = i.props.link,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def link: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = true,
          loading   = i.props.loading,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

    def loading: UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = i.props.color,
          corner    = i.props.corner,
          disabled  = i.props.disabled,
          fitted    = i.props.fitted,
          flipped   = i.props.flipped,
          inverted  = i.props.inverted,
          link      = i.props.link,
          loading   = true,
          name      = i.props.name,
          rotated   = i.props.rotated,
          size      = i.props.size
        ))

  }
}
