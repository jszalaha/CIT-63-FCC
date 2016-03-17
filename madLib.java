/*
 * Jordan Zalaha
 * CIT - 63
 * February 28, 2013
 */
package assn7;
import java.util.Scanner;

public class madLib {
    
    String ingVerb1 = null,
           adjective1 = null,
           ingVerb2 = null, 
           bodyPart1 = null,
           adverb1 = null,
           bodyPart2 = null, 
           nouns = null,
           verb1 = null,
           animals = null,
           noun = null, 
           verb2 = null,
           adjective2 = null,
           color = null;
    
    public void receive()
    {
        Scanner scr = new Scanner(System.in);
        
        do
        {
           System.out.println("Enter a verb ending in 'ing': ");
           ingVerb1 = scr.nextLine();
           ingVerb1 = ingVerb1.toLowerCase();
           if(!parseIng(ingVerb1) || parseFoul(ingVerb1))
           {
                ingVerb1 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(ingVerb1 == null);
        
        do
        {
           System.out.println("Enter an adjective: ");
           adjective1 = scr.nextLine();
           adjective1 = adjective1.toLowerCase();
           if(parseFoul(adjective1))
           {
                adjective1 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(adjective1 == null);
       
        do
        {
           System.out.println("Enter a verb ending in 'ing': ");
           ingVerb2 = scr.nextLine();
           ingVerb2 = ingVerb1.toLowerCase();
           if(!parseIng(ingVerb2) || parseFoul(ingVerb2))
           {
                ingVerb1 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(ingVerb2 == null);
        
        do
        {
           System.out.println("Enter a part of the body: ");
           bodyPart1 = scr.nextLine();
           bodyPart1 = bodyPart1.toLowerCase();
           if(parseFoul(bodyPart1))
           {
                bodyPart1 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(bodyPart1 == null);
        
        do
        {
           System.out.println("Enter an adverb: ");
           adverb1 = scr.nextLine();
           adverb1 = adverb1.toLowerCase();
           if(!parseAdverb(adverb1) || parseFoul(adverb1))
           {
                adverb1 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(adverb1 == null);
        
        do
        {
           System.out.println("Enter a part of the body: ");
           bodyPart2 = scr.nextLine();
           bodyPart2 = bodyPart2.toLowerCase();
           if(parseFoul(bodyPart2))
           {
                bodyPart2 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(bodyPart2 == null);
        
        do
        {
           System.out.println("Enter a plural noun: ");
           nouns = scr.nextLine();
           nouns = nouns.toLowerCase();
           if(!parsePlural(nouns) || parseFoul(nouns))
           {
                nouns = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(nouns == null);
        
        do
        {
           System.out.println("Enter a verb: ");
           verb1 = scr.nextLine();
           verb1 = verb1.toLowerCase();
           if(parseFoul(verb1))
           {
                verb1 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(verb1 == null);        

        do
        {
           System.out.println("Enter a plural animal: ");
           animals = scr.nextLine();
           animals = animals.toLowerCase();
           if(!parsePlural(animals) || parseFoul(animals))
           {
                animals = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(animals == null);
        
        do
        {
           System.out.println("Enter a noun: ");
           noun = scr.nextLine();
           noun = noun.toLowerCase();
           if(parseFoul(noun))
           {
                noun = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(noun == null);
        
        do
        {
           System.out.println("Enter a verb: ");
           verb2 = scr.nextLine();
           verb2 = verb2.toLowerCase();
           if(parseFoul(verb2))
           {
                verb2 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(verb2 == null);
        
        do
        {
           System.out.println("Enter an adjective: ");
           adjective2 = scr.nextLine();
           adjective2 = adjective2.toLowerCase();
           if(parseFoul(adjective2))
           {
                adjective2 = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(adjective2 == null);

        do
        {
           System.out.println("Enter a color: ");
           color = scr.nextLine();
           color = color.toLowerCase();
           if(parseFoul(color))
           {
                color = null;
                System.out.println("Invalid Entry.\n");
           }
        }while(color == null);
    }
    
    public void print()
    {
        System.out.println("Most docotrs agree that bicycle " +ingVerb1+ " is a/an " +adjective1+ " form "
                + "of exercise.\n " +ingVerb2+ " a bicycle enables you to develop your " +bodyPart1+ " "
                + "muscles as well as " +adverb1+ " increase the rate of your " +bodyPart2+ " beat.\n "
                + "More " +nouns+ " around the world " +verb1+ " bicycles than drive " +animals+ ".\n No matter"
                + " what kind of " +noun+ " you " +verb2+ ", always be sure to wear a/an " +adjective2+ " "
                + "helmet.\n Make sure to have " +color+ " reflectors too!");
    }
    
    public boolean parseIng(String line)
    {
        boolean success = false;
        line = line.trim();
        if(line.endsWith("ing"))
            success = true;
        return success;
    }
    
    public boolean parsePlural(String line)
    {
        boolean success = false;
        line = line.trim();
        if(line.endsWith("s"))
            success = true;       
        return success;
    }
    
    public boolean parseAdverb(String line)
    {
        boolean success = false;
        line = line.trim();
        if(line.endsWith("ly"))
            success = true;        
        return success;
    }
    
    public boolean parseFoul(String line)
    {
        boolean success = false;
        line = line.trim();
        if(line.startsWith("fuck") 
                || line.startsWith("shit") 
                || line.startsWith("cunt") 
                || line.startsWith("bitch")
                || line.startsWith("ass")
                || line.startsWith("dick")
                || line.startsWith("fag")
                || line.startsWith("nig"))
            success = true;
        return success;
    }
    
}
