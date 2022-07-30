import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

// Abstract Factory pattern
public class MusicShop extends Frame implements ActionListener { // MusicShop

    private Checkbox Nir, Green, Jimi, Blurr;
    private Button Drummer, Singer, Guitarist, Album, Quit;
    private MusicStore musicShop = null;
    private MusicPanel musicShopPlot;
    private String textArea = "";

    public MusicShop() {
        super("Music Shop");
        setGUI();
    }
    private void setGUI() {
        setBackground(Color.pink);
        setLayout(new GridLayout(1,2)); // 1 row 2 columns
        Panel left = new Panel();
        add(left);
        Panel right= new Panel();
        add(right);

        //create label and 3 radio buttons on left side

        left.setLayout(new GridLayout(4, 1)); // 4 rows and 1 column
        left.add(new Label("Pick A Band"));
        CheckboxGroup grp= new CheckboxGroup();
        Nir = new Checkbox("Nirvana", grp, false);
        Green = new Checkbox("Green Day", grp, false);
        Jimi = new Checkbox("Jimi Hendrix", grp, false);
        Blurr = new Checkbox("Blur", grp, false);

        left.add(Nir); // add Nir to left panel
        left.add(Green); // add Green to left panel
        left.add(Jimi); // add Jimi to left panel
        left.add(Blurr); // add Blurr to left panel


        Nir.addItemListener(new NirListener()); // add action listener to Nir
        Jimi.addItemListener(new JimiListener()); // add action listener to Jimi
        Green.addItemListener(new GreenListener()); // add action listener to Green
        Blurr.addItemListener(new BlurListener()); // add action listen to Blurr

        right.setLayout(new GridLayout(2,1)); // 2 rows 1 column
        musicShopPlot = new MusicPanel(); // create musicShopPlot
        musicShopPlot.setBackground(Color.black); // set background colour
        Panel botRight = new Panel();

        right.add(musicShopPlot);
        right.add(botRight);
        Drummer = new Button("Drummer");
        Singer =  new Button("Singer");
        Guitarist = new Button("Guitarist");
        Album = new Button("Album");
        Quit = new Button("Quit");
        // add buttons to panel
        botRight.add(Drummer);
        Drummer.addActionListener(this);
        botRight.add(Singer);
        Singer.addActionListener(this);
        botRight.add(Guitarist);
        Guitarist.addActionListener(this);
        botRight.add(Album);
        Album.addActionListener(this);
        botRight.add(Quit);
        Quit.addActionListener(this);
        setBounds(100,100, 900,600);
        setVisible(true);

    }
    private static String mytoString(String[] anArray, String replace) {
	      StringBuilder sb = new StringBuilder();
	      for (int i = 0; i < anArray.length; i++) {
	         if (i > 0) {
	            sb.append(replace);
	         }
	         String item = anArray[i];
			 sb.append(item);
	      }
	      return sb.toString();
   }
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == Drummer){
            setDrummer();
		}
        if (obj == Singer){
            setSinger();
		}
        if (obj == Guitarist){
            setGuitarist();
		}
		if (obj == Album){
			setAlbum();
		}
        if (obj == Quit){
        	System.exit(0);
		}

    }
    private void setDrummer() {
        clearMember();
        if (musicShop != null){
			textArea = musicShop.getDrummer().getName() + " " + musicShop.getSinger().getDob();
		}
        // repaints musicShop panel
        musicShopPlot.repaint();
    }
    private void setSinger() {
		clearMember();
        if (musicShop != null){
			textArea = musicShop.getSinger().getName() + " " + musicShop.getSinger().getDob();
		}
        musicShopPlot.repaint();
    }
    private void setGuitarist() {
		clearMember();
        if (musicShop != null){
			textArea = musicShop.getGuitarist().getName() + " " + musicShop.getSinger().getDob();
		}
        musicShopPlot.repaint();
    }
    private void setAlbum() {
		clearMember();
		String[] array = musicShop.getAlbum().getTracks();
		if (musicShop != null){
			String albumTracks = mytoString(array, " : ");
			textArea = musicShop.getAlbum().getName() + ": " + array.length + ": " + albumTracks;

		}
		musicShopPlot.repaint();
	}
    private void clearMember() {
        textArea="";
        musicShopPlot.repaint();
    }
    static public void main(String argv[]) {
        new MusicShop();
    }
    class MusicPanel extends Panel {
        public void paint (Graphics g) {
            Dimension sz=getSize();
            g.setColor(Color.pink);
            g.drawRect(0,0, sz.width-1, sz.height-1);
            g.drawString(textArea, 5, 40);
        }
    }
    class NirListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            musicShop = new Nirvana();
            clearMember();
        }
    }
    class JimiListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            musicShop = new Jhex();
            clearMember();
        }
    }
    class GreenListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            musicShop = new GreenDay();
            clearMember();
        }
    }
    class BlurListener implements ItemListener {
	        public void itemStateChanged(ItemEvent e) {
	            musicShop = new Blur();
	            clearMember();
	        }
    }
}     //end of MusicShop class