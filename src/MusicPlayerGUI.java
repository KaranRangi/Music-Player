import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class MusicPlayerGUI extends JFrame {
    public static final Color FRAME_COLOR = Color.DARK_GRAY;
    public static final Color TEXT_COLOR = Color.WHITE;

    public MusicPlayerGUI() {
        //set title header to "Music Player" 
        super("Music Player");
        //set size and width of gui
        setSize(400, 600);
        //end program when app is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set the app to the center of the screen
        setLocationRelativeTo(null);
        //prevent user from resizing the gui
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(FRAME_COLOR);

        addGuiComponents();
    }

    private void addGuiComponents() {
        //add toolbar
        addToolBar();

        JLabel songImage = new JLabel(loadImage("src/assets/record.png"));
        songImage.setBounds(0, 50, getWidth() - 20, 225);
        add(songImage);

        //song title
        JLabel songTitle = new JLabel("Song Title");
        songTitle.setBounds(0, 285, getWidth()-10, 30);
        songTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        songTitle.setForeground(TEXT_COLOR);
        songTitle.setHorizontalAlignment(SwingConstants.CENTER);
        add(songTitle);

        //song artist
        JLabel artist = new JLabel("Artist");
        artist.setBounds(0, 315, getWidth()-10, 30);
        artist.setFont(new Font("Dialog", Font.BOLD, 24));
        artist.setForeground(TEXT_COLOR);
        artist.setHorizontalAlignment(SwingConstants.CENTER);
        add(artist);

        //slider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setBounds(getWidth()/2 - 300/2, 365, 300, 40);
        slider.setBackground(null);
        add(slider);

        //buttons
        addPlaybackButtons();
    }

    private void addToolBar() {

        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(0, 0, getWidth(), 20);

        //prevent toolbar from being moved
        toolBar.setFloatable(false);

        //add a drop down menu
        JMenuBar menuBar = new JMenuBar();
        toolBar.add(menuBar);

        //make a song menu
        JMenu songMenu = new JMenu("Song");
        menuBar.add(songMenu);

        //add load song into song menu
        JMenuItem loadSong = new JMenuItem("Load Song");
        songMenu.add(loadSong);

        //add playlist menu
        JMenu playlistMenu = new JMenu("Playlist");
        menuBar.add(playlistMenu);

        JMenuItem createPlaylist = new JMenuItem("Create Playlist");
        playlistMenu.add(createPlaylist);

        JMenuItem loadPlaylist = new JMenuItem("Load Playlist");
        playlistMenu.add(loadPlaylist);

        add(toolBar);
    }

    private void addPlaybackButtons() {
        JPanel buttons = new JPanel();
        buttons.setBounds(0, 435, getWidth()-10, 80);
        buttons.setBackground(null);

        //Previous button
        JButton prev = new JButton(loadImage("src/assets/previous.png"));
        prev.setBorderPainted(false);
        prev.setBackground(null);
        buttons.add(prev);

        //Play Button
        JButton play = new JButton(loadImage("src/assets/play.png"));
        play.setBorderPainted(false);
        play.setBackground(null);
        buttons.add(play);

        //Pause Button
        JButton pause = new JButton(loadImage("src/assets/pause.png"));
        pause.setBorderPainted(false);
        pause.setBackground(null);
        pause.setVisible(false);
        buttons.add(pause);

        //Next Button
        JButton next = new JButton(loadImage("src/assets/next.png"));
        next.setBorderPainted(false);
        next.setBackground(null);
        buttons.add(next);

        add(buttons);
    }

    //load record image
    private ImageIcon loadImage(String imagepath) {
        try {
            BufferedImage image = ImageIO.read(new File(imagepath));
            return new ImageIcon(image);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
