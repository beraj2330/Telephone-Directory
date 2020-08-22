import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {  
	public static void main(String[] args) { 
		//Title of the menu window 
		JFrame menu=new JFrame("Phone Directory");
		menu.setVisible(true); 
		/*
			Creation of Data structure to store contacts goes here
		*/
		
		//Adds contact to directory   
		JButton AddContact=new JButton("Add Contact");  
		AddContact.setBounds(10,60,200,30); 
		AddContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//Creates new window which will have fields to add information for new contact
				JFrame addcontactmenu=new JFrame("Add Contact");
				addcontactmenu.setSize(450,600);  
				addcontactmenu.setLayout(null);
				addcontactmenu.setVisible(true); 
				//When the window is closed it will just close this window not the main one
				addcontactmenu.setDefaultCloseOperation(addcontactmenu.DISPOSE_ON_CLOSE);
				
				//Just shows the instruction at the top of the window
				JLabel ACMTitleLabel=new JLabel("Please add information for new contact");
				ACMTitleLabel.setBounds(90,10,350,30); 
				
				//Label for the text field to enter the contacts first name
				JLabel firstNameLabel=new JLabel("First Name:");
				firstNameLabel.setBounds(10,60,200,30);
				JTextField firstNameText=new JTextField();
				firstNameText.setBounds(115,60,300,30);
				
				//Label for the text field to enter the contacts last name
				JLabel lastNameLabel=new JLabel("Last Name:");
				lastNameLabel.setBounds(10,95,200,30);
				JTextField lastNameText=new JTextField();
				lastNameText.setBounds(115,95,300,30);
				
				//Label for the text field to enter the contacts phone number
				JLabel phoneNumberLabel=new JLabel("Phone Number:");
				phoneNumberLabel.setBounds(10,130,200,30);
				JTextField phoneNumberText=new JTextField();
				phoneNumberText.setBounds(125,130,290,30);
				
				//Label for the text field to enter the contacts school or workplace
				JLabel workSchoolLabel=new JLabel("Work or School:");
				workSchoolLabel.setBounds(10,165,200,30);
				JTextField workSchoolText=new JTextField();
				workSchoolText.setBounds(130,165,285,30);
				
				// When user clicks submit all the information put in each text field 
				// will be saved to the data structure storing contact information
				JButton ACSubmit=new JButton("Submit");
				ACSubmit.setBounds(10,200,200,30);
				ACSubmit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
					
						/*
							Add Contact Function goes here
							This will take the string from each text field and pass it into the function
							which will add the information to the data structure
						*/
						addcontactmenu.dispose();
					}
				});
				
				//If user clicks the cancel button it will close this window and just show the main menu
				JButton ACCancel=new JButton("Cancel");
				ACCancel.setBounds(215,200,200,30);
				ACCancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						addcontactmenu.dispose();
					}
				});
				
				addcontactmenu.add(ACMTitleLabel);
				addcontactmenu.add(firstNameLabel);
				addcontactmenu.add(firstNameText);
				addcontactmenu.add(lastNameLabel);
				addcontactmenu.add(lastNameText);
				addcontactmenu.add(phoneNumberLabel);
				addcontactmenu.add(phoneNumberText);
				addcontactmenu.add(workSchoolLabel);
				addcontactmenu.add(workSchoolText);
				addcontactmenu.add(ACSubmit);
				addcontactmenu.add(ACCancel);
			}
		});
		
		//Deletes a choosen contact
		JButton DeleteContact=new JButton("Delete Contact");  
		DeleteContact.setBounds(215,60,200,30);
		DeleteContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame deletecontactmenu=new JFrame("Delete Contact");
				deletecontactmenu.setSize(450,600);  
				deletecontactmenu.setLayout(null);
				deletecontactmenu.setVisible(true);
				deletecontactmenu.setDefaultCloseOperation(deletecontactmenu.DISPOSE_ON_CLOSE);
				
				//Just shows the instruction at the top of the window
				JLabel ACMTitleLabel=new JLabel("Input information for the contact that will be deleted");
				ACMTitleLabel.setBounds(20,10,400,30); 
				
				//Label for the text field to enter the contacts first name
				JLabel firstNameLabel=new JLabel("First Name:");
				firstNameLabel.setBounds(10,60,200,30);
				JTextField firstNameText=new JTextField();
				firstNameText.setBounds(115,60,300,30);
				
				//Label for the text field to enter the contacts last name
				JLabel lastNameLabel=new JLabel("Last Name:");
				lastNameLabel.setBounds(10,95,200,30);
				JTextField lastNameText=new JTextField();
				lastNameText.setBounds(115,95,300,30);
				
				//Label for the text field to enter the contacts phone number
				JLabel phoneNumberLabel=new JLabel("Phone Number:");
				phoneNumberLabel.setBounds(10,130,200,30);
				JTextField phoneNumberText=new JTextField();
				phoneNumberText.setBounds(125,130,290,30);
				
				//Label for the text field to enter the contacts school or workplace
				JLabel workSchoolLabel=new JLabel("Work or School:");
				workSchoolLabel.setBounds(10,165,200,30);
				JTextField workSchoolText=new JTextField();
				workSchoolText.setBounds(130,165,285,30);
				//Submit button to process delete action
				JButton Submit=new JButton("Submit");
				Submit.setBounds(10,200,200,30);
				Submit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
					
						/*
							Depending on the selected information it will delete the
							corresponding contact by passing the information to
							the delete function
						*/
						menu.setVisible(true);
						deletecontactmenu.dispose();
					}
				});
				
				//Cancel just in case user changes mind
				JButton Cancel=new JButton("Cancel");
				Cancel.setBounds(215,200,200,30);
				Cancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						menu.setVisible(true);
						deletecontactmenu.dispose();
					}
				});
				
				//Adding the buttons and fields to the Frame(window)
				deletecontactmenu.add(ACMTitleLabel);
				deletecontactmenu.add(firstNameLabel);
				deletecontactmenu.add(firstNameText);
				deletecontactmenu.add(lastNameLabel);
				deletecontactmenu.add(lastNameText);
				deletecontactmenu.add(phoneNumberLabel);
				deletecontactmenu.add(phoneNumberText);
				deletecontactmenu.add(workSchoolLabel);
				deletecontactmenu.add(workSchoolText);
				deletecontactmenu.add(Submit);
				deletecontactmenu.add(Cancel);
			}
		});
		
		//Search for a contact
		JButton SearchContact=new JButton("Search Contact");  
		SearchContact.setBounds(10,95,200,30); 
		SearchContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame chooseContact = new JFrame();
				chooseContact.setSize(300,300);
				chooseContact.setLayout(null);
				chooseContact.setVisible(true);
				chooseContact.setDefaultCloseOperation(chooseContact.DISPOSE_ON_CLOSE);
				
				//Instructions for user
				JLabel TitleLabel=new JLabel("How would you like to search?");
				TitleLabel.setBounds(20,10,250,30); 
				
				//The following are radio buttons to choose how the search will be performed
				JRadioButton FirstName = new JRadioButton("First name");
				FirstName.setBounds(10,30,150,30);
				
				JRadioButton LastName = new JRadioButton("Last name");
				LastName.setBounds(10,60,150,30);
				
				JRadioButton PhoneNumber = new JRadioButton("Phone Number");
				PhoneNumber.setBounds(10,90,150,30);
				
				JRadioButton WorkSchool = new JRadioButton("Work or School");
				WorkSchool.setBounds(10,120,150,30);
				
				//Groups the buttons together
				ButtonGroup group = new ButtonGroup();
					group.add(FirstName);
					group.add(LastName);
					group.add(PhoneNumber);
					group.add(WorkSchool);
					
				//Submit button to process search choice
				JButton Submit=new JButton("Submit");
				Submit.setBounds(10,160,200,30);
				Submit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
					
						/*
							Depending on the selected information it will search the
							the data strut by passing the information to
							the search function
						*/
						
						chooseContact.dispose();
					}
				});
				
				//Cancel just in case user changes mind
				JButton Cancel=new JButton("Cancel");
				Cancel.setBounds(10,200,200,30);
				Cancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						chooseContact.dispose();
					}
				});	
				//Add all features to the window(Jframe)
				chooseContact.add(FirstName);	
				chooseContact.add(LastName);
				chooseContact.add(PhoneNumber);
				chooseContact.add(WorkSchool);
				chooseContact.add(TitleLabel);
				chooseContact.add(Submit);
				chooseContact.add(Cancel);
			}
		});
		
		//Shows possible contacts
		JButton PossibleContact=new JButton("Possible Contacts");  
		PossibleContact.setBounds(215,95,200,30);
		PossibleContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				/*
					When this button is selected it will
					show potential contacts the user may know
					based on work place or school
					This will open a new window up displaying the information
				*/
				System.out.printf("Poss\n");
			}
		});
		
		//Displays all contacts which will be sorted and displayed as requested by user
		JButton DisplayContact=new JButton("Display all contacts sorted by");  
		DisplayContact.setBounds(55,130,300,30);
		DisplayContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame displayChoice = new JFrame();
				displayChoice.setSize(300,300);
				displayChoice.setLayout(null);
				displayChoice.setVisible(true);
				displayChoice.setDefaultCloseOperation(displayChoice.DISPOSE_ON_CLOSE);
				
				//Instructions for user
				JLabel TitleLabel=new JLabel("How would you like to search?");
				TitleLabel.setBounds(20,10,250,30); 
				
				//The following are radio buttons to choose how the search will be performed
				JRadioButton FirstName = new JRadioButton("First name");
				FirstName.setBounds(10,30,150,30);
				
				JRadioButton LastName = new JRadioButton("Last name");
				LastName.setBounds(10,60,150,30);
				
				JRadioButton PhoneNumber = new JRadioButton("Phone Number");
				PhoneNumber.setBounds(10,90,150,30);
				
				JRadioButton WorkSchool = new JRadioButton("Work or School");
				WorkSchool.setBounds(10,120,150,30);
				
				//Groups the buttons together
				ButtonGroup group = new ButtonGroup();
					group.add(FirstName);
					group.add(LastName);
					group.add(PhoneNumber);
					group.add(WorkSchool);
					
				//Submit button to process search choice
				JButton Submit=new JButton("Submit");
				Submit.setBounds(10,160,200,30);
				Submit.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
					
						/*
							Depending on the selected information it will sort the data structure
							then display the contents based on that.
						*/
						
						displayChoice.dispose();
					}
				});
				
				//Cancel just in case user changes mind
				JButton Cancel=new JButton("Cancel");
				Cancel.setBounds(10,200,200,30);
				Cancel.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						displayChoice.dispose();
					}
				});	
				//Add all features to the window(Jframe)
				displayChoice.add(FirstName);	
				displayChoice.add(LastName);
				displayChoice.add(PhoneNumber);
				displayChoice.add(WorkSchool);
				displayChoice.add(TitleLabel);
				displayChoice.add(Submit);
				displayChoice.add(Cancel);
			}
		});
		
		menu.add(AddContact);  
		menu.add(DeleteContact);
		menu.add(SearchContact);
		menu.add(PossibleContact);
		menu.add(DisplayContact);
		menu.setSize(450,600);  
		menu.setLayout(null);
		menu.setVisible(true); 
		menu.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);     
	}  
}
