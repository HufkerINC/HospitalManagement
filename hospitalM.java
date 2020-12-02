import java.util.*;
class hospitalM
{   public static String docname;
    public static String dept;
    public static int reg_no;
    public static int room_rate;
    public static double food_price;
    public static double medicine_rate;
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
               
        
        System.out.println(" Has the patient come for the first time?(enter yes or no) :");
        String come=scan.next();
        char c=come.charAt(0);
        
        hospitalM obj1=new hospitalM();
        if(c=='y')
        {
         obj1.registration();
         obj1.docassign();
         obj1.lab();
        }
        else
        { 
        obj1.docassign();
        obj1.lab();}
            
    }
    
    public static void docassign()
  {

Scanner scan=new Scanner(System.in);
//String docname = "";//has to be instance variable
Boolean flag = true;
String doc[]={"Dr.Leah Parker","Dr. Bruce Banner","Dr.Mia Tonks","Dr Meredith Gray","Dr M","Dr Stephen Strange","Dr Shawn Murphy","Dr Rachel Ross","Dr Cersei Lannnister","Dr Daenerys Frey"};

String spec[]={"Otolaryngologists(ENT)","Allergist/Immunologist","Cardiologist/Haematologist","Gastroenterologist","Nephrologist","Neurologist","Gynaecologist/Obstetrician","Oncologist","Opthamologist","Psychiatrist"};

String use[]={"Ear, nose and throat specialists, also called ENTs, ENT doctors and otolaryngologists, specialize in otolaryngology (pronounced ?-t?-la-r?n-gä-l?-j?). Otolaryngologists diagnose, manage and treat disorders of the head and neck, including the ears, nose throat, sinuses, voice box (larynx) and other structures","The allergist treats asthma and allergies. An allergist is a physician who specializes in the diagnosis and treatment of asthma and other allergic diseases. The allergist is specially trained to identify allergy and asthma triggers. Allergists help people treat or prevent their allergy problems","A cardiologist specializes in diagnosing and treating diseases of the cardiovascular system.","Gastroenterologists have extensive training in the diagnosis and treatment of conditions that affect the esophagus, stomach, small intestine, large intestine (colon), and biliary system","A nephrologist is a doctor who specializes in the study of kidneys and the diseases and conditions that can affect the kidneys.","The neurologist treats disorders that affect the brain, spinal cord, and nerves, such as: Cerebrovascular disease, such as stroke","A gynecologist treats patients with female reproductive organs, whether or not they identify as women. An obstetrician is a kind of gynecologist who specializes in pregnancy and childbirth.","An oncologist is a doctor who treats cancer and provides medical care for a person diagnosed with cancer.","Ophthalmologists are trained to perform eye exams, diagnose and treat disease, prescribe medications and perform eye surgery. They also write prescriptions for eyeglasses and contact lenses","Psychiatry is the branch of medicine focused on the diagnosis, treatment and prevention of mental, emotional and behavioral disorders. A psychiatrist is a medical doctor (an M.D. or D.O.) who specializes in mental health"};
//make change in symptoms if you want
String medcase[]={"balance problemsrecent upper respiratory infections,drainage from the ear (from a ruptured tympanic membrane)","allergic asthma,hypersensitivity,irritation","high blood pressure,tightness in throat,chest pain","bloating,pain,cramps","nausea,vomiting,change in urination","Partial or complete paralysis.Partial or complete loss of sensation.Seizures   ","abnormal menstrual cycle,cramps,fatigue","change in bowel habits,lump under skin,incessant cough","difficulty in seeing clearly,pain behind eyes","mood shifts,loss of interest,anxiety"};


System.out.println("Please select and enter a type of doctor you would like to consult from the list given- ");

int i;

System.out.println("Serialno.\t Specialization \t\t Description\n"); 
for(i=0;i<10;i++)
{ 
   System.out.println( i+"\t"+spec[i]+"\t\t\t"+use[i]);
}
String choi=scan.nextLine();
int j;
for (j=0;j<10;j++)
{
    if(choi.equalsIgnoreCase(spec[j]) == flag)
    {
        System.out.println("The name of the doctor you need to consult is: "+ doc[j]);
        docname=doc[j];
        dept=spec[j];
        System.out.println("Help us calibrate your result accurately...");
        System.out.println(" cases and symtoms like these are treated:" + medcase[j]);//you could rephrase this line in a better way
        break;
    }
    //else
    //{
       // System.out.println("the specialization you have entered in not here");
        //break;
}

System.out.println("\n" + "If your medical condition falls under any of the above cases or you think  it correlates with your specialization then Press 1. If  it does not fall under the above cases then press 0");
   
int choice = scan.nextInt();

if (choice == 1) 
{
    System.out.println("Remember, your doctors name is:"+ docname);
    System.out.println("Thanks, Have a nice day!  \t");
}
else if (choice == 0)
{
    System.out.println("Sorry!Our Hospital does not have the type of doctor or specialization to treat your condition \n Thank you for your time and have a nice day!");
}
else
{
   System.out.println("the choice you have entered is wrong!"); 
}
}

