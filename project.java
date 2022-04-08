import java.util.Scanner;
class project
{
    Scanner sc=new Scanner(System.in);
    void cricket()
    {
        System.out.println("\f");//to clean the window
        int infinity;//used to keep the game until the user wants
        int cheat;//used to over the game if the player is cheating
        double rn;//its is the random number by computer
        int un;//it is the number entered by the user
        int cn;//it is the number from computer 
        int uscore;//it is the score of the user
        int cscore;//it is the score of computer
        int c;//used for the loop 
        int cp;//it is continue playing the player can play till he not out
        int choose;//used to choose batting or bowling;
        infinity=1;
        while(infinity>0)
        {
            uscore=0;
            cp=1;
            cscore=0;
            rn=0.0;
            cheat=0;
            choose=0;
            cn=0;
            System.out.println("==========================");
            System.out.println(" WELCOME TO CRICKET-MANIA");
            System.out.println("==========================");
            for(c=0;c<2;c++)
                System.out.println("====================================");
            System.out.println("******************************************");
            System.out.println("---------------INSTRUCTIONS---------------");
            System.out.println("1.This Game Is Similar To The Hand-Cricket Played By Kids.");
            System.out.println("2.There Is No Limit In The Number Of Balls."); 
            System.out.println("3.Enter Any Number From 1 To 10.");
            System.out.println("4.Enter The Numbers Carefully Without Making Any Mistake.");
            System.out.println("5.Your Final Score Will Be The Sum Of The Numbers You Entered Before Getting Out.");
            System.out.println("6.If The Number Entered By The Computer Is Same As The Number Entered By You,You Will Be Declared As Out.");
            System.out.println("7.If The Number Entered By You Is Same As The Number Entered By Computer, Computer Will Be Declared Out.");
            System.out.println("8.The One Who Scores More Wins, If The Score Is Same Then Its A Tie");
            for(c=0;c<2;c++)
                System.out.println("====================================");
            System.out.println("Choose Batting Or Bowling");
            System.out.println("To Bat Press 1");
            System.out.println("To Bowl Press 2");
            choose=sc.nextInt();
            switch(choose)
            {
                case 1:
                System.out.println("========YOUR=BATTING========");
                while(cp>0)
                {
                    System.out.print("Enter Your Number:");
                    un=sc.nextInt();
                    rn=(Math.random())*10;
                    rn=rn+1;
                    cn=(int)rn;
                    System.out.println(" ");
                    System.out.println("Computer's Number:"+cn);
                    System.out.println(" ");
                    if(un==cn)
                    {
                        System.out.println("");
                        System.out.println("!!!!HOWZATT!!!!");
                        System.out.println("");;
                        System.out.println("####################");
                        System.out.println("Your Final Score:"+uscore);
                        System.out.println("####################");
                        cp=1;
                        break;
                    }
                    else if(un>0 && un<=10)
                    {
                        uscore=uscore+un;
                    }
                    else if(un>10||un<0)
                    {
                        cheat=1;
                        System.out.println("===========================================");
                        System.out.println("===========================================");
                        System.out.println(" ");
                        System.out.println("You Have Tried To CHEAT Or You Have Entered A Wrong Input");
                        System.out.println("!!!!!!---GAME OVER---!!!!!!");
                        System.out.println(" ");
                        cp=1;
                        break;
                    }
                    System.out.println("===============");
                    System.out.println("Your score is "+uscore);
                    System.out.println("===============");
                }
                if(cheat==0)
                {
                    System.out.println(" ");
                    System.out.println("====YOUR=BOWLING====");
                    System.out.println(" ");
                }
                while(cp>0)
                {
                    if(cheat>0)
                    {
                        cp=1;
                        break;
                    }
                    System.out.print("Enter Your Number:");
                    un=sc.nextInt();
                    rn=(Math.random())*10;
                    rn=rn+1;
                    cn=(int)rn;
                    System.out.println(" ");
                    System.out.println("Computer's Number:"+cn);
                    System.out.println(" ");
                    if(un==cn)
                    {
                        System.out.println("");
                        System.out.println("!!!!HOWZATT!!!!");
                        System.out.println("");;
                        System.out.println("####################");
                        System.out.println("Computer's Final Score:"+cscore);
                        System.out.println("####################");
                        cp=1;
                        break;
                    }
                    else if(un>0 && un<=10)
                        cscore=cscore+cn;
                    else if(un>10||un<0)
                    {
                        cheat=1;
                        System.out.println("===========================================");
                        System.out.println("===========================================");
                        System.out.println(" ");
                        System.out.println("You Have Tried To CHEAT Or You Have Entered A Wrong Input");
                        System.out.println("!!!!!!---GAME OVER---!!!!!!");
                        System.out.println(" ");
                        cp=1;
                        break;
                    }
                    System.out.println("===============");
                    System.out.println("Computer's score is "+cscore);
                    System.out.println("===============");
                    if(cscore>uscore)
                    {
                        cp=1;
                        break;
                    }
                }
                if(cheat>0)
                {
                }
                else
                {
                    System.out.println("################");
                    System.out.println("YOUR FINAL SCORE :"+uscore);
                    System.out.println("COMPUTER'S FINAL SCORE :"+cscore);
                    System.out.println("################");
                    System.out.println("");
                    if(uscore>cscore)
                        System.out.println("Congratulations You Have Defeated The Almighty, Computer!!");
                    else if(cscore>uscore)
                        System.out.println("Sorry But The Computer Has Defeated You..!!");
                    else
                        System.out.println("Its a Tie....");
                }
                break;
                case 2:
                System.out.println("========YOUR=BOWLING========");
                while(cp>0)
                {
                    System.out.print("Enter Your Number:");
                    un=sc.nextInt();
                    rn=(Math.random())*10;
                    rn=rn+1;
                    cn=(int)rn;
                    System.out.println(" ");
                    System.out.println("Computer's Number:"+cn);
                    System.out.println(" ");
                    if(un==cn)
                    {
                        System.out.println("");
                        System.out.println("!!!!HOWZATT!!!!");
                        System.out.println("");;
                        System.out.println("####################");
                        System.out.println("Computer's Final Score:"+cscore);
                        System.out.println("####################");
                        cp=1;
                        break;
                    }
                    else if(un>0 && un<=10)
                        cscore=cscore+cn;
                    else if(un>10||un<0)
                    {
                        cheat=1;
                        System.out.println("===========================================");
                        System.out.println("===========================================");
                        System.out.println(" ");
                        System.out.println("You Have Tried To CHEAT Or You Have Entered A Wrong Input");
                        System.out.println("!!!!!!---GAME OVER---!!!!!!");
                        System.out.println(" ");
                        cp=1;
                        break;
                    }
                    System.out.println("===============");
                    System.out.println("Computer's score is "+cscore);
                    System.out.println("===============");
                }
                if(cheat==0)
                {
                    System.out.println(" ");
                    System.out.println("====YOUR=BATTING====");
                    System.out.println(" ");

                }
                while(cp>0)
                {
                    if(cheat>0)
                    {
                        cp=1;
                        break;
                    }
                    System.out.print("Enter Your Number:");
                    un=sc.nextInt();
                    rn=(Math.random())*10;
                    rn=rn+1;
                    cn=(int)rn;
                    System.out.println(" ");
                    System.out.println("Computer's Number:"+cn);
                    System.out.println(" ");
                    if(un==cn)
                    {
                        System.out.println("");
                        System.out.println("!!!!HOWZATT!!!!");
                        System.out.println("");;
                        System.out.println("####################");
                        System.out.println("Your Final Score:"+uscore);
                        System.out.println("####################");
                        cp=1;
                        break;
                    }
                    else if(un>0 && un<=10)
                        uscore=uscore+un;
                    else if(un>10||un<0)
                    {
                        cheat=1;
                        System.out.println("===========================================");
                        System.out.println("===========================================");
                        System.out.println(" ");
                        System.out.println("You Have Tried To CHEAT Or You Have Entered A Wrong Input");
                        System.out.println("!!!!!!---GAME OVER---!!!!!!");
                        System.out.println(" ");
                        cp=1;
                        break;
                    }
                    System.out.println("===============");
                    System.out.println("Your score is "+uscore);
                    System.out.println("===============");
                    if(uscore>cscore)
                    {
                        cp=1;
                        break;
                    }
                }
                if(cheat>0)
                {
                }
                else
                {
                    System.out.println("################");
                    System.out.println("YOUR FINAL SCORE :"+uscore);
                    System.out.println("COMPUTER'S FINAL SCORE :"+cscore);
                    System.out.println("################");
                    System.out.println("");
                    if(uscore>cscore)
                        System.out.println("Congratulations You Have Defeated The Almighty, Computer!!");
                    else if(cscore>uscore)
                        System.out.println("Sorry But The Computer Has Defeated You..!!");
                    else
                        System.out.println("Its a Tie....");
                }
                break;
                default:
                System.out.println("!!!!!!!!ERROR!!!!!!!!");
                System.out.println("Please Enter A Valid Choise");
            }
            System.out.println("To Cricket-Mania Play Again Press '1'");
            System.out.println("To Go On The Main Page '0'");
            infinity=sc.nextInt();
            System.out.println("\f");//to clean the page
        }
    }

    void bollywood()
    {
        System.out.println("\f");//to clean the page
        String m[]={"Iqbal","Chamku","Jimmy","Mission Istanbul","Drohkaal","My name is khan","Rafoochakkar",
                "Insaaf ki aawaaz","Mujhe meri biwi se bachao","Sahib Bibi aur ghulam","Nastik","Don muthu swami","Mr Ya Miss"
            ,"My name is anthony gonsalves","Happy New Year","Paheli","Rok sako to rok lo","Shaka Laka Boom Boom"
            ,"Luv Shuv Tey Chicken Khurana","Unns","Utthaan","Tango Charlie","Via Darjeeling","Eight Shani",
                "Manorama Six Feet Under","1857 The rising","Kabul Express","Eklavya","Jhoot bole kauwa kaate","36 china town"
            ,"Anwar","Bas ek pal","Bombay to bangkok","Journey Bombay to goa","Bose the forgotten hero","Dashavatar"
            ,"Fareb","Sanju","Thugs of hinduatan","Tumbbad","Dhadak","PK","Sultan","Padman","1921","Mohalla Assi"
            ,"OMG Oh My God","kick","Wanted","Barfi","Shahid","Student of the Year","Mary Kom","Blue","Don 2","Ugly"
            ,"Gunday","Krrish 3","Krrish","Company","Dhoom 3","Dhoom 2","Dhoom","Dussehra","FryDay","Page 16"
            ,"Redrum","Tubelight","Judwaa 2","Judwaa","Hindi Medium","Border","Dev D","Devdas","Airlift","Akira"
            ,"Happy Bhag Jayegi","Befikre","Sanam Re","A Flying Jatt","Singh Is Bling","Welcome Back","Aligarh","Fugly"
            ,"Players","Shanghai","Bheja Fry 2","No Problem","Golmaal Returns","Hum Aapke Hain Koun","Jo Bole So Nihaal"
            ,"Kuch Kuch Hota Hai","Jurm","Insan","Shabd","Dum","Munna Bhai MBBS","Hogi Pyaar Ki Jeet","Dastak","Dangal"};//used to save the name os movies;
        String h1[]={"2005","2008","2008","2008","1994","20 10","1975","1986","2001","1962","1983","2008","2005","2008","2014"
            ,"2005","2004","2007","2012","2006","2006","2005","2008","2006","2007","2005","2006","2007","1998","2006"
            ,"2007","2006","2008","2007","2004","2008","2005","2018","2018","2018","2018","2014","2016","2018","2018"
            ,"2018","2018","2014","2009","2012","2012","2012","2014","2009","2009","2014","2014","2013","2006","2002"
            ,"2013","2006","2004","2018","2018","2018","2018","2017","2017","1997","2017","1997","2009","2002","2012","2016"
            ,"2016","2016","2016","2016","2016","2015","2015","2015","2014","2012","2012","2011","2011","2008","1994","2005"
            ,"1998","2005","2005","2005","2003","2003","1996","2016"};//used for the hint in case if the player is not albe th gusse the name of the movie
        String h2[]={"Nagesh Kukunoor","Kabeer Kaushik","Raj N. Sippy","Apoorva Lakhia","Govind Nihalani","Karan Johar"
            ,"Narendra Bedi","B. Gopal & D Ramanaidu","Harry Baweja","Abrar Alvi","Pramod Chakravorty","Ashim Samanta",
                "Antara Mali and Satchit Puranik","Eeshwar Nivas","Farah Khan","Amol Palekar","Arindam Chaudhuri","Suneel Darshan"
            , "Sameer Sharma","Bhupender Gupta","U. Chatterjee","Mani Shankar","Arindam Nandy","Karan Razdan","Navdeep Singh"
            ,"Ketan Mehta","Kabir Khan","Vidhu Vinod Chopra","Vidhu Vinod Chopra","Mastan Alibhai Burmawalla and Abbas Burmawalla"
            ,"Manish Jha","Onir","Nagesh Kukunoor","Raj Pendurkar","Shyam Benegal","K. S. Ravikumar","Vikram Bhatt","Rajkumar Hirani"
            ,"Vijay Krishna Acharya","Anand Gandhi and Adesh Prasad","Shashank Khaitan","Rajkumar Hirani","Ali Abbas Zafar"
            ,"R. Balki","Vikram Bhatt","Chandraprakash Dwivedi","Umesh Shukla","Sajid Nadiadwala","Prabhu Deva","Anurag Basu"
            ,"Hansal Mehta","Karan Johar","Omung Kumar","Anthony D'Souza","Farhan Akhtar","Anurag Kashyap","Ali Abbas Zafar"
            ,"Rakesh Roshan","Rakesh Roshan","Ram Gopal Varma","Vijay Krishna Acharya","Sanjay Gadhvi","Sanjay Gadhvi","Manish Vatsalya"
            ,"Abhishek Dogra","Shamshad Pathan","Sourabh","Kabir Khan","David Dhawan","David Dhawan","Saket Chaudhary","J.P. Dutta","Anurag Kashyap"
            ,"Sanjay Leela Bhansali","Raja Krishna Menon","A.R. Murugadoss","Mudassar Aziz","Aditya Chopra","Divya Khosla Kumar","Remo D'Souza","Prabhu Deva"
            ,"Anees Bazmee","Hansal Mehta","Kabir Sadanand","Mustan Burmawalla and Abbas Burmawalla","Dibakar Banerjee","Sagar Ballary"
            ,"Anees Bazmee","Rohit Shetty","Sooraj Barjatya","Rahul Rawail","Karan Johar","Vikram Bhatt","K. Subhash","Leena Yadav"
            ,"Eeshwar Nivas","Rajkumar Hirani","P. Vasu","Mahesh Bhatt","Nitesh Tiwari"};//used for the 2nd hint in case now also the player is not able to guss
        int c;//used for loops
        int z;//its is used for the user to play the game till 100 movies
        z=0;
        int sub;//its is used to cut the letters from bollywood string as per the rules of game
        String bollywood="BOLLYWOOD";// used for limited chances for the user
        double rn;//used to select a random number and select a random movie
        String mn1;//it will save the vowels from the movie name and compare it at last
        String mn2;//it will also save the vowels but it will add consonants to the string
        boolean f;//used to check that character is a whiteapace or not
        int an;// it will generate a integer from the random number of type double
        char y;//will accept the character from the user 
        char x;//it will extract the character from a string
        int b;//used in loop It will work till the string bollywood is having letters
        int hint;//used to show first hint first and second as second
        char ui;//it is used to extract characters from a String
        int p;//if user's guess is wrong then it will decrease one letter from bollywood 
        char q;//it is used at last to select the choise
        int ab;//if the user has input something which is already there than it will not let the next conditon
        String mn3="";
        char cc;//it is used to extract characters from a String
        System.out.println("size of m "+m.length);
        System.out.println("size of h1 "+h1.length);
        System.out.println("size of h2 " +h2.length);
        System.out.println("===========================");
        System.out.println(" WELCOME TO BOLLYWOOD-GAME");
        System.out.println("===========================");
        for(c=0;c<2;c++)
            System.out.println("====================================");
        System.out.println("******************************************");
        System.out.println("---------------INSTRUCTIONS---------------");
        System.out.println("1.A movie name without consonants would be given to you.");
        System.out.println("2.You Need to Guess The Consonants If Correct No Problem Game Moves On");
        System.out.println("3.If Your Guess Is Wrong Then One Letter From The 'BOLLYWOOD' Would Decrease");
        System.out.println("4.If All The Letter Are Vanished Then Can Move To Next Movie Or Quit The Game");
        System.out.println("5.If You Type The Vowels(Which is not allowed) Then Also Your Chance Would Decrease");
        System.out.println("6.To Move To Next Movie Press '@'");
        System.out.println("7.You Can Only Have Two Hints, By Pressing '!' ");
        System.out.println("8.To Quit The Game In Between press '#' ");
        while(z<100)
        {
            rn=Math.random();
            rn=rn*100;
            an=(int)rn;
            mn1="";
            mn2="";
            sub=9;
            p=0;
            hint=0;
            b=0;
            for(int i=0;i<m[an].length();i++)
            {
                x=m[an].charAt(i);
                x=Character.toUpperCase(x);
                f=Character.isWhitespace(x);
                if(f==true)
                    x='/';
                // this will help to match the user string and the computer string
                mn1=mn1+x;
            }
            for(int i=0;i<m[an].length();i++)
            {
                x=m[an].charAt(i);
                x=Character.toUpperCase(x);
                f=Character.isWhitespace(x);
                if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
                {
                }
                else if(f==true)
                    x='/';
                else
                    x='_';
                mn2=mn2+x;
            }
            System.out.println("-----------------------------");
            System.out.println("");
            System.out.println("\t\t"+mn2);
            System.out.println("");
            System.out.println("-----------------------------");
            System.out.println("\tOnly for the maker"+mn1);
            b=bollywood.substring(9-sub).length();
            while(b>0)
            {
                System.out.print("Enter the Character: ");
                y=sc.next().charAt(0);
                y=Character.toUpperCase(y);
                if(y=='!' && hint==0){
                    hint+=1;
                    System.out.println("==============================");
                    System.out.println("");
                    System.out.println("Your First Hint Is The Movie's Launch Year:"+h1[an]);
                    System.out.println("");
                    System.out.println("==============================");
                    continue;
                }
                if(y=='!' && hint>0 && hint<2){
                    hint+=1;
                    System.out.println("==============================");
                    System.out.println("");
                    System.out.println("Your Second Hint Is The Name Of The Director Of the Movie:"+h2[an]);
                    System.out.println("Now, You Have Lost All Your Hint's");
                    System.out.println("");
                    System.out.println("==============================");
                    continue;
                }
                if(y=='!' && hint>1){
                    System.out.println("==============================");
                    System.out.println("");
                    System.out.println("You Have Lost All Your Hint's");
                    System.out.println("");
                    System.out.println("==============================");
                    continue;
                }
                if(y=='#'){
                    System.out.println("==============================");
                    System.out.println("");
                    System.out.println("Since You Have Surrendered");
                    System.out.println("");
                    System.out.println("==============================");
                    break;
                }
                ab=0; 
                char aa[]=new char[mn2.length()];
                for(int k=0;k<mn2.length();k++){
                    cc=mn2.charAt(k);
                    aa[k]=cc;
                }
                for(int k=0;k<mn2.length();k++){
                    if( (y==aa[k] ||y=='A'||y=='E'||y=='I'||y=='O'||y=='U'||y=='/') && ab==0){
                        System.out.println("==============================");
                        System.out.println("");
                        System.out.println(" ShoulYoud Not Enter Something Which Is Already In Front Of You");
                        System.out.println("");
                        System.out.println("==============================");
                        ab++;
                    }
                }
                if(ab==0){
                    for(int i=0;i<mn1.length();i++){
                        x=mn1.charAt(i);
                        if(y==x){
                            p++;
                            mn3=mn2;
                            mn2="";
                            for(int j=0;j<mn3.length();j++){
                                ui=mn3.charAt(j);
                                if(i==j){
                                    ui=y; 
                                }
                                mn2=mn2+ui;
                            }
                            mn3="";
                        }
                    }
                    ab++;
                }
                if(p==0)
                    sub--;
                System.out.println("-----------------------------");
                System.out.println("");
                System.out.println("\t\t"+mn2);
                System.out.print("\t\t");
                for(int i=9;i>sub;i--)
                    System.out.print("\\");
                System.out.println(""+bollywood.substring(9-sub));
                System.out.println("");
                System.out.println("-----------------------------");
                p=0;
                b=bollywood.substring(9-sub).length();
                if(mn2.compareTo(mn1)==0){
                    System.out.println("!@#$%^&*!@#$%^&*!@#$%^&*!@#$%^&*!@#$%^&*!@#$%^&*!@#$%^&*");
                    System.out.println("");
                    System.out.println("CONGRATULATION's You Have Guess The Right Movie Name");
                    System.out.println("");
                    System.out.println("!@#$%^&*!@#$%^&*!@#$%^&*!@#$%^&*!@#$%^&*!@#$%^&*!@#$%^&*");
                    System.out.println("");
                    System.out.println("======================================");
                    System.out.println("Film was "+m[an]+" Launched In Year "+h1[an]+" And The Director Of The Film Was "+h2[an]);
                    System.out.println("======================================");
                    System.out.println("");
                    break;
                }
            }
            if(mn2.compareTo(mn1)!=0){
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("");
                System.out.println("We Are Sorry To Say That You Have ----LOST---- ");
                System.out.println("");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("");
                System.out.println("======================================");
                System.out.println("Film was "+m[an]+" Launched In Year "+h1[an]+" And The Director Of The Film Was "+h2[an]);
                System.out.println("======================================");
                System.out.println("");
            }
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("If You Want To Play Again Press '@'");
            System.out.println("If You Want To Quit Press '#'");
            System.out.println("-----------------------------------");
            System.out.println("");
            int o=1;
            while(o>0){
                q=sc.next().charAt(0);
                if(q=='@'){
                    System.out.print("");
                    System.out.println("You Have Moved To Next Movie");
                    z++;
                    break;
                }
                else if(q=='#'){
                    System.out.println("");
                    z=100;
                    break;
                }
                else{
                    System.out.println("----------!!ERROR!!----------");
                    System.out.println("Please Enter A Correct Input");
                    System.out.println("----------!!ERROR!!----------");
                }
            }
        }
    }

