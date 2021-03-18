package controllers

import javax.inject._
import models.usernamemodel
import edu.trinity.videoquizreact.shared.SharedMessages
import play.api.mvc._
import models.DougStatData
import play.api.data._
import play.api.data.Forms._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def login = Action{
    Ok(views.html.form())
  }

  def table(col: Int) = Action {
    val sortedData = if (col == 0) DougStatData.data.sortBy(_.name) 
      else DougStatData.data.sortBy(_.stats(col - 1))
    Ok(views.html.table(sortedData.toSeq))
  }

  def validateEntry(name: String, color: String) = Action {
    Ok((name + " like the color: " + color))
  }
  def validatePost=Action{implicit request=>
    val postVals=request.body.asFormUrlEncoded
    postVals.map{args=>
      val name=args("name").head
      val color=args("color").head
      Ok((name + " like the color: " + color))
    }.getOrElse(Ok("It's Broken."))
  }
  def viewStudent()=Action{
    val data=usernamemodel
    Ok(views.html.model(data.toSeq))
  }
  

}
