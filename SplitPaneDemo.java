import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SplitPaneDemo extends JFrame
{
	JTabbedPane tabbedPane = new JTabbedPane();
	JPanel lowerPane = new JPanel();
	JEditorPane compileOutput = new JEditorPane();
	JLabel lineNo = new JLabel("This is line No");
	public SplitPaneDemo()
	{
		super("SplitPane Demo");
		setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()),(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()-30));
		
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,  tabbedPane ,lowerPane);
		lowerPane.setLayout(new BorderLayout());
		lowerPane.add(new JScrollPane(compileOutput),BorderLayout.CENTER);
		lowerPane.add(lineNo,BorderLayout.SOUTH);
		splitPane.setDividerLocation((int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/1.5));
		splitPane.setOneTouchExpandable(true);
		
		JMenu fileMenu = new JMenu("File");
		
		fileMenu.add(new NewTabAction());
		fileMenu.addSeparator();
		fileMenu.add(new ExitAction());
		fileMenu.setMnemonic('F');
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add( fileMenu );
		setJMenuBar( menuBar );
		
		Container container = getContentPane();
		container.add(splitPane, BorderLayout.CENTER);
		
		
		
		setVisible( true );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	private void createNewTab()
	{
		JPanel panel = new JPanel(new BorderLayout());
		
		try
		{
			CodeEditor  editor= new CodeEditor(null);
			editor.setLineNoLabel(lineNo);
			panel.add(new JScrollPane(editor));
		}
		catch(Exception e)
		{
		}
		
		tabbedPane.addTab("Tabbed " + tabbedPane.getTabCount() , panel);
	}
	private class NewTabAction extends AbstractAction
	{
		public NewTabAction()
		{
			putValue(Action.NAME, "New Tab");
			putValue(Action.SHORT_DESCRIPTION,"Add a new Tab");
			putValue(Action.MNEMONIC_KEY, new Integer('N'));
		}
		public void actionPerformed(ActionEvent ae)
		{
			createNewTab();
		}
	}
	private class ExitAction extends AbstractAction
	{
		public ExitAction()
		{
			putValue( Action.NAME , "Exit");
			putValue( Action.SHORT_DESCRIPTION, "Exit Application");
			putValue( Action.MNEMONIC_KEY,new Integer('X'));
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(JOptionPane.showConfirmDialog(SplitPaneDemo.this,"Are you want to exit","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				System.exit(0);
		}
	}
	public static void main(String[]args)
	{
		System.setProperty("windowModified","java.lang.Boolean");
         try 
         { 
              UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
         } catch (Exception e) 
         {
          
         }
         
		SplitPaneDemo sp = new SplitPaneDemo();
	}
	
}

