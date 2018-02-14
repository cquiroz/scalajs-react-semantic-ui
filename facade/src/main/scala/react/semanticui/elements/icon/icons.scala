package react.semanticui

import react.semanticui.elements.icon.Icon

trait SemanticIcons {
  sealed trait SemanticIcon {
    val name: String
  }
  val Search = Icon(Icon.props(name = "search"))
  val MailOutline = Icon(Icon.props(name = "mail outline"))
  val Signal = Icon(Icon.props(name = "signal"))
  val Setting = Icon(Icon.props(name = "setting"))
  val Home = Icon(Icon.props(name = "home"))
  val Inbox = Icon(Icon.props(name = "inbox"))
  val Browser = Icon(Icon.props(name = "browser"))

  case object Tag extends SemanticIcon {
    val name = "tag"
  }
  case object Tags extends SemanticIcon {
    val name = "tags"
  }
  case object Image extends SemanticIcon {
    val name = "image"
  }
  case object Calendar extends SemanticIcon {
    val name = "calendar"
  }
  case object Comment extends SemanticIcon {
    val name = "comment"
  }
  case object Shop extends SemanticIcon {
    val name = "shop"
  }
  case object Comments extends SemanticIcon {
    val name = "comments"
  }
  case object External extends SemanticIcon {
    val name = "external"
  }
  case object Privacy extends SemanticIcon {
    val name = "privacy"
  }
  case object Settings extends SemanticIcon {
    val name = "settings"
  }

  case object Trophy extends SemanticIcon {
    val name = "trophy"
  }
  case object Payment extends SemanticIcon {
    val name = "payment"
  }
  case object Feed extends SemanticIcon {
    val name = "feed"
  }
  case object AlarmOutline extends SemanticIcon {
    val name = "alarm outline"
  }
  case object Tasks extends SemanticIcon {
    val name = "tasks"
  }
  case object Cloud extends SemanticIcon {
    val name = "cloud"
  }
  case object Lab extends SemanticIcon {
    val name = "lab"
  }
  case object Mail extends SemanticIcon {
    val name = "mail"
  }
  case object Dashboard extends SemanticIcon {
    val name = "dashboard"
  }
  case object CommentOutline extends SemanticIcon {
    val name = "comment outline"
  }

  case object CommentsOutline extends SemanticIcon {
    val name = "comments outline"
  }
  case object Sitemap extends SemanticIcon {
    val name = "sitemap"
  }
  case object Idea extends SemanticIcon {
    val name = "idea"
  }
  case object Alarm extends SemanticIcon {
    val name = "alarm"
  }
  case object Terminal extends SemanticIcon {
    val name = "terminal"
  }
  case object Code extends SemanticIcon {
    val name = "code"
  }
  case object Protect extends SemanticIcon {
    val name = "protect"
  }
  case object CalendarOutline extends SemanticIcon {
    val name = "calendar outline"
  }
  case object Ticket extends SemanticIcon {
    val name = "ticket"
  }

  case object ExternalSquare extends SemanticIcon {
    val name = "external square"
  }
  case object Bug extends SemanticIcon {
    val name = "bug"
  }
  case object MailSquare extends SemanticIcon {
    val name = "mail square"
  }
  case object History extends SemanticIcon {
    val name = "history"
  }
  case object Options extends SemanticIcon {
    val name = "options"
  }
  case object TextTelephone extends SemanticIcon {
    val name = "text telephone"
  }
  case object Find extends SemanticIcon {
    val name = "find"
  }
  case object Wifi extends SemanticIcon {
    val name = "wifi"
  }
  case object AlarmMute extends SemanticIcon {
    val name = "alarm mute"
  }

  case object AlarmMuteOutline extends SemanticIcon {
    val name = "alarm mute outline"
  }
  case object Copyright extends SemanticIcon {
    val name = "copyright"
  }
  case object At extends SemanticIcon {
    val name = "at"
  }
  case object Eyedropper extends SemanticIcon {
    val name = "eyedropper"
  }
  case object PaintBrush extends SemanticIcon {
    val name = "paint brush"
  }
  case object Heartbeat extends SemanticIcon {
    val name = "heartbeat"
  }
  case object MousePointer extends SemanticIcon {
    val name = "mouse pointer"
  }

