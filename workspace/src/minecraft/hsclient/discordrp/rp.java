package hsclient.discordrp;

import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;
import net.arikia.dev.drpc.DiscordUser;
import net.arikia.dev.drpc.callbacks.ReadyCallback;
import org.lwjgl.Sys;

public class rp {

    private boolean running = true;
    private long created = 0;

    public void start() {
        this.created = System.currentTimeMillis();
        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler(new ReadyCallback() {
            @Override
            public void apply(DiscordUser user) {
                System.out.println("websome " + user.username + "#" + user.discriminator + ".");
                update("Starting...", "");
            }

        }).build();

        DiscordRPC.discordInitialize("1081142437466083329", handlers, true);

        // callback
        new Thread("discord rpc clb") {
            @Override
            public void run() {

                while(running) {
                    DiscordRPC.discordRunCallbacks();
                }
            }
        }.start();
    }

    public void shutdown() {
        running = false;
        DiscordRPC.discordShutdown();
    }

    public void update(String fl, String sl) {
        DiscordRichPresence.Builder b = new DiscordRichPresence.Builder(sl);
        b.setDetails(fl);
        b.setStartTimestamps(created);

        DiscordRPC.discordUpdatePresence((b.build()));
    }

}