public void registration()
{ Scanner sc = new Scanner(System.in);
  Scanner scan = new Scanner(System.in);  
  Scanner s = new Scanner(System.in);
  System.out.println("Enter Patient Name");
  String p = sc.nextLine();
  System.out.println("Enter age of Patient");
  int age = scan.nextInt();
  System.out.println("Enter Patient Gender");
  String g = sc.nextLine();
  System.out.println("Enter Patient Address");
  String adrs = sc.nextLine();
  System.out.println("Enter Patient Phone number");
  long numb = s.nextLong();
  double id = (int)(Math.random() *1000000)+1;
  System.out.println(" \t\t\tPatient ID \t\t\t");
  System.out.println("NAME\t AGE \t GENDER \t ADDRESS \t PHONE NUMBER\t ID NO. ");
  System.out.println("------------------------------------------------------------");
  System.out.println(p+ "\t"+ age +"\t"+ g +"\t"+ adrs+" \t"+ numb + "\t" + id);
  System.out.println("------------------------------------------------------------\n");
}
    
public static void lab()
    { Scanner scan=new Scanner(System.in);
      //String Doctor=docname;
      int i,choice;
      System.out.println("Your doctor is:"+ docname);
      String docname1[]={"Dr.Leah Parker","Dr. Bruce Banner","Dr.Mia Tonks","Dr Meredith Gray","Dr M","Dr Stephen Strange","Dr Shawn Murphy","Dr Rachel Ross","Dr Cersei Lannnister","Dr Daenerys Frey"};
      String labtests[]={"\n abc \n qyz","2","3","4","5","6","7","8","9","10"};
      for (i=0;i<=9;i++)
      {if (docname1[i].equalsIgnoreCase(docname)==true)
          {System.out.println("The laboratory tests and medicines prescribed as per your doctor are:"+ labtests[i]);}
       }
      do
      {System.out.println("Are your lab reports after consultation from the doctor, positive for presence of disease or negative?"); 
       System.out.println("1:Positive \n 2:Negative \n Enter your choice");
       choice=scan.nextInt();}
      while(choice>=2 && choice<=1);
      switch(choice)
      { case 1 : billing();break;
        case 2 : billing();break;
      }
    } 
    
public static void room()
    {   
        Scanner scan=new Scanner(System.in);
        String arr[]={"AC       " ,"Non-AC   " ,"Deluxe   "    ,"Super deluxe  " ,"General    " };
        int rate[]={5000,3000,4000,2000,500};
        String food[]={"Veg","Non-Veg"};
        double food_rate[]={150,300};
        int i;
        int room_number;
        System.out.println("\n------------------------------------------------ ");
        System.out.println("\t\t  Rooms Details   \t");
        System.out.println("------------------------------------------------ ");
        System.out.println("Room Number\t    Type\t\t Rate(Rs)");
        for(i=0;i<5;i++)
        {
        room_number=i+1;
        System.out.println("      "+room_number+"\t\t"+arr[i]+"\t\t"+rate[i]);
        }
        System.out.println("What kind of room would you like to have : (1,2,3,4 or 5) " );
        
        int choice=scan.nextInt();
        if (choice>=1 && choice <=5)
        {
        String room_type=arr[choice-1];
        room_rate=rate[choice-1];
        System.out.println("You have selected " + room_type + " room and rate is "+ room_rate);
        
        }           
        else 
        System.out.println("Wrong input");
        
        System.out.println("\nWhat kind of food would you like to have : (1:Veg or 2:Non-veg) " );
        int choice1=scan.nextInt();
        System.out.println("\n------------------------------------------------ ");
        System.out.println("\t\t  Food Details   \t");
        System.out.println("------------------------------------------------ ");
        if (choice1>=1 && choice1 <=2)
        {
        String food_type=food[choice1-1];
        food_price=food_rate[choice1-1];
        System.out.println("You have selected " + food_type + " and rate is Rs. "+ food_price);
        
        }           
        else 
        System.out.println("Wrong input");
        
    }
    
    public static void billing()
{ Scanner scan=new Scanner(System.in);
  double totalCost=0.0;
  String arr[]={"Dr.Leah Parker","Dr. Bruce Banner","Dr.Mia Tonks","Dr Meredith Gray","Dr M","Dr Stephen Strange","Dr Shawn Murphy","Dr Rachel Ross","Dr Cersei Lannnister","Dr Daenerys Frey"};
  int aro[]={1,2,3,4,5,6,7,8,9,10};
  int ari[]={11,12,13,14,15,16,17,18,19,20};
  System.out.println("Are you an out patient? \n 1.Yes \n 2.No \n Enter your choice 1 or 2");
  int ch=scan.nextInt();
  medicin_shop();
  for(int i=0;i<10;i++)
   { if(arr[i].equalsIgnoreCase(docname)==true)
     { if(ch==1)
         {
         totalCost=aro[i]+medicine_rate;}
        
       else if(ch==2)
          {   room();
              System.out.println("Enter the number of days you stayed in our room: ");
              int days =scan.nextInt();
          
          totalCost=ari[i]+((room_rate+food_price)*days)+medicine_rate;}
       else
          break;
        }
    }
    System.out.println("COST"+totalCost);  
    System.out.println(" THANK YOU FOR VISITING OUR HOSPITAL. GET WELL SOON AND STAY HEALTHY!  \n YOUR TOTAL BILL AMOUNT IS " + totalCost);
 
}

