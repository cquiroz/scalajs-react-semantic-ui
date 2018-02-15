package react.semanticui.elements

import react.semanticui.sizes._

package object icon extends SemanticIcons {
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
        size = if (s == Medium) "" else s.name))

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
  }
}
