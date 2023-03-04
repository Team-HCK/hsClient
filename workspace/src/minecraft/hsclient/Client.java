package hsclient;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.arikia.dev.drpc.DiscordRPC;
import org.lwjgl.opengl.Display;

public class Client {



    private static final Client INSTANCE = new Client();
    public static final Client getInstance() {
        return INSTANCE;
    }
    //private DiscordRP discordRP = new DiscordRP();
    public static String author = "Team HCK";

    public static void startup() {
        System.out.println("starting hsClient, made by. " + author);
    }

    public void init() {
        // discordRP();
    }

    public void shutdown() {

    }

}