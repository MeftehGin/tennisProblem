package main.java.com.ismaillagouilly.tennis;

/**
 * Created by Ismail Lagouilly.
 */

/* ********************************************************************************* */
/*                                                                                   */
/*  Player Class                                                                     */
/*                                                                                   */
/*  Manages players of a Game, Set or a Tennis Match.                                */
/*                                                                                   */
/*   The class uses Lombok a java library to automatically generate                  */
/*   Getters & Setters. More information on the link: https://www.projectlombok.org/ */
/*                                                                                   */
/* ********************************************************************************* */


public class Player {

    private String username;

    public Player(String username) {

        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
