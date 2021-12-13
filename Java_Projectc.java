/**
* This is a small game like Lost In Forest/Paper Please for Java project 
* 
* @author Michael Chu 
**/

import hsa_ufa.Console; // this imports the code from the hsa_new package
import java.awt.*;      // this imports code for using colors and fonts

public class Java_Projectc // change this to match the name of the file
{
  static Console c = new Console(1600,900); // You can change this line to make the console bigger or smaller

  public static void main (String[] args) throws InterruptedException

  {
    // Code start here
    //Image Variables
    Image startImage;
    startImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("start.jpg"));
    Image noteImage;
    noteImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("note.jpg"));
    Image bgImage;
    bgImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("bg.jpg"));
    Image oldmanImage;
    oldmanImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("oldman.jpg"));
    Image oldwomanImage;
    oldwomanImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("oldwoman.jpg"));
    Image bombmanImage;
    bombmanImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("bombman.jpg"));
    Image manImage;
    manImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("man.jpg"));
    Image arrestedImage;
    arrestedImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("arrested.jpg"));
    Image brotherImage;
    brotherImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("brother.jpg"));
    Image logoImage;
    logoImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("logo.png"));
    //Papers Image Variables
    //1st person
    Image oldmanpassImage;
    oldmanpassImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("oldmanpass.jpg"));
    Image oldmanvisaImage;
    oldmanvisaImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("oldmanvisa.jpg"));
    //2nd person
    Image brotherpassImage;
    brotherpassImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("brotherpass.jpg"));
    Image brothervisaImage;
    brothervisaImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("brothervisa.jpg"));
    //3rd person
    Image oldwomanpassImage;
    oldwomanpassImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("oldwomanpass.jpg"));
    Image oldwomanvisaImage;
    oldwomanvisaImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("oldwomanvisa.jpg"));
    //4th person
    Image bombmanpassImage;
    bombmanpassImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("bombmanpass.jpg"));
    Image bombmanvisaImage;
    bombmanvisaImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("bombmanvisa.jpg"));
    //5th person
    Image manpassImage;
    manpassImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("manpass.jpg"));
    Image manvisaImage;
    manvisaImage = Toolkit.getDefaultToolkit ().getImage (c.getClass().getClassLoader().getResource("manvisa.jpg"));
    //User's anwser Variables
    char userAnswer; //stores player's choice-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Opening screen
    c.setBackgroundColor(new Color(255,0,0));
    c.clear();
    c.drawImage (logoImage,350,0);
    Thread.sleep(5000);//1000 = 1 second

    //Opening screen 2
    c.clear();
    c.setFont(new Font("Roboto",Font.BOLD,150));
    c.setColor(Color.yellow);
    c.drawString ("Passport Please",150,450);
    Thread.sleep(5000);//1000 = 1 second

    //Asking for background story
    c.clear();
    c.setBackgroundColor(new Color(0,0,0));
    c.clear();
    c.drawImage (bgImage,0,0,800,450);
    c.drawImage (noteImage,800,0,800,450);
    c.setFont(new Font("Roboto",Font.BOLD,20));
    c.setColor(Color.red);
    c.drawString ("Press y to continue",0,470);
    userAnswer = c.getChar();
    //Yes, background story################################################################################################################################################################################################################
    if (userAnswer == 'y')
    {
      c.clear();
      c.drawImage (bgImage,0,0,800,450);
      c.drawImage (noteImage,800,0,800,450);
      c.drawString ("Your name is Aleksei Volkov(Алексей Волков), you are a small character, a inspector, working for",0,470);
      Thread.sleep(500);//1000 = 1 second
      c.drawString ("a dictatorship government - People’s коммунизм Government in the 1960s. You will meet many different problems",0,490);
      Thread.sleep(500);//1000 = 1 second
      c.drawString ("and people who are trying to pass the border. You might meet rebels, civilians and officials during your job.",0,510);
      Thread.sleep(500);//1000 = 1 second
      c.drawString ("Good luck comrade...",0,530);
      Thread.sleep(12000);//1000 = 1 second
      c.clear();
      c.drawImage (startImage,0,0,800,450);
      c.drawImage (noteImage,800,0,800,450);
      c.drawString ("Captain Aleksandr: Glory to коммунизм, comrade!",0,470);
      Thread.sleep(500);//1000 = 1 second
      c.drawString ("You: Glory to коммунизм, comrade!",0,490);
      Thread.sleep(500);//1000 = 1 second
      c.drawString ("Captain Aleksandr: I'll be your guard for today Aleksei, call me if you need me.",0,510);
      Thread.sleep(500);//1000 = 1 second
      c.drawString ("You: Alright.",0,530);
      Thread.sleep(5000);//1000 = 1 second
      c.clear();
      //Game start, 1st person starts here-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
      c.drawImage (oldmanImage,0,0,800,450);
      c.drawImage (noteImage,800,0,800,450);
      c.drawString ("You: Passport and your visa please.",800,470);
      Thread.sleep(2500);//1000 = 1 second
      c.drawImage (oldmanpassImage,0,450,400,450);
      c.drawImage (oldmanvisaImage,400,450,400,450);
      c.drawString ("Robinsky: A bumpy road to here, I feels like I've been on a train for a day!",800,490);
      c.drawString ("Choose one option.",800,510);
      c.drawString ("a: Let him pass",800,530);//lose
      c.drawString ("b: Decline",800,550);//win
      c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
      c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
      userAnswer = c.getChar();
      if (userAnswer == 'a')
      {
        c.clear();
        c.drawImage (arrestedImage,0,0,800,450);
        c.drawImage (noteImage,800,0,800,450);
        c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
        Thread.sleep(500);//1000 = 1 second
        c.drawString ("The penalty is forced labor.",0,490);
        Thread.sleep(500);//1000 = 1 second
        c.drawString ("You family will be sent back to their village.",0,510);
        Thread.sleep(500);//1000 = 1 second
        c.drawString ("A replacement inspector will be found easily",0,530);
        Thread.sleep(500);//1000 = 1 second
        c.drawString ("Glory to коммунизм!",0,550);
        Thread.sleep(1000);//1000 = 1 second
        c.clear();
      }
      else if (userAnswer == 'b')
      {         
        c.clear();
        c.drawImage (bgImage,0,0,800,450);
        c.drawImage (noteImage,800,0,800,450);
        c.drawString ("Captain Aleksandr has detained him for an invalid visa.",0,470);
        Thread.sleep(5000);//1000 = 1 second
        c.clear();
      //2nd person starts here############################################################################################################################################################################################################################
        c.drawImage (brotherImage,0,0,800,450);
        c.drawImage (noteImage,800,0,800,450);
        c.drawString ("You: Passport and your visa please.",800,470);
        Thread.sleep(2000);//1000 = 1 second
        c.drawImage (brotherpassImage,0,450,400,450);
        c.drawImage (brothervisaImage,400,450,400,450);
        c.drawString ("Jason: >:)",800,490);
        c.drawString ("Choose one option.",800,510);
        c.drawString ("a: Let him pass",800,530);//lose
        c.drawString ("b: Decline",800,550);//win
        c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
        c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
        userAnswer = c.getChar();
        if (userAnswer == 'a')
        {
          //3rd person starts here############################################################################################################################################################################################################################
          c.clear();
          c.drawImage (oldwomanImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("You: Passport and your visa please.",800,470);
          Thread.sleep(2000);//1000 = 1 second
          c.drawImage (oldwomanpassImage,0,450,400,450);
          c.drawImage (oldwomanvisaImage,400,450,400,450);
          c.drawString ("Elisa: I came here to visit my son!",800,490);
          c.drawString ("Choose one option.",800,510);
          c.drawString ("a: Let her pass",800,530);//lose
          c.drawString ("b: Decline",800,550);//win
          c.drawString ("c: Ask her question",800,570);//if you let him pass, lose
          c.drawString ("d: Tell Captain Aleksandr to arrest her",800,590);//win
          userAnswer = c.getChar();
          if (userAnswer == 'a')
          {
            //4th person starts here############################################################################################################################################################################################################################
            c.clear();
            c.drawImage (bombmanImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("You: Passport and your visa please.",800,470);
            Thread.sleep(2000);//1000 = 1 second
            c.drawImage (bombmanpassImage,0,450,400,450);
            c.drawImage (bombmanvisaImage,400,450,400,450);
            c.drawString ("Fyodor: ...)",800,490);
            c.drawString ("Choose one option.",800,510);
            c.drawString ("a: Let him pass",800,530);//lose
            c.drawString ("b: Decline",800,550);//win
            c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
            c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
            userAnswer = c.getChar();
            if (userAnswer == 'a')
            {
              //5th person starts here and endings#########################################################################################################################################################################################################################
              c.clear();
              c.drawImage (manImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("You: Passport and your visa please.",800,470);
              Thread.sleep(2000);//1000 = 1 second
              c.drawImage (manpassImage,0,450,400,450);
              c.drawImage (manvisaImage,400,450,400,450);
              c.drawString ("Yermolai: )",800,490);
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);//lose
              c.drawString ("b: Decline",800,550);//win
              c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
              c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("You and your family are safe and free.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A new government will rise.",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He has a gun, he killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Your family dies in the battle.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A new government will rise.",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'c')
              {
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("You: Take off your hoodie!",800,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Yermolai: Let me in or DIE!",800,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);
                c.drawString ("b: Decline",800,550);
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }
              else if (userAnswer == 'd')
              {
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Your family dies in the battle.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A new government will rise.",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }//5th person ends here and endings############################################################################################################################################################################################################################
            else if (userAnswer == 'b')
            {
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("He triggered the bomb.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The explosion killed you.",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Their attack didn't go well, they failed.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The government will remember you and be thankful.",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
            else if (userAnswer == 'c')
            {
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawImage (bombmanpassImage,0,450,400,450);
              c.drawImage (bombmanvisaImage,400,450,400,450);
              c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);
              c.drawString ("b: Decline",800,550);
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //5th person starts here and endings#########################################################################################################################################################################################################################
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("Yermolai: )",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("You: Take off your hoodie!",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Yermolai: Let me in or DIE!",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(500);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//5th person ends here and endings############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He triggered the bomb.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The explosion killed you.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }
            else if (userAnswer == 'd')
            {
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Captain killed you.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("He is part of rebel.",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Their attack didn't go well, they failed.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The government will remember you and be thankful.",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
          }//4th person starts here############################################################################################################################################################################################################################
          else if (userAnswer == 'b')
          {
            c.clear();
            c.drawImage (arrestedImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("Your supervisor has reported you for theft of коммунизм's property.",0,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("The penalty is jail",0,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You family will be sent back to their village.",0,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("A replacement inspector will be found easily.",0,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Glory to коммунизм!",0,550);
            Thread.sleep(10000);//1000 = 1 second
            c.clear();
          }
          else if (userAnswer == 'c')
          {
            c.clear();
            c.drawImage (oldwomanImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawImage (oldwomanpassImage,0,450,400,450);
            c.drawImage (oldwomanvisaImage,400,450,400,450);
            c.drawString ("You: You are Arstotzkalian...",800,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Elisa: I'm just come here visit my son!",800,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Elisa: Please let me in.",800,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You: Who is your son?",800,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Elisa: Your minister.",800,550);
            c.drawString ("Choose one option.",800,570);
            c.drawString ("a: Let her pass",800,590);
            c.drawString ("b: Decline",800,610);
            userAnswer = c.getChar();
            if (userAnswer == 'a')
            {
              //4th person starts here############################################################################################################################################################################################################################
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("You: Passport and your visa please.",800,470);
              Thread.sleep(2000);//1000 = 1 second
              c.drawImage (bombmanpassImage,0,450,400,450);
              c.drawImage (bombmanvisaImage,400,450,400,450);
              c.drawString ("Fyodor: ...)",800,490);
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);//lose
              c.drawString ("b: Decline",800,550);//win
              c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
              c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //5th person starts here and endings#########################################################################################################################################################################################################################
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("Yermolai: )",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(500);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("You: Take off your hoodie!",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Yermolai: Let me in or DIE!",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//5th person ends here and endings############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He triggered the bomb.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The explosion killed you.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'c')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);
                c.drawString ("b: Decline",800,550);
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }
              else if (userAnswer == 'd')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }//4th person starts here############################################################################################################################################################################################################################
            else if (userAnswer == 'b')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your family is gone.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is forced labor",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("People will forget you.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
          }
          else if (userAnswer == 'd')
          {
            c.clear();
            c.drawImage (arrestedImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("Your supervisor has reported you for theft of коммунизм property.",0,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("The penalty is jail",0,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You family will be sent back to their village.",0,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("A replacement inspector will be found easily",0,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Glory to коммунизм!",0,550);
            Thread.sleep(10000);//1000 = 1 second
            c.clear();
          }
        }//3rd person ends here############################################################################################################################################################################################################################
        else if (userAnswer == 'b')
        {
          c.clear();
          c.drawImage (arrestedImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("The penalty is forced labor.",0,490);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("You family will be sent back to their village.",0,510);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("A replacement inspector will be found easily",0,530);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Glory to коммунизм!",0,550);
          Thread.sleep(10000);//1000 = 1 second
          c.clear();
        }
        else if (userAnswer == 'c')
        {
          c.clear();
          c.drawImage (brotherImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawImage (brotherpassImage,0,450,400,450);
          c.drawImage (brothervisaImage,400,450,400,450);
          c.drawString ("You: You are a cat LOL",800,470);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Yermolai: My brother turned me into a cat. ;-;",800,490);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Choose one option.",800,510);
          c.drawString ("a: Let him pass",800,530);
          c.drawString ("b: Decline",800,550);
          userAnswer = c.getChar();
          if (userAnswer == 'a')
          {
            //3rd person starts here############################################################################################################################################################################################################################
            c.clear();
            c.drawImage (oldwomanImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("You: Passport and your visa please.",800,470);
            Thread.sleep(2000);//1000 = 1 second
            c.drawImage (oldwomanpassImage,0,450,400,450);
            c.drawImage (oldwomanvisaImage,400,450,400,450);
            c.drawString ("Elisa: I came here to visit my son!",800,490);
            c.drawString ("Choose one option.",800,510);
            c.drawString ("a: Let her pass",800,530);//lose
            c.drawString ("b: Decline",800,550);//win
            c.drawString ("c: Ask her question",800,570);//if you let him pass, lose
            c.drawString ("d: Tell Captain Aleksandr to arrest her",800,590);//win
            userAnswer = c.getChar();
            if (userAnswer == 'a')
            {
              //4th person starts here############################################################################################################################################################################################################################
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("You: Passport and your visa please.",800,470);
              Thread.sleep(2000);//1000 = 1 second
              c.drawImage (bombmanpassImage,0,450,400,450);
              c.drawImage (bombmanvisaImage,400,450,400,450);
              c.drawString ("Fyodor: ...)",800,490);
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);//lose
              c.drawString ("b: Decline",800,550);//win
              c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
              c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //5th person starts here and endings#########################################################################################################################################################################################################################
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("Yermolai: )",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("You: Take off your hoodie!",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Yermolai: Let me in or DIE!",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//5th person ends here and endings############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He triggered the bomb.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The explosion killed you.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'c')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);
                c.drawString ("b: Decline",800,550);
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }
              else if (userAnswer == 'd')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }//4th person starts here############################################################################################################################################################################################################################
            else if (userAnswer == 'b')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your supervisor has reported you for theft of коммунизм's property.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is jail",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You family will be sent back to their village.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily.",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
            else if (userAnswer == 'c')
            {
              c.clear();
              c.drawImage (oldwomanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawImage (oldwomanpassImage,0,450,400,450);
              c.drawImage (oldwomanvisaImage,400,450,400,450);
              c.drawString ("You: You are Arstotzkalian...",800,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Elisa: I'm just come here visit my son!",800,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Elisa: Please let me in.",800,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You: Who is your son?",800,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Elisa: Your minister.",800,550);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Choose one option.",800,570);
              c.drawString ("a: Let her pass",800,590);
              c.drawString ("b: Decline",800,610);
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //4th person starts here############################################################################################################################################################################################################################
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("Fyodor: ...)",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (bombmanpassImage,0,450,400,450);
                  c.drawImage (bombmanvisaImage,400,450,400,450);
                  c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    //5th person starts here and endings#########################################################################################################################################################################################################################
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("You: Passport and your visa please.",800,470);
                    Thread.sleep(2000);//1000 = 1 second
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("Yermolai: )",800,490);
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);//lose
                    c.drawString ("b: Decline",800,550);//win
                    c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                    c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'c')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawImage (manpassImage,0,450,400,450);
                      c.drawImage (manvisaImage,400,450,400,450);
                      c.drawString ("You: Take off your hoodie!",800,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Yermolai: Let me in or DIE!",800,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Choose one option.",800,510);
                      c.drawString ("a: Let him pass",800,530);
                      c.drawString ("b: Decline",800,550);
                      userAnswer = c.getChar();
                      if (userAnswer == 'a')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family are safe and free.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                      else if (userAnswer == 'b')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("He has a gun, he killed you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("He is part of rebel.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Your family dies in the battle.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                    }
                    else if (userAnswer == 'd')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }//5th person ends here and endings############################################################################################################################################################################################################################
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (bombmanImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He triggered the bomb.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The explosion killed you.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack didn't go well, they failed.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The government will remember you and be thankful.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Glory to коммунизм!",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//4th person starts here############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (arrestedImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Your family is gone.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The penalty is forced labor",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("People will forget you.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A replacement inspector will be found easily",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }
            else if (userAnswer == 'd')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your supervisor has reported you for theft of коммунизм property.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is jail",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You family will be sent back to their village.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
          }//3rd person ends here############################################################################################################################################################################################################################
          else if (userAnswer == 'b')
          {
            c.clear();
            c.drawImage (arrestedImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("The penalty is forced labor.",0,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You family will be sent back to their village.",0,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("A replacement inspector will be found easily",0,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Glory to коммунизм!",0,550);
            Thread.sleep(10000);//1000 = 1 second
            c.clear();
          }
        }
        else if (userAnswer == 'd')
        {
          c.clear();
          c.drawImage (arrestedImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("The penalty is forced labor.",0,490);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("You family will be sent back to their village.",0,510);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("A replacement inspector will be found easily",0,530);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Glory to коммунизм!",0,550);
          Thread.sleep(10000);//1000 = 1 second
          c.clear();
        }
      }//2nd person ends here############################################################################################################################################################################################################################
      else if (userAnswer == 'c')
      {
        c.clear();
        c.drawImage (oldmanImage,0,0,800,450);
        c.drawImage (noteImage,800,0,800,450);
        c.drawImage (oldmanpassImage,0,450,400,450);
        c.drawImage (oldmanvisaImage,400,450,400,450);
        c.drawString ("You: What's wrong with your visa, why there is a spelling mistake?",800,470);
        Thread.sleep(500);//1000 = 1 second
        c.drawString ("Robinsky: Oh that damn guy, I told him many times to spell my name",800,490);
        Thread.sleep(500);//1000 = 1 second
        c.drawString ("correctly! Please inspector, I haven't seen my sister for 10 years",800,510);
        Thread.sleep(500);//1000 = 1 second
        c.drawString ("after the war.",800,530);
        Thread.sleep(500);//1000 = 1 second
        c.drawString ("Choose one option.",800,550);
        c.drawString ("a: Let him pass",800,570);
        c.drawString ("b: Decline",800,590);
        userAnswer = c.getChar();
        if (userAnswer == 'a')
        {
          c.clear();
          c.drawImage (arrestedImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("The penalty is forced labor.",0,490);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("You family will be sent back to their village.",0,510);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("A replacement inspector will be found easily",0,530);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Glory to коммунизм!",0,550);
          Thread.sleep(10000);//1000 = 1 second
          c.clear();
        }
        else if (userAnswer == 'b')
        {
          c.clear();
          c.drawImage (bgImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("Captain Aleksandr has detained him for an invalid visa.",0,470);
          Thread.sleep(5000);//1000 = 1 second
          c.clear();
          //2nd person starts here############################################################################################################################################################################################################################
          c.drawImage (brotherImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("You: Passport and your visa please.",800,470);
          Thread.sleep(2000);//1000 = 1 second
          c.drawImage (brotherpassImage,0,450,400,450);
          c.drawImage (brothervisaImage,400,450,400,450);
          c.drawString ("Jason: >:)",800,490);
          c.drawString ("Choose one option.",800,510);
          c.drawString ("a: Let him pass",800,530);//lose
          c.drawString ("b: Decline",800,550);//win
          c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
          c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
          userAnswer = c.getChar();
          if (userAnswer == 'a')
          {
            //3rd person starts here############################################################################################################################################################################################################################
            c.clear();
            c.drawImage (oldwomanImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("You: Passport and your visa please.",800,470);
            Thread.sleep(2000);//1000 = 1 second
            c.drawImage (oldwomanpassImage,0,450,400,450);
            c.drawImage (oldwomanvisaImage,400,450,400,450);
            c.drawString ("Elisa: I came here to visit my son!",800,490);
            c.drawString ("Choose one option.",800,510);
            c.drawString ("a: Let her pass",800,530);//lose
            c.drawString ("b: Decline",800,550);//win
            c.drawString ("c: Ask her question",800,570);//if you let him pass, lose
            c.drawString ("d: Tell Captain Aleksandr to arrest her",800,590);//win
            userAnswer = c.getChar();
            if (userAnswer == 'a')
            {
              //4th person starts here############################################################################################################################################################################################################################
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("You: Passport and your visa please.",800,470);
              Thread.sleep(2000);//1000 = 1 second
              c.drawImage (bombmanpassImage,0,450,400,450);
              c.drawImage (bombmanvisaImage,400,450,400,450);
              c.drawString ("Fyodor: ...)",800,490);
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);//lose
              c.drawString ("b: Decline",800,550);//win
              c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
              c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //5th person starts here and endings#########################################################################################################################################################################################################################
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("Yermolai: )",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("You: Take off your hoodie!",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Yermolai: Let me in or DIE!",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//5th person ends here and endings############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He triggered the bomb.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The explosion killed you.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'c')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);
                c.drawString ("b: Decline",800,550);
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }
              else if (userAnswer == 'd')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }//4th person starts here############################################################################################################################################################################################################################
            else if (userAnswer == 'b')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your supervisor has reported you for theft of коммунизм's property.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is jail",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You family will be sent back to their village.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily.",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
            else if (userAnswer == 'c')
            {
              c.clear();
              c.drawImage (oldwomanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawImage (oldwomanpassImage,0,450,400,450);
              c.drawImage (oldwomanvisaImage,400,450,400,450);
              c.drawString ("You: You are Arstotzkalian...",800,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Elisa: I'm just come here visit my son!",800,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Elisa: Please let me in.",800,510);
              c.drawString ("You: Who is your son?",800,530);
              c.drawString ("Elisa: Your minister.",800,550);
              c.drawString ("Choose one option.",800,570);
              c.drawString ("a: Let her pass",800,590);
              c.drawString ("b: Decline",800,610);
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //4th person starts here############################################################################################################################################################################################################################
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("Fyodor: ...)",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (bombmanpassImage,0,450,400,450);
                  c.drawImage (bombmanvisaImage,400,450,400,450);
                  c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    //5th person starts here and endings#########################################################################################################################################################################################################################
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("You: Passport and your visa please.",800,470);
                    Thread.sleep(2000);//1000 = 1 second
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("Yermolai: )",800,490);
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);//lose
                    c.drawString ("b: Decline",800,550);//win
                    c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                    c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'c')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawImage (manpassImage,0,450,400,450);
                      c.drawImage (manvisaImage,400,450,400,450);
                      c.drawString ("You: Take off your hoodie!",800,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Yermolai: Let me in or DIE!",800,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Choose one option.",800,510);
                      c.drawString ("a: Let him pass",800,530);
                      c.drawString ("b: Decline",800,550);
                      userAnswer = c.getChar();
                      if (userAnswer == 'a')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family are safe and free.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                      else if (userAnswer == 'b')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("He has a gun, he killed you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("He is part of rebel.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Your family dies in the battle.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                    }
                    else if (userAnswer == 'd')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }//5th person ends here and endings############################################################################################################################################################################################################################
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (bombmanImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He triggered the bomb.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The explosion killed you.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack didn't go well, they failed.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The government will remember you and be thankful.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Glory to коммунизм!",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//4th person starts here############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (arrestedImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Your family is gone.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The penalty is forced labor",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("People will forget you.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A replacement inspector will be found easily",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }
            else if (userAnswer == 'd')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your supervisor has reported you for theft of коммунизм property.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is jail",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You family will be sent back to their village.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
          }//3rd person ends here############################################################################################################################################################################################################################
          else if (userAnswer == 'b')
          {
            c.clear();
            c.drawImage (arrestedImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("The penalty is forced labor.",0,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You family will be sent back to their village.",0,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("A replacement inspector will be found easily",0,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Glory to коммунизм!",0,550);
            Thread.sleep(10000);//1000 = 1 second
            c.clear();
          }
          else if (userAnswer == 'c')
          {
            c.clear();
            c.drawImage (brotherImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawImage (brotherpassImage,0,450,400,450);
            c.drawImage (brothervisaImage,400,450,400,450);
            c.drawString ("You: You are a cat LOL",800,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Yermolai: My brother turned me into a cat. ;-;",800,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Choose one option.",800,510);
            c.drawString ("a: Let him pass",800,530);
            c.drawString ("b: Decline",800,550);
            userAnswer = c.getChar();
            if (userAnswer == 'a')
            {
              //3rd person starts here############################################################################################################################################################################################################################
              c.clear();
              c.drawImage (oldwomanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("You: Passport and your visa please.",800,470);
              Thread.sleep(2000);//1000 = 1 second
              c.drawImage (oldwomanpassImage,0,450,400,450);
              c.drawImage (oldwomanvisaImage,400,450,400,450);
              c.drawString ("Elisa: I came here to visit my son!",800,490);
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let her pass",800,530);//lose
              c.drawString ("b: Decline",800,550);//win
              c.drawString ("c: Ask her question",800,570);//if you let him pass, lose
              c.drawString ("d: Tell Captain Aleksandr to arrest her",800,590);//win
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //4th person starts here############################################################################################################################################################################################################################
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("Fyodor: ...)",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(500);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (bombmanpassImage,0,450,400,450);
                  c.drawImage (bombmanvisaImage,400,450,400,450);
                  c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    //5th person starts here and endings#########################################################################################################################################################################################################################
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("You: Passport and your visa please.",800,470);
                    Thread.sleep(2000);//1000 = 1 second
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("Yermolai: )",800,490);
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);//lose
                    c.drawString ("b: Decline",800,550);//win
                    c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                    c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'c')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawImage (manpassImage,0,450,400,450);
                      c.drawImage (manvisaImage,400,450,400,450);
                      c.drawString ("You: Take off your hoodie!",800,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Yermolai: Let me in or DIE!",800,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Choose one option.",800,510);
                      c.drawString ("a: Let him pass",800,530);
                      c.drawString ("b: Decline",800,550);
                      userAnswer = c.getChar();
                      if (userAnswer == 'a')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family are safe and free.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                      else if (userAnswer == 'b')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("He has a gun, he killed you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("He is part of rebel.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Your family dies in the battle.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                    }
                    else if (userAnswer == 'd')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }//5th person ends here and endings############################################################################################################################################################################################################################
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (bombmanImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He triggered the bomb.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The explosion killed you.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack didn't go well, they failed.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The government will remember you and be thankful.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Glory to коммунизм!",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//4th person starts here############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (arrestedImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Your supervisor has reported you for theft of коммунизм's property.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The penalty is jail",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("You family will be sent back to their village.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A replacement inspector will be found easily.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'c')
              {
                c.clear();
                c.drawImage (oldwomanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawImage (oldwomanpassImage,0,450,400,450);
                c.drawImage (oldwomanvisaImage,400,450,400,450);
                c.drawString ("You: You are Arstotzkalian...",800,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Elisa: I'm just come here visit my son!",800,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Elisa: Please let me in.",800,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("You: Who is your son?",800,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Elisa: Your minister.",800,550);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Choose one option.",800,570);
                c.drawString ("a: Let her pass",800,590);
                c.drawString ("b: Decline",800,610);
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //4th person starts here############################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (bombmanpassImage,0,450,400,450);
                  c.drawImage (bombmanvisaImage,400,450,400,450);
                  c.drawString ("Fyodor: ...)",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    //5th person starts here and endings#########################################################################################################################################################################################################################
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("You: Passport and your visa please.",800,470);
                    Thread.sleep(2000);//1000 = 1 second
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("Yermolai: )",800,490);
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);//lose
                    c.drawString ("b: Decline",800,550);//win
                    c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                    c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'c')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawImage (manpassImage,0,450,400,450);
                      c.drawImage (manvisaImage,400,450,400,450);
                      c.drawString ("You: Take off your hoodie!",800,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Yermolai: Let me in or DIE!",800,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Choose one option.",800,510);
                      c.drawString ("a: Let him pass",800,530);
                      c.drawString ("b: Decline",800,550);
                      userAnswer = c.getChar();
                      if (userAnswer == 'a')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family are safe and free.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                      else if (userAnswer == 'b')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("He has a gun, he killed you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("He is part of rebel.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Your family dies in the battle.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                    }
                    else if (userAnswer == 'd')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }//5th person ends here and endings############################################################################################################################################################################################################################
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (bombmanImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He triggered the bomb.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The explosion killed you.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack didn't go well, they failed.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The government will remember you and be thankful.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Glory to коммунизм!",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (bombmanImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (bombmanpassImage,0,450,400,450);
                    c.drawImage (bombmanvisaImage,400,450,400,450);
                    c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      //5th person starts here and endings#########################################################################################################################################################################################################################
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("You: Passport and your visa please.",800,470);
                      Thread.sleep(2000);//1000 = 1 second
                      c.drawImage (manpassImage,0,450,400,450);
                      c.drawImage (manvisaImage,400,450,400,450);
                      c.drawString ("Yermolai: )",800,490);
                      c.drawString ("Choose one option.",800,510);
                      c.drawString ("a: Let him pass",800,530);//lose
                      c.drawString ("b: Decline",800,550);//win
                      c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                      c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                      userAnswer = c.getChar();
                      if (userAnswer == 'a')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family are safe and free.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                      else if (userAnswer == 'b')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("He has a gun, he killed you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("He is part of rebel.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Your family dies in the battle.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                      else if (userAnswer == 'c')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawImage (manpassImage,0,450,400,450);
                        c.drawImage (manvisaImage,400,450,400,450);
                        c.drawString ("You: Take off your hoodie!",800,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Yermolai: Let me in or DIE!",800,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Choose one option.",800,510);
                        c.drawString ("a: Let him pass",800,530);
                        c.drawString ("b: Decline",800,550);
                        userAnswer = c.getChar();
                        if (userAnswer == 'a')
                        {
                          c.clear();
                          c.drawImage (manImage,0,0,800,450);
                          c.drawImage (noteImage,800,0,800,450);
                          c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                          Thread.sleep(500);//1000 = 1 second
                          c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                          Thread.sleep(500);//1000 = 1 second
                          c.drawString ("You and your family are safe and free.",0,510);
                          Thread.sleep(500);//1000 = 1 second
                          c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                          Thread.sleep(500);//1000 = 1 second
                          c.drawString ("A new government will rise.",0,550);
                          Thread.sleep(10000);//1000 = 1 second
                          c.clear();
                        }
                        else if (userAnswer == 'b')
                        {
                          c.clear();
                          c.drawImage (manImage,0,0,800,450);
                          c.drawImage (noteImage,800,0,800,450);
                          c.drawString ("He has a gun, he killed you.",0,470);
                          Thread.sleep(500);//1000 = 1 second
                          c.drawString ("He is part of rebel.",0,490);
                          Thread.sleep(500);//1000 = 1 second
                          c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                          Thread.sleep(500);//1000 = 1 second
                          c.drawString ("Your family dies in the battle.",0,530);
                          Thread.sleep(500);//1000 = 1 second
                          c.drawString ("A new government will rise.",0,550);
                          Thread.sleep(10000);//1000 = 1 second
                          c.clear();
                        }
                      }
                      else if (userAnswer == 'd')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("Captain killed you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("He is part of rebel.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Your family dies in the battle.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                    }//5th person ends here and endings############################################################################################################################################################################################################################
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (bombmanImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He triggered the bomb.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("The explosion killed you.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack didn't go well, they failed.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("The government will remember you and be thankful.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Glory to коммунизм!",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (bombmanImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack didn't go well, they failed.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The government will remember you and be thankful.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Glory to коммунизм!",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//4th person starts here############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (arrestedImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Your family is gone.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The penalty is forced labor",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("People will forget you.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A replacement inspector will be found easily",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }
              else if (userAnswer == 'd')
              {
                c.clear();
                c.drawImage (arrestedImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Your supervisor has reported you for theft of коммунизм property.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The penalty is jail",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("You family will be sent back to their village.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A replacement inspector will be found easily",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }//3rd person ends here############################################################################################################################################################################################################################
            else if (userAnswer == 'b')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is forced labor.",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You family will be sent back to their village.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
          }
          else if (userAnswer == 'd')
          {
            c.clear();
            c.drawImage (arrestedImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("The penalty is forced labor.",0,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You family will be sent back to their village.",0,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("A replacement inspector will be found easily",0,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Glory to коммунизм!",0,550);
            Thread.sleep(10000);//1000 = 1 second
            c.clear();
          }
        }//2nd person ends here############################################################################################################################################################################################################################
      }
      else if (userAnswer == 'd')
      {
        c.clear();
        c.drawImage (bgImage,0,0,800,450);
        c.drawImage (noteImage,800,0,800,450);
        c.drawString ("Captain Aleksandr has detained him for an invalid visa.",0,470);
        Thread.sleep(10000);//1000 = 1 second
        c.clear();
        //2nd person starts here############################################################################################################################################################################################################################
        c.drawImage (brotherImage,0,0,800,450);
        c.drawImage (noteImage,800,0,800,450);
        c.drawString ("You: Passport and your visa please.",800,470);
        Thread.sleep(2000);//1000 = 1 second
        c.drawImage (brotherpassImage,0,450,400,450);
        c.drawImage (brothervisaImage,400,450,400,450);
        c.drawString ("Jason: >:)",800,490);
        c.drawString ("Choose one option.",800,510);
        c.drawString ("a: Let him pass",800,530);//lose
        c.drawString ("b: Decline",800,550);//win
        c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
        c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
        userAnswer = c.getChar();
        if (userAnswer == 'a')
        {
          //3rd person starts here############################################################################################################################################################################################################################
          c.clear();
          c.drawImage (oldwomanImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("You: Passport and your visa please.",800,470);
          Thread.sleep(2000);//1000 = 1 second
          c.drawImage (oldwomanpassImage,0,450,400,450);
          c.drawImage (oldwomanvisaImage,400,450,400,450);
          c.drawString ("Elisa: I came here to visit my son!",800,490);
          c.drawString ("Choose one option.",800,510);
          c.drawString ("a: Let her pass",800,530);//lose
          c.drawString ("b: Decline",800,550);//win
          c.drawString ("c: Ask her question",800,570);//if you let him pass, lose
          c.drawString ("d: Tell Captain Aleksandr to arrest her",800,590);//win
          userAnswer = c.getChar();
          if (userAnswer == 'a')
          {
            //4th person starts here############################################################################################################################################################################################################################
            c.clear();
            c.drawImage (bombmanImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("You: Passport and your visa please.",800,470);
            Thread.sleep(2000);//1000 = 1 second
            c.drawImage (bombmanpassImage,0,450,400,450);
            c.drawImage (bombmanvisaImage,400,450,400,450);
            c.drawString ("Fyodor: ...)",800,490);
            c.drawString ("Choose one option.",800,510);
            c.drawString ("a: Let him pass",800,530);//lose
            c.drawString ("b: Decline",800,550);//win
            c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
            c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
            userAnswer = c.getChar();
            if (userAnswer == 'a')
            {
              //5th person starts here and endings#########################################################################################################################################################################################################################
              c.clear();
              c.drawImage (manImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("You: Passport and your visa please.",800,470);
              Thread.sleep(2000);//1000 = 1 second
              c.drawImage (manpassImage,0,450,400,450);
              c.drawImage (manvisaImage,400,450,400,450);
              c.drawString ("Yermolai: )",800,490);
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);//lose
              c.drawString ("b: Decline",800,550);//win
              c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
              c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("You and your family are safe and free.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A new government will rise.",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He has a gun, he killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Your family dies in the battle.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A new government will rise.",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'c')
              {
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("You: Take off your hoodie!",800,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Yermolai: Let me in or DIE!",800,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);
                c.drawString ("b: Decline",800,550);
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }
              else if (userAnswer == 'd')
              {
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Your family dies in the battle.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A new government will rise.",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }//5th person ends here and endings############################################################################################################################################################################################################################
            else if (userAnswer == 'b')
            {
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("He triggered the bomb.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The explosion killed you.",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Their attack didn't go well, they failed.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The government will remember you and be thankful.",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
            else if (userAnswer == 'c')
            {
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawImage (bombmanpassImage,0,450,400,450);
              c.drawImage (bombmanvisaImage,400,450,400,450);
              c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);
              c.drawString ("b: Decline",800,550);
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //5th person starts here and endings#########################################################################################################################################################################################################################
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("Yermolai: )",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("You: Take off your hoodie!",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Yermolai: Let me in or DIE!",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//5th person ends here and endings############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He triggered the bomb.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The explosion killed you.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }
            else if (userAnswer == 'd')
            {
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Captain killed you.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("He is part of rebel.",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Their attack didn't go well, they failed.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The government will remember you and be thankful.",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
          }//4th person starts here############################################################################################################################################################################################################################
          else if (userAnswer == 'b')
          {
            c.clear();
            c.drawImage (arrestedImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("Your supervisor has reported you for theft of коммунизм's property.",0,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("The penalty is jail",0,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You family will be sent back to their village.",0,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("A replacement inspector will be found easily.",0,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Glory to коммунизм!",0,550);
            Thread.sleep(10000);//1000 = 1 second
            c.clear();
          }
          else if (userAnswer == 'c')
          {
            c.clear();
            c.drawImage (oldwomanImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawImage (oldwomanpassImage,0,450,400,450);
            c.drawImage (oldwomanvisaImage,400,450,400,450);
            c.drawString ("You: You are Arstotzkalian...",800,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Elisa: I'm just come here visit my son!",800,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Elisa: Please let me in.",800,510);
            c.drawString ("You: Who is your son?",800,530);
            c.drawString ("Elisa: Your minister.",800,550);
            c.drawString ("Choose one option.",800,570);
            c.drawString ("a: Let her pass",800,590);
            c.drawString ("b: Decline",800,610);
            userAnswer = c.getChar();
            if (userAnswer == 'a')
            {
              //4th person starts here############################################################################################################################################################################################################################
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("You: Passport and your visa please.",800,470);
              Thread.sleep(2000);//1000 = 1 second
              c.drawImage (bombmanpassImage,0,450,400,450);
              c.drawImage (bombmanvisaImage,400,450,400,450);
              c.drawString ("Fyodor: ...)",800,490);
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);//lose
              c.drawString ("b: Decline",800,550);//win
              c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
              c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //5th person starts here and endings#########################################################################################################################################################################################################################
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("Yermolai: )",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("You: Take off your hoodie!",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Yermolai: Let me in or DIE!",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//5th person ends here and endings############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He triggered the bomb.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The explosion killed you.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'c')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);
                c.drawString ("b: Decline",800,550);
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }
              else if (userAnswer == 'd')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }//4th person starts here############################################################################################################################################################################################################################
            else if (userAnswer == 'b')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your family is gone.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is forced labor",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("People will forget you.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
          }
          else if (userAnswer == 'd')
          {
            c.clear();
            c.drawImage (arrestedImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("Your supervisor has reported you for theft of коммунизм property.",0,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("The penalty is jail",0,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You family will be sent back to their village.",0,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("A replacement inspector will be found easily",0,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Glory to коммунизм!",0,550);
            Thread.sleep(10000);//1000 = 1 second
            c.clear();
          }
        }//3rd person ends here############################################################################################################################################################################################################################
        else if (userAnswer == 'b')
        {
          c.clear();
          c.drawImage (arrestedImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("The penalty is forced labor.",0,490);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("You family will be sent back to their village.",0,510);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("A replacement inspector will be found easily",0,530);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Glory to коммунизм!",0,550);
          Thread.sleep(10000);//1000 = 1 second
          c.clear();
        }
        else if (userAnswer == 'c')
        {
          c.clear();
          c.drawImage (brotherImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawImage (brotherpassImage,0,450,400,450);
          c.drawImage (brothervisaImage,400,450,400,450);
          c.drawString ("You: You are a cat LOL",800,470);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Yermolai: My brother turned me into a cat. ;-;",800,490);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Choose one option.",800,510);
          c.drawString ("a: Let him pass",800,530);
          c.drawString ("b: Decline",800,550);
          userAnswer = c.getChar();
          if (userAnswer == 'a')
          {
            //3rd person starts here############################################################################################################################################################################################################################
            c.clear();
            c.drawImage (oldwomanImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("You: Passport and your visa please.",800,470);
            Thread.sleep(2000);//1000 = 1 second
            c.drawImage (oldwomanpassImage,0,450,400,450);
            c.drawImage (oldwomanvisaImage,400,450,400,450);
            c.drawString ("Elisa: I came here to visit my son!",800,490);
            c.drawString ("Choose one option.",800,510);
            c.drawString ("a: Let her pass",800,530);//lose
            c.drawString ("b: Decline",800,550);//win
            c.drawString ("c: Ask her question",800,570);//if you let him pass, lose
            c.drawString ("d: Tell Captain Aleksandr to arrest her",800,590);//win
            userAnswer = c.getChar();
            if (userAnswer == 'a')
            {
              //4th person starts here############################################################################################################################################################################################################################
              c.clear();
              c.drawImage (bombmanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("You: Passport and your visa please.",800,470);
              Thread.sleep(2000);//1000 = 1 second
              c.drawImage (bombmanpassImage,0,450,400,450);
              c.drawImage (bombmanvisaImage,400,450,400,450);
              c.drawString ("Fyodor: ...)",800,490);
              c.drawString ("Choose one option.",800,510);
              c.drawString ("a: Let him pass",800,530);//lose
              c.drawString ("b: Decline",800,550);//win
              c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
              c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //5th person starts here and endings#########################################################################################################################################################################################################################
                c.clear();
                c.drawImage (manImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (manpassImage,0,450,400,450);
                c.drawImage (manvisaImage,400,450,400,450);
                c.drawString ("Yermolai: )",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family are safe and free.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He has a gun, he killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("You: Take off your hoodie!",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Yermolai: Let me in or DIE!",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Your family dies in the battle.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("A new government will rise.",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//5th person ends here and endings############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("He triggered the bomb.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The explosion killed you.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(500);//1000 = 1 second
                c.clear();
              }
              else if (userAnswer == 'c')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);
                c.drawString ("b: Decline",800,550);
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }
              else if (userAnswer == 'd')
              {
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Captain killed you.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("He is part of rebel.",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Their attack didn't go well, they failed.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The government will remember you and be thankful.",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }//4th person starts here############################################################################################################################################################################################################################
            else if (userAnswer == 'b')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your supervisor has reported you for theft of коммунизм's property.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is jail",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You family will be sent back to their village.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily.",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
            else if (userAnswer == 'c')
            {
              c.clear();
              c.drawImage (oldwomanImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawImage (oldwomanpassImage,0,450,400,450);
              c.drawImage (oldwomanvisaImage,400,450,400,450);
              c.drawString ("You: You are Arstotzkalian...",800,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Elisa: I'm just come here visit my son!",800,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Elisa: Please let me in.",800,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You: Who is your son?",800,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Elisa: Your minister.",800,550);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Choose one option.",800,570);
              c.drawString ("a: Let her pass",800,590);
              c.drawString ("b: Decline",800,610);
              userAnswer = c.getChar();
              if (userAnswer == 'a')
              {
                //4th person starts here############################################################################################################################################################################################################################
                c.clear();
                c.drawImage (bombmanImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("You: Passport and your visa please.",800,470);
                Thread.sleep(2000);//1000 = 1 second
                c.drawImage (bombmanpassImage,0,450,400,450);
                c.drawImage (bombmanvisaImage,400,450,400,450);
                c.drawString ("Fyodor: ...)",800,490);
                c.drawString ("Choose one option.",800,510);
                c.drawString ("a: Let him pass",800,530);//lose
                c.drawString ("b: Decline",800,550);//win
                c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                userAnswer = c.getChar();
                if (userAnswer == 'a')
                {
                  //5th person starts here and endings#########################################################################################################################################################################################################################
                  c.clear();
                  c.drawImage (manImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("You: Passport and your visa please.",800,470);
                  Thread.sleep(2000);//1000 = 1 second
                  c.drawImage (manpassImage,0,450,400,450);
                  c.drawImage (manvisaImage,400,450,400,450);
                  c.drawString ("Yermolai: )",800,490);
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);//lose
                  c.drawString ("b: Decline",800,550);//win
                  c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                  c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family are safe and free.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He has a gun, he killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                  else if (userAnswer == 'c')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("You: Take off your hoodie!",800,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Yermolai: Let me in or DIE!",800,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);
                    c.drawString ("b: Decline",800,550);
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }
                  else if (userAnswer == 'd')
                  {
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("Captain killed you.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("He is part of rebel.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Your family dies in the battle.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("A new government will rise.",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }//5th person ends here and endings############################################################################################################################################################################################################################
                else if (userAnswer == 'b')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("He triggered the bomb.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The explosion killed you.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
                else if (userAnswer == 'c')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawImage (bombmanpassImage,0,450,400,450);
                  c.drawImage (bombmanvisaImage,400,450,400,450);
                  c.drawString ("You: It's only 25°C, don't you feel hot?",800,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Fyodor: Compare to Fatali, I think it's cold.",800,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Choose one option.",800,510);
                  c.drawString ("a: Let him pass",800,530);
                  c.drawString ("b: Decline",800,550);
                  userAnswer = c.getChar();
                  if (userAnswer == 'a')
                  {
                    //5th person starts here and endings#########################################################################################################################################################################################################################
                    c.clear();
                    c.drawImage (manImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("You: Passport and your visa please.",800,470);
                    Thread.sleep(2000);//1000 = 1 second
                    c.drawImage (manpassImage,0,450,400,450);
                    c.drawImage (manvisaImage,400,450,400,450);
                    c.drawString ("Yermolai: )",800,490);
                    c.drawString ("Choose one option.",800,510);
                    c.drawString ("a: Let him pass",800,530);//lose
                    c.drawString ("b: Decline",800,550);//win
                    c.drawString ("c: Ask him question",800,570);//if you let him pass, lose
                    c.drawString ("d: Tell Captain Aleksandr to arrest him",800,590);//win
                    userAnswer = c.getChar();
                    if (userAnswer == 'a')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family are safe and free.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'b')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("He has a gun, he killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                    else if (userAnswer == 'c')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawImage (manpassImage,0,450,400,450);
                      c.drawImage (manvisaImage,400,450,400,450);
                      c.drawString ("You: Take off your hoodie!",800,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Yermolai: Let me in or DIE!",800,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Choose one option.",800,510);
                      c.drawString ("a: Let him pass",800,530);
                      c.drawString ("b: Decline",800,550);
                      userAnswer = c.getChar();
                      if (userAnswer == 'a')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("Captain and they are rebels, but Captain and other rebels didn't kill you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("They let you go. You ran back to your house and bring your family out of the battlefields.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family are safe and free.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("You and your family moved back to the village and start a life there again.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                      else if (userAnswer == 'b')
                      {
                        c.clear();
                        c.drawImage (manImage,0,0,800,450);
                        c.drawImage (noteImage,800,0,800,450);
                        c.drawString ("He has a gun, he killed you.",0,470);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("He is part of rebel.",0,490);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("Your family dies in the battle.",0,530);
                        Thread.sleep(500);//1000 = 1 second
                        c.drawString ("A new government will rise.",0,550);
                        Thread.sleep(10000);//1000 = 1 second
                        c.clear();
                      }
                    }
                    else if (userAnswer == 'd')
                    {
                      c.clear();
                      c.drawImage (manImage,0,0,800,450);
                      c.drawImage (noteImage,800,0,800,450);
                      c.drawString ("Captain killed you.",0,470);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("He is part of rebel.",0,490);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Their attack goes well and successfully win the battle.",0,510);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("Your family dies in the battle.",0,530);
                      Thread.sleep(500);//1000 = 1 second
                      c.drawString ("A new government will rise.",0,550);
                      Thread.sleep(10000);//1000 = 1 second
                      c.clear();
                    }
                  }//5th person ends here and endings############################################################################################################################################################################################################################
                  else if (userAnswer == 'b')
                  {
                    c.clear();
                    c.drawImage (bombmanImage,0,0,800,450);
                    c.drawImage (noteImage,800,0,800,450);
                    c.drawString ("He triggered the bomb.",0,470);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The explosion killed you.",0,490);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Their attack didn't go well, they failed.",0,510);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("The government will remember you and be thankful.",0,530);
                    Thread.sleep(500);//1000 = 1 second
                    c.drawString ("Glory to коммунизм!",0,550);
                    Thread.sleep(10000);//1000 = 1 second
                    c.clear();
                  }
                }
                else if (userAnswer == 'd')
                {
                  c.clear();
                  c.drawImage (bombmanImage,0,0,800,450);
                  c.drawImage (noteImage,800,0,800,450);
                  c.drawString ("Captain killed you.",0,470);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("He is part of rebel.",0,490);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Their attack didn't go well, they failed.",0,510);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("The government will remember you and be thankful.",0,530);
                  Thread.sleep(500);//1000 = 1 second
                  c.drawString ("Glory to коммунизм!",0,550);
                  Thread.sleep(10000);//1000 = 1 second
                  c.clear();
                }
              }//4th person starts here############################################################################################################################################################################################################################
              else if (userAnswer == 'b')
              {
                c.clear();
                c.drawImage (arrestedImage,0,0,800,450);
                c.drawImage (noteImage,800,0,800,450);
                c.drawString ("Your family is gone.",0,470);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("The penalty is forced labor",0,490);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("People will forget you.",0,510);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("A replacement inspector will be found easily",0,530);
                Thread.sleep(500);//1000 = 1 second
                c.drawString ("Glory to коммунизм!",0,550);
                Thread.sleep(10000);//1000 = 1 second
                c.clear();
              }
            }
            else if (userAnswer == 'd')
            {
              c.clear();
              c.drawImage (arrestedImage,0,0,800,450);
              c.drawImage (noteImage,800,0,800,450);
              c.drawString ("Your supervisor has reported you for theft of коммунизм property.",0,470);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("The penalty is jail",0,490);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("You family will be sent back to their village.",0,510);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("A replacement inspector will be found easily",0,530);
              Thread.sleep(500);//1000 = 1 second
              c.drawString ("Glory to коммунизм!",0,550);
              Thread.sleep(10000);//1000 = 1 second
              c.clear();
            }
          }//3rd person ends here############################################################################################################################################################################################################################
          else if (userAnswer == 'b')
          {
            c.clear();
            c.drawImage (arrestedImage,0,0,800,450);
            c.drawImage (noteImage,800,0,800,450);
            c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("The penalty is forced labor.",0,490);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("You family will be sent back to their village.",0,510);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("A replacement inspector will be found easily",0,530);
            Thread.sleep(500);//1000 = 1 second
            c.drawString ("Glory to коммунизм!",0,550);
            Thread.sleep(10000);//1000 = 1 second
            c.clear();
          }
        }
        else if (userAnswer == 'd')
        {
          c.clear();
          c.drawImage (arrestedImage,0,0,800,450);
          c.drawImage (noteImage,800,0,800,450);
          c.drawString ("Your supervisor has reported you for the negligence of your duty.",0,470);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("The penalty is forced labor.",0,490);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("You family will be sent back to their village.",0,510);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("A replacement inspector will be found easily",0,530);
          Thread.sleep(500);//1000 = 1 second
          c.drawString ("Glory to коммунизм!",0,550);
          Thread.sleep(10000);//1000 = 1 second
          c.clear();
        }
      }//1st and 2nd person ends here------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }//No, background story##################################################################################################################################################################################################################
    else if (userAnswer != 'y')
    {
      c.clear();
      c.drawImage (bgImage,0,0,800,450);
      c.drawImage (noteImage,800,0,800,450);
      c.drawString ("Easter egg, Hiiiiii :))))), restart the program",0,470);
      Thread.sleep(10000);//1000 = 1 second
      c.clear(); 
    }
  }
}
