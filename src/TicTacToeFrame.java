import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TicTacToeFrame extends JFrame
{

    private static final int ROW = 3;
    private static final int COL = 3;
    String player = "X";
    boolean finished = false;
    boolean playing = true;

    int moveCnt = 0;
    final int MOVES_FOR_WIN = 5;
    final int MOVES_FOR_TIE = 7;
    String[] options = { "Exit!", "Play Again!" };
    private static TicTacToeTile[][] board = new TicTacToeTile[ROW][COL];
    Toolkit kit = Toolkit.getDefaultToolkit();
    JPanel mainPanel;
    JPanel topPanel;
    JPanel midPanel;
    JPanel statsPanel;
    JPanel bottomPanel;
    JLabel titleLabel;

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
        board[0][0].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(0,0))
            {
                board[0][0].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    var selection = JOptionPane.showOptionDialog(null, "Its a Tie!",
                            "Tie!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });
        board[0][1].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(0,1))
            {
                board[0][1].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    var selection = JOptionPane.showOptionDialog(null, "Its a Tie!",
                            "Tie!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });
        board[0][2].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(0,2))
            {
                board[0][2].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    JOptionPane.showMessageDialog(null, "It's a Tie!",
                            "Tie!", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });
        board[1][0].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(1,0))
            {
                board[1][0].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    var selection = JOptionPane.showOptionDialog(null, "Its a Tie!",
                            "Tie!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });
        board[1][1].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(1,1))
            {
                board[1][1].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    var selection = JOptionPane.showOptionDialog(null, "Its a Tie!",
                            "Tie!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });
        board[1][2].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(1,2))
            {
                board[1][2].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    var selection = JOptionPane.showOptionDialog(null, "Its a Tie!",
                            "Tie!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });
        board[2][0].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(2,0))
            {
                board[2][0].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    var selection = JOptionPane.showOptionDialog(null, "Its a Tie!",
                            "Tie!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });
        board[2][1].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(2,1))
            {
                board[2][1].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);
                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    var selection = JOptionPane.showOptionDialog(null, "Its a Tie!",
                            "Tie!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });
        board[2][2].addActionListener((ActionEvent ae) ->
        {
            if(isValidMove(2,2))
            {
                board[2][2].setText(player);
                moveCnt++;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Move! Choose other move!",
                        "Wrong Move", JOptionPane.INFORMATION_MESSAGE);

                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }
            }
            if(moveCnt >= MOVES_FOR_WIN)
            {
                if(isWin(player))
                {
                    var selection = JOptionPane.showOptionDialog(null, "Player " + player + " wins!",
                            "Player" + player + "won!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            if(moveCnt >= MOVES_FOR_TIE)
            {
                if(isTie())
                {
                    var selection = JOptionPane.showOptionDialog(null, "Its a Tie!",
                            "Tie!",0,3,null, options, options[0]);
                    if (selection == 0) {
                        System.exit(0);
                    }
                    else if (selection == 1)
                    {
                        clearBoard();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }

            if(player.equals("X"))
            {
                player = "O";
            }
            else
            {
                player = "X";
            }

        });

    }
    private void createBottomPanel()
    {
        bottomPanel = new JPanel();
        exit = new JButton("EXIT");
        bottomPanel.add(exit);
        exit.addActionListener((ActionEvent ae) -> {
            JOptionPane.showMessageDialog(null, "Player quit! Goodbye!",
                    "Quit!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        });

    }

    private static void clearBoard()
    {
        // sets all the board elements to a space
        for(int row=0; row < ROW; row++)
        {
            for(int col=0; col < COL; col++)
            {
                board[row][col].setText(" ");
            }
        }
    }

    private static boolean isValidMove(int row, int col)
    {
        boolean retVal = false;
        if(board[row][col].getText().equals(" "))
            retVal = true;
        return retVal;

    }
    private static boolean isWin(String player)
    {
        if(isColWin(player) || isRowWin(player) || isDiagnalWin(player))
        {
            return true;
        }

        return false;
    }
    private static boolean isColWin(String player)
    {
        // checks for a col win for specified player
        for(int col=0; col < COL; col++)
        {
            if(board[0][col].getText().equals(player) &&
                    board[1][col].getText().equals(player) &&
                    board[2][col].getText().equals(player))
            {
                return true;
            }
        }
        return false; // no col win
    }
    private static boolean isRowWin(String player)
    {
        // checks for a row win for the specified player
        for(int row=0; row < ROW; row++)
        {
            if(board[row][0].getText().equals(player) &&
                    board[row][1].getText().equals(player) &&
                    board[row][2].getText().equals(player))
            {
                return true;
            }
        }
        return false; // no row win
    }
    private static boolean isDiagnalWin(String player)
    {
        // checks for a diagonal win for the specified player

        if(board[0][0].getText().equals(player) &&
                board[1][1].getText().equals(player) &&
                board[2][2].getText().equals(player) )
        {
            return true;
        }
        if(board[0][2].getText().equals(player) &&
                board[1][1].getText().equals(player) &&
                board[2][0].getText().equals(player) )
        {
            return true;
        }
        return false;
    }

    // checks for a tie before board is filled.
    // check for the win first to be efficient
    private static boolean isTie()
    {
        boolean xFlag = false;
        boolean oFlag = false;
        // Check all 8 win vectors for an X and O so
        // no win is possible
        // Check for row ties
        for(int row=0; row < ROW; row++)
        {
            if(board[row][0].getText().equals("X") ||
                    board[row][1].getText().equals("X") ||
                    board[row][2].getText().equals("X"))
            {
                xFlag = true; // there is an X in this row
            }
            if(board[row][0].getText().equals("O") ||
                    board[row][1].getText().equals("O") ||
                    board[row][2].getText().equals("O"))
            {
                oFlag = true; // there is an O in this row
            }

            if(! (xFlag && oFlag) )
            {
                return false; // No tie can still have a row win
            }

            xFlag = oFlag = false;

        }
        // Now scan the columns
        for(int col=0; col < COL; col++)
        {
            if(board[0][col].getText().equals("X") ||
                    board[1][col].getText().equals("X") ||
                    board[2][col].getText().equals("X"))
            {
                xFlag = true; // there is an X in this col
            }
            if(board[0][col].getText().equals("O") ||
                    board[1][col].getText().equals("O") ||
                    board[2][col].getText().equals("O"))
            {
                oFlag = true; // there is an O in this col
            }

            if(! (xFlag && oFlag) )
            {
                return false; // No tie can still have a col win
            }
        }
        // Now check for the diagonals
        xFlag = oFlag = false;

        if(board[0][0].getText().equals("X") ||
                board[1][1].getText().equals("X") ||
                board[2][2].getText().equals("X") )
        {
            xFlag = true;
        }
        if(board[0][0].getText().equals("O") ||
                board[1][1].getText().equals("O") ||
                board[2][2].getText().equals("O") )
        {
            oFlag = true;
        }
        if(! (xFlag && oFlag) )
        {
            return false; // No tie can still have a diag win
        }
        xFlag = oFlag = false;

        if(board[0][2].getText().equals("X") ||
                board[1][1].getText().equals("X") ||
                board[2][0].getText().equals("X") )
        {
            xFlag =  true;
        }
        if(board[0][2].getText().equals("O") ||
                board[1][1].getText().equals("O") ||
                board[2][0].getText().equals("O") )
        {
            oFlag =  true;
        }
        if(! (xFlag && oFlag) )
        {
            return false; // No tie can still have a diag win
        }

        // Checked every vector so I know I have a tie
        return true;
    }

}
