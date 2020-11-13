
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""


"""),format.raw/*4.1*/("""<html>
<head>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

  <title>My search page</title>
  <link rel="stylesheet" href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.versioned("stylesheets/search.css")),format.raw/*14.82*/("""'>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>


<div class="container">
  <div class="top-image">
    <img src="assets/images/top-icon.svg">
  </div>
  <div class="welcome-title">Welcome To Tweet Analytics</div>
  <div class="welcome-subtitle">Start searching tweets</div>




  <div class="search-container">
    <div class="search-input">

      <input type="text" name="keyword" name="search_text" id="searchInput" placeholder="Search Here">
    </div>

    <button class="search-image" onclick="search()" ><img src="assets/images/search.svg"> Search</button>
  </div>



  <div class="welcome-footer">
    <div>Team Project</div>
    <div>Team HG.005</div>
    <div>SOEN 6441</div>
  </div>


  <p id="demo"></p>

</div>



<script>

  function goTo(url)
  """),format.raw/*57.3*/("""{"""),format.raw/*57.4*/("""
    """),format.raw/*58.5*/("""location.replace(url);
  """),format.raw/*59.3*/("""}"""),format.raw/*59.4*/("""

  """),format.raw/*61.3*/("""function search()"""),format.raw/*61.20*/("""{"""),format.raw/*61.21*/("""
  """),format.raw/*62.3*/("""var searchText = $("#searchInput").val()

  window.location.replace("tweetSearch/"+searchText);
  """),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""



  """),format.raw/*69.3*/("""</script>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-12T23:14:04.103315500
                  SOURCE: C:/Users/saidi/Downloads/Telegram Desktop/SOEN6441-APP/PlayWebApplication/app/views/index.scala.html
                  HASH: a5a42ad1985c3d580318bdb6f787904389219d55
                  MATRIX: 900->1|996->3|1028->9|1648->602|1663->608|1727->651|2603->1500|2631->1501|2664->1507|2717->1533|2745->1534|2778->1540|2823->1557|2852->1558|2883->1562|3011->1663|3039->1664|3076->1674
                  LINES: 27->1|32->1|35->4|45->14|45->14|45->14|88->57|88->57|89->58|90->59|90->59|92->61|92->61|92->61|93->62|96->65|96->65|100->69
                  -- GENERATED --
              */
          