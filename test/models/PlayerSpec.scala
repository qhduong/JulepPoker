package models

import org.specs2.mutable.Specification
import org.specs2.matcher.{ThrownMessages, ThrownExpectations}

/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 1/9/13
 * Time: 12:46 AM
 * To change this template use File | Settings | File Templates.
 */

class PlayerSpec extends Specification with ThrownMessages {

    "A Player" should {
        "be created" in {
            val player = Player.create("Test Player", 1)
            player.id must beGreaterThan(-1)
        }

        "be returned by id" in {
            val player = Player.get(0)
            player.name must beEqualTo("Test Player")
            player.gameId must beEqualTo(1)
        }

        "get a list by game id" in {
            todo
        }
    }
    "As a participant a Player" should {
        "be able to start a game" in {
            todo
        }

        "be able to join a game" in {
            todo
        }

        "be able to leave a game" in {
            todo
        }
    }

    "As a game admin a Player" should {
        "be able to kick another player" in {
            todo
        }

        "be able to end a game" in {
            todo
        }
    }
}