  case object HourglassEmpty extends SemanticIcon {
    val name = "hourglass empty"
  }
  case object HourglassStart extends SemanticIcon {
    val name = "hourglass start"
  }
  case object HourglassHalf extends SemanticIcon {
    val name = "hourglass half"
  }
  case object HourglassEnd extends SemanticIcon {
    val name = "hourglass end"
  }
  case object HourglassFull extends SemanticIcon {
    val name = "hourglass full"
  }
  case object HandPointer extends SemanticIcon {
    val name = "hand pointer"
  }

  case object Trademark extends SemanticIcon {
    val name = "trademark"
  }
  case object Registered extends SemanticIcon {
    val name = "registered"
  }
  case object CreativeCommons extends SemanticIcon {
    val name = "creative commons"
  }
  case object AddToCalendar extends SemanticIcon {
    val name = "add to calendar"
  }
  case object RemoveFromCalendar extends SemanticIcon {
    val name = "remove from calendar"
  }
  case object DeleteCalendar extends SemanticIcon {
    val name = "delete calendar"
  }

  case object CheckedCalendar extends SemanticIcon {
    val name = "checked calendar"
  }
  case object Industry extends SemanticIcon {
    val name = "industry"
  }
  case object ShoppingBag extends SemanticIcon {
    val name = "shopping bag"
  }
  case object ShoppingBasket extends SemanticIcon {
    val name = "shopping basket"
  }
  case object Hashtag extends SemanticIcon {
    val name = "hashtag"
  }
  case object Percent extends SemanticIcon {
    val name = "percent"
  }
  case object AddressBook extends SemanticIcon {
    val name = "address book"
  }

  case object AddressBookOutline extends SemanticIcon {
    val name = "address book outline"
  }
  case object AddressCard extends SemanticIcon {
    val name = "address card"
  }
  case object AddressCardOutline extends SemanticIcon {
    val name = "address card outline"
  }
  case object IdBadge extends SemanticIcon {
    val name = "id badge"
  }
  case object IdCard extends SemanticIcon {
    val name = "id card"
  }
  case object IdCardOutline extends SemanticIcon {
    val name = "id card outline"
  }

  case object Podcast extends SemanticIcon {
    val name = "podcast"
  }
  case object WindowClose extends SemanticIcon {
    val name = "window close"
  }
  case object WindowCloseOutline extends SemanticIcon {
    val name = "window close outline"
  }
  case object WindowMaximize extends SemanticIcon {
    val name = "window maximize"
  }
  case object WindowMinimize extends SemanticIcon {
    val name = "window minimize"
  }
  case object WindowRestore extends SemanticIcon {
    val name = "window restore"
  }

  case object Wait extends SemanticIcon {
    val name = "wait"
  }
  case object Download extends SemanticIcon {
    val name = "download"
  }
  case object Repeat extends SemanticIcon {
    val name = "repeat"
  }
  case object Refresh extends SemanticIcon {
    val name = "refresh"
  }
  case object Lock extends SemanticIcon {
    val name = "lock"
  }
  case object Bookmark extends SemanticIcon {
    val name = "bookmark"
  }
  case object Print extends SemanticIcon {
    val name = "print"
  }
  case object Write extends SemanticIcon {
    val name = "write"
  }
  case object Adjust extends SemanticIcon {
    val name = "adjust"
  }
  case object Theme extends SemanticIcon {
    val name = "theme"
  }
  case object Edit extends SemanticIcon {
    val name = "edit"
  }

  case object ExternalShare extends SemanticIcon {
    val name = "external share"
  }
  case object Ban extends SemanticIcon {
    val name = "ban"
  }
  case object MailForward extends SemanticIcon {
    val name = "mail forward"
  }
  case object Share extends SemanticIcon {
    val name = "share"
  }
  case object Expand extends SemanticIcon {
    val name = "expand"
  }
  case object Compress extends SemanticIcon {
    val name = "compress"
  }
  case object Unhide extends SemanticIcon {
    val name = "unhide"
  }
  case object Hide extends SemanticIcon {
    val name = "hide"
  }
  case object Random extends SemanticIcon {
    val name = "random"
  }
  case object Retweet extends SemanticIcon {
    val name = "retweet"
  }

  case object SignOut extends SemanticIcon {
    val name = "sign out"
  }
  case object Pin extends SemanticIcon {
    val name = "pin"
  }
  case object SignIn extends SemanticIcon {
    val name = "sign in"
  }
  case object Upload extends SemanticIcon {
    val name = "upload"
  }
  case object Call extends SemanticIcon {
    val name = "call"
  }
  case object RemoveBookmark extends SemanticIcon {
    val name = "remove bookmark"
  }
  case object CallSquare extends SemanticIcon {
    val name = "call square"
  }
  case object Unlock extends SemanticIcon {
    val name = "unlock"
  }
  case object Configure extends SemanticIcon {
    val name = "configure"
  }

  case object Filter extends SemanticIcon {
    val name = "filter"
  }
  case object Wizard extends SemanticIcon {
    val name = "wizard"
  }
  case object Undo extends SemanticIcon {
    val name = "undo"
  }
  case object Exchange extends SemanticIcon {
    val name = "exchange"
  }
  case object CloudDownload extends SemanticIcon {
    val name = "cloud download"
  }
  case object CloudUpload extends SemanticIcon {
    val name = "cloud upload"
  }
  case object Reply extends SemanticIcon {
    val name = "reply"
  }
  case object ReplyAll extends SemanticIcon {
    val name = "reply all"
  }

  case object Erase extends SemanticIcon {
    val name = "erase"
  }
  case object UnlockAlternate extends SemanticIcon {
    val name = "unlock alternate"
  }
  case object WriteSquare extends SemanticIcon {
    val name = "write square"
  }
  case object ShareSquare extends SemanticIcon {
    val name = "share square"
  }
  case object Archive extends SemanticIcon {
    val name = "archive"
  }
  case object Translate extends SemanticIcon {
    val name = "translate"
  }
  case object Recycle extends SemanticIcon {
    val name = "recycle"
  }
  case object Send extends SemanticIcon {
    val name = "send"
  }

  case object SendOutline extends SemanticIcon {
    val name = "send outline"
  }
  case object ShareAlternate extends SemanticIcon {
    val name = "share alternate"
  }
  case object ShareAlternateSquare extends SemanticIcon {
    val name = "share alternate square"
  }
  case object AddToCart extends SemanticIcon {
    val name = "add to cart"
  }
  case object InCart extends SemanticIcon {
    val name = "in cart"
  }
  case object AddUser extends SemanticIcon {
    val name = "add user"
  }
  case object RemoveUser extends SemanticIcon {
    val name = "remove user"
  }
}

