package utfpr.itsone.model;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private ArrayList<Game> games = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(Game game) {
        if (!Objects.isNull(game)){
            if (!games.contains(game))
                games.add(game);
        }
    }
}
