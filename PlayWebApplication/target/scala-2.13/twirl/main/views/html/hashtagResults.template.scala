
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

object hashtagResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[TwitterResultModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resultList: List[TwitterResultModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<html>
<head>

</head>
<body>
<div class="modal-container"></div>
<div class="container">

    <ul>
        """),_display_(/*11.10*/for(p <- resultList) yield /*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
        """),format.raw/*12.9*/("""<li > """),_display_(/*12.16*/p/*12.17*/.twitterName),format.raw/*12.29*/(""" """),format.raw/*12.30*/(""","""),_display_(/*12.32*/p/*12.33*/.tweetContent),format.raw/*12.46*/(""" """),format.raw/*12.47*/(""", """),_display_(/*12.50*/p/*12.51*/.hashTag),format.raw/*12.59*/("""> </li>
        """)))}),format.raw/*13.10*/("""
    """),format.raw/*14.5*/("""</ul>
</div>



<script>

    function goTo(url)
    """),format.raw/*22.5*/("""{"""),format.raw/*22.6*/("""
      """),format.raw/*23.7*/("""location.replace(url);
    """),format.raw/*24.5*/("""}"""),format.raw/*24.6*/("""


    """),format.raw/*27.5*/("""function getprofile() """),format.raw/*27.27*/("""{"""),format.raw/*27.28*/("""

        """),format.raw/*29.9*/("""var profile = $("#searchInput").val()

        window.location.replace("profile/");
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""

    """),format.raw/*34.5*/("""function goBack() """),format.raw/*34.23*/("""{"""),format.raw/*34.24*/("""
        """),format.raw/*35.9*/("""window.location.replace("http://localhost:9000/");
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""

        """),format.raw/*38.9*/("""function search()"""),format.raw/*38.26*/("""{"""),format.raw/*38.27*/("""
  """),format.raw/*39.3*/("""var searchText = $("#searchInput").val()

  window.location.replace(searchText);
  """),format.raw/*42.3*/("""}"""),format.raw/*42.4*/("""




    """),format.raw/*47.5*/("""</script>

</body>"""))
      }
    }
  }

  def render(resultList:List[TwitterResultModel]): play.twirl.api.HtmlFormat.Appendable = apply(resultList)

  def f:((List[TwitterResultModel]) => play.twirl.api.HtmlFormat.Appendable) = (resultList) => apply(resultList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-12T23:14:04.096764
                  SOURCE: C:/Users/saidi/Downloads/Telegram Desktop/SOEN6441-APP/PlayWebApplication/app/views/hashtagResults.scala.html
                  HASH: f4004d83239d0c04ac1cad4a1fa13aef09b5ec53
                  MATRIX: 934->1|1067->39|1095->41|1240->159|1276->179|1316->181|1353->191|1387->198|1397->199|1430->211|1459->212|1488->214|1498->215|1532->228|1561->229|1591->232|1601->233|1630->241|1679->259|1712->265|1800->326|1828->327|1863->335|1918->363|1946->364|1983->374|2033->396|2062->397|2101->409|2223->504|2252->505|2287->513|2333->531|2362->532|2399->542|2486->602|2515->603|2554->615|2599->632|2628->633|2659->637|2772->723|2800->724|2841->738
                  LINES: 27->1|32->1|33->2|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|45->14|53->22|53->22|54->23|55->24|55->24|58->27|58->27|58->27|60->29|63->32|63->32|65->34|65->34|65->34|66->35|67->36|67->36|69->38|69->38|69->38|70->39|73->42|73->42|78->47
                  -- GENERATED --
              */
          