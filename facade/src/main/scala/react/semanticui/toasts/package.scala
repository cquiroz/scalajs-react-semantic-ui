package react.semanticui

import japgolly.scalajs.react.raw.JsNumber
import japgolly.scalajs.react.Callback
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui.elements.icon.Icon.IconProps
import react.semanticui.elements.icon.Icon
import react.semanticui.sizes._
import react.semanticui.colors._
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.concurrent.duration._

package toasts {
  sealed trait ContainerPosition extends Product with Serializable
  object ContainerPosition {
    implicit val enum: EnumValue[ContainerPosition] = EnumValue.instance {
      case TopRight     => "top-right"
      case TopCenter    => "top-center"
      case TopLeft      => "top-left"
      case BottomRight  => "bottom-right"
      case BottomCenter => "bottom-center"
      case BottomLeft   => "bottom-left"
    }

    case object TopRight extends ContainerPosition
    case object TopCenter extends ContainerPosition
    case object TopLeft extends ContainerPosition
    case object BottomRight extends ContainerPosition
    case object BottomCenter extends ContainerPosition
    case object BottomLeft extends ContainerPosition
  }

  sealed trait ToastType extends Product with Serializable
  object ToastType {
    implicit val enum: EnumValue[ToastType] = EnumValue.instance {
      case Info    => "info"
      case Success => "success"
      case Warning => "warning"
      case Error   => "error"
    }

    case object Info extends ToastType
    case object Success extends ToastType
    case object Warning extends ToastType
    case object Error extends ToastType
  }

  sealed trait SemanticAnimation extends Product with Serializable
  object SemanticAnimation {
    implicit val enum: EnumValue[SemanticAnimation] = EnumValue.instance {
      case Scale          => "scale"
      case Zoom           => "zoom"
      case Fade           => "fade"
      case FadeUp         => "fade up"
      case FadeDown       => "fade down"
      case FadeLeft       => "fade left"
      case FadeRight      => "fade right"
      case HorizontalFlip => "horizontal flip"
      case VerticalFlip   => "vertical flip"
      case Drop           => "drop"
      case FlyLeft        => "fly left"
      case FlyRight       => "fly right"
      case FlyDown        => "fly down"
      case FlyUp          => "fly up"
      case SwingLeft      => "swing left"
      case SwingRight     => "swing right"
      case SwingUp        => "swing up"
      case SwingDown      => "swing down"
      case Browse         => "browse"
      case BrowseRight    => "browse right"
      case SlideDown      => "slide down"
      case SlideUp        => "slide up"
      case SlideLeft      => "slide left"
      case SlideRight     => "slide right"
      case Jiggle         => "jiggle"
      case Flash          => "flash"
      case Shake          => "shake"
      case Pulse          => "pulse"
      case Tada           => "tada"
      case Bounce         => "bounce"
      case Glow           => "glow"
    }

    case object Scale extends SemanticAnimation
    case object Zoom extends SemanticAnimation
    case object Fade extends SemanticAnimation
    case object FadeUp extends SemanticAnimation
    case object FadeDown extends SemanticAnimation
    case object FadeLeft extends SemanticAnimation
    case object FadeRight extends SemanticAnimation
    case object HorizontalFlip extends SemanticAnimation
    case object VerticalFlip extends SemanticAnimation
    case object Drop extends SemanticAnimation
    case object FlyLeft extends SemanticAnimation
    case object FlyRight extends SemanticAnimation
    case object FlyDown extends SemanticAnimation
    case object FlyUp extends SemanticAnimation
    case object SwingLeft extends SemanticAnimation
    case object SwingRight extends SemanticAnimation
    case object SwingUp extends SemanticAnimation
    case object SwingDown extends SemanticAnimation
    case object Browse extends SemanticAnimation
    case object BrowseRight extends SemanticAnimation
    case object SlideDown extends SemanticAnimation
    case object SlideUp extends SemanticAnimation
    case object SlideLeft extends SemanticAnimation
    case object SlideRight extends SemanticAnimation
    case object Jiggle extends SemanticAnimation
    case object Flash extends SemanticAnimation
    case object Shake extends SemanticAnimation
    case object Pulse extends SemanticAnimation
    case object Tada extends SemanticAnimation
    case object Bounce extends SemanticAnimation
    case object Glow extends SemanticAnimation
  }

  sealed trait Dismissal extends Product with Serializable
  object Dismissal {
    case object User extends Dismissal
    final case class On(on: FiniteDuration) extends Dismissal
  }

  @js.native
  trait ToastOptions extends js.Object {
    var title: String
    var description: js.UndefOr[String]                           = js.native
    var `type`: js.UndefOr[String]                                = js.native
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[IconProps]] = js.native
    var time: js.UndefOr[JsNumber]                                = js.native
    var animation: js.UndefOr[String]                             = js.native
    var size: js.UndefOr[suiraw.SemanticSIZES]                    = js.native
    var color: js.UndefOr[suiraw.SemanticCOLORS]                  = js.native
  }

  object ToastOptions {
    def apply(
      title:       String,
      description: js.UndefOr[String] = js.undefined,
      tpe:         js.UndefOr[ToastType] = js.undefined,
      icon:        js.UndefOr[Icon] = js.undefined,
      time:        js.UndefOr[Dismissal] = js.undefined,
      animation:   js.UndefOr[SemanticAnimation] = js.undefined,
      size:        js.UndefOr[SemanticSize] = js.undefined,
      color:       js.UndefOr[SemanticColor] = js.undefined
    ): ToastOptions = {

      val p = (new js.Object).asInstanceOf[ToastOptions]
      p.title       = title
      p.description = description
      p.`type`      = tpe.toJs
      p.icon        = icon.map(_.props)
      p.time = time.map(_ match {
        case Dismissal.User  => 0
        case Dismissal.On(t) => t.toMillis.toDouble
      })
      p.animation = animation.toJs
      p.size      = size.toJs
      p.color     = color.toJs
      p
    }
  }
}
package object toasts {
  type On               = Unit => Callback
  private type RawEvent = js.Function0[Unit]

  @js.native
  @JSImport("react-semantic-toasts", "toast")
  private object rawtoasts
      extends js.Function4[ToastOptions, js.UndefOr[RawEvent], js.UndefOr[RawEvent], js.UndefOr[
        RawEvent
      ], js.Any] {
    def apply(
      options:   ToastOptions,
      onClose:   js.UndefOr[RawEvent],
      onClick:   js.UndefOr[RawEvent],
      onDismiss: js.UndefOr[RawEvent]
    ): js.Any = js.native
  }

  def toast(
    options:   ToastOptions,
    onClose:   js.UndefOr[Callback] = js.undefined,
    onClick:   js.UndefOr[Callback] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined
  ): js.Any =
    rawtoasts(options, onClose.toJs, onClick.toJs, onDismiss.toJs)

  def toastCB(
    options:   ToastOptions,
    onClose:   js.UndefOr[Callback] = js.undefined,
    onClick:   js.UndefOr[Callback] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined
  ): Callback =
    Callback(rawtoasts(options, onClose.toJs, onClick.toJs, onDismiss.toJs))

  def toastCB(text: String): Callback =
    toastCB(ToastOptions(text))

}
