import java.net.*;
import java.io.*;
import java.util.*;

public class GameServer {
    private List<Player> players;
    private List<Bullet> bullets;
    private ServerSocket serverSocket;

    public GameServer(int port) throws IOException {
        players = new ArrayList<>();
        bullets = new ArrayList<>();
        serverSocket = new ServerSocket(port);
    }

    public void start() {
        System.out.println("Server started on port " + serverSocket.getLocalPort());

        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();
                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
            } catch (IOException e) {
                System.err.println("Error accepting client connection: " + e.getMessage());
            }
        }
    }

    private class ClientHandler implements Runnable {
        private Socket clientSocket;
        private Player player;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Add new player
                String name = in.readLine();
                player = new Player(players.size(), name, Math.random() * 600, Math.random() * 400);
                players.add(player);

                // Send initial game state
                out.println(players.size() - 1);
                for (Player p : players) {
                    if (p != player) {
                        out.println(p.getId() + "," + p.getName() + "," + p.getX() + "," + p.getY() + "," + p.isShooting());
                    }
                }

                // Receive input and update game state
