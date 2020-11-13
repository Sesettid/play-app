
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object frequency extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Seq[WordsFrequency],AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchTerm:String)(implicit wordFrequency: Seq[WordsFrequency] , assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<html>
<head>
    <title>My search results</title>
    <link rel="stylesheet" href=""""),_display_(/*6.35*/assetsFinder/*6.47*/.path("stylesheets/css/results.css")),format.raw/*6.83*/("""">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
            table, th, td """),format.raw/*9.27*/("""{"""),format.raw/*9.28*/("""
                """),format.raw/*10.17*/("""border: 1px solid black;

            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/("""
            """),format.raw/*13.13*/("""table """),format.raw/*13.19*/("""{"""),format.raw/*13.20*/("""
                """),format.raw/*14.17*/("""border-spacing: 0px;
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""
        """),format.raw/*16.9*/("""</style>
</head>
<body>
<h1 style="margin-left: 50px">Word Frequency Statistics</h1>
<h3 style="margin-left: 50px">Search Term: """),_display_(/*20.45*/searchTerm),format.raw/*20.55*/("""</h3>

<table style="margin-left: 50px">
    <thead>
    <tr><th>Word</th><th>Freqency</th>
    </thead>
    <tbody>
    """),_display_(/*27.6*/for(w <- wordFrequency) yield /*27.29*/ {_display_(Seq[Any](format.raw/*27.31*/("""
    """),format.raw/*28.5*/("""<tr>
        <td style="text-align: center">"""),_display_(/*29.41*/w/*29.42*/.word),format.raw/*29.47*/("""</td><td style="text-align: center">"""),_display_(/*29.84*/w/*29.85*/.frequency),format.raw/*29.95*/("""</td>
    </tr>
    """)))}),format.raw/*31.6*/("""
    """),format.raw/*32.5*/("""</tbody>
</table>
</body>

</html>
"""))
      }
    }
  }

  def render(searchTerm:String,wordFrequency:Seq[WordsFrequency],assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(searchTerm)(wordFrequency,assetsFinder)

  def f:((String) => (Seq[WordsFrequency],AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (searchTerm) => (wordFrequency,assetsFinder) => apply(searchTerm)(wordFrequency,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-12T23:14:04.082864400
                  SOURCE: C:/Users/saidi/Downloads/Telegram Desktop/SOEN6441-APP/PlayWebApplication/app/views/frequency.scala.html
                  HASH: 4e6b32563a7c13d0d1154d6311db85cf6a486188
                  MATRIX: 944->1|1132->94|1162->98|1276->186|1296->198|1352->234|1498->353|1526->354|1572->372|1640->412|1669->413|1711->427|1745->433|1774->434|1820->452|1882->486|1911->487|1948->497|2108->630|2139->640|2294->769|2333->792|2373->794|2406->800|2479->846|2489->847|2515->852|2579->889|2589->890|2620->900|2673->923|2706->929
                  LINES: 27->1|32->1|34->3|37->6|37->6|37->6|40->9|40->9|41->10|43->12|43->12|44->13|44->13|44->13|45->14|46->15|46->15|47->16|51->20|51->20|58->27|58->27|58->27|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|63->32
                  -- GENERATED --
              */
          