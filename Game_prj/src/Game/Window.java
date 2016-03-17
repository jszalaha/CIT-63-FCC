package Game;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.GroupLayout.*;


public class Window extends JFrame
{
    
    private JTextField Command;
    private JTextArea Output;
    private JScrollPane Scroll;
    
    public Window()
    {
        super("");
        setLayout(new FlowLayout());         
        
        Output = new JTextArea(10,40);        
        Output.setEditable(false);
        Output.setLineWrap(true);       
        add(Output);
        
        Scroll = new JScrollPane(Output);
        Scroll.setWheelScrollingEnabled(true);
        Scroll.setAutoscrolls(true);
        add(Scroll);
        
        Command = new JTextField(40);
        add(Command);
        
        thehandler handler = new thehandler();
        Command.addActionListener(handler);
        
        /*super("New Game");
        setLayout(new FlowLayout());
        
        item1 = new JTextField(10);
        add(item1);
        
        item2 = new JTextField("Enter text here");
        add(item2);
        
        item3 = new JTextField("uneditable",20);
        item3.setEditable(false);
        add(item3);
        
        pwdField = new JPasswordField("mypass");
        add(pwdField);
        
        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        pwdField.addActionListener(handler);*/
        
    } // End Window()
    
    private class thehandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String string = "";
            
            if(event.getSource() == Command)
            {
                inOut(string);
                /*
                switch(string.toUpperCase())
                {
                    case "/CREATEBARD":
                    {
                        Command.addActionListener();
                        Bard newBard = new Bard();
                        Output.append("Please give him a name\n");
                        inOut(string);
                        Command.addActionListener(this);
                        
                        break;
                    }
                }
                 */
            } // end if
            
            
            /*if(event.getSource() == item1)
                string = String.format("field 1: %s", event.getActionCommand());
            else if(event.getSource() == item2)
                string = String.format("field 2: %s", event.getActionCommand());
            else if(event.getSource() == item3)
                string = String.format("field 3: %s", event.getActionCommand());
            else if(event.getSource() == pwdField)
                string = String.format("password field is: %s", 
                        event.getActionCommand());
            JOptionPane.showMessageDialog(null, string);*/
            
        } // End actionPerformed
        public void inOut(String string)
        {
            string = Command.getText();
            Command.setText("");
            Output.append(string + "\n");
        }
    } // End thehandler
/*
enum Command {...};
enum Expected {...};
Command command = ...;
Expected expected = ...;   
public void parser(String string)
{
	switch(expected)
	{
		case primary_command:
			switch(string)
			{
				case createHero:
					Hero newHero = new Hero();
					command = createcharacter;
					expected = name;
				case 	
			}

		case name:
			hero.changeName(string);
			expected = race;

		case race:
			switch(string.touppercase())
			{
				case ELF:
					hero.Race = ELF;
				case HUMAN:
				
} // end parser
*/	
    
    
} // End Window