public static void medicin_shop()
    {
        Scanner scan=new Scanner(System.in);
        int i;
        System.out.println("\n------------------------------------------------ ");
        System.out.println("\t\t   Medicine Shop   \t");
        System.out.println("------------------------------------------------ ");
        medicine_rate=0.0;
        String medicine_name="";
        String oto_med[]={"Hydrocodone","Zocor","Lisinopril","Hydrochloro" };
        String all_med[]={"Synthroid","Prilosec","Zocor","Lisinopril" };
        String cardio_med[]={"Hydrocodone","Zocor","Lisinopril","Hydrochloro" };      
        String gastro_med[]={"Synthroid","Prilosec","Zocor","Lisinopril" };
        String nephro_med[]={"Hydrocodone","Zocor","Lisinopril","Hydrochloro" };
        String neuro_med[]={"Synthroid","Prilosec","Zocor","Lisinopril" };
        
        String gynac_med[]={"Synthroid","Prilosec","Zocor","Lisinopril" };
        String onco_med[]={"Hydrocodone","Zocor","Lisinopril","Hydrochloro" };
        String optho_med[]={"Hydrocodone","Zocor","Lisinopril","Hydrochloro" };
        String psych_med[]={"Hydrocodone","Zocor","Lisinopril","Hydrochloro" };
        
        double cardio_rate[]={100,200,300,567.2};
        double oto_rate[]={900,200,300,400};
        double all_rate[]={100,600,300,123.4};
        double gastro_rate[]={100,200,670,400};
        double nephro_rate[]={100,200,300,950.5};
        double neuro_rate[]={100,200,300,400};
        //double obste_rate[]={100,211,300,400};
        double gynac_rate[]={100,200,773,697};
        double onco_rate[]={100,200.9,300,400};
        double optho_rate[]={100,200,773,697};
        double psych_rate[]={100,200.9,300,400};
        
       
        System.out.println("\t List of the medicines");
        System.out.println("------------------------------------------------ ");
        System.out.println("\t Name         Rate");
        if(dept.substring(0,3).equalsIgnoreCase("car"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+cardio_med[i]+"\t" + cardio_rate[i]);}
                      
                      System.out.println("\nWhich medicine has the doctor prescribed?");
                      
                      String card_pre=scan.next();
                      int count=0;
                                           
                      for(i=0;i<4;i++)
                      {
                          if(cardio_med[i].toLowerCase().equals(card_pre.toLowerCase()))
                          {
                            count=1;
                            medicine_name=cardio_med[i];
                            medicine_rate= cardio_rate[i];                    
                        }
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock");              
            }/*if*/  
            
           // ---------------------------
           if(dept.substring(0,3).equalsIgnoreCase("oto"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+oto_med[i]+"\t" + oto_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String oto_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(oto_med[i].toLowerCase().equals(oto_pre))
                          {
                            count=1;
                            medicine_name=oto_med[i];
                            medicine_rate= oto_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock"); 
            }/*if*/ 
            
            if(dept.substring(0,3).equalsIgnoreCase("all"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+all_med[i] +"\t" +  all_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String all_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(all_med[i].toLowerCase().equals(all_pre))
                          { count=1;
                            medicine_name=all_med[i];
                            medicine_rate= all_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock");  
            }/*if*/ 
            
            if(dept.substring(0,3).equalsIgnoreCase("gas"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+gastro_med[i] +"\t" +  gastro_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String gastro_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(gastro_med[i].toLowerCase().equals(gastro_pre))
                          { count=1;
                            medicine_name=gastro_med[i];
                            medicine_rate= gastro_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock");
            }/*if*/ 
            
            if(dept.substring(0,3).equalsIgnoreCase("nep"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+nephro_med[i] +"\t" +  nephro_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String nephro_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(nephro_med[i].toLowerCase().equals(nephro_pre))
                          { count=1;
                            medicine_name=nephro_med[i];
                            medicine_rate= nephro_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock"); 
            }/*if*/ 
            
            if(dept.substring(0,3).equalsIgnoreCase("neu"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+neuro_med[i] +"\t" +  neuro_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String neuro_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(neuro_med[i].toLowerCase().equals(neuro_pre))
                          { count=1;
                            medicine_name=neuro_med[i];
                            medicine_rate= neuro_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock"); 
            }/*if*/ 
            /*double optho_rate[]={100,200,773,697};
        double psych_rate[]={100,200.9,300,400};*/
        
            if(dept.substring(0,3).equalsIgnoreCase("psy"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+psych_med[i] +"\t" +  psych_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String psych_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(psych_med[i].toLowerCase().equals(psych_pre))
                          { count=1;
                            medicine_name=psych_med[i];
                            medicine_rate= psych_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock"); 
            }/*if*/ 
            
            if(dept.substring(0,3).equalsIgnoreCase("opt"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+optho_med[i] +"\t" +  optho_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String optho_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(optho_med[i].toLowerCase().equals(optho_pre))
                          { count=1;
                            medicine_name=optho_med[i];
                            medicine_rate= optho_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock"); 
            }/*if*/ 
            
            if(dept.substring(0,3).equalsIgnoreCase("gyn"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+gynac_med[i]+"\t" +  gynac_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String gynac_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(gynac_med[i].toLowerCase().equals(gynac_pre))
                          { count=1;
                            medicine_name=gynac_med[i];
                            medicine_rate= gynac_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock"); 
            }/*if*/ 
            
            if(dept.substring(0,3).equalsIgnoreCase("onc"))
            {
                for(i=0;i<4;i++)
                      {System.out.println("\t"+onco_med[i]+"\t" +  onco_rate[i]);}
                      
                      System.out.println("Which medicine has the doctor prescribed?");
                      
                      String onco_pre=scan.next();
                      int count=0;
                      for(i=0;i<4;i++)
                      {
                          if(onco_med[i].toLowerCase().equals(onco_pre))
                         { count=1;
                            medicine_name=onco_med[i];
                            medicine_rate= onco_rate[i]; }
                             
                      }
                      if (count==1)
                      {System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      }
                      else
                      System.out.println("Sorry, we are out of stock"); 
            }/*if*/ 
            
            System.out.println("------------------------------------------------ ");
            System.out.println("Medicine "+ medicine_name+ " available in the shop and rate is Rs. "+medicine_rate);
                      
           
           //---------------------
        
    }/*medicine_shop*/
}

