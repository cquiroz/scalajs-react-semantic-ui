package react.semanticui.elements

import react.semanticui.sizes._
import react.semanticui.sizes
import react.semanticui.colors._
import scala.scalajs.js

package icon {
  sealed trait IconFlip {
    val value: String
  }
  object IconFlip {
    case object Horizontally extends IconFlip {
      val value = "horizontally"
    }
    case object Vertically extends IconFlip {
      val value = "vertically"
    }
  }

  sealed trait IconRotated {
    val value: String
  }
  object IconRotated {
    case object Clockwise extends IconRotated {
      val value = "clockwise"
    }
    case object CounterClockwise extends IconRotated {
      val value = "counterclockwise"
    }
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
            else s.value
        ))

    def color(s: SemanticColor): UnmountedIcon =
      Icon(
        Icon.rawprops(
          as        = i.props.as,
          bordered  = i.props.bordered,
          circular  = i.props.circular,
          className = i.props.className,
          color     = s.value,
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
          flipped   = s.value,
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
          rotated   = s.value,
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
