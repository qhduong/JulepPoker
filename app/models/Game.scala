package models

import collection.mutable.ArrayBuffer

/**
 *
 * @param topic The topic name i.e. Sprint 6 Planning
 * @param query The JIRA query to get items for the game
 */
case class Game(topic: String, query: String)

object Game {
    def start(game: Game): Int = GameServer.add(game)

    def join(gameId: Int, player: Player) = {

    }

    def end(id: Int) = GameServer.remove(id)

}

object GameServer {
    var games = ArrayBuffer[Game]()

    def add(game: Game): Int = {
        games.append(game)
        games.size - 1
    }

    /**
     * Get a currently open game
     *
     * @param id Game Id
     * @return A Game if index refers to a game or null if not found
     */
    def get(id: Int) : Game = {
        try {
            games(id)
        } catch {
            case _ => null
        }
    }

    def remove(id: Int) = {
        try {
            games.remove(id)
        } catch {
            case _ => null
        }
    }
}
