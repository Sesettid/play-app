
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

object tweet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[TwitterResultModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resultList: List[TwitterResultModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
		 <title>My search results</title>
    <link rel="stylesheet" href='"""),_display_(/*5.35*/routes/*5.41*/.Assets.versioned("stylesheets/results.css")),format.raw/*5.85*/("""'>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="modal-container"></div>
        <div class="container">
            <div class="back-results-arrow-container">
                <div class="back-arrow-image" onclick="goBack()"><img src="assets/images/arrow.svg"></div>
                <div class="back-arrow-text">Your search results</div>
            </div>
            <div class="search-container">
                <div class="search-container-name">Search Terms</div>
                <div class="search-input">
                    <input type="text" name="keyword" name="search_text" id="searchInput"  placeholder="Search Here">
                </div>
                <button class="search-image" onclick="search()" ><img src="assets/images/search.svg"></button>
            </div>
            <div class="search-result-stats">
                <div class="search-result-count-title">Search Results:&nbsp;</div>
                <div class="search-result-count">10</div>
                &nbsp;&nbsp;| &nbsp;&nbsp;
                <div class="search-result-sentiment-title">Overall Sentiment:&nbsp;</div>
                <div class="search-result-sentiment">&#128512; Happy</div>
            </div>

            <ul>
                

                """),_display_(/*40.18*/for(p <- resultList) yield /*40.38*/ {_display_(Seq[Any](format.raw/*40.40*/("""
        
        
                """),format.raw/*43.17*/("""<li > """),_display_(/*43.24*/p/*43.25*/.twitterName),format.raw/*43.37*/(""" """),format.raw/*43.38*/(""","""),_display_(/*43.40*/p/*43.41*/.tweetContent),format.raw/*43.54*/("""> </li>
                    """),_display_(/*44.22*/for(h <- p.hashTag) yield /*44.41*/ {_display_(Seq[Any](format.raw/*44.43*/("""
                    """),format.raw/*45.21*/("""<a href=""""),_display_(/*45.31*/routes/*45.37*/.HomeController.hashtag(h)),format.raw/*45.63*/("""">"""),_display_(/*45.66*/h),format.raw/*45.67*/("""</a>
                    """)))}),format.raw/*46.22*/("""
    """)))}),format.raw/*47.6*/("""
        
            """),format.raw/*49.13*/("""</ul>
            </div>
        
    
  
<script>

    function goTo(url)
    """),format.raw/*57.5*/("""{"""),format.raw/*57.6*/("""
      """),format.raw/*58.7*/("""location.replace(url);
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""
  
    
    """),format.raw/*62.5*/("""function getprofile() """),format.raw/*62.27*/("""{"""),format.raw/*62.28*/("""

        """),format.raw/*64.9*/("""var profile = $("#searchInput").val()

        window.location.replace("profile/");
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/("""

    """),format.raw/*69.5*/("""function goBack() """),format.raw/*69.23*/("""{"""),format.raw/*69.24*/("""
        """),format.raw/*70.9*/("""window.location.replace("http://localhost:9000/");
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/("""

        """),format.raw/*73.9*/("""function search()"""),format.raw/*73.26*/("""{"""),format.raw/*73.27*/("""
  """),format.raw/*74.3*/("""var searchText = $("#searchInput").val()

  window.location.replace(searchText);
  """),format.raw/*77.3*/("""}"""),format.raw/*77.4*/("""

        
  
  
    """),format.raw/*82.5*/("""</script>
        
    </body>
    
</html>
"""))
      }
    }
  }

  def render(resultList:List[TwitterResultModel]): play.twirl.api.HtmlFormat.Appendable = apply(resultList)

  def f:((List[TwitterResultModel]) => play.twirl.api.HtmlFormat.Appendable) = (resultList) => apply(resultList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-12T23:14:04.140642100
                  SOURCE: C:/Users/saidi/Downloads/Telegram Desktop/SOEN6441-APP/PlayWebApplication/app/views/tweet.scala.html
                  HASH: 8be3c5d3831cbe2a5ef588be83b728335ab01483
                  MATRIX: 925->1|1058->39|1086->41|1203->132|1217->138|1281->182|3177->2051|3213->2071|3253->2073|3319->2111|3353->2118|3363->2119|3396->2131|3425->2132|3454->2134|3464->2135|3498->2148|3555->2178|3590->2197|3630->2199|3680->2221|3717->2231|3732->2237|3779->2263|3809->2266|3831->2267|3889->2294|3926->2301|3978->2325|4092->2412|4120->2413|4155->2421|4210->2449|4238->2450|4281->2466|4331->2488|4360->2489|4399->2501|4521->2596|4550->2597|4585->2605|4631->2623|4660->2624|4697->2634|4784->2694|4813->2695|4852->2707|4897->2724|4926->2725|4957->2729|5070->2815|5098->2816|5151->2842
                  LINES: 27->1|32->1|33->2|36->5|36->5|36->5|71->40|71->40|71->40|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|76->45|76->45|76->45|77->46|78->47|80->49|88->57|88->57|89->58|90->59|90->59|93->62|93->62|93->62|95->64|98->67|98->67|100->69|100->69|100->69|101->70|102->71|102->71|104->73|104->73|104->73|105->74|108->77|108->77|113->82
                  -- GENERATED --
              */
          