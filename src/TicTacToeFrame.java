import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TicTacToeFrame extends JFrame
{

    private static final int ROW = 3;
    private static final int COL = 3;

    TicTacToeTile[][] board = new TicTacToeTile[ROW][COL];
    Toolkit kit = Toolkit.getDefaultToolkit();
    JPanel mainPanel;
    JPanel topPanel;
    JPanel midPanel;
    JPanel statsPanel;
    JPanel bottomPanel;
    JLabel titleLabel;

    JScrollPane scroller;

    JTextArea resultsDisplay;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    JButton exit;
    public TicTacToeFrame()
    {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        createTopPanel();
        add(topPanel, BorderLayout.NORTH);

        createMidPanel();
        mainPanel.add(midPanel, BorderLayout.CENTER);

        createBottomPanel();
        mainPanel.add(bottomPanel,BorderLayout.SOUTH);

        add(mainPanel);

        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        // center frame in screen
        setSize(screenWidth * 3/4 , screenHeight * 3/4);
        setLocation(screenWidth / 8, screenHeight / 8);
        // set frame icon and title
        setTitle("TicTacToe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    private void createTopPanel()
    {
        topPanel = new JPanel();
        titleLabel = new JLabel("Tic Tac Toe Game", JLabel.CENTER);
        titleLabel.setVerticalTextPosition(JLabel.BOTTOM);
        titleLabel.setHorizontalTextPosition(JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 48));
        topPanel.add(titleLabel);
    }
    private void createMidPanel()
    {
        midPanel = new JPanel();
        midPanel.setLayout(new GridLayout(3,3));

        for( int row = 0; row < 3; row++)
            for(int col= 0; col < 3; col++)
            {
                board[row][col] = new TicTacToeTile(row, col);
                board[row][col].setText(" ");
                midPanel.add(board[row][col]);
            }

    }
    private void createBottomPanel()
    {
        bottomPanel = new JPanel();
        exit = new JButton("EXIT");
        bottomPanel.add(exit);
        exit.addActionListener((ActionEvent ae) -> System.exit(0));

    }

}