    void printtictactoe(char r[])//it will help to print the board
    {
        System.out.println();
        System.out.println("/---|---|---\\");
        System.out.println("| " + r[0] + " | " + r[1] + " | " + r[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + r[3] + " | " + r[4] + " | " + r[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + r[6] + " | " + r[7] + " | " + r[8] + " |");
        System.out.println("\\---|---|---/");
    }

    char [] locationX(int un,char a[])//it will giv the location of the  x in the array
    {
        int e;
        e=9;
        char t;
        un=un+48;
        t=(char)un;
        for(int j=0;j<9;j++){
            if(a[j]==t)
                a[j]='X';
            e--;
        }
        return(a);
    }

    char [] locationO(int un,char a[])//it will giv the location of the  x in the array
    {
        int e;
        e=9;
        char t;
        un=un+48;
        t=(char)un;
        for(int j=0;j<9;j++){
            if(a[j]==t)
                a[j]='O';
            e--;
        }
        return(a);
    }

    boolean checkiflegal(int un,char a[])//it will check if the location is already entered them will print error
    {
        int e;
        boolean tt=true;
        char t;
        t=(char)un;
        if(a[un-1]=='X' || a[un-1]== 'O'){
            tt=false;
            System.out.println("tt="+tt);
        }
        return(tt);
    }

    boolean winlose(char a[])//if one of the player wins then it will break the loop
    {
        boolean winlose;
        if(a[0]==a[1] && a[1]==a[2] && (a[0]=='X' || a[0]=='O'))
            return true;
        else if(a[3]==a[4] && a[4]==a[5] &&(a[3]=='X' || a[3]=='O')) 
            return true;
        else if(a[6]==a[7] && a[7]==a[8] &&(a[6]=='X' || a[6]=='O')) 
            return true;
        else if(a[0]==a[3] && a[3]==a[6] &&(a[0]=='X' || a[0]=='O')) 
            return true;
        else if(a[1]==a[4] && a[4]==a[7] &&(a[1]=='X' || a[1]=='O')) 
            return true;
        else if(a[2]==a[5] && a[5]==a[8] &&(a[2]=='X' || a[8]=='O')) 
            return true;
        else if(a[0]==a[4] && a[4]==a[8] &&(a[0]=='X' || a[0]=='O')) 
            return true;
        else if(a[2]==a[4] && a[4]==a[6] &&(a[2]=='X' || a[2]=='O')) 
            return true;
        return false;
    }

    void tictactoe()
    {
        project tic=new project();
        int l;//it will let the user play until the user wants
        l=1;
        int e;//there are 9 box on the board so the user can only input 9 times
        int un;//it is the User Number where the user wants to input the location
        int c;//used in loops for printing lines
        int t;//it will print from 1-9 as characters on the board
        boolean check;//it will check weather the input location is correct or not
        char aa[]=new char[9];//it is the MAIN which consists of all the location of the user
        System.out.println("=============================");
        System.out.println(" WELCOME To TIC-TAC-TOE-GAME");
        System.out.println("=============================");
        for(c=0;c<2;c++)
            System.out.println("====================================");
        System.out.println("******************************************");
        System.out.println("---------------INSTRUCTIONS---------------");
        System.out.println("1.Its The Famous TicTacToe Game");
        System.out.println("2.This One Is A 2-Player Game");
        System.out.println("3.Enter The Location From 1 To 9 As 'X'or'O'");
        System.out.println("4.The Player Who 1st Brings The Series Of 'OOO' Or 'XXX' Vertically or Horizontally or Diagonaly WIN The Game");
        while(l>0){
            e=9;
            t=49;
            for(int i=0;i<9;i++){
                aa[i]=(char)t;
                t++;
            }
            tic.printtictactoe(aa);
            while(e>0){
                if(e%2!=0){
                    System.out.println("Turn of X");
                    un=sc.nextInt();
                    if(un>0 && un<=9){
                        check=tic.checkiflegal(un,aa);
                        if(check==false){
                            System.out.println("Enter the location again its is already taken");
                            continue;
                        }
                        aa=tic.locationX(un,aa);;
                        if(tic.winlose(aa)==true){
                            tic.printtictactoe(aa);
                            System.out.println("======================");
                            System.out.println("Player X won the match");
                            System.out.println("======================");
                            e=0;
                            break;
                        }
                    }
                    else{
                        System.out.println("plz enter no. between 1 and 9");
                        e++;
                    }
                }
                else if(e%2==0){
                    System.out.println("Turn of O");
                    un=sc.nextInt(); 
                    if(un>0 && un<=9){
                        check=tic.checkiflegal(un,aa);
                        System.out.println("ck="+check);
                        if(check==false){
                            System.out.println("Enter the location again its is already taken");
                            continue;
                        }
                        tic.locationO(un,aa);
                        if(tic.winlose(aa)==true){
                            tic.printtictactoe(aa);
                            System.out.println("======================");
                            System.out.println("Player O won the match");
                            System.out.println("======================");
                            e=0;
                            break;
                        }
                    }
                    else{
                        System.out.println("plz enter no. between 1 and 9");
                        e++;
                    }
                }
                tic.printtictactoe(aa);
                e--;
            }
            System.out.println("Sorry its a tie");
            System.out.println("To exit press '0'");
            System.out.println("To play again press '1'");
            l=sc.nextInt();
            System.out.println("\f");
        }
    }

    void printesto(char r[])
    {
        // used to print the board
        System.out.println("/---|---|---|---|---\\");
        System.out.println("| "+r[0]+" | "+r[1]+" | "+r[2]+" | "+r[3]+" | "+r[4]+" |");
        System.out.println("|-------------------|");
        System.out.println("| "+r[5]+" | "+r[6]+" | "+r[7]+" | "+r[8]+" | "+r[9]+ " |");
        System.out.println("|-------------------|");
        System.out.println("| "+r[10]+" | "+r[11]+" | "+r[12]+" | "+r[13]+" | "+r[14]+" |");
        System.out.println("|-------------------|");
        System.out.println("| "+r[15]+" | "+r[16]+" | "+r[17]+" | "+r[18]+" | "+r[19]+" |");
        System.out.println("|-------------------|");
        System.out.println("| "+r[20]+" | "+r[21]+" | "+r[22]+" | "+r[23]+" | "+r[24]+" |");
        System.out.println("\\---|---|---|---|---/");
    }

    int dicehard()
    {
        int x=1;
        double a;
        a=Math.random();//used to select random no of dice
        if(a<=0.2)
            x=1;
        if(a>0.2 && a<=0.3)
            x=2;
        if(a>0.3 && a<=0.5)
            x=3;
        if(a>0.5 && a<=0.6)
            x=4;
        if(a>0.6 && a<=0.8)
            x=5;
        if(a>0.8 && a<=0.9)
            x=6;
        return(x);
    }

    int dicesoft()
    {
        int x=1;
        double a;
        a=Math.random();//used to select random no of dice
        if(a<=0.1)
            x=1;
        if(a>0.1 && a<=0.2)
            x=2;
        if(a>0.2 && a<=0.4)
            x=3;
        if(a>0.4 && a<=0.6)
            x=4;
        if(a>0.6 && a<=0.7)
            x=5;
        if(a>0.7 && a<=0.9)
            x=6;
        return(x);
    }

    void esto()
    {
        project esto=new project();
        System.out.println("Welcome to Esto");
        char aa[]=new char[25];
        int select;
        int z=1;//it will let the user play till he/she wants to play 
        int x;//it is the dice no. whic comes back in the main method from function
        int zz;//it will let steps be contracted
        int oldY;//if the array is out of bound then it will try to let it back
        int oldYY;//if the array is out of bound then it will try to let it back
        int y;//it would be the sum till where the user wants to go 
        int zzz;//it will let steps be contracted
        int yy;//it would be the sum till where the user wants to go 
        int e;//it will help the user to jump form turn of x to o and back to x
        int o=1;//used in loop at last
        int es2[]={14,9,4,3,2,1,0,5,10,15,20,21,22,23,24,19,18,17,16,11,6,7,8,13,12};//path of player O
        int es1[]={10,15,20,21,22,23,24,19,14,9,4,3,2,1,0,5,6,7,8,13,18,17,16,11,12};//path of player x
        int c;
        System.out.println("");
        System.out.println("======================");
        System.out.println(" WELCOME TO ESTO-GAME");
        System.out.println("======================");
        for(c=0;c<2;c++)
            System.out.println("====================================");
        System.out.println("******************************************");
        System.out.println("---------------INSTRUCTIONS---------------");
        System.out.println("1.Its A Two Player Of x and o");
        System.out.println("2.The One Who Reach's The Center First At Center Wins");
        System.out.println("3.Path Of X Till The Winning Line");
        System.out.println("/----|----|----|----|----\\");
        System.out.println("| VV |    | << |    | << |");
        System.out.println("|------------------------|");
        System.out.println("| >> | >> |    | VV |    |");
        System.out.println("|------------------------|");
        System.out.println("| X  | >> | #  |    | ^^ |");
        System.out.println("|------------------------|");
        System.out.println("| VV | ^^ |    |  < |    |");
        System.out.println("|------------------------|");
        System.out.println("| >> |    | >> |    | ^^ |");
        System.out.println("\\----|----|----|----|----/");
        System.out.println("4.Path Of O");
        System.out.println("/----|----|----|----|----\\");
        System.out.println("| vv |    | << |    | << |");
        System.out.println("|------------------------|");
        System.out.println("|    | >> |    | VV | ^^ |");
        System.out.println("|------------------------|");
        System.out.println("| vv |    | #  | << | O  |");
        System.out.println("|------------------------|");
        System.out.println("|    | ^^ |    | << | << |");
        System.out.println("|------------------------|");
        System.out.println("| >> |    | >> |    | ^^ |");
        System.out.println("\\----|----|----|----|----/");
        System.out.println("");
        while(z>0){
            y=0;
            zz=25;
            zzz=25;
            yy=0;
            for(int i=0;i<25;i++){
                if(i==10)
                    aa[i]='x';
                else if(i==14)
                    aa[i]='o';
                else if(i==12)
                    aa[i]='#';
                else
                    aa[i]=32;
            }
            esto.printesto(aa);
            e=1;
            while(e!=0){
                if(e%2!=0){
                    System.out.println("Player X's Turn");
                    System.out.println("To Dice Hard Press 1");
                    System.out.println("To Dice Soft Press 2");
                    select=sc.nextInt();
                    if(select==1)
                        x=esto.dicehard();
                    else if(select==2)
                        x=esto.dicesoft();
                    else{
                        System.out.println("-----ERROR-----");
                        continue;
                    }
                    System.out.println("Player X diced :"+x);
                    if(x<=zz){
                        oldY = y;
                        y+=x;
                        if (y >= 25)
                        {
                            y = oldY;
                        }
                        zz-=x;
                    }
                    if(es1[y]==12){
                        y=25;
                        zz=0;
                    }
                    if(y<25){
                        for(int i=0;i<25;i++){
                            if (aa[i] == 'x'){
                                aa[i]=32;
                            }
                        }

                        aa[es1[y]]='x';
                        esto.printesto(aa);
                    }
                    if(zz==0){
                        e=0;
                        for(int i=0;i<25;i++){
                            if (aa[i] == 'x'){
                                aa[i]=32;
                            }
                        }

                        aa[12]='x';
                        esto.printesto(aa);   
                        System.out.println("Player X wins");
                        break;
                    }
                    e++;
                }
                else if(e%2==0){
                    System.out.println("Player O's Turn");
                    System.out.println("To Dice Hard Press 1");
                    System.out.println("To Dice Soft Press 2");
                    select=sc.nextInt();
                    if(select==1)
                        x=esto.dicehard();
                    else if(select==2)
                        x=esto.dicesoft();
                    else{
                        System.out.println("-----ERROR-----");
                        continue;
                    }
                    System.out.println("Player O diced :"+x);
                    if(x<=zzz){
                        oldYY = yy;
                        yy+=x;
                        if (yy >= 25)
                        {
                            yy = oldYY;
                        }
                        zzz-=x;
                    }
                    if(es2[yy]==12){
                        yy=25;
                        zzz=0;
                    }
                    if(yy<25){
                        for(int i=0;i<25;i++){
                            if (aa[i] == 'o'){
                                aa[i]=32;
                            }
                        }
                        aa[es2[yy]]='o';
                        esto.printesto(aa);
                    }
                    if(zzz==0){
                        e=0;
                        for(int i=0;i<25;i++){
                            if (aa[i] == 'o'){
                                aa[i]=32;
                            }
                        }
                        aa[12]='o';
                        esto.printesto(aa);
                        System.out.println("Player O wins");
                        break;
                    }
                    e++;
                }
            }
            System.out.println("To Play Again Press '1'");
            System.out.println("To Quit Press '0'");
            while(o>0){
                z=sc.nextInt();
                if(z==1){
                    System.out.print("");
                    System.out.println("You Are Playing Again");
                    z++;
                    break;
                }
                else if(z==0){
                    System.out.println("");
                    z=-1;
                    e=0;
                    break;
                }
                else{
                    System.out.println("----------!!ERROR!!----------");
                    System.out.println("Please Enter A Correct Input");
                    System.out.println("----------!!ERROR!!----------");
                }
            }
        }
    }

    void level3()
    {
        System.out.println("");
        System.out.println("You Are At Level--1--");
        System.out.println("");
        System.out.println("You Need To Find 9 Words The Are Related To : LITERATURE");
        System.out.println("");
        System.out.println("When You Feel That You Want To Give Up Then Press'@'");
        System.out.println("");
        System.out.println(" -----------------------------------------------");
        System.out.println("| Y | R | T | S | I | M | E | H | C | V | P | Y |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| A | L | U | I | V | R | X | Z | K | T | M | K |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| X | E | I | T | R | J | P | Q | R | W | K | D |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| F | S | F | T | I | K | Z | R | Y | A | P | P |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| K | E | D | V | E | G | S | N | N | E | I | N |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| U | U | L | B | L | R | S | N | D | T | R | A |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| H | G | N | T | G | J | A | Z | A | B | Y | T |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| I | U | K | U | L | D | C | T | M | S | O | E |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| N | T | H | S | D | K | H | F | U | T | Y | B |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| D | R | Z | K | S | S | U | R | K | R | M | I |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| I | O | Z | H | I | S | T | O | R | Y | E | T |");
        System.out.println(" -----------------------------------------------");
        System.out.println("| I | P | Q | A | H | K | G | N | O | Z | D | O |");
        System.out.println(" -----------------------------------------------");
        String ans;
        String anscap;
        char x;//it will extract the letter frome name entered by the user
        int b;//when the user surrenders these will increase and confim it 
        String s[]={"DZONGKHA","HINDI","PORTUDUESE","LITERATURE","CHEMISTRY","KANNADA","HISTORY","SANSKRIT","TIBETAN"};//it is the answer key 
        int z;//it will be the number of words left to be found
        z=9;
        int a;//it will help to check weather the input is correct or not
        ans="";
        b=0;
        while(z>0){
            System.out.println("Now You Need To Find :"+z+" Words.");
            a=0;
            ans=sc.nextLine();
            anscap="";
            for(int i=0;i<ans.length();i++){
                x=ans.charAt(i);
                x=Character.toUpperCase(x);
                anscap+=x;
            }
            if(ans.compareTo("ono")==0){
                b++;
                z=-1;
                break;
            }
            else{
                for(int i=0;i<9;i++){
                    if(anscap.compareTo(s[i])==0){
                        z--;
                        a++;
                    }
                }
                if(a==1)
                {
                }
                else
                    System.out.println("Sorry That Is Not There");
                System.out.println("");
                a=0;
            }
            ans="";
            anscap="";
            if(z==0){
                System.out.println("");
                System.out.println("CONGRULATIONS You Have Found All The Words");
                System.out.println("");
            }
        }
        if((ans.compareTo("ono")==0)==true && b>0){
            System.out.println("Since You Have Given Up");
            System.out.println("Your Answer Key Is");
            System.out.println(" -----------------------------------------------");
            System.out.println("| Y | R | T | S | I | M | E | H | C |   |   |   |");
            System.out.println(" -----------------------------------------------");
            System.out.println("|   | L |   | I |   |   |   |   |   |   |   |   |");
            System.out.println(" -----------------------------------------------");
            System.out.println("|   | E | I |   | R |   |   |   |   |   | K |   |");
            System.out.println(" -----------------------------------------------");
            System.out.println("|   | S |   | T |   | K |   |   |   | A |   |   |");
            System.out.println(" -----------------------------------------------");
            System.out.println("|   | E |   |   | E |   | S |   | N |   |   | N |");
            System.out.println(" -----------------------------------------------");
            System.out.println("|   | U |   |   |   | R |   | N |   |   |   | A |");
            System.out.println(" -----------------------------------------------");
            System.out.println("| H | G |   |   |   |   | A |   | A |   |   | T |");
            System.out.println(" -----------------------------------------------");
            System.out.println("| I | U |   |   |   | D |   | T |   | S |   | E |");
            System.out.println(" -----------------------------------------------");
            System.out.println("| N | T |   |   | D |   |   |   | U |   |   | B |");
            System.out.println(" -----------------------------------------------");
            System.out.println("| D | R |   |   |   |   |   |   |   | R |   | I |");
            System.out.println(" -----------------------------------------------");
            System.out.println("| I | O |   | H | I | S | T | O | R | Y | E | T |");
            System.out.println(" -----------------------------------------------");
            System.out.println("|   | P |   | A | H | K | G | N | O | Z | D |   |");
            System.out.println(" -----------------------------------------------");
            System.out.println("Your Words Were:");
            System.out.println("DZONGKHA");
            System.out.println("PORTUDUESE");
            System.out.println("HINDI");
            System.out.println("HISTORY");
            System.out.println("LITERATURE");
            System.out.println("TIBETAN");
            System.out.println("KANNADA");
            System.out.println("SANSKRIT");
            System.out.println("CHEMISTRY");

        }
    }

    void level2()
    {
        System.out.println("");
        System.out.println("You Are At Level--2--");
        System.out.println("");
        System.out.println("You Need To Find 9 Words The Are Related To : FOOD");
        System.out.println("");
        System.out.println("When You Feel That You Want To Give Up Then Press'ono'");
        System.out.println("");
        System.out.println("If You Are Not Able To Find The Words Then Type 'ono' To Quit The Level");
        System.out.println("");
        System.out.println(" ---------------------------------------");
        System.out.println("| T | G | J | L | N | C | V | S | E | O |");
        System.out.println(" ---------------------------------------");
        System.out.println("| T | O | O | T | H | P | I | C | K | N |");
        System.out.println(" ---------------------------------------");
        System.out.println("| L | M | M | T | K | E | I | H | Y | I |");
        System.out.println(" ---------------------------------------");
        System.out.println("| D | E | A | A | C | F | A | E | P | O |");
        System.out.println(" ---------------------------------------");
        System.out.println("| G | E | T | U | T | M | B | C | E | N |");
        System.out.println(" ---------------------------------------");
        System.out.println("| M | F | A | T | B | O | U | Z | S | S |");
        System.out.println(" ---------------------------------------");
        System.out.println("| Y | S | E | T | U | U | Y | C | E | O |");
        System.out.println(" ---------------------------------------");
        System.out.println("| F | R | I | E | S | C | N | N | Q | U |");
        System.out.println(" ---------------------------------------");
        System.out.println("| D | W | A | E | G | L | Q | V | E | S |");
        System.out.println(" ---------------------------------------");
        System.out.println("| A | U | R | C | J | A | T | S | H | R |");
        System.out.println(" ---------------------------------------");
        String anscap;
        String ans;
        char x;//it will extract the letter frome name entered by the user
        int b;//when the user surrenders these will increase and confim it 
        int a;//it will help to check weather the input is correct or not
        String s[]={"TOMATO","TOOTHPICK","ONIONS","CHEESE","BUNS","LETTUCE","FRIES","SAUCE","MEAT"};//it is the answer key 
        int z;//it will be the number of words left to be found
        z=9;
        ans="";
        b=0;
        while(z>0){
            a=0;
            System.out.println("Now You Need To Find :"+z+" Words.");
            ans=sc.nextLine();
            anscap="";
            for(int i=0;i<ans.length();i++){
                x=ans.charAt(i);
                x=Character.toUpperCase(x);
                anscap+=x;
            }
            if(ans.compareTo("ono")==0){
                b++;
                z=-1;
                break;
            }
            else{
                for(int i=0;i<9;i++){
                    if(anscap.compareTo(s[i])==0){
                        z--;
                        a++;
                    }
                }
                if(a==1)
                {
                }
                else
                    System.out.println("Sorry That Is Not There");
                System.out.println("");
                a=0;
            }
            ans="";
            anscap="";
            if(z==0){
                System.out.println("");
                System.out.println("CONGRULATIONS You Have Found All The Words");
                System.out.println("");
            }
        }
        if((ans.compareTo("ono")==0)==true && b>0){
            System.out.println("Since You Have Given Up");
            System.out.println("Your Answer Key Is");
            System.out.println(" ---------------------------------------");
            System.out.println("| T |   |   |   |   |   |   |   |   | O |");
            System.out.println(" ---------------------------------------");
            System.out.println("| T | O | O | T | H | P | I | C | K | N |");
            System.out.println(" ---------------------------------------");
            System.out.println("| L |   | M | T |   | E |   | H |   | I |");
            System.out.println(" ---------------------------------------");
            System.out.println("|   | E | A | A | C |   |   | E |   | O |");
            System.out.println(" ---------------------------------------");
            System.out.println("|   | E | T | U | T |   |   |   | E | N |");
            System.out.println(" ---------------------------------------");
            System.out.println("| M |   | A | T | B | O |   |   | S | S |");
            System.out.println(" ---------------------------------------");
            System.out.println("|   | S |   |   | U | U |   |   | E |   |");
            System.out.println(" ---------------------------------------");
            System.out.println("| F | R | I | E | S | C | N |   |   |   |");
            System.out.println(" ---------------------------------------");
            System.out.println("|   |   |   |   |   |   |   |   | E | S |");
            System.out.println(" ---------------------------------------");
            System.out.println("|   |   |   |   |   |   |   |   |   |   |");
            System.out.println(" ---------------------------------------");
            System.out.println("Your Words Were:");
            System.out.println("TOMATO");
            System.out.println("TOOTHPICK");
            System.out.println("ONIONS");
            System.out.println("CHEESE");
            System.out.println("BUNS");
            System.out.println("LETTUCE");
            System.out.println("FRIES");
            System.out.println("SAUCE");
            System.out.println("MEAT");

        }
    }

    void level1()
    {
        System.out.println("");
        System.out.println("You Are At Level--1--");
        System.out.println("");
        System.out.println("You Need To Find 7 Words The Are Related To : COLOURS");
        System.out.println("");
        System.out.println("When You Feel That You Want To Give Up Then Type 'ono'");
        System.out.println("");
        System.out.println(" -----------------------");
        System.out.println("| I | N | O | M | E | L |");
        System.out.println(" -----------------------");
        System.out.println("| K | W | Z | B | A | E |");
        System.out.println(" -----------------------");
        System.out.println("| A | Y | H | R | M | N |");
        System.out.println(" -----------------------");
        System.out.println("| H | O | O | I | Y | A |");
        System.out.println(" -----------------------");
        System.out.println("| K | C | L | R | T | T |");
        System.out.println(" -----------------------");
        System.out.println("| D | P | B | L | U | E |");
        System.out.println(" -----------------------");
        String anscap;
        String ans;
        char x;//it will extract the letter frome name entered by the user
        int b;//when the user surrenders these will increase and confim it 
        int a;//it will help to check weather the input is correct or not
        String s[]={"LEMON","TAN","WHITE","KHAKI","CORAL","BLUE","LIME"};//it is the answer key 
        int z;//it will be the number of words left to be found
        z=7;
        ans="";
        b=0;
        while(z>0){
            a=0;
            System.out.println("Now You Need To Find :"+z+" Words.");
            ans=sc.nextLine();
            anscap="";
            for(int i=0;i<ans.length();i++){
                x=ans.charAt(i);
                x=Character.toUpperCase(x);
                anscap+=x;
            }
            if(ans.compareTo("ono")==0){
                b++;
                z=-1;
                break;
            }
            else{
                for(int i=0;i<7;i++){
                    if(anscap.compareTo(s[i])==0){
                        z--;
                        a++;
                    }
                }
                if(a==1)
                {
                }
                else
                    System.out.println("Sorry That Is Not There");
                System.out.println("");
                a=0;
            }
            ans="";
            anscap="";
            if(z==0){
                System.out.println("");
                System.out.println("CONGRULATIONS You Have Found All The Words");
                System.out.println("");
            }
        }
        if((ans.compareTo("ono")==0)==true && b>0){
            System.out.println("Since You Have Given Up");
            System.out.println("Your Answer Key Is");
            System.out.println(" -----------------------");
            System.out.println("| I | N | O | M | E | L |");
            System.out.println(" -----------------------");
            System.out.println("| K | W |   |   | A | E |");
            System.out.println(" -----------------------");
            System.out.println("| A |   | H | R | M | N |");
            System.out.println(" -----------------------");
            System.out.println("| H |   | O | I |   | A |");
            System.out.println(" -----------------------");
            System.out.println("| K | C | L |   | T | T |");
            System.out.println(" -----------------------");
            System.out.println("|   |   | B | L | U | E |");
            System.out.println(" -----------------------");
            System.out.println("Your Words Were:");
            System.out.println("Khaki");
            System.out.println("Lemon");
            System.out.println("Tan");
            System.out.println("White");
            System.out.println("Coral");
            System.out.println("Blue");
            System.out.println("Lime");
        }
    }

    void wordsearch()
    {
        project wo=new project();
        System.out.println("\f");
        System.out.println("===========================");
        System.out.println(" WELCOME TO WORDSEARCH-GAME");
        System.out.println("===========================");
        for(int c=0;c<2;c++)// it is used in loops for printing lines 
            System.out.println("====================================");
        System.out.println("******************************************");
        System.out.println("---------------INSTRUCTIONS---------------");
        System.out.println("1.You Will Be Provided With The Jumbled Group Of Words.");
        System.out.println("2.The Words Would Run Horizontally, Vertically Or Diagonally");
        System.out.println("3.You Only Have To Find The Words And Type Them");
        System.out.println("4.Here You Are Provides With Five Different Difficulty Levels");
        System.out.println("5.Select Your Level By Pressing From 1-3.");
        int s;//it is used to give the choise to the user to choose difficulty level
        int z=0;//the user will only be allowed to play 3 times
        while(z>=0 && z<3){
            System.out.println("If You Want To Play Then Enter The Level Which You Want To Play");
            System.out.println("If You Want To Quit Then Press'0'");
            s=sc.nextInt();
            switch(s){
                case 1:
                z++;
                System.out.println("\f");
                wo.level1();
                continue;
                case 2:
                z++;
                System.out.println("\f");
                wo.level2();
                continue;
                case 3:
                z++;
                System.out.println("\f");
                wo.level3();
                continue;
                case 0:
                z=-1;
                System.out.println("\f");
                continue;
                default:
                System.out.println("-----ERROR-----");
                System.out.println("Please Enter The Number Between 1-5");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        project ob=new project();
        String name;//used to take the name of the user
        System.out.println("========================");
        System.out.println(" ======================");
        System.out.println("  WELCOME TO FUN-GAMES");
        System.out.println(" ======================");
        System.out.println("========================");
        System.out.println("Enter Your Name:");
        name=sc.nextLine();
        int infinity;//these will give the choise to the user that he/she wants to play again or quit
        infinity=1;
        while(infinity>0){
            System.out.println("==========================================");
            System.out.println("          WELCOME:"+name);
            System.out.println("==========================================");
            System.out.println("***********There Are five Games***********");
            System.out.println("Type The Number Which You Like To Play");
            System.out.println("1.Cricket-Mania");
            System.out.println("2.Bollywood");
            System.out.println("3.Tic Tac Toe");
            System.out.println("4.Esto");
            System.out.println("5.T-game");
            System.out.println("6.To Quit Press '0'");
            int choose;//used for the switch case
            choose=sc.nextInt();
            switch(choose){
                case 1:
                ob.cricket();
                break;
                case 2:
                ob.bollywood();
                break;
                case 3:
                ob.tictactoe();
                break;
                case 4:
                ob.esto();
                break;
                case 5:
                ob.wordsearch();
                break;
                case 0:
                break;
                default:
                System.out.println("!!!!!!!!ERROR!!!!!!!!");
                System.out.println("Please Enter A Valid Choise");
            }
            for(int c=0;c<2;c++){
                System.out.println("======================================");
            }
            System.out.println("To Go On Main Menu Press '1'");
            System.out.println("To Quit The Game Press'0'");
            infinity=sc.nextInt();
            if(infinity>0){
                System.out.println("\f");//to clean the page
            }
            else if (infinity==0){
                System.out.println("===================================");
                System.out.println("Thanks For The Visit At FUN-GAMES");
                System.out.println("Play Again And Have A Good Day:"+name);
		System.out.println("This project was created by Shrut Sureja");
                System.out.println("===================================");
            }
        }
    }
}