package react.semanticui.elements

import react.semanticui.sizes._
import react.semanticui.colors._

package object icon extends SemanticIcons {
  type UnmountedIcon = japgolly.scalajs.react.component.Js.UnmountedMapped[
    japgolly.scalajs.react.internal.Effect.Id,
    Icon.IconProps,
    Null,
    japgolly.scalajs.react.component.Js.RawMounted,
    Icon.IconProps,
    Null]

  implicit class CopyIconOps(val i: UnmountedIcon) extends AnyVal {
    def copy: UnmountedIcon =
      Icon(Icon.rawprops(
        as = i.props.as,
        bordered = i.props.bordered,
        circular = i.props.circular,
        className = i.props.className,
        color = i.props.color,
        corner = i.props.corner,
        disabled = i.props.disabled,
        fitted = i.props.fitted,
        flipped = i.props.flipped,
        inverted = i.props.inverted,
        link = i.props.link,
        loading = i.props.loading,
        name = i.props.name,
        rotated = i.props.rotated,
        size = i.props.size))

    def withSize(s: SemanticSize): UnmountedIcon =
      Icon(Icon.rawprops(
        as = i.props.as,
        bordered = i.props.bordered,
        circular = i.props.circular,
        className = i.props.className,
        color = i.props.color,
        corner = i.props.corner,
        disabled = i.props.disabled,
        fitted = i.props.fitted,
        flipped = i.props.flipped,
        inverted = i.props.inverted,
        link = i.props.link,
        loading = i.props.loading,
        name = i.props.name,
        rotated = i.props.rotated,
        size = if (s == Medium) "" else s.value))

    def withColor(s: SemanticColor): UnmountedIcon =
      Icon(Icon.rawprops(
        as = i.props.as,
        bordered = i.props.bordered,
        circular = i.props.circular,
        className = i.props.className,
        color = s.value,
        corner = i.props.corner,
        disabled = i.props.disabled,
        fitted = i.props.fitted,
        flipped = i.props.flipped,
        inverted = i.props.inverted,
        link = i.props.link,
        loading = i.props.loading,
        name = i.props.name,
        rotated = i.props.rotated,
        size = i.props.size))

    def flipped(s: IconFlip): UnmountedIcon =
      Icon(Icon.rawprops(
        as = i.props.as,
        bordered = i.props.bordered,
        circular = i.props.circular,
        className = i.props.className,
        color = i.props.color,
        corner = i.props.corner,
        disabled = i.props.disabled,
        fitted = i.props.fitted,
        flipped = s.value,
        inverted = i.props.inverted,
        link = i.props.link,
        loading = i.props.loading,
        name = i.props.name,
        rotated = i.props.rotated,
        size = i.props.size))

    def rotated(s: IconRotated): UnmountedIcon =
      Icon(Icon.rawprops(
        as = i.props.as,
        bordered = i.props.bordered,
        circular = i.props.circular,
        className = i.props.className,
        color = i.props.color,
        corner = i.props.corner,
        disabled = i.props.disabled,
        fitted = i.props.fitted,
        flipped = i.props.flipped,
        inverted = i.props.inverted,
        link = i.props.link,
        loading = i.props.loading,
        name = i.props.name,
        rotated = s.value,
        size = i.props.size))
  }
}
