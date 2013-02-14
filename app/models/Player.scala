package models

import collection.mutable.ArrayBuffer

/**
 *
 */
case class Player (id:Int, name:String, gameId: Int)

object Player {

    def create(name:String, gameId:Int) : Player  = {
        PlayerData.add(new Player(-1, name, gameId))
    }

    def get(playerId: Int) : Player = {
        PlayerData.findById(playerId)
    }

}

object PlayerData {
    val players = ArrayBuffer[Player] ()

    def add(player: Player) : Player = {
        players.append(player)
        player.copy(id=(players.size-1))
    }

    def findById(playerId: Int) : Player = {
        players(playerId)
    }
}