package object icons extends SemanticIcons
// 'object group' | 'object ungroup' | 'clone' | 'talk' | 'talk outline' | 'help circle' | 'info circle' |
// 'warning circle' | 'warning sign' | 'announcement' | 'help' | 'info' | 'warning' | 'birthday' | 'help circle outline' |
// 'user' | 'users' | 'doctor' | 'handicap' | 'student' | 'child' | 'spy' | 'user circle' | 'user circle outline' |
// 'user outline' | 'female' | 'male' | 'woman' | 'man' | 'non binary transgender' | 'intergender' | 'transgender' |
// 'lesbian' | 'gay' | 'heterosexual' | 'other gender' | 'other gender vertical' | 'other gender horizontal' |
// 'neuter' | 'genderless' | 'universal access' | 'wheelchair' | 'blind' | 'audio description' | 'volume control phone' |
// 'braille' | 'asl' | 'assistive listening systems' | 'deafness' | 'sign language' | 'low vision' |
// 'block layout' | 'grid layout' | 'list layout' | 'zoom' | 'zoom out' | 'resize vertical' | 'resize horizontal' |
// 'maximize' | 'crop' | 'cocktail' | 'road' | 'flag' | 'book' | 'gift' | 'leaf' | 'fire' | 'plane' | 'magnet' | 'lemon' |
// 'world' | 'travel' | 'shipping' | 'money' | 'legal' | 'lightning' | 'umbrella' | 'treatment' | 'suitcase' | 'bar' |
// 'flag outline' | 'flag checkered' | 'puzzle' | 'fire extinguisher' | 'rocket' | 'anchor' | 'bullseye' | 'sun' | 'moon' |
// 'fax' | 'life ring' | 'bomb' | 'soccer' | 'calculator' | 'diamond' | 'sticky note' | 'sticky note outline' | 'law' |
// 'hand peace' | 'hand rock' | 'hand paper' | 'hand scissors' | 'hand lizard' | 'hand spock' |
// 'tv' | 'thermometer empty' | 'thermometer full' | 'thermometer half' | 'thermometer quarter' |
// 'thermometer three quarters' | 'bath' | 'snowflake outline' | 'crosshairs' | 'asterisk' | 'square outline' |
// 'certificate' | 'square' | 'quote left' | 'quote right' | 'spinner' | 'circle' | 'ellipsis horizontal' |
// 'ellipsis vertical' | 'cube' | 'cubes' | 'circle notched' | 'circle thin' | 'checkmark' | 'remove' | 'checkmark box' |
// 'move' | 'add circle' | 'minus circle' | 'remove circle' | 'check circle' | 'remove circle outline' |
// 'check circle outline' | 'plus' | 'minus' | 'add square' | 'radio' | 'minus square' | 'minus square outline' |
// 'check square' | 'selected radio' | 'plus square outline' | 'toggle off' | 'toggle on' | 'film' |
// 'sound' | 'photo' | 'bar chart' | 'camera retro' | 'newspaper' | 'area chart' | 'pie chart' | 'line chart' |
// 'arrow circle outline down' | 'arrow circle outline up' | 'chevron left' | 'chevron right' | 'arrow left' |
// 'arrow right' | 'arrow up' | 'arrow down' | 'chevron up' | 'chevron down' | 'pointing right' | 'pointing left' |
// 'pointing up' | 'pointing down' | 'arrow circle left' | 'arrow circle right' | 'arrow circle up' | 'arrow circle down' |
// 'caret down' | 'caret up' | 'caret left' | 'caret right' | 'angle double left' | 'angle double right' | 'angle double up' |
// 'angle double down' | 'angle left' | 'angle right' | 'angle up' | 'angle down' | 'chevron circle left' |
// 'chevron circle right' | 'chevron circle up' | 'chevron circle down' | 'toggle down' | 'toggle up' |
// 'toggle right' | 'long arrow down' | 'long arrow up' | 'long arrow left' | 'long arrow right' |
// 'arrow circle outline right' | 'arrow circle outline left' | 'toggle left' | 'tablet' | 'mobile' | 'battery full' |
// 'battery high' | 'battery medium' | 'battery low' | 'battery empty' | 'power' | 'trash outline' | 'disk outline' |
// 'desktop' | 'laptop' | 'game' | 'keyboard' | 'plug' | 'trash' | 'file outline' | 'folder' | 'folder open' |
// 'file text outline' | 'folder outline' | 'folder open outline' | 'level up' | 'level down' | 'file' |
// 'file text' | 'file pdf outline' | 'file word outline' | 'file excel outline' | 'file powerpoint outline' |
// 'file image outline' | 'file archive outline' | 'file audio outline' | 'file video outline' | 'file code outline' |
// 'qrcode' | 'barcode' | 'rss' | 'fork' | 'html5' | 'css3' | 'rss square' | 'openid' | 'database' |
// 'server' | 'usb' | 'bluetooth' | 'bluetooth alternative' | 'microchip' | 'heart' | 'star' | 'empty star' |
// 'thumbs outline up' | 'thumbs outline down' | 'star half' | 'empty heart' | 'smile' | 'frown' | 'meh' |
// 'star half empty' | 'thumbs up' | 'thumbs down' | 'music' | 'video play outline' | 'volume off' | 'volume down' |
// 'volume up' | 'record' | 'step backward' | 'fast backward' | 'backward' | 'play' | 'pause' | 'stop' | 'forward' |
// 'fast forward' | 'step forward' | 'eject' | 'unmute' | 'mute' | 'video play' | 'closed captioning' | 'pause circle' |
// 'pause circle outline' | 'stop circle' | 'stop circle outline' | 'marker' | 'coffee' | 'food' | 'building outline' |
// 'hospital' | 'emergency' | 'first aid' | 'military' | 'h' | 'location arrow' | 'compass' | 'space shuttle' |
// 'university' | 'building' | 'paw' | 'spoon' | 'car' | 'taxi' | 'tree' | 'bicycle' | 'bus' | 'ship' | 'motorcycle' |
// 'street view' | 'hotel' | 'train' | 'subway' | 'map pin' | 'map signs' | 'map outline' | 'map' | 'table' | 'columns' |
// 'sort' | 'sort descending' | 'sort ascending' | 'sort alphabet ascending' | 'sort alphabet descending' |
// 'sort content ascending' | 'sort content descending' | 'sort numeric ascending' | 'sort numeric descending' |
// 'font' | 'bold' | 'italic' | 'text height' | 'text width' | 'align left' | 'align center' | 'align right' |
// 'align justify' | 'list' | 'outdent' | 'indent' | 'linkify' | 'cut' | 'copy' | 'attach' | 'save' | 'content' |
// 'unordered list' | 'ordered list' | 'strikethrough' | 'underline' | 'paste' | 'unlinkify' | 'superscript' |
// 'subscript' | 'header' | 'paragraph' | 'text cursor' | 'euro' | 'pound' | 'dollar' | 'rupee' | 'yen' | 'ruble' |
// 'won' | 'bitcoin' | 'lira' | 'shekel' | 'paypal' | 'google wallet' | 'visa' | 'mastercard' | 'discover' |
// 'american express' | 'paypal card' | 'stripe' | 'japan credit bureau' | 'diners club' |
// 'credit card alternative' | 'twitter square' | 'facebook square' | 'linkedin square' | 'github square' |
// 'twitter' | 'facebook f' | 'github' | 'pinterest' | 'pinterest square' | 'google plus square' | 'google plus' |
// 'linkedin' | 'github alternate' | 'maxcdn' | 'youtube square' | 'youtube' | 'xing' | 'xing square' | 'youtube play' |
// 'dropbox' | 'stack overflow' | 'instagram' | 'flickr' | 'adn' | 'bitbucket' | 'bitbucket square' | 'tumblr' |
// 'tumblr square' | 'apple' | 'windows' | 'android' | 'linux' | 'dribble' | 'skype' | 'foursquare' | 'trello' |
// 'gittip' | 'vk' | 'weibo' | 'renren' | 'pagelines' | 'stack exchange' | 'vimeo square' | 'slack' | 'wordpress' |
// 'yahoo' | 'google' | 'reddit' | 'reddit square' | 'stumbleupon circle' | 'stumbleupon' | 'delicious' |
// 'digg' | 'pied piper' | 'pied piper alternate' | 'drupal' | 'joomla' | 'behance' | 'behance square' | 'steam' |
// 'steam square' | 'spotify' | 'deviantart' | 'soundcloud' | 'vine' | 'codepen' | 'jsfiddle' | 'rebel' | 'empire' |
// 'git square' | 'git' | 'hacker news' | 'tencent weibo' | 'qq' | 'wechat' | 'slideshare' | 'twitch' | 'yelp' |
// 'lastfm' | 'lastfm square' | 'ioxhost' | 'angellist' | 'meanpath' | 'buysellads' | 'connectdevelop' | 'dashcube' |
// 'forumbee' | 'leanpub' | 'sellsy' | 'shirtsinbulk' | 'simplybuilt' | 'skyatlas' | 'facebook' | 'whatsapp' | 'viacoin' |
// 'medium' | 'y combinator' | 'optinmonster' | 'opencart' | 'expeditedssl' | 'gg' | 'gg circle' | 'tripadvisor' |
// 'odnoklassniki' | 'odnoklassniki square' | 'pocket' | 'wikipedia' | 'safari' | 'chrome' | 'firefox' |
// 'opera' | 'internet explorer' | 'contao' | '500px' | 'amazon' | 'houzz' | 'vimeo' | 'black tie' | 'fonticons' |
// 'reddit alien' | 'microsoft edge' | 'codiepie' | 'modx' | 'fort awesome' | 'product hunt' | 'mixcloud' | 'scribd' |
// 'gitlab' | 'wpbeginner' | 'wpforms' | 'envira gallery' | 'glide' | 'glide g' | 'viadeo' | 'viadeo square' |
// 'snapchat' | 'snapchat ghost' | 'snapchat square' | 'pied piper hat' | 'first order' | 'yoast' | 'themeisle' |
// 'google plus circle' | 'font awesome' | 'bandcamp' | 'eercast' | 'etsy' | 'free code camp' | 'grav' | 'imdb' |
// 'linode' | 'meetup' | 'quora' | 'ravelry' | 'superpowers' | 'telegram' | 'wpexplorer' | 'like' | 'favorite' |
// 'video' | 'check' | 'close' | 'cancel' | 'delete' | 'x' | 'zoom in' | 'magnify' | 'shutdown' | 'clock' | 'time' |
// 'play circle outline' | 'headphone' | 'camera' | 'video camera' | 'picture' | 'pencil' | 'compose' | 'point' |
// 'tint' | 'signup' | 'plus circle' | 'question circle' | 'dont' | 'minimize' | 'add' | 'exclamation circle' |
// 'attention' | 'eye' | 'exclamation triangle' | 'shuffle' | 'chat' | 'cart' | 'shopping cart' | 'bar graph' |
// 'key' | 'cogs' | 'discussions' | 'like outline' | 'dislike outline' | 'heart outline' | 'log out' | 'thumb tack' |
// 'winner' | 'phone' | 'bookmark outline' | 'phone square' | 'credit card' | 'hdd outline' | 'bullhorn' |
// 'bell outline' | 'hand outline right' | 'hand outline left' | 'hand outline up' | 'hand outline down' |
// 'globe' | 'wrench' | 'briefcase' | 'group' | 'chain' | 'flask' | 'sidebar' | 'bars' | 'list ul' | 'list ol' |
// 'numbered list' | 'magic' | 'truck' | 'currency' | 'triangle down' | 'dropdown' | 'triangle up' | 'triangle left' |
// 'triangle right' | 'envelope' | 'conversation' | 'rain' | 'clipboard' | 'lightbulb' | 'bell' | 'ambulance' |
// 'medkit' | 'fighter jet' | 'beer' | 'plus square' | 'computer' | 'circle outline' | 'gamepad' | 'star half full' |
// 'broken chain' | 'question' | 'exclamation' | 'eraser' | 'microphone' | 'microphone slash' | 'shield' | 'target' |
// 'play circle' | 'pencil square' | 'eur' | 'gbp' | 'usd' | 'inr' | 'cny' | 'rmb' | 'jpy' | 'rouble' | 'rub' |
// 'krw' | 'btc' | 'gratipay' | 'zip' | 'dot circle outline' | 'try' | 'graduation' | 'sliders' | 'weixin' | 'tty' |
// 'teletype' | 'binoculars' | 'power cord' | 'visa card' | 'mastercard card' | 'discover card' | 'amex' |
// 'american express card' | 'stripe card' | 'bell slash' | 'bell slash outline' | 'area graph' | 'pie graph' |
// 'line graph' | 'cc' | 'sheqel' | 'ils' | 'plus cart' | 'arrow down cart' | 'detective' | 'venus' | 'mars' |
// 'mercury' | 'intersex' | 'venus double' | 'female homosexual' | 'mars double' | 'male homosexual' | 'venus mars' |
// 'mars stroke' | 'mars alternate' | 'mars vertical' | 'mars stroke vertical' | 'mars horizontal' |
// 'mars stroke horizontal' | 'asexual' | 'facebook official' | 'user plus' | 'user times' | 'user close' |
// 'user cancel' | 'user delete' | 'user x' | 'bed' | 'yc' | 'ycombinator' | 'battery four' | 'battery three' |
// 'battery three quarters' | 'battery two' | 'battery half' | 'battery one' | 'battery quarter' | 'battery zero' |
// 'i cursor' | 'jcb' | 'japan credit bureau card' | 'diners club card' | 'balance' | 'hourglass outline' |
// 'hourglass zero' | 'hourglass one' | 'hourglass two' | 'hourglass three' | 'hourglass four' | 'grab' |
// 'hand victory' | 'tm' | 'r circle' | 'television' | 'five hundred pixels' | 'calendar plus' | 'calendar minus' |
// 'calendar times' | 'calendar check' | 'factory' | 'commenting' | 'commenting outline' | 'edge' | 'ms edge' |
// 'wordpress beginner' | 'wordpress forms' | 'envira' | 'question circle outline' | 'assistive listening devices' |
// 'als' | 'ald' | 'asl interpreting' | 'deaf' | 'american sign language interpreting' | 'hard of hearing' |
// 'signing' | 'new pied piper' | 'theme isle' | 'google plus official' | 'fa' | 'bathtub' | 'drivers license' |
// 'drivers license outline' | 's15' | 'thermometer' | 'times rectangle' | 'times rectangle outline' | 'vcard' |
// 'vcard outline' | 'left dropdown';
