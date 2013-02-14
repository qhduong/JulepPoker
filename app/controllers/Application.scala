package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  /**
   * API examples
   * @return
   */
  def index = Action {
    Ok(views.html.index("Create a new game."))
  }

  /**
   * Route for joining a game
   * @return
   */
  def join(gameId:String) = Action { TODO }


  /**
   * Create a new game on the server and return the game id
   *
   * Expects JSON Game
   * @return
   */
  def create = Action { TODO }

  /**
   * End a game
   * @return
   */
  def end = Action { TODO }
}