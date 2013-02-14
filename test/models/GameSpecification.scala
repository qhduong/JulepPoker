package models

import org.specs2.mutable.Specification

class GameSpecification extends Specification {

    "The GameServer" should {
        "save and return a Game object" in {
            val testGameId:Int = GameServer.add(new Game("Test", "http://testurl.html"))
            val testGame:Game = GameServer.get(testGameId);
            testGame.topic must beEqualTo("Test")
        }

        "return null if no Game with the specified id exists" in {
            val testGame:Game = GameServer.get(999)
            testGame must beNull
        }

        "return null for a deleted game" in {
            val testGameToDeleteId = GameServer.add(new Game("Test2","http://testurl.html"))
            val testGameToDelete = GameServer.get(testGameToDeleteId)
            testGameToDelete must not beNull; //semi-colon ends the matcher

            GameServer.remove(testGameToDeleteId)
            val actualId = GameServer.get(testGameToDeleteId)
            actualId must beNull
        }
    }
/*
    "A Game" should {
        "start and be returnable from the server" in {

        }

        "allow a player to join and associate that player to the game" in {

        }


    }
  */
}
