package org.sticollegeandroidprojects.applicationdriver.Etc;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;

import java.util.ArrayList;
import java.util.List;

public class InitializeData {
    private final List<EDictionaryWords> poList = new ArrayList<>();

    private EDictionaryWords loDetail;
    private ETrivia loTrivia;

    public void InitializeWords(){
        //English to Pangasinan
        loDetail = new EDictionaryWords();
        loDetail.setWordName("I");
        loDetail.setPrnction("I");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used by a speaker to refer to himself or herself as the object of a verb or preposition. ");
        loDetail.setTransLte("Siak , Ak");
        loDetail.setInfoxxxx("I was the one who cooked., Siak so nanluto.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("You ");
        loDetail.setPrnction("You");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("The one or ones being addressed");
        loDetail.setTransLte("Sika, Sikayo");
        loDetail.setInfoxxxx("You are the one i love., Sika so inarok.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Yes");
        loDetail.setPrnction("Yes");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An affirmative answer or decision - especially in voting.");
        loDetail.setTransLte("On");
        loDetail.setInfoxxxx("They said yes., Imbaga da On.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("He");
        loDetail.setPrnction("He");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used to refer to a man - boy - or male animal previously mentioned or easily identified.");
        loDetail.setTransLte("Sikato");
        loDetail.setInfoxxxx("He is the one for me., Sikato so parad siak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("They");
        loDetail.setPrnction("They");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Use to refer to tow or more people or things previously mentioned or easily identified");
        loDetail.setTransLte("Sikara");
        loDetail.setInfoxxxx("They bought our house., Sikara so angaliw ya abong tayo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("We");
        loDetail.setPrnction("We");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used by a speaker to refer to himself or herself and one or more other people considered together");
        loDetail.setTransLte("Sikatayo, Sikami");
        loDetail.setInfoxxxx("We are his children., Sikami so anak to.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Who");
        loDetail.setPrnction("Who");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used primarily to refer to persons");
        loDetail.setTransLte("Siopa, Opa");
        loDetail.setInfoxxxx("Who bought our house?, Siopa so angaliw yaabong tayo?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("No");
        loDetail.setPrnction("No");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A negative answer or decision - as in voting.");
        loDetail.setTransLte("Andi");
        loDetail.setInfoxxxx("No! You're going., Andi! Agka oonla.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("January");
        loDetail.setPrnction("Jan-u-ar-y");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The first month of the year - in the northern hemisphere usually considered the second month of winter.");
        loDetail.setTransLte("Enero");
        loDetail.setInfoxxxx("Our fight is in January., No enero so laban mi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Entrance");
        loDetail.setPrnction("En-trance");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An opening - such as a door - passage - or gate - that allows access to a place.");
        loDetail.setTransLte("Looban");
        loDetail.setInfoxxxx("Where is the entrance?, Iner so looban?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Exit");
        loDetail.setPrnction("Ex-it");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A way out, especially of a public building - room - or passenger vehicle.");
        loDetail.setTransLte("Labasan");
        loDetail.setInfoxxxx("There is the exit., Diman so labasan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Vacant");
        loDetail.setPrnction("Va-cant");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having no contents; empty; void");
        loDetail.setTransLte("Bakanti");
        loDetail.setInfoxxxx("Do you have a vacant room?, Walay bakanti yo na kwarto?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Free");
        loDetail.setPrnction("Free");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("Without cost or payment.");
        loDetail.setTransLte("Libre");
        loDetail.setInfoxxxx("I got free food., Akala ak ya libre ya naakan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Danger");
        loDetail.setPrnction("Dan-ger");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The possibility of suffering harm or injury.");
        loDetail.setTransLte("Piligro");
        loDetail.setInfoxxxx("I'm in danger., Wala ak ed piligro.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dangerous");
        loDetail.setPrnction("Dan-ger-ous");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Able or likely to cause harm or injury.");
        loDetail.setTransLte("Piligroso");
        loDetail.setInfoxxxx("This food is dangerous., Ang pagkain na ito ay piligroso.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Luck");
        loDetail.setPrnction("Luck");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Success or failure apparently brought by chance rather than through one's own actions.");
        loDetail.setTransLte("Suerte");
        loDetail.setInfoxxxx("I am very lucky in life., Agaylay suertik ed bilay.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Private");
        loDetail.setPrnction("Pri-vate");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Belonging to or for the use of one particular person or group of people only.");
        loDetail.setTransLte("Pribado");
        loDetail.setInfoxxxx("This is a private vehicle., Pribado ya na luluganan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Door");
        loDetail.setPrnction("Door");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A hinged, sliding - or revolving barrier at the entrance to a building - room - or vehicle - or in the framework of a cupboard.");
        loDetail.setTransLte("Puerta, Kapot");
        loDetail.setInfoxxxx("Open the door., Lukasan mo may puerta.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Water");
        loDetail.setPrnction("Wa-ter");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A colorless - transparent - odorless liquid that forms the seas - lakes - rivers - and rain and is the basis of the fluids of living organisms.");
        loDetail.setTransLte("Danum");
        loDetail.setInfoxxxx("Get me some water., Iyalaan mo ak pa ya danum.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Wait");
        loDetail.setPrnction("Wait");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stay where one is or delay action until a particular time or until something else happens.");
        loDetail.setTransLte("Alagar");
        loDetail.setInfoxxxx("Wait for me., Alagar mo ak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Left");
        loDetail.setPrnction("Left");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("On, toward - or relating to the side of a human body or of a thing that is to the west when the person or thing is facing north.");
        loDetail.setTransLte("Kawigi");
        loDetail.setInfoxxxx("Let's go to the left., Unla tayo ed kawigi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Right");
        loDetail.setPrnction("Right");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Allowing access - passage - or a view through an empty space; not closed or blocked up.");
        loDetail.setTransLte("Kawanan");
        loDetail.setInfoxxxx("Let's go to the right., Unla tayo ed kawanan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Police");
        loDetail.setPrnction("Po-lice");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The civil force of a national or local government - responsible for the prevention and detection of crime and the maintenance of public order.");
        loDetail.setTransLte("Polisya, Pulis");
        loDetail.setInfoxxxx("They talked to the local police commander., Akitongtong ira ed lokal a komander na polisya.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Open");
        loDetail.setPrnction("O-pen");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Allowing access - passage - or a view through an empty space; not closed or blocked up.");
        loDetail.setTransLte("Lukas, Alukasan, Lukasan");
        loDetail.setInfoxxxx("Open the door., Lukasan mo may puerta.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Close");
        loDetail.setPrnction("Close");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("The state of something not being open.");
        loDetail.setTransLte("Kaput, Ikaput, Sarado");
        loDetail.setInfoxxxx("Close to the door., Ikaput mo may puerta.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Toilet");
        loDetail.setPrnction("Toi-let");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A fixed receptacle into which a person may urinate or defecate - typically consisting of a large bowl connected to a system for flushing away the waste into a sewer or septic tank.");
        loDetail.setTransLte("Kasilyas");
        loDetail.setInfoxxxx("Where is the toilet?, Iner so kasilyas?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Song");
        loDetail.setPrnction("Song");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A short poem or other set of words set to music or meant to be sung.");
        loDetail.setTransLte("Kansion");
        loDetail.setInfoxxxx("That's a beautiful song., Marakdakep itan a kansion.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("While");
        loDetail.setPrnction("While");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A period of time.");
        loDetail.setTransLte("Lenag, Lapud");
        loDetail.setInfoxxxx("I study while working., Manaaral ak lenag na mantratrabaho.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("February");
        loDetail.setPrnction("Feb-ru-ar-y");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The second month of the year - in the northern hemisphere usually considered the last month of winter.");
        loDetail.setTransLte("Pebrero");
        loDetail.setInfoxxxx("February is the day of hearts., Pebrero so agew ya puso.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);
        //30
        loDetail = new EDictionaryWords();
        loDetail.setWordName("March");
        loDetail.setPrnction("March");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The third month of the year - in the northern hemisphere usually considered the first month of spring.");
        loDetail.setTransLte("Marso");
        loDetail.setInfoxxxx("Our graduation is in march., Marso so graduasyon mi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("April");
        loDetail.setPrnction("A-pril");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fourth month of the year - in the northern hemisphere usually considered the second month of spring.");
        loDetail.setTransLte("Abril");
        loDetail.setInfoxxxx("We will travel in april., Onbiahe kami ed abril.  ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("May");
        loDetail.setPrnction("May");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fifth month of the year - in the northern hemisphere usually considered the last month of spring.");
        loDetail.setTransLte("Mayo");
        loDetail.setInfoxxxx("May is my birthday., Mayo so agew ya inkiyanak ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("June");
        loDetail.setPrnction("June");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The sixth month of the year - in the northern hemisphere usually considered the first month of summer.");
        loDetail.setTransLte("Hunyo");
        loDetail.setInfoxxxx("Class starts in June., June so gapoan ya  klase.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bath");
        loDetail.setPrnction("Bath");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act or process of immersing and washing one's body in a large container of water.");
        loDetail.setTransLte("Ames, Manames");
        loDetail.setInfoxxxx("Let's take a bath in the ocean., Manames tayo ed dayat.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Knock");
        loDetail.setPrnction("Knock");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A sudden short sound caused by a blow - especially on a door to attract attention or gain entry.");
        loDetail.setTransLte("Toktok, Ontoktok");
        loDetail.setInfoxxxx("Knock first before entering., Toktok ni bago Onloob");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Reserve");
        loDetail.setPrnction("Re-serve");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A supply of a commodity not needed for immediate use but available if required.");
        loDetail.setTransLte("Reserba");
        loDetail.setInfoxxxx("We have a lot of reserves in basketball. Dakel so reserba mi ed basketbol.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Careful");
        loDetail.setPrnction("Care-ful");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Making sure of avoiding potential danger - mishap - or harm; cautious.");
        loDetail.setTransLte("Manalwar");
        loDetail.setInfoxxxx("Be careful while you are driving., Manalwar ka ta lenag moy manmaneho.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Time");
        loDetail.setPrnction("Time");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A point of time as measured in hours and minutes past midnight or noon.");
        loDetail.setTransLte("Oras");
        loDetail.setInfoxxxx("What time is it?, Anto lay oras?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Its");
        loDetail.setPrnction("Its");
        loDetail.setWordType("Determiner");
        loDetail.setDescript("Belonging to or associated with a thing previously mentioned or easily identified.");
        loDetail.setTransLte("Say");
        loDetail.setInfoxxxx("Its called Basketball., Say tawag da et Basketbol.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Early");
        loDetail.setPrnction("Ear-ly");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Happening or done before the usual or expected time.");
        loDetail.setTransLte("Masakbay");
        loDetail.setInfoxxxx("You should come early., Masakbay kan Onsabi a.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Late");
        loDetail.setPrnction("Late");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("After the expected - proper - or usual time.");
        loDetail.setTransLte("Atrasado");
        loDetail.setInfoxxxx("Are you going home late?, Atrasado ka lan onsimpit?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Here");
        loDetail.setPrnction("Here");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In - at - or to this place or position.");
        loDetail.setTransLte("Dia");
        loDetail.setInfoxxxx("Come here now., Galalad dia natan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Rest");
        loDetail.setPrnction("Rest");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An instance or period of relaxing or ceasing to engage in strenuous or stressful activity.");
        loDetail.setTransLte("Painawa");
        loDetail.setInfoxxxx("Let's rest first., Painawa tini.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Today");
        loDetail.setPrnction("To-day");
        loDetail.setWordType("Noun");
        loDetail.setDescript("This present day.");
        loDetail.setTransLte("Natan");
        loDetail.setInfoxxxx("Today is a day of rest., Natan ya agew et painawa");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Yesterday");
        loDetail.setPrnction("Yes-ter-day");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The day before today.");
        loDetail.setTransLte("Karuman");
        loDetail.setInfoxxxx("Yesterday we went to the beach., Linma kami ed dayat karuman.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tomorrow");
        loDetail.setPrnction("To-mor-row");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The day after today.");
        loDetail.setTransLte("Nabuas");
        loDetail.setInfoxxxx("He leaves tomorrow., Onalis sikato nabuas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Leave");
        loDetail.setPrnction("Leave");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go away from.");
        loDetail.setTransLte("Onalis, Ontaynan");
        loDetail.setInfoxxxx("He leaves tomorrow., Onalis siakto nabuas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Morning");
        loDetail.setPrnction("Morn-ing");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the day which follows noon - between noon and evening.");
        loDetail.setTransLte("Kabuasan ");
        loDetail.setInfoxxxx("We will leave in the morning., Kabuasan tayo onalis.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Afternoon");
        loDetail.setPrnction("Af-ter-noon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the day which follows noon - between noon and evening");
        loDetail.setTransLte("Ugto");
        loDetail.setInfoxxxx("You arrived in the afternoon., Ugto kala simabi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);


        loDetail = new EDictionaryWords();
        loDetail.setWordName("Noon");
        loDetail.setPrnction("Noon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Twelve o'clock in the day; midday.");
        loDetail.setTransLte("Ngarem");
        loDetail.setInfoxxxx("It's already noon., Ngarem la.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Evening");
        loDetail.setPrnction("Eve-ning");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The period of time at the end of the day - usually from about 6 p.m. to bedtime.");
        loDetail.setTransLte("Labi");
        loDetail.setInfoxxxx("Good Evening., Masantos ya Labi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ocean");
        loDetail.setPrnction("O-cean");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A very large expanse of sea - in particular each of the main areas into which the sea is divided geographically.");
        loDetail.setTransLte("Dayat");
        loDetail.setInfoxxxx("Let's take a bath on the ocean., Man amis tayo ed dayat.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("July");
        loDetail.setPrnction("Ju-ly");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The seventh month of the year - in the northern hemisphere usually considered the second month of summer.");
        loDetail.setTransLte("Hulyo");
        loDetail.setInfoxxxx("My brother will come home in July., Onsempit si kuyak no hulyo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("August");
        loDetail.setPrnction("Au-gust");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The eighth month of the year - in the northern hemisphere usually considered the last month of summer.");
        loDetail.setTransLte("Agosto");
        loDetail.setInfoxxxx("We will meet in August., Makapaningnigan kami la ed Agosto.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("September");
        loDetail.setPrnction("Sep-tem-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The ninth month of the year - in the northern hemisphere usually considered the first month of autumn.");
        loDetail.setTransLte("Setyembre");
        loDetail.setInfoxxxx("It's September tomorrow., Setyembre la nabwas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Week");
        loDetail.setPrnction("Week");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A period of seven days.");
        loDetail.setTransLte("Simba");
        loDetail.setInfoxxxx("We were only there for a week., Sakey simba kami labat diman.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Month");
        loDetail.setPrnction("Month");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Each of the twelve named periods into which a year is divided.");
        loDetail.setTransLte("Bulan");
        loDetail.setInfoxxxx("My birthday is just a few months away., Pigaran bulan labat la agew na inkiyanak ko la.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("October");
        loDetail.setPrnction("Oc-to-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The tenth month of the year - in the northern hemisphere usually considered the second month of autumn.");
        loDetail.setTransLte("Oktubre");
        loDetail.setInfoxxxx("The project started in october., Say proyekto nan ompisa nin oktubre.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Year");
        loDetail.setPrnction("Year");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The time taken by the earth to make one revolution around the sun.");
        loDetail.setTransLte("Taon");
        loDetail.setInfoxxxx("Happy New Year., Maliket na balon taon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("New");
        loDetail.setPrnction("New");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Already existing but seen - experienced - or acquired recently or now for the first time.");
        loDetail.setTransLte("Balo");
        loDetail.setInfoxxxx("I have new shoes., Walay balon sapatos ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("November");
        loDetail.setPrnction("No-vem-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The eleventh month of the year - in the northern hemisphere usually considered the last month of autumn.");
        loDetail.setTransLte("Nobyembre");
        loDetail.setInfoxxxx("The store opened in november., Nanlukas may lakoan nin nobyembre.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("December");
        loDetail.setPrnction("De-cem-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The twelfth month of the year - in the northern hemisphere usually considered the first month of winter.");
        loDetail.setTransLte("Disyembre");
        loDetail.setInfoxxxx("Christmas is celebrated in december., Disyembre so selebrasyon na krismas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("First");
        loDetail.setPrnction("First");
        loDetail.setWordType("Number");
        loDetail.setDescript("Coming before all others in time or order; earliest; 1st.");
        loDetail.setTransLte("Unona");
        loDetail.setInfoxxxx("You are the first to leave., Sika so unona ya onalis.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Second");
        loDetail.setPrnction("Sec-ond");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number two in a sequence; coming after the first in time or order; 2nd.");
        loDetail.setTransLte("Komadua");
        loDetail.setInfoxxxx("You are the second to leave., Sika so komadua ya onalis.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Third");
        loDetail.setPrnction("Third");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number three in a sequence; 3rd.");
        loDetail.setTransLte("Komatlo");
        loDetail.setInfoxxxx("He chose a third option., Inunor to so komatlon napampilian.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fourth");
        loDetail.setPrnction("Fourth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number four in a sequence; 4th.");
        loDetail.setTransLte("Komapat");
        loDetail.setInfoxxxx("You are the Fourth to leave., Sika so komapat ya onalis.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fifth");
        loDetail.setPrnction("Fifth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number five in a sequence; 5th.");
        loDetail.setTransLte("Komalima");
        loDetail.setInfoxxxx("He finished fifth., Asumpal siakto ya komalima.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sixth");
        loDetail.setPrnction("Sixth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number six in a sequence; 6th.");
        loDetail.setTransLte("Komanem");
        loDetail.setInfoxxxx("He is the sixth among siblings., Komanem sikato ed san aagi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Seventh");
        loDetail.setPrnction("Sev-ent");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number seven in a sequence; 7th.");
        loDetail.setTransLte("Komapito");
        loDetail.setInfoxxxx("His seventh goal of the season., Say komapiton gol to ed sayan taon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eighth");
        loDetail.setPrnction("Eighth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number eight in a sequence; 8th.");
        loDetail.setTransLte("Komawalo");
        loDetail.setInfoxxxx("He is the eighth among the winners., Sikato so komawaloan ed saray analo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ninth");
        loDetail.setPrnction("Ninth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number nine in a sequence; 9th.");
        loDetail.setTransLte("Komasiam");
        loDetail.setInfoxxxx("You are ninth in the contest., Sika so komasiam ed kompetisyon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tenth");
        loDetail.setPrnction("Tenth");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Constituting number ten in a sequence; 10th.");
        loDetail.setTransLte("Komasamplo");
        loDetail.setInfoxxxx("You are tenth in class., Komasamplo ka ed klase.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hundred");
        loDetail.setPrnction("Hun-dred");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of ten and ten; ten more than ninety; 100.");
        loDetail.setTransLte("Sanlasos");
        loDetail.setInfoxxxx("My money is only a hundred., Say kuartak et sanlasos labat.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Thousand");
        loDetail.setPrnction("Thou·sand");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of a hundred and ten; 1000.");
        loDetail.setTransLte("Sanlibon");
        loDetail.setInfoxxxx("Thousands of people attended the event., Nilibon totoo so inmatendi ed sayan okasyon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Million");
        loDetail.setPrnction("Mil·lion");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of a thousand and a thousand; 1000000 or 106.");
        loDetail.setTransLte("Milyon");
        loDetail.setInfoxxxx("A million people will benefit., Sakey milyon a totoo so nagunggonaan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Where");
        loDetail.setPrnction("Where");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In or to what place or position.");
        loDetail.setTransLte("Iner");
        loDetail.setInfoxxxx("Where do you live?, Iner so panaayaman mo? ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hate");
        loDetail.setPrnction("Hate");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Feel intense or passionate dislike for (someone).");
        loDetail.setTransLte("Kabusol, Kagula");
        loDetail.setInfoxxxx("I hate you., Kabusol ta ka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("When");
        loDetail.setPrnction("When");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At what time.");
        loDetail.setTransLte("Kapigan, Pigan");
        loDetail.setInfoxxxx("When did you last see him?, Kapigan so unor lan impakanengneng yo ed sikato?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("What");
        loDetail.setPrnction("What");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Asking for information specifying something.");
        loDetail.setTransLte("Anto");
        loDetail.setInfoxxxx("What is your name?, Anto so ngaran mo?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("How");
        loDetail.setPrnction("How");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In what way or manner; by what means.");
        loDetail.setTransLte("Pano, Panon");
        loDetail.setInfoxxxx("How does it work?, Panon itan ya nagagawa?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Why");
        loDetail.setPrnction("Why");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("For what cause - reason - or purpose");
        loDetail.setTransLte("Akin");
        loDetail.setInfoxxxx("Why did you do it?, Akin et ginawam itan?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Which");
        loDetail.setPrnction("Which");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Asking for information specifying one or more people or things from a definite set.");
        loDetail.setTransLte("Dinan");
        loDetail.setInfoxxxx("Which of them?, Dinan ed sikara?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Name");
        loDetail.setPrnction("Name");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A word or set of words by which a person - animal - place - or thing is known - addressed - or referred to.");
        loDetail.setTransLte("Ngaran");
        loDetail.setInfoxxxx("My name is Parsons, John Parsons., Say ngaran ko et Parsons, John Parsons.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("See");
        loDetail.setPrnction("See");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Perceive with the eyes; discern visually.");
        loDetail.setTransLte("Nengnengen, Anengneng");
        loDetail.setInfoxxxx("In the distance she could see the blue sea., Diad arawi et nanengneng toy asul a dayat.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Call");
        loDetail.setPrnction("Call");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cry out (a word or words).");
        loDetail.setTransLte("Ontawag, Tawag");
        loDetail.setInfoxxxx("He heard an insistent voice calling his name., Nadngel to so mapekder ya boses ya ontatawag ed ngaran to.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Start");
        loDetail.setPrnction("Start");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Begin or be reckoned from a particular point in time or space.");
        loDetail.setTransLte("Gapo, Igapo, Onggapo");
        loDetail.setInfoxxxx("The race starts in Setyembre., Onggapo so lumba no Setyembre.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Contest");
        loDetail.setPrnction("Con-test");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An event in which people compete for supremacy in a sport - activity - or particular quality.");
        loDetail.setTransLte("Kompetisyon");
        loDetail.setInfoxxxx("Who will win in bike contest?, Siopa so manalo ed kompetisyon na bisikleta?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bike");
        loDetail.setPrnction("Bike");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A bicycle or motorcycle.");
        loDetail.setTransLte("Bisikleta");
        loDetail.setInfoxxxx("Who will win in bike contest?, Siopa so manalo ed kompetisyon na bisikleta?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Meaning");
        loDetail.setPrnction("Mean-ing");
        loDetail.setWordType("Noun");
        loDetail.setDescript("What is meant by a word - text - concept - or action.");
        loDetail.setTransLte("Kabaliksan, Panamegley");
        loDetail.setInfoxxxx("What Does It Really Mean?, Anto so Talagan Kabaliksan na Satan?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Understand");
        loDetail.setPrnction("Un-der-stand");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Perceive the intended meaning of (words - a language - or a speaker).");
        loDetail.setTransLte("Talosan");
        loDetail.setInfoxxxx("He didn't understand a word I said., Agto atalosan so anggan sakey a salita ya imbagak. ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Project");
        loDetail.setPrnction("Proj-ect");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An individual or collaborative enterprise that is carefully planned to achieve a particular aim.");
        loDetail.setTransLte("Proyekto");
        loDetail.setInfoxxxx("We have a lot of project., Dakel so proyekto mi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Benefit");
        loDetail.setPrnction("Ben-e-fit");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An advantage or profit gained from something.");
        loDetail.setTransLte("Gunggona");
        loDetail.setInfoxxxx("What is my benefit for being with you?, Anto so nagunggona ed siak lapud piulop kod sika?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Best");
        loDetail.setPrnction("Best");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of the most excellent - effective - or desirable type or quality.");
        loDetail.setTransLte("Sankaabigan, Kamaongan");
        loDetail.setInfoxxxx("The best pitcher in the league., Say sankaabigan a pitcher ed liga.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Really");
        loDetail.setPrnction("Re-al-ly");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In actual fact - as opposed to what is said or imagined to be true or possible.");
        loDetail.setTransLte("Talaga");
        loDetail.setInfoxxxx("What really happened?, Antoy talagan agawa?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bite");
        loDetail.setPrnction("Bite");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a person or animal) use the teeth to cut into or through something.");
        loDetail.setTransLte("Ketket");
        loDetail.setInfoxxxx("What really happened?, Antoy talagan agawa?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Blind");
        loDetail.setPrnction("Blind");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cause (someone) to be unable to see - permanently or temporarily.");
        loDetail.setTransLte("Bulag");
        loDetail.setInfoxxxx("The injury temporarily blinded him., Sikatoy temporaryon abulag lapud sugat to.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Cheat");
        loDetail.setPrnction("Cheat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Act dishonestly or unfairly in order to gain an advantage - especially in a game or examination.");
        loDetail.setTransLte("Masaol");
        loDetail.setInfoxxxx("You are cheating on our quiz., Mansasaol ka ed quiz tayo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Childhood");
        loDetail.setPrnction("Child-hood");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state of being a child.");
        loDetail.setTransLte("Inkaugaw, Inkatobonbalo");
        loDetail.setInfoxxxx("The idealized world of childhood., Say idealized a mundo na inkaugaw.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dream");
        loDetail.setPrnction("Dream");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A series of thoughts - images - and sensations occurring in a person's mind during sleep.");
        loDetail.setTransLte("Kugip");
        loDetail.setInfoxxxx("I had a dream about you., Akupkugip taka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Take");
        loDetail.setPrnction("Take");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Remove (someone or something) from a particular place.");
        loDetail.setTransLte("Ala, Alaen");
        loDetail.setInfoxxxx("He took an envelope from his inside pocket., Inala to so sobre manlapud loob na bulsa to.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Farmer");
        loDetail.setPrnction("Farm-er");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who owns or manages a farm.");
        loDetail.setTransLte("Dumaralos, Managtaneman");
        loDetail.setInfoxxxx("My father is a farmer., Say tatay koy dumaralos.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Study");
        loDetail.setPrnction("Stud-y");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The devotion of time and attention to acquiring knowledge on an academic subject - especially by means of books.");
        loDetail.setTransLte("Nanaral, Aral");
        loDetail.setInfoxxxx("I'm studying for our quiz., Manaaral ak parad quiz tayo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("School");
        loDetail.setPrnction("School");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An institution for educating children.");
        loDetail.setTransLte("Eskuelaan, Abong-Aralan");
        loDetail.setInfoxxxx("I'm going to school now., Onla ak la natan ed eskuelaan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Awake");
        loDetail.setPrnction("A-wake");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stop sleeping; wake from sleep.");
        loDetail.setTransLte("Bangon");
        loDetail.setInfoxxxx("She awoke to find the streets covered in snow., Sikatoy binmangon tan anengneng to a saray karsada et napnoy niebe.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Foreigner");
        loDetail.setPrnction("For-eign-er");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person born in or coming from a country other than one's own.");
        loDetail.setTransLte("Dayo");
        loDetail.setInfoxxxx("Are you the only foreigners here?, Sikayo labat kasi so dayo dia?.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Accompany");
        loDetail.setPrnction("Ac-com-pa-ny");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go somewhere with (someone) as a companion or escort.");
        loDetail.setTransLte("Ibaan");
        loDetail.setInfoxxxx("They accompanied me., Inibaan da ak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Teach");
        loDetail.setPrnction("Teach");
        loDetail.setWordType("Verb");
        loDetail.setDescript("show or explain to (someone) how to do something.");
        loDetail.setTransLte("Ibangat");
        loDetail.setInfoxxxx("She taught him to read., Sikatoy angibangat ed sikato na panagbasa.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Involve");
        loDetail.setPrnction("In-volve");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a situation or event) include (something) as a necessary part or result.");
        loDetail.setTransLte("Idamay, Nalanor, Mibiang");
        loDetail.setInfoxxxx("");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Drink");
        loDetail.setPrnction("Drink");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take (a liquid) into the mouth and swallow.");
        loDetail.setTransLte("Inom, Inumen");
        loDetail.setInfoxxxx("We sat by the fire and drinking our coffee., Inmirung kami ed abay na apoy tan inminom kami na kape.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bury");
        loDetail.setPrnction("Bur-y");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Put or hide under ground.");
        loDetail.setTransLte("Inkotkot, Imponpon");
        loDetail.setInfoxxxx("He buried the box in the back garden., Inkotkot to so kahon diad beneg a hardin.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Cook");
        loDetail.setPrnction("Cook");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Prepare (food - a dish, or a meal) by combining and heating the ingredients in various ways., ");
        loDetail.setTransLte("Luto, Iluto");
        loDetail.setInfoxxxx("Shall I cook dinner tonight?, Kasin manluto ak na pangdem ed sayan labi? ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Love");
        loDetail.setPrnction("Love");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An intense feeling of deep affection.");
        loDetail.setTransLte("Aro, Inaro, Pangaro");
        loDetail.setInfoxxxx("Babies fill parents with feelings of love., Saray ugugaw so mangiter ed atateng na liknaan na aro.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dead");
        loDetail.setPrnction("Dead");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("No longer alive.");
        loDetail.setTransLte("Inatey");
        loDetail.setInfoxxxx("My chicken died., Inatey may manok ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lend");
        loDetail.setPrnction("Lend");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grant to (someone) the use of (something) on the understanding that it shall be returned.");
        loDetail.setTransLte("Ipautang, Pabayesen");
        loDetail.setInfoxxxx("Stewart asked me to lend him my car., Kinerew nen Stewart ya ipabayes koy luluganan ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pray");
        loDetail.setPrnction("Pray");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grant to (someone) the use of (something) on the understanding that it shall be returned.");
        loDetail.setTransLte("Ipikasi");
        loDetail.setInfoxxxx("Pray for me., Manpikasi kayo parad siak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Friend");
        loDetail.setPrnction("Friend");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person whom one knows and with whom one has a bond of mutual affection - typically exclusive of sexual or family relations.");
        loDetail.setTransLte("Kaaro");
        loDetail.setInfoxxxx("She's a friend of mine., Sikatoy kaarok.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lazy");
        loDetail.setPrnction("La-zy");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Unwilling to work or use energy.");
        loDetail.setTransLte("Mangiras");
        loDetail.setInfoxxxx("He was too lazy to cook., Sikatoy mangiras a manluto.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Believe");
        loDetail.setPrnction("Be-lieve");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Accept (something) as true; feel sure of the truth of.");
        loDetail.setTransLte("Manisia, Anisia");
        loDetail.setInfoxxxx("The superintendent believed Lancaster's story., Anisia so superintendent ed istorya nen Lancaster.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tired");
        loDetail.setPrnction("Tired");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("In need of sleep or rest; weary.");
        loDetail.setTransLte("Naksawan");
        loDetail.setInfoxxxx("I'm tired of working., Naknaksawan ak lan mantrabaho.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Slow");
        loDetail.setPrnction("Slow");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or operating, or designed to do so, only at a low speed; not quick or fast.");
        loDetail.setTransLte("Matantan, Mapalna");
        loDetail.setInfoxxxx("You are so slow., Talagan matantan ka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Soup");
        loDetail.setPrnction("Soup");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A liquid dish - typically made by boiling meat - fish - or vegetables - etc. - in stock or water.");
        loDetail.setTransLte("Sabaw");
        loDetail.setInfoxxxx("The waves and the water beyond have become a thick  soup., Saray daluyon tan say danum ed paway et nagmaliw a makapal ya sopas. ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Blow");
        loDetail.setPrnction("Blow");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Expel air through pursed lips.");
        loDetail.setTransLte("Sibok");
        loDetail.setInfoxxxx("Blow the candle., Sibokan moy kandila.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Repeat");
        loDetail.setPrnction("Re-peat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Do (something) again - either once or a number of times.");
        loDetail.setTransLte("Uliten");
        loDetail.setInfoxxxx("Repeat it., Ulit mo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fish");
        loDetail.setPrnction("Fish");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A limbless cold-blooded vertebrate animal with gills and fins and living wholly in water.");
        loDetail.setTransLte("Sira");
        loDetail.setInfoxxxx("I sell fish., Mangilako ak na sira.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Have");
        loDetail.setPrnction("Have");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Possess - own - or hold.");
        loDetail.setTransLte("Wala");
        loDetail.setInfoxxxx("I have fish., Walay sirak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Big");
        loDetail.setPrnction("Big");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Of considerable size - extent - or intensity.");
        loDetail.setTransLte("Baleg");
        loDetail.setInfoxxxx("It's a big decision., Baleg itan a desisyon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Small");
        loDetail.setPrnction("Small");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of a size that is less than normal or usual.");
        loDetail.setTransLte("Melag");
        loDetail.setInfoxxxx("The room was small and quiet., Melag tan mareen so kuarto.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fast");
        loDetail.setPrnction("Fast");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or capable of moving at high speed.");
        loDetail.setTransLte("Maples");
        loDetail.setInfoxxxx("A fast and powerful car., Maples tan makapanyari ya kotse.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Quiet");
        loDetail.setPrnction("Qui-et");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Making little or no noise.");
        loDetail.setTransLte("Mareen");
        loDetail.setInfoxxxx("The car has a quiet., Say luluganan et mareen.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Vehicle");
        loDetail.setPrnction("Ve-hi-cle");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A thing used for transporting people or goods - especially on land - such as a car or truck.");
        loDetail.setTransLte("Luluganan");
        loDetail.setInfoxxxx("I have A vehicle., Walay luluganan ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Cheap");
        loDetail.setPrnction("Cheap");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(of an item for sale) low in price; worth more than its cost.");
        loDetail.setTransLte("Mura");
        loDetail.setInfoxxxx("They bought some cheap fruit., Angaliw ira na mamuran prutas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Expensive");
        loDetail.setPrnction("Ex-pen-sive");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Costing a lot of money.");
        loDetail.setTransLte("Mabli");
        loDetail.setInfoxxxx("Your clothes are expensive., Mabmabli iray kawes mo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Near");
        loDetail.setPrnction("Near");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At or to a short distance away; nearby.");
        loDetail.setTransLte("Asingger");
        loDetail.setInfoxxxx("I'm near., Asingger ak la.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Far");
        loDetail.setPrnction("Far");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At - to - or by a great distance (used to indicate the extent to which one thing is distant from another).");
        loDetail.setTransLte("Arawi");
        loDetail.setInfoxxxx("Your house is very far away., Arawi so abung yo. ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hot");
        loDetail.setPrnction("Hot");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having a high degree of heat or a high temperature.");
        loDetail.setTransLte("Ampetang");
        loDetail.setInfoxxxx("I wish you were hot., Komon ta ampetang ka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Cold");
        loDetail.setPrnction("Cold");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of or at a low or relatively low temperature - especially when compared with the human body.");
        loDetail.setTransLte("Ambetel");
        loDetail.setInfoxxxx("I wish you were cold., Komon ta ambetel ka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Full");
        loDetail.setPrnction("Full");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Containing or holding as much or as many as possible; having no empty space.");
        loDetail.setTransLte("Napno");
        loDetail.setInfoxxxx("Wastebaskets full of rubbish., Saray basuraan a napno na basura.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nothing");
        loDetail.setPrnction("Noth-ing");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Not anything; no single thing.");
        loDetail.setTransLte("Anggapo");
        loDetail.setInfoxxxx("I said nothing., Anggapoy imbagak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Easy");
        loDetail.setPrnction("Eas-y");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Achieved without great effort; presenting few difficulties.");
        loDetail.setTransLte("Mainomay");
        loDetail.setInfoxxxx("The quiz is easy., Mainomay so quiz.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Difficult");
        loDetail.setPrnction("Dif-fi-cult");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Needing much effort or skill to accomplish - deal with - or understand.");
        loDetail.setTransLte("Mairap");
        loDetail.setInfoxxxx("The quiz is so difficult., Mairap so quiz.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Heavy");
        loDetail.setPrnction("Heav-y");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of great weight; difficult to lift or move.");
        loDetail.setTransLte("Belat, Ambelat");
        loDetail.setInfoxxxx("The pan was too heavy for me to carry., Mabelat so pan ya awiten ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Light");
        loDetail.setPrnction("Light");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(physics, chemistry) not having atomic weight greater than average.");
        loDetail.setTransLte("Alemew");
        loDetail.setInfoxxxx("I carry only a very light magazine bag., Alemew labat ya bag so aawiten ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Carry");
        loDetail.setPrnction("Car-ry");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Support and move (someone or something) from one place to another.");
        loDetail.setTransLte("Awiten");
        loDetail.setInfoxxxx("The pan was too heavy for me to carry., Mabelat so pan ya awiten ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Powerful");
        loDetail.setPrnction("Pow-er-ful");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having control and influence over people and events.");
        loDetail.setTransLte("Makapanyari");
        loDetail.setInfoxxxx("The world's most powerful nation., Sankamakapanyarin bansa ed mundo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bad");
        loDetail.setPrnction("Bad");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of poor quality or a low standard.");
        loDetail.setTransLte("Mauges");
        loDetail.setInfoxxxx("It's bad for you., Mauges tan ed sika.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Good");
        loDetail.setPrnction("Good");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("To be desired or approved of.");
        loDetail.setTransLte("Maong, Maabig");
        loDetail.setInfoxxxx("A good quality of life., Maong a kalidad na bilay.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Help");
        loDetail.setPrnction("Help");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The action of helping someone to do something; assistance.");
        loDetail.setTransLte("Tulong");
        loDetail.setInfoxxxx("They helped her., Tinulongan da.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Young");
        loDetail.setPrnction("Young");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived or existed for only a short time");
        loDetail.setTransLte("Ugaw");
        loDetail.setInfoxxxx(" The young girl is very smart., Talagan marunong so ugaw a bii.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Old");
        loDetail.setPrnction("Old");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived for a long time; no longer young.");
        loDetail.setTransLte("Masiken");
        loDetail.setInfoxxxx("My parents are old., Masiken la ray atateng ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);


        //Pangasinan to English
        //A.
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ababues");
        loDetail.setPrnction("A-ba-bues");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("No longer present; departed.");
        loDetail.setTransLte("Gone");
                loDetail.setInfoxxxx("Ababues so luluganan to., His vehicles goned.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abaingan");
        loDetail.setPrnction("A-ba-i-ngan");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cause (someone) to feel awkward - self-conscious - or ashamed.");
        loDetail.setTransLte("Embarrass ");
        loDetail.setInfoxxxx("Abaingan ed samay agawa.,  Shame about what happened.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abakada");
        loDetail.setPrnction("A-ba-ka-da");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A set of letters or symbols in a fixed order - used to represent the basic sounds of a language; in particular - the set of letters from A to Z.");
        loDetail.setTransLte("Alphabet");
        loDetail.setInfoxxxx(" Abakada so imbangat da ed sikami., They teach us about the alphabet.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abala");
        loDetail.setPrnction("A-ba-la");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Keep occupied.");
        loDetail.setTransLte("Busy");
        loDetail.setInfoxxxx("Abala kami ed panhahanda., We were busy preparing.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abalaten");
        loDetail.setPrnction("A-ba-la-ten");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The direction toward the point of the horizon 90° clockwise from east - or the point on the horizon itself.");
        loDetail.setTransLte("South");
        loDetail.setInfoxxxx("Say dagem et manlalapud abalaten., The breeze came from the south.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abang");
        loDetail.setPrnction("A-bang");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A tenant's regular payment to a landlord for the use of property or land.");
        loDetail.setTransLte("Rent");
        loDetail.setInfoxxxx("Amay abang mo ed satay abong., Your rent on this house.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abasto");
        loDetail.setPrnction("A-bas-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A stock of a resource from which a person or place can be provided with the necessary amount of that resource.");
        loDetail.setTransLte("Supply");
        loDetail.setInfoxxxx("Dakel so abasto yo a., You have plenty of supplies.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abay");
        loDetail.setPrnction("A-bay");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At or to a short distance away; nearby.");
        loDetail.setTransLte("Near");
        loDetail.setInfoxxxx("Diad samay abay na bintana., The ones near the windows.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abeba");
        loDetail.setPrnction("A-be-ba");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In or into a low position or state.");
        loDetail.setTransLte("Low");
        loDetail.setInfoxxxx("Diman labat ed abeba., Only in the lower.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //10
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abel");
        loDetail.setPrnction("A-bel");
        loDetail.setWordType("Noun");
        loDetail.setDescript("woven or felted fabric made from wool - cotton - or a similar fiber.");
        loDetail.setTransLte("Cloth");
        loDetail.setInfoxxxx("Walay abel mo?, Do you have cloth?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abet");
        loDetail.setPrnction("A-bet");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Come into the presence or company of (someone) by chance or arrangement.");
        loDetail.setTransLte("Meet");
        loDetail.setInfoxxxx("Paway kayo tan abet yo., Go out to meet him.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abig");
        loDetail.setPrnction("A-big");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Relieve (a person or animal) of the symptoms of a disease or condition.");
        loDetail.setTransLte("Cure");
        loDetail.setInfoxxxx("Sikatoy inmabig ed sakit to., He was cured of the disease.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abilogan");
        loDetail.setPrnction("A-bi-lo-gan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the center).");
        loDetail.setTransLte("Circled");
        loDetail.setInfoxxxx("Abilogan mo may sagot?, Did you circled your answer?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abulok");
        loDetail.setPrnction("A-bu-lok");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Suffering from decay.");
        loDetail.setTransLte("Rotten");
        loDetail.setInfoxxxx("Abulok ya itnol., Rotten Eggs.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abril");
        loDetail.setPrnction("Ab-ril");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fourth month of the year - in the northern hemisphere usually considered the second month of spring.");
        loDetail.setTransLte("April");
        loDetail.setInfoxxxx("Onbiahe kami ed abril., We will travel in april.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abung");
        loDetail.setPrnction("A-bung");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The place where one lives permanently - especially as a member of a family or household.");
        loDetail.setTransLte("Home");
        loDetail.setInfoxxxx("Marakdakep so abung yo., Your house is beautiful.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aderal");
        loDetail.setPrnction("A-de-ral");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Physical harm caused to something in such a way as to impair its value - usefulness - or normal function.");
        loDetail.setTransLte("Damage");
        loDetail.setInfoxxxx(" Walay aderal to., He damage something.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agagi");
        loDetail.setPrnction("A-ga-gi");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Each of two or more children or offspring having one or both parents in common; a brother or sister.");
        loDetail.setTransLte("Sibling");
        loDetail.setInfoxxxx("Pigara ka yon san agagi?, How many siblings you have?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agasang");
        loDetail.setPrnction("A-ga-sang");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Flavoured with or fragrant with spice.");
        loDetail.setTransLte("Spicy");
        loDetail.setInfoxxxx("Labay ko iray agasang ya kanen., I love spicy foods.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //20
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agat");
        loDetail.setPrnction("A-gat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A hot - fragrant spice made from the rhizome of a plant - which may be chopped or powdered for cooking - preserved in syrup - or candied.");
        loDetail.setTransLte("Ginger");
        loDetail.setInfoxxxx("Gagamiten kon tambal so agat., I use ginger as my medicine.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agawa");
        loDetail.setPrnction("A-ga-wa");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A thing that happens or takes place - especially one of importance. ");
        loDetail.setTransLte("Event");
        loDetail.setInfoxxxx("Bali-bali so agawa karuman., The event yesterday was beautiful.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agawaan");
        loDetail.setPrnction("A-ga-wa-an");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The process of developing or being developed. ");
        loDetail.setTransLte("Development");
        loDetail.setInfoxxxx("Maayos so agawaan ya abong tayo., The development of our house is good.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agaygay");
        loDetail.setPrnction("A-gay-gay");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Old and torn; in poor condition. ");
        loDetail.setTransLte("Tattered");
        loDetail.setInfoxxxx("Lanang ak ya mansusulong ya agaygay ya pantalon., I always use a tattered pants.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agaylay");
        loDetail.setPrnction("A-gay-lay");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Very good or pleasant; excellent.");
        loDetail.setTransLte("Super");
        loDetail.setInfoxxxx("Agaylay liket to., She is super happy.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agda");
        loDetail.setPrnction("Ag-da");
        loDetail.setWordType("Contraction");
        loDetail.setDescript("Do not.");
        loDetail.setTransLte("Don't");
        loDetail.setInfoxxxx("Agda amta no antoy nagawa., They really don't know what will happen.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agel");
        loDetail.setPrnction("A-gel");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Keep (something) from happening.");
        loDetail.setTransLte("Prevent");
        loDetail.setInfoxxxx("Nobody can prevent our marriage., Anggapo so man agel ed kasal ta.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agew");
        loDetail.setPrnction("A-gew");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The star round which the earth orbits.");
        loDetail.setTransLte("Sun");
        loDetail.setInfoxxxx("Ampetang so agew., The sun is hot.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agewagew");
        loDetail.setPrnction("A-gew-a-gew");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("Happening or used every day; daily");
        loDetail.setTransLte("Everyday");
        loDetail.setInfoxxxx("Biyaya so agewagew., Everyday is a blessing. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //30
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ageyet");
        loDetail.setPrnction("A-ge-yet");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A slender long-legged fly with aquatic larvae");
        loDetail.setTransLte("Mosquito");
        loDetail.setInfoxxxx("Kabusol koy ageyet., I hate mosquito. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agila");
        loDetail.setPrnction("A-gi-la");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Large, heavy-beaked, big-footed birds of prey");
        loDetail.setTransLte("Eagle");
        loDetail.setInfoxxxx("Labay kon makaneng-neng ya agila., I want to see a eagle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agilaygilay");
        loDetail.setPrnction("A-gi-lay-gi-lay");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(of cloth or clothes) old and torn.");
        loDetail.setTransLte("Ragged");
        loDetail.setInfoxxxx("Ibantak la irayay agilaygilay ya kawes tayo., Trash our ragged clothes.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aginilaluan");
        loDetail.setPrnction("A-gi-ni-la-lu-an");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Not expected or regarded as likely to happen.");
        loDetail.setTransLte("Unexpected");
        loDetail.setInfoxxxx("Aginilaluan so insabi toh., Her arrival was unexpected.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnabitla");
        loDetail.setPrnction("Ag-na-bit-la");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Can not be revealed");
        loDetail.setTransLte("unspoken");
        loDetail.setInfoxxxx("Agko nabitla so ngaran to., I can not say his name.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnadalan");
        loDetail.setPrnction("Ag-na-da-lan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Impossible to travel along or over.");
        loDetail.setTransLte("Impassable");
        loDetail.setInfoxxxx("Agnadalan so dalan diman., The road there is impassable.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnakaukulan");
        loDetail.setPrnction("Ag-na-ka-u-ku-lan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Not needed");
        loDetail.setTransLte("Unnecesarry");
        loDetail.setInfoxxxx("Iwasan mo raw agnakaukulan ya gastos., You should avoid unnecessary expenses.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnalikiran");
        loDetail.setPrnction("Ag-na-li-ki-ran");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Not able to be avoided.");
        loDetail.setTransLte("Unnavoidable");
        loDetail.setInfoxxxx("Agnalikiran iray estudyante ya bastos., Rude students are unnavoidable.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnalingo");
        loDetail.setPrnction("Ag-na-li-ngo");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Incapable of making mistakes or being wrong.");
        loDetail.setTransLte("Infallible");
        loDetail.setInfoxxxx("Anggapod sikatayo so agnalingo., None of us are infallible.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);


        //40
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnalinguanan");
        loDetail.setPrnction("Ag-na-lin-gua-nan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Incapable of being forgotten.");
        loDetail.setTransLte("Unforgettable");
        loDetail.setInfoxxxx("Amay imbaga toh so agnalinguanan., What he said was unforgettable.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnanengneng");
        loDetail.setPrnction("Ag-na-neng-neng");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Unable to be seen.");
        loDetail.setTransLte("Invisible");
        loDetail.setInfoxxxx("Labay kon nasubukan so agnannengneng., I want to try to be invisible.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnapaliisan");
        loDetail.setPrnction("Ag-na-pa-li-i-san");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Impossible to stop or prevent.");
        loDetail.setTransLte("Unstoppable");
        loDetail.setInfoxxxx("Agnapaliisan so uran., The rain is unstoppable.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnapatunda");
        loDetail.setPrnction("Ag-na-pa-tun-da");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Impossible to stop or prevent.");
        loDetail.setTransLte("Unstoppable");
        loDetail.setInfoxxxx("Agnapatunda so galaw to., It moves unstoppable,");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnasimbangan");
        loDetail.setPrnction("Ag-na-sim-ba-ngan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Unable to be compared; totally different.");
        loDetail.setTransLte("Incomparable");
        loDetail.setInfoxxxx("Parad siyak sikato et agnasimbangan ya arom., For me he is incomparable to anyone.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnatambal");
        loDetail.setPrnction("Ag-na-tam-bal");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("A person who cannot be cured.");
        loDetail.setTransLte("Incurable");
        loDetail.setInfoxxxx("Kuwanto may doktor agnatambal., The doctor said it is incurable.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnayari");
        loDetail.setPrnction("Ag-na-ya-ri");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Not able to occur, exist, or be done");
        loDetail.setTransLte("Impossible");
        loDetail.setInfoxxxx("Anggapoy agnayari no kaibam so Diyos,. Nothing is impossible with God.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agnibaga");
        loDetail.setPrnction("Ag-ni-ba-ga");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Too unusual, extreme, or indefinite to be adequately described");
        loDetail.setTransLte("Indescribable");
        loDetail.setInfoxxxx("Agnibaga so lasa to., The taste was indescribable.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agom");
        loDetail.setPrnction("A-gom");
        loDetail.setWordType("Noun");
        loDetail.setInfoxxxx("Nilingas to may ginto ya walay agom so mata to., He looked at the gold with greedy eyes.");
        loDetail.setTransLte("Greed");
        loDetail.setInfoxxxx("He looked at the gold with greedy eyes., Nilingas to may ginto ya walay agom so mata to.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agonaboloy");
        loDetail.setPrnction("Ag-o-na-bo-loy");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Reserved, formal - or strict in one's behaviour or attitudes; austere and inflexible.");
        loDetail.setTransLte("Unbending");
        loDetail.setInfoxxxx(" Agonaboloy amay maestra ed saray problema., The teacher was proving unbending on key problems.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//50
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agong");
        loDetail.setPrnction("A-gong");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A yellow alloy of copper and zinc.");
        loDetail.setTransLte("Brass");
        loDetail.setInfoxxxx("Gawa ed agong amay yurungan., The chaair was made of brass.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agonleteb");
        loDetail.setPrnction("Ag-on-le-teb");
        loDetail.setWordType("Adjecticve");
        loDetail.setDescript("Not liable to be washed away by water");
        loDetail.setTransLte("Waterproof");
        loDetail.setInfoxxxx("Agonleteb su payong ku., My umbrella is waterproof.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agonnipeg");
        loDetail.setPrnction("Ag-gon-ni-peg");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Not competent or sufficiently knowledgeable to do something");
        loDetail.setTransLte("Unqualified");
        loDetail.setInfoxxxx(" Agonnipeg so edad to., Her age is unqualified.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agonpatey");
        loDetail.setPrnction("Ag-on-pa-tey");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Living forever; never dying or decaying. ");
        loDetail.setTransLte("Immortal");
        loDetail.setInfoxxxx("Labay ko ya agonpatey., I want to be immortal.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agos");
        loDetail.setPrnction("A-gos");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("The rate or speed at which something flows");
        loDetail.setTransLte("Flow");
        loDetail.setInfoxxxx("Maples so agos to may dayat., The flow of the sea is furious.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agosot");
        loDetail.setPrnction("A-go-sot");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Lacking organization; untidy");
        loDetail.setTransLte("Messy");
        loDetail.setInfoxxxx(" Agosot yay buwek ko., My hair is messy.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agosto");
        loDetail.setPrnction("A-gos-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The eighth month of the year - in the northern hemisphere usually considered the last month of summer.");
        loDetail.setTransLte("August");
        loDetail.setInfoxxxx("Makapaningnigan kami la ed Agosto., We will meet in August.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agpasal");
        loDetail.setPrnction("Ag-pa-sal");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("customary; usual.");
        loDetail.setTransLte("Accustomed");
        loDetail.setInfoxxxx("Agpasal ak la ed saya., I'm accustomed to this.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agrabiyado");
        loDetail.setPrnction("Ag-ra-bi-ya-do");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("In unfavourable circumstances - especially with regard to financial or social opportunities.");
        loDetail.setTransLte("Vulnerable");
        loDetail.setInfoxxxx("Tulungan dapat ya gobyerno iray agrabiyado ya tuo., Government should help those vulnerable people.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agrimensor");
        loDetail.setPrnction("Ag-ri-men-sor");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who examines the condition of land and buildings professionally");
        loDetail.setTransLte("Surveyor");
        loDetail.setInfoxxxx("Unla may agrimensor nabwas diya ed abong tayo., The surveyor will come to our house tomorrow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//60
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agrimento");
        loDetail.setPrnction("Ag-ri-men-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A negotiated and typically legally binding arrangement between parties as to a course of action");
        loDetail.setTransLte("Agreement");
        loDetail.setInfoxxxx("Walay agrimento mi ya bayaran to so utang to nabuwas., We have a agreement to pay her debt tomorrow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agrisibo");
        loDetail.setPrnction("Ag-ri-si-bo");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Ready or likely to attack or confront; characterized by or resulting from aggression.");
        loDetail.setTransLte("Aggressive");
        loDetail.setInfoxxxx("Agrisibo tay asom., Your dog is aggressive.");
                loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agsawen");
        loDetail.setPrnction("Ag-sa-wen");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take (someone) away by force or deception; kidnap.");
        loDetail.setTransLte("Abduct");
        loDetail.setInfoxxxx("Walay ugaw ya agsawen karuman., There was a child that abducted yesterday.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agto");
        loDetail.setPrnction("Ag-to");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("A feeling of aversion or disapproval.");
        loDetail.setTransLte("Dislike");
        loDetail.setInfoxxxx("Nanpawit ak ya rosas ed sikato et agto., I send her a flowers but she dislike it.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agua");
        loDetail.setPrnction("A-gua");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A fragrant liquid typically made from essential oils extracted from flowers and spices - used to give a pleasant smell to one's body.");
        loDetail.setTransLte("Perfume");
        loDetail.setInfoxxxx("Initdan koy paborito ton agua., I gave him his favourite perfume.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aguat");
        loDetail.setPrnction("A-guat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The length of the space between two points.");
        loDetail.setTransLte("Distance");
        loDetail.setInfoxxxx("Arawi ya aguat so relasyon mi., Our relationship is long distance.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agui");
        loDetail.setPrnction("A-gui");
        loDetail.setWordType("Interjection");
        loDetail.setDescript("Used to express pain.");
        loDetail.setTransLte("Ouch");
        loDetail.setInfoxxxx("Agui ansakit so ulok., Ouch my head hurts.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ahente");
        loDetail.setPrnction("A-hen-te");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who acts on behalf of another person or group.");
        loDetail.setTransLte("Agent");
        loDetail.setInfoxxxx("Sikato so ahente ya abong., He is a real estate agent.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ak");
        loDetail.setPrnction("Ak");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("A speaker or writer uses I to refer to himself or herself.");
        loDetail.setTransLte("I");
        loDetail.setInfoxxxx("Anganko labay da ak., I think they like me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Akademya");
        loDetail.setPrnction("A-ka-dem-ya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A place of study or training in a special field.");
        loDetail.setTransLte("Academy");
        loDetail.setInfoxxxx("Anton akademya ka manaaral?, What academy are you attending?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //70
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Akaimbento");
        loDetail.setPrnction("A-ka-im-ben-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who invented a particular process or device or who invents things as an occupation.");
        loDetail.setTransLte("Inventor");
        loDetail.setInfoxxxx("Siak so akaimbento., I'am the inventor.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Akan");
        loDetail.setPrnction("A-kan");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Put (food) into the mouth and chew and swallow it.");
        loDetail.setTransLte("Eat");
        loDetail.setInfoxxxx("Sangi ka tan akan mo so iter kod sika., Open your mouth and eat what I am giving you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Akar");
        loDetail.setPrnction("A-kar");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Move at a regular pace by lifting and setting down each foot in turn, never having both feet off the ground at once.");
        loDetail.setTransLte("Walk");
        loDetail.setInfoxxxx("Nanakar ak  ed plaza., I walked to the plaza. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Akin");
        loDetail.setPrnction("A-kin");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("For what cause - reason - or purpose");
        loDetail.setTransLte("Why");
        loDetail.setInfoxxxx("Akin et ginawam itan?, Why did you do it?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Akis");
        loDetail.setPrnction("A-kis");
        loDetail.setWordType("Verb");
        loDetail.setDescript("shed tears, typically as an expression of distress, pain, or sorrow.");
        loDetail.setTransLte("Cry");
        loDetail.setInfoxxxx("Anakis may ugaw., The child cried.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aksidente");
        loDetail.setPrnction("Ak-si-den-te");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An unfortunate incident that happens unexpectedly and unintentionally - typically resulting in damage or injury.");
        loDetail.setTransLte("Accident");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ala");
        loDetail.setPrnction("A-la");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Remove (someone or something) from a particular place.");
        loDetail.setTransLte("Take");
        loDetail.setInfoxxxx("Inala to so sobre manlapud loob na bulsa to., He took an envelope from his inside pocket.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Alagar");
        loDetail.setPrnction("A-la-gar");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stay where one is or delay action until a particular time or until something else happens.");
        loDetail.setTransLte("Wait");
        loDetail.setInfoxxxx("Alagar mo ak., Wait for me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Alagey");
        loDetail.setPrnction("A-la-gey");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Have or maintain an upright position, supported by one's feet.");
        loDetail.setTransLte("Stand");
        loDetail.setInfoxxxx("Alagey ka., Stand up.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Alemew");
        loDetail.setPrnction("A-le-mew");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(physics, chemistry) not having atomic weight greater than average.");
        loDetail.setTransLte("Light");
        loDetail.setInfoxxxx("Alemew labat ya bag so aawiten ko., I carry only a very light magazine bag.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //80
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aliwa");
        loDetail.setPrnction("A-li-wa");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Not correct or true; incorrect.");
        loDetail.setTransLte("Wrong");
        loDetail.setInfoxxxx("Aliwan satan so sagot., That is the wrong answer.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ambetel");
        loDetail.setPrnction("Am-be-tel");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of or at a low or relatively low temperature - especially when compared with the human body.");
        loDetail.setTransLte("Cold");
        loDetail.setInfoxxxx("Komon ta ambetel ka., I wish you were cold.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ames");
        loDetail.setPrnction("A-mes");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act or process of immersing and washing one's body in a large container of water.");
        loDetail.setTransLte("Bath");
        loDetail.setInfoxxxx("Manames tayo ed dayat., Let's take a bath in the ocean.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ampetang");
        loDetail.setPrnction("Am-pe-tang");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having a high degree of heat or a high temperature.");
        loDetail.setTransLte("Hot");
        loDetail.setInfoxxxx("Komon ta ampetang ka., I wish you were hot.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Andi");
        loDetail.setPrnction("An-di");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A negative answer or decision - as in voting.");
        loDetail.setTransLte("No");
        loDetail.setInfoxxxx("Andi! Agka oonla., No! You're going");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Anggapo");
        loDetail.setPrnction("Ang-ga-po");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Not anything; no single thing.");
        loDetail.setTransLte("Nothing");
        loDetail.setInfoxxxx("Anggapoy imbagak., I said nothing.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Anisia");
        loDetail.setPrnction("A-ni-sia");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Accept (something) as true; feel sure of the truth of.");
        loDetail.setTransLte("Believe");
        loDetail.setInfoxxxx("Anisia so superintendent ed istorya nen Lancaster., The superintendent believed Lancaster's story.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Anto");
        loDetail.setPrnction("An-to");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Asking for information specifying something.");
        loDetail.setTransLte("What");
        loDetail.setInfoxxxx("Anto so ngaran mo?, What is your name?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aral");
        loDetail.setPrnction("A-ral");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The devotion of time and attention to acquiring knowledge on an academic subject - especially by means of books.");
        loDetail.setTransLte("Study");
        loDetail.setInfoxxxx("Manaaral ak parad quiz tayo., I'm studying for our quiz.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Arawi");
        loDetail.setPrnction("A-ra-wi");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At - to - or by a great distance (used to indicate the extent to which one thing is distant from another).");
        loDetail.setTransLte("Far");
        loDetail.setInfoxxxx("Arawi so abung yo., Your house is very far away.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //90
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aro");
        loDetail.setPrnction("A-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An intense feeling of deep affection.");
        loDetail.setTransLte("Love");
        loDetail.setInfoxxxx("Saray ugugaw so mangiter ed atateng na liknaan na aro., Babies fill parents with feelings of love.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Asingger");
        loDetail.setPrnction("A-sing-ger");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At or to a short distance away; nearby.");
        loDetail.setTransLte("Near");
        loDetail.setInfoxxxx("Asingger ak la., I'm near.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Atrasado");
        loDetail.setPrnction("A-tra-sa-do");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("After the expected - proper - or usual time.");
        loDetail.setTransLte("Late");
        loDetail.setInfoxxxx("Atrasado ka lan onsimpit?, Are you going home late?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Awiten");
        loDetail.setPrnction("A-wi-ten");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Support and move (someone or something) from one place to another.");
        loDetail.setTransLte("Carry");
        loDetail.setInfoxxxx("Mabelat so pan ya awiten ko., The pan was too heavy for me to carry.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//B
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Baba");
        loDetail.setPrnction("Ba-ba");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The protruding part of the face below the mouth.");
        loDetail.setTransLte("Chin");
        loDetail.setInfoxxxx(" Ansakit so babak., My chin hurts.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Babalawen");
        loDetail.setPrnction("Ba-ba-la-wen");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Form and express a judgement.");
        loDetail.setTransLte("Criticize");
        loDetail.setInfoxxxx("Babalawen to may agik. He criticize my brother.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Babawi");
        loDetail.setPrnction("Ba-ba-wi");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act or instance of retaliating in order to get even.");
        loDetail.setTransLte("Revenge");
        loDetail.setInfoxxxx("Babawi kuno ed galaw., He will have revenge in the game.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Baboy");
        loDetail.setPrnction("Ba-boy");
        loDetail.setWordType("Nound");
        loDetail.setDescript("A wild animal of the pig family.");
        loDetail.setTransLte("Pig");
        loDetail.setInfoxxxx("Labay ko ya mangan ya baboy., I want to eat pig.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Baka");
        loDetail.setPrnction("Ba-ka");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A fully grown female animal of a domesticated breed of ox - kept to produce milk or beef");
        loDetail.setTransLte("Cow");
        loDetail.setInfoxxxx("Dakel so baka da., They have a plenty of cows.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakal");
        loDetail.setPrnction("Ba-kal");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A state of armed conflict between different nations or states or different groups within a nation or state.");
        loDetail.setTransLte("War");
        loDetail.setInfoxxxx("Iner so panlapuan na bakal tan sepakan ed sikayo?, From what source are there wars and from what source are there fights among you?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//100
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakalan");
        loDetail.setPrnction("Ba-ka-lan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Place where fighting is held");
        loDetail.setTransLte("Battlefield");
        loDetail.setInfoxxxx("Walad bakalan so asawa toh., Her husband is in the battlefield.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakanti");
        loDetail.setPrnction("Ba-kan-ti");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having no contents; empty; void");
        loDetail.setTransLte("Vacant");
        loDetail.setInfoxxxx("Walay bakanti yo na kwarto?, Do you have a vacant room?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakasiyon");
        loDetail.setPrnction("Ba-k-si-yon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A fixed holiday period between terms in universities and law courts.");
        loDetail.setTransLte("Vacation");
        loDetail.setInfoxxxx("We have a vacation tomorrow., Wala so bakasiyon tayo nabuwas.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakat");
        loDetail.setPrnction("Ba-kat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A mark - object - or other indication of the existence or passing of something.");
        loDetail.setTransLte("Trace");
        loDetail.setInfoxxxx("Wala so bakat sa sali., There is a trace of a footsteps.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakawan");
        loDetail.setPrnction("Ba-ka-wan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Type of water-based tree.");
        loDetail.setTransLte("Mangrove");
        loDetail.setInfoxxxx("Wala so bakawan mi ed beneg ya abong., We have a mangrove in our backyard.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakes");
        loDetail.setPrnction("Ba-kes");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A small to medium-sized primate that typically has a long tail - most kinds of which live in trees in tropical countries.");
        loDetail.setTransLte("Monkey");
        loDetail.setInfoxxxx("Gabay kon makanengneng ya bakes., I want to see a monkey.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakli");
        loDetail.setPrnction("Bak-li");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Separate or cause to separate into pieces.");
        loDetail.setTransLte("Break");
        loDetail.setInfoxxxx("Bakli mo may baso., Break the glass.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakokol");
        loDetail.setPrnction("Ba-ko-kol");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A large marine reptile with a bony or leathery shell and flippers - coming ashore annually on sandy beaches to lay eggs.");
        loDetail.setTransLte("Turtle");
        loDetail.setInfoxxxx("Dakel so bakokol., There are plenty of turtles. Dakel so bakokol.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakterya");
        loDetail.setPrnction("Bak-ter-ya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A member of a large group of unicellular microorganisms which have cell walls but lack organelles and an organized nucleus - including some that can cause disease.");
        loDetail.setTransLte("Bacteria");
        loDetail.setInfoxxxx("Walay maong met na bakterya., There are also good bacteria.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bala");
        loDetail.setPrnction("Ba-la");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Each of the pair of organs situated within the rib cage - consisting of elastic sacs with branching passages into which air is drawn - so that oxygen can pass into the blood and carbon dioxide be removed.");
        loDetail.setTransLte("Lung");
        loDetail.setInfoxxxx("Napipitpit so bala to tan magmainomay laingen a naimpeksion., It pressed against his lungs and made him prone to infections.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //110
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Balangbang");
        loDetail.setPrnction("Ba-lang-bang");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the human body below the ribs and above the hips.");
        loDetail.setTransLte("Waist");
        loDetail.setInfoxxxx("Isayaw so balangbang mo., Dance with your waist.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Baleg");
        loDetail.setPrnction("Ba-leg");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Of considerable size - extent - or intensity.");
        loDetail.setTransLte("Big");
        loDetail.setInfoxxxx("Baleg itan a desisyon., It's a big decision.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Baley");
        loDetail.setPrnction("Ba-ley");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An urban area that has a name - defined boundaries - and local government - and that is generally larger than a village and smaller than a city.");
        loDetail.setTransLte("Town");
        loDetail.setInfoxxxx("Unla tayo dyad baley., Let's go to town.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Balikas");
        loDetail.setPrnction("Ba-li-kas");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A short - pithy expression that generally contains advice or wisdom.");
        loDetail.setTransLte("Saying");
        loDetail.setInfoxxxx("Dia ed ontan dia ed saya a panaon itondak la so saraya a balikas ko., Therefore for this time I make an end of my sayings.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Balitok");
        loDetail.setPrnction("Ba-li-tok");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A yellow precious metal - the chemical element of atomic number 79 - used especially in jewelry and decoration and to guarantee the value of currencies.");
        loDetail.setTransLte("Gold");
        loDetail.setInfoxxxx("Intapew iratan ed saray balitok a panangipeketan., They were mounted in settings of gold.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Balo");
        loDetail.setPrnction("Ba-lo");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Already existing but seen - experienced - or acquired recently or now for the first time.");
        loDetail.setTransLte("New");
        loDetail.setInfoxxxx("Walay balon sapatos ko., I have new shoes.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bangon");
        loDetail.setPrnction("Ba-ngon");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stop sleeping; wake from sleep.");
        loDetail.setTransLte("Awake");
        loDetail.setInfoxxxx("Sikatoy binmangon tan anengneng to a saray karsada et napnoy niebe., She awoke to find the streets covered in snow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//I
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibantak");
        loDetail.setPrnction("I-ban-tak");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act of throwing something");
        loDetail.setTransLte("Throw");
        loDetail.setInfoxxxx("Ibantak yu imay basura., Throw the garbage.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);


        loDetail = new EDictionaryWords();
        loDetail.setWordName("Baog");
        loDetail.setPrnction("Ba-og");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The thin layer of tissue forming the natural outer covering of the body of a person or animal.");
        loDetail.setTransLte("Skin");
        loDetail.setInfoxxxx("Larak parad saray baog da., Oil for their skin");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //120
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Basa");
        loDetail.setPrnction("Ba-sa");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Covered or saturated with water or another liquid.");
        loDetail.setTransLte("Wet");
        loDetail.setInfoxxxx("Ambasa may kawes., The cloths are wet.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Batik");
        loDetail.setPrnction("Ba-tik");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Move at a speed faster than a walk - never having both or all the feet on the ground at the same time.");
        loDetail.setTransLte("Run");
        loDetail.setInfoxxxx("Batik ira ed palandey., They run to the mountain.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bauang");
        loDetail.setPrnction("Ba-u-ang");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A strong-smelling pungent-tasting bulb - used as a flavoring in cooking and in herbal medicine.");
        loDetail.setTransLte("Garling");
        loDetail.setInfoxxxx("Alam may bauang. , Get the garlic.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bekleo");
        loDetail.setPrnction("Bek-leo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of a person's or animal's body connecting the head to the rest of the body.");
        loDetail.setTransLte("Neck");
        loDetail.setInfoxxxx("Ituro so bekleo., Point to the neck.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Betag");
        loDetail.setPrnction("Be-tag");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Separate or cause to separate into pieces as a result of a blow - shock - or strain.");
        loDetail.setTransLte("Break");
        loDetail.setInfoxxxx("Betag mo may yelo., Break the ice.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bisikleta");
        loDetail.setPrnction("Bi-sik-le-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A bicycle or motorcycle.");
        loDetail.setTransLte("Bike");
        loDetail.setInfoxxxx("Siopa so manalo ed kompetisyon na bisikleta?, Who will win in bike contest?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bulag");
        loDetail.setPrnction("Bu-lag");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cause (someone) to be unable to see - permanently or temporarily.");
        loDetail.setTransLte("Blind");
        loDetail.setInfoxxxx("Sikatoy temporaryon abulag lapud sugat to., The injury temporarily blinded him.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bulan");
        loDetail.setPrnction("Bu-lan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Each of the twelve named periods into which a year is divided.");
        loDetail.setTransLte("Month");
        loDetail.setInfoxxxx("Pigaran bulan labat la agew na inkiyanak ko la., My birthday is just a few months away.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//D
//130
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Daak");
        loDetail.setPrnction("Da-ak");
        loDetail.setWordType("Verb");
        loDetail.setDescript("An act or instance of using or expending something carelessly - extravagantly - or to no purpose.");
        loDetail.setTransLte("Waste");
        loDetail.setInfoxxxx("Agka man-daak ya kuwartam., Do not waste your money.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Daakan");
        loDetail.setPrnction("Da-a-kan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Plentifulness of the good things of life; prosperity.");
        loDetail.setTransLte("Abundance");
        loDetail.setInfoxxxx("Daakan ya biyaya., Abundance of blessing.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Daan");
        loDetail.setPrnction("Da-an");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having a high value because of age and quality.");
        loDetail.setTransLte("Antique");
        loDetail.setInfoxxxx("Wala su daan ya gamit mi ed abong., We have a antique things in the house.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dabog");
        loDetail.setPrnction("Da-bog");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Movement showing displeasure or anger.");
        loDetail.setTransLte("Irritation");
        loDetail.setInfoxxxx("Atalo ed galaw katon nan-dabog., He lose the game, su that he gets angry.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dabuk");
        loDetail.setPrnction("Da-buk");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Fine - dry powder consisting of tiny particles of earth or waste matter lying on the ground or on surfaces or carried in the air.");
        loDetail.setTransLte("Dust");
        loDetail.setInfoxxxx("Ekal mo su dabuk., Remove the dust.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dagdag");
        loDetail.setPrnction("Dag-dag");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A part added (as to a building or residential section.");
        loDetail.setTransLte("Addition");
        loDetail.setInfoxxxx("Wala ni su dagdag mu?., Do you have any addition?.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dagdawit");
        loDetail.setPrnction("Dag-da-wit");
        loDetail.setWordType("Preposition");
        loDetail.setDescript("Not quite; very nearly.");
        loDetail.setTransLte("Almost");
        loDetail.setInfoxxxx("Dagdawit ya naplag., She almost fell.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dagem");
        loDetail.setPrnction("Da-gem");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The invisible gaseous substance surrounding the earth, a mixture mainly of oxygen and nitrogen.");
        loDetail.setTransLte("Air");
        loDetail.setInfoxxxx("Anggapo su dagem., There is no air.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dages");
        loDetail.setPrnction("Da-ges");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Without any intervening time or space.");
        loDetail.setTransLte("Immediately");
        loDetail.setInfoxxxx("Gawam ya dages., Do it immediately.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dago");
        loDetail.setPrnction("Da-go");
        loDetail.setWordType("Verb");
        loDetail.setDescript("A verbal or written answer");
        loDetail.setTransLte("Respond");
        loDetail.setInfoxxxx("Dago ka kuno., He said respond to him.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//140
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dagum");
        loDetail.setPrnction("Da-gum");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A very fine slender piece of metal with a point at one end and a hole or eye for thread at the other, used in sewing.");
        loDetail.setTransLte("Needle");
        loDetail.setInfoxxxx("Alam may dagum., Get the needle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Daiset");
        loDetail.setPrnction("Da-i-set");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Small in size - amount - or degree (often used to convey an appealing diminutiveness or express an affectionate or condescending attitude.)");
        loDetail.setTransLte("Little");
        loDetail.setInfoxxxx("Tawayan ko ya daiset., I'll taste it a little.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dait");
        loDetail.setPrnction("Da-it");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Join - fasten - or repair (something) by making stitches with a needle and thread or a sewing machine");
        loDetail.setTransLte("Sew");
        loDetail.setInfoxxxx("Dait mu su kawes ko., Sew my clothes.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dakayan");
        loDetail.setPrnction("Da-ka-yan");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Provide (a house or room) with furniture and fittings.");
        loDetail.setTransLte("Furnish");
        loDetail.setInfoxxxx("Dakayan su balo ya abong., Furnish the new house.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dakel");
        loDetail.setPrnction("Da-kel");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Existing or available in large quantities; plentiful.");
        loDetail.setTransLte("Abundant");
        loDetail.setInfoxxxx("Dakel su mansanas mi., We have a abundant of apples.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dakep");
        loDetail.setPrnction("Da-kep");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An excellent example of something. ");
        loDetail.setTransLte("Beuty");
        loDetail.setInfoxxxx("Ma-dakep su gawa tu., Her work is such a beauty.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dakma");
        loDetail.setPrnction("Dak-ma");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Itercept and hold (something which has been thrown, propelled, or dropped)");
        loDetail.setTransLte("Catch");
        loDetail.setInfoxxxx("Dakma mu su bola., Catch the ball.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dakmomo");
        loDetail.setPrnction("Dak-mo-mo");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Play (a stringed instrument or music) using a bow");
        loDetail.setTransLte("Bow");
        loDetail.setInfoxxxx("Anta tu ya mantugtog ya dakmomo., He knows how to use.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dakob");
        loDetail.setPrnction("Da-kob");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Put something on top of or in front of (something) - especially in order to protect or conceal it.");
        loDetail.setTransLte("Cover");
        loDetail.setInfoxxxx("Dakob mu su sangim., Cover your mouth.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dakosoy");
        loDetail.setPrnction("Da-ko-soy");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Make untidy or disordered.");
        loDetail.setTransLte("Disarranged");
        loDetail.setInfoxxxx("Dakosoy da imay papel., They disarranged the paper.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //150
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dala");
        loDetail.setPrnction("Da-la");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fluid that circulates in the principal vascular system of human beings and other vertebrates - in humans consisting of plasma in which the red blood cells - white blood cells - and platelets are suspended.");
        loDetail.setTransLte("Blood");
        loDetail.setInfoxxxx("Atagey so dalam, Your blood is so high.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dalang");
        loDetail.setPrnction("Da-lang");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Combustion or burning - in which substances combine chemically with oxygen from the air and typically give out bright light - heat - and smoke.");
        loDetail.setTransLte("Fire");
        loDetail.setInfoxxxx("Maksil so dalang to., Its fire was strong.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dalayap");
        loDetail.setPrnction("Da-la-yap");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A yellow - oval citrus fruit with thick skin and fragrant - acidic juice.");
        loDetail.setTransLte("Lemon");
        loDetail.setInfoxxxx("Mangala ka pa ya dalayap., Get some lemon.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dalin");
        loDetail.setPrnction("Da-lin");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The upper layer of earth in which plants grow - a black or dark brown material typically consisting of a mixture of organic remains - clay - and rock particles.");
        loDetail.setTransLte("Soil");
        loDetail.setInfoxxxx("Mangala ka na dalin., Get some soil.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Danet");
        loDetail.setPrnction("Da-net");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Pressure or tension exerted on a material object.");
        loDetail.setTransLte("Stress");
        loDetail.setInfoxxxx("Agalay danet ko., I was very stress.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Danum");
        loDetail.setPrnction("Da-num");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A colorless - transparent - odorless liquid that forms the seas - lakes - rivers - and rain and is the basis of the fluids of living organisms.");
        loDetail.setTransLte("Water");
        loDetail.setInfoxxxx("Iyalaan mo ak pa ya danum., Get me some water.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dayat");
        loDetail.setPrnction("Da-yat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A very large expanse of sea - in particular each of the main areas into which the sea is divided geographically.");
        loDetail.setTransLte("Ocean");
        loDetail.setInfoxxxx("Man amis tayo ed dayat., Let's take a bath on the ocean.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dayo");
        loDetail.setPrnction("Da-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person born in or coming from a country other than one's own.");
        loDetail.setTransLte("Foreigner");
        loDetail.setInfoxxxx("Sikayo labat kasi so dayo dia?, Are you the only foreigners here?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dengel");
        loDetail.setPrnction("De-ngel");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Perceive with the ear the sound made by (someone or something).");
        loDetail.setTransLte("Hear");
        loDetail.setInfoxxxx("Adengel mo?, Did you heard?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dia");
        loDetail.setPrnction("Dia");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In - at - or to this place or position.");
        loDetail.setTransLte("Here");
        loDetail.setInfoxxxx("Galalad dia natan., Come here now.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);


        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dika");
        loDetail.setPrnction("Di-ka");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Vegetation consisting of typically short plants with long - narrow leaves - growing wild or cultivated on lawns and pasture - and as a fodder crop.");
        loDetail.setTransLte("Grass");
        loDetail.setInfoxxxx("Mangala ka pay dika., Get some grass.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Diman");
        loDetail.setPrnction("Di-man");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In - at - or to that place or position.");
        loDetail.setTransLte("There");
        loDetail.setInfoxxxx("Anto so sankaasinggeran a rota pian makasabi diman?, What is the most direct route to get there?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dinan");
        loDetail.setPrnction("Di-nan");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Asking for information specifying one or more people or things from a definite set.");
        loDetail.setTransLte("Which");
        loDetail.setInfoxxxx("Dinan ed sikara?, Which of them?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dingot");
        loDetail.setPrnction("Di-ngot");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Covered or marked with an unclean substance.");
        loDetail.setTransLte("Dirty");
        loDetail.setInfoxxxx("Madingot na kawes., Dirty clothes.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Disyembre");
        loDetail.setPrnction("Dis-yem-bre");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The twelfth month of the year - in the northern hemisphere usually considered the first month of winter.");
        loDetail.setTransLte("December");
        loDetail.setInfoxxxx("Disyembre so selebrasyon na krismas., Christmas is celebrated in december.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Duara");
        loDetail.setPrnction("Du-a-ra");
        loDetail.setWordType("Number");
        loDetail.setDescript("Equivalent to the sum of one and one; one less than three; 2.");
        loDetail.setTransLte("Two");
        loDetail.setInfoxxxx("Duara so agik , I have two siblings.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Duga");
        loDetail.setPrnction("Du-ga");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Free from error; in accordance with fact or truth.");
        loDetail.setTransLte("Correct");
        loDetail.setInfoxxxx("Duga ka., You are correct.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dumaralos");
        loDetail.setPrnction("Du-ma-ra-los");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who owns or manages a farm.");
        loDetail.setTransLte("Farmer");
        loDetail.setInfoxxxx("Say tatay koy dumaralos., My father is a farmer.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dunong");
        loDetail.setPrnction("Du-nong");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The various branches of creative activity - such as painting - music - literature - and dance.");
        loDetail.setTransLte("Art");
        loDetail.setInfoxxxx("Labay ko tay dunong mo., I like your art.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //E
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ebanghelyo");
        loDetail.setPrnction("E-bang-hel-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Tells the story of Christ's life and teachings");
        loDetail.setTransLte("Gospel");
        loDetail.setInfoxxxx("We talked to a gospel yesterday., Wala su katungtong mi ya ebanghelyo karuman.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //170
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ebas");
        loDetail.setPrnction("E-bas");
        loDetail.setWordType("Noum");
        loDetail.setDescript("Bring to an end");
        loDetail.setTransLte("Finish");
        loDetail.setInfoxxxx("Ebas mu su urong mo., Finish your class.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ebat");
        loDetail.setPrnction("E-bat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The action of answering someone or something.");
        loDetail.setTransLte("Reply");
        loDetail.setInfoxxxx("Ebat ka ed siyak., Reply to me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ebeg");
        loDetail.setPrnction("E-beg");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A feeling of discontented or resentful longing aroused by someone else's possessions, qualities, or luck");
        loDetail.setTransLte("Envy");
        loDetail.setInfoxxxx("Wala su ebeg tu ta magangana., She envy her because she is beautiful.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ebeng");
        loDetail.setPrnction("E-beng");
        loDetail.setWordType("Noun");
        loDetail.setDescript("State of bein undernourished");
        loDetail.setTransLte("Underweight");
        loDetail.setInfoxxxx("Ebeng su asu tu., Her dog is underweight.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ebet");
        loDetail.setPrnction("E-bet");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fleshy part of the human body that you sit on");
        loDetail.setTransLte("Ass");
        loDetail.setInfoxxxx("Baleg su ebet tu., Her ass is big.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ed");
        loDetail.setPrnction("Ed");
        loDetail.setWordType("Noun");
        loDetail.setDescript("What is meant by a word - text - concept - or action.");
        loDetail.setTransLte("To");
        loDetail.setInfoxxxx("Para ed sika., This is to you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Edad");
        loDetail.setPrnction("Ed-ad");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The length of time that a person has lived or a thing has existed.");
        loDetail.setTransLte("Age");
        loDetail.setInfoxxxx("Antak so edad mo.,I know your age.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Edukasyon");
        loDetail.setPrnction("E-du-ka-syon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The process of receiving or giving systematic instruction - especially at a school or university.");
        loDetail.setTransLte("Education");
        loDetail.setInfoxxxx("Say edukasyon makatulong ed sika., Education was the one that can help you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Egab");
        loDetail.setPrnction("E-gab");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Noisily release air from the stomach through the mouth");
        loDetail.setTransLte("Burp");
        loDetail.setInfoxxxx("Maingal so egab tu., Her burp is too loud.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eges");
        loDetail.setPrnction("E-ges");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The internal organ in which the major part of the digestion of food occurs - being (in humans and many mammals) a pear-shaped enlargement of the alimentary canal linking the esophagus to the small intestine.");
        loDetail.setTransLte("Stomach");
        loDetail.setInfoxxxx("Balbaleg so eges ko., My stomach was so big.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//180
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Egna");
        loDetail.setPrnction("Eg-na");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grasp - carry - or support with one's hands");
        loDetail.setTransLte("Hold");
        loDetail.setInfoxxxx("Egna mu su limak., Hold my hand.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ehemplo");
        loDetail.setPrnction("E-hem-plo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A thing characteristic of its kind or illustrating a general rule.");
        loDetail.setTransLte("Example");
        loDetail.setInfoxxxx("Maong ya ehemplo., Good example.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ekal");
        loDetail.setPrnction("E-kal");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take (something) away or off from the position occupied.");
        loDetail.setTransLte("Remove");
        loDetail.setInfoxxxx("Ekal mu su tsinelas mu., Remove your slippers.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ekban");
        loDetail.setPrnction("Ek-ban");
        loDetail.setWordType("Verb");
        loDetail.setDescript("To drop whatever one is holding.");
        loDetail.setTransLte("Drop");
        loDetail.setInfoxxxx("Ekban mu su baso., You should drop the glass.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ekol");
        loDetail.setPrnction("E-kol");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The hindmost part of an animal - especially when prolonged beyond the rest of the body.");
        loDetail.setTransLte("Tail");
        loDetail.setInfoxxxx("Anggapo su ekol tu imay aso., The dog has no tail.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eksakto");
        loDetail.setPrnction("Ek-sak-to");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Used to emphasize the accuracy of a figure or description.");
        loDetail.setTransLte("Exactly");
        loDetail.setInfoxxxx("Eksakto su kawes mu ed sika., Your shirt fits exactly on you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eksamen");
        loDetail.setPrnction("Ek-sa-men");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A formal test of a person's knowledge or proficiency in a subject or skill.");
        loDetail.setTransLte("Examination");
        loDetail.setInfoxxxx("Akapasa ak ed eksamen., I have passed the examination.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eksperto");
        loDetail.setPrnction("Eks-per-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who is very knowledgeable about or skilful in a particular area.");
        loDetail.setTransLte("Expert");
        loDetail.setInfoxxxx("Eksperto ed panagtugtog ya gitara. He is expert to play guitar.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ektarya");
        loDetail.setPrnction("Ek-tar-ya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A metric unit of square measure - equal to 100 ares (2.471 acres or 10,000 square metres).");
        loDetail.setTransLte("Hectare");
        loDetail.setInfoxxxx("Wala su ektarya ya dalin ku ed probinsiya mi., I have hectare of in our province.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eleksion");
        loDetail.setPrnction("E-lek-sion");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A formal and organized choice by vote of a person for a political office or other position.");
        loDetail.setTransLte("Election");
        loDetail.setInfoxxxx("Eleksion lalamet., The election again.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eleng");
        loDetail.setPrnction("E-leng");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part projecting above the mouth on the face of a person or animal - containing the nostrils and used for breathing and smelling.");
        loDetail.setTransLte("Nose");
        loDetail.setInfoxxxx("Baleg so eleng to., His nose was big.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Emel");
        loDetail.setPrnction("E-mel");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Refraining from speech or temporarily speechless.");
        loDetail.setTransLte("Mute");
        loDetail.setInfoxxxx("Emel sikato., He is mute.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Emerhensia");
        loDetail.setPrnction("E-mer-hen-sia");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A serious - unexpected - and often dangerous situation requiring immediate action.");
        loDetail.setTransLte("Emergency");
        loDetail.setInfoxxxx("Walay emerhensia., There's emergency.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Enero");
        loDetail.setPrnction("E-ne-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The first month of the year - in the northern hemisphere usually considered the second month of winter.");
        loDetail.setTransLte("January");
        loDetail.setInfoxxxx("No enero so laban mi., Our fight is in January.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Enhinyero");
        loDetail.setPrnction("En-hin-ye-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who designs, builds, or maintains engines, machines, or public works.");
        loDetail.setTransLte("Engineer");
        loDetail.setInfoxxxx("Labay koy ungawa na enhinyero., I wanted to be engineer.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Epel");
        loDetail.setPrnction("E-pel");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Make or become dull or less intense.");
        loDetail.setTransLte("Dull");
        loDetail.setInfoxxxx("Balet mairap itan ya ipaliwawa lapud nagmaliw ya epel so pakadngel yo., Since you have become dull in your hearing.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Epidemya");
        loDetail.setPrnction("E-pi-dem-ya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A widespread occurrence of an infectious disease in a community at a particular time.");
        loDetail.setTransLte("Epidemic");
        loDetail.setInfoxxxx("Makapataktakot yay epidemya., The epidemic was scary.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ermen");
        loDetail.setPrnction("Er-men");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Feeling or showing sorrow; unhappy.");
        loDetail.setTransLte("Sad");
        loDetail.setInfoxxxx("Galaylay ermen ko., I'm so sad.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eskuelaan");
        loDetail.setPrnction("Es-kuela-an");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An institution for educating children.");
        loDetail.setTransLte("School");
        loDetail.setInfoxxxx("Onla ak la natan ed eskuelaan., I'm going to school now.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Espiker");
        loDetail.setPrnction("Es-pi-ker");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who speaks.");
        loDetail.setTransLte("Speaker");
        loDetail.setInfoxxxx("Siak so espiker natan., I'am the speaker for today.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //200
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Espongha");
        loDetail.setPrnction("Es-pong-ha");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A piece of a soft - light - porous substance originally consisting of the fibrous skeleton of an invertebrate but now usually made of synthetic material.");
        loDetail.setTransLte("Sponge");
        loDetail.setInfoxxxx("Maneesep iray impormasyon a singa espongha, They soak up information like sponges.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Et");
        loDetail.setPrnction("Et");
        loDetail.setWordType("Conjunction");
        loDetail.setDescript("Used to connect words of the same part of speech - clauses - or sentences - that are to be taken jointly.");
        loDetail.setTransLte("And");
        loDetail.setInfoxxxx("Siak etan sika., Me and you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eyag");
        loDetail.setPrnction("Eyag");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Give a long - loud - piercing cry or cries expressing excitement - great emotion - or pain.");
        loDetail.setTransLte("Scream");
        loDetail.setInfoxxxx(" Eyag mo labat., Just scream.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //G
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gabay");
        loDetail.setPrnction("Ga-bay");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Used with reference to a person or thing of the same kind as another.");
        loDetail.setTransLte("Like");
        loDetail.setInfoxxxx("Gabay ko ya., I like this.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gabiang");
        loDetail.setPrnction("Ga-biang");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Tear or pull (something) quickly or forcibly away from something or someone.");
        loDetail.setTransLte("Rip");
        loDetail.setInfoxxxx("Gabiang mu imay kurtina., Rip the curtain.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gabinte");
        loDetail.setPrnction("Ga-bin-te");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A cupboard with shelves or drawers for storing or displaying articles.");
        loDetail.setTransLte("Cabinet");
        loDetail.setInfoxxxx("Ed luob ya gabinte., Inside the cabinet.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gaem");
        loDetail.setPrnction("Ga-em");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A menace of bodily harm - such as may restrain a person's freedom of action.");
        loDetail.setTransLte("Threat");
        loDetail.setInfoxxxx("Gaem mu piyano nataktakot., Threat her in order to be scared.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gagala");
        loDetail.setPrnction("Ga-ga-la");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Done on purpose; deliberate");
        loDetail.setTransLte("Intentional");
        loDetail.setInfoxxxx("Gagala tu ak ya intulak., He intentionally pushed me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gakgalaw");
        loDetail.setPrnction("Gak-ga-law");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An object for a child to play with, typically a model or miniature replica of something");
        loDetail.setTransLte("Toy");
        loDetail.setInfoxxxx("Mangaliw ak ya gakgalaw., I will buy a toy.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gala");
        loDetail.setPrnction("Ga-la");
        loDetail.setWordType("Verb");
        loDetail.setDescript("To move or travel towards the speaker or with the speaker");
        loDetail.setTransLte("Come");
        loDetail.setInfoxxxx("Gala diya., Come here.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//210
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Galakgak");
        loDetail.setPrnction("Ga-lak-gak");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The action or sound of laughing");
        loDetail.setTransLte("Laughter");
        loDetail.setInfoxxxx(" Maingal so galakgak tu., Her laughter is too loud.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Galangen");
        loDetail.setPrnction("Ga-la-ngen");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Pay one's respect to");
        loDetail.setTransLte("Respect");
        loDetail.setInfoxxxx("Galangen su pangulo., Respect the president.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Galaw");
        loDetail.setPrnction("Ga-law");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Engage in activity for enjoyment and recreation rather than a serious or practical purpose.");
        loDetail.setTransLte("Play");
        loDetail.setInfoxxxx("Manisip ka pay labalabay mon galaw, a singa say chess., Think of a game you have played, such as a board game or a particular sport.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Galawgaw");
        loDetail.setPrnction("Ga-law-gaw");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Behaving in such a way as to suggest a playful sexual attraction to someone.");
        loDetail.setTransLte("Filrtatious");
        loDetail.setInfoxxxx("Galawgaw su kilos tu., Her actions is flirtatious.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gamet");
        loDetail.setPrnction("Ga-met");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Each of the four slender jointed parts attached to either hand (or five - if the thumb is included).");
        loDetail.setTransLte("Finger");
        loDetail.setInfoxxxx("Kulaan so gamet mo?, Where is your finger?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ganggan");
        loDetail.setPrnction("Gang-gan");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Give an authoritative order..");
        loDetail.setTransLte("Command");
        loDetail.setInfoxxxx("Ingangan da ak., They command me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ga-po");
        loDetail.setPrnction("Ga-po");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Start; perform or undergo the first part of (an action or activity).");
        loDetail.setTransLte("Begin ");
        loDetail.setInfoxxxx("Igapo yo lay eksamin., The exam begin.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gastos");
        loDetail.setPrnction("Gas-tos");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of an object or action) require the payment of (a specified sum of money) before it can be acquired or done.");
        loDetail.setTransLte("Cost");
        loDetail.setInfoxxxx("Pigaray gastos?, How much the cost?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gatas");
        loDetail.setPrnction("Ga-tas");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An opaque white fluid rich in fat and protein - secreted by female mammals for the nourishment of their young.");
        loDetail.setTransLte("Milk");
        loDetail.setInfoxxxx("Inom ka ya gatas., You drink the milk.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ginawa");
        loDetail.setPrnction("Gi-na-wa");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Past participle of do.");
        loDetail.setTransLte("Done");
        loDetail.setInfoxxxx("Ginawa nin?, Done by?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //220
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gisantes");
        loDetail.setPrnction("Gi-san-tes");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A spherical green seed that is eaten as a vegetable or as a pulse when dried.");
        loDetail.setTransLte("Pea");
        loDetail.setInfoxxxx("Walay gisantes yo?, Do you have peas?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gitara");
        loDetail.setPrnction("Gi-ta-ra");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A stringed musical instrument - with a fretted fingerboard - typically incurved sides - and six or twelve strings - played by plucking or strumming with the fingers or a plectrum.");
        loDetail.setTransLte("Guitar");
        loDetail.setInfoxxxx("Panamegley na impanbangat koy gitara., By giving guitar lessons.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("graduar");
        loDetail.setPrnction("gra-du-ar");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who has successfully completed a course of study or training - especially a person who has been awarded an undergraduate academic degree.");
        loDetail.setTransLte("Graduate");
        loDetail.setInfoxxxx("Sikatoy nan graduar ed koma-42 a klase na Gilead., A graduate of the 42nd class of Gilead.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gramo");
        loDetail.setPrnction("Gra-mo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A metric unit of mass equal to one thousandth of a kilogram.");
        loDetail.setTransLte("Gram");
        loDetail.setInfoxxxx("Sarag tayon ikompara so sakey gramo na DNA ed compact disc (CD)., Compare the storage capacity of one gram of DNA with that of a compact disc (CD).");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Guardia");
        loDetail.setPrnction("Gu-ar-dia");
        loDetail.setWordType("verb");
        loDetail.setDescript("Watch over in order to protect or control.");
        loDetail.setTransLte("Guard");
        loDetail.setInfoxxxx("Maong may guardia mi ed skol., Our school guard was good.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gugo");
        loDetail.setPrnction("Gu-go");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Score or mark the surface of (something) with a sharp or pointed object.");
        loDetail.setTransLte("Scratch");
        loDetail.setInfoxxxx("Gugom pa may beneg ko., Scracth my back.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gulis");
        loDetail.setPrnction("Gu-lis");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A long, narrow mark or band");
        loDetail.setTransLte("Line");
        loDetail.setInfoxxxx("Mangawa ka ya gulis., Make a line.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gunggona");
        loDetail.setPrnction("Gung-go-na");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An advantage or profit gained from something.");
        loDetail.setTransLte("Benefit");
        loDetail.setInfoxxxx("Anto so nagunggona ed siak lapud piulop kod sika?, What is my benefit for being with you?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gurgor");
        loDetail.setPrnction("Gur-gor");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act of rubbing.");
        loDetail.setTransLte("Rub");
        loDetail.setInfoxxxx("Gurgor mo pa may beneg ko., Rub my back.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Guwantis");
        loDetail.setPrnction("Gu-wan-tis");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A covering for the hand worn for protection against cold or dirt and typically having separate parts for each finger and the thumb.");
        loDetail.setTransLte("Glove");
        loDetail.setInfoxxxx("Mansulong ka ya guwantis., Where some gloves.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //230
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Guyor");
        loDetail.setPrnction("Gu-yor");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Exert force on (someone or something) so as to cause movement toward oneself.");
        loDetail.setTransLte("Pull");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//H
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Haplos");
        loDetail.setPrnction("Ha-plos");
        loDetail.setWordType("Verb");
                loDetail.setDescript("Touch quickly and gently with the flat of the hand");
        loDetail.setTransLte("Pat");
        loDetail.setInfoxxxx("Haplos mu imay asu., Pat the dog.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hardin");
        loDetail.setPrnction("Har-din");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A small piece of ground used to grow vegetables - fruit - herbs - or flowers.");
        loDetail.setTransLte("Garden");
        loDetail.setInfoxxxx("Walay hardin ko., I have garden.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Helikopter");
        loDetail.setPrnction("He-li-kop-ter");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A type of aircraft which derives both lift and propulsion from one or more sets of horizontally revolving overhead rotors.");
        loDetail.setTransLte("Helicopter");
        loDetail.setInfoxxxx("Lugan tayo ed helikopter., Let's ride on helicopter.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Heneral");
        loDetail.setPrnction("He-ne-ral");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A commander of an army - or an army officer of very high rank.");
        loDetail.setTransLte("General");
        loDetail.setInfoxxxx("Heneral su amak., My father is a general.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hinang");
        loDetail.setPrnction("Hi-nang");
        loDetail.setWordType("Verb");
        loDetail.setDescript("A low-melting alloy - especially one based on lead and tin.");
        loDetail.setTransLte("Solder");
        loDetail.setInfoxxxx("Hinang mo itan ya duwara., Solder the two pieces together.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hipnotismo");
        loDetail.setPrnction("Hip-to-tis-mo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The study or practice of hypnosis.");
        loDetail.setTransLte("Hypnotism");
        loDetail.setInfoxxxx("Gabay ku natutunan su hipnotismo., I want to learn hypnotism.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Historya");
        loDetail.setPrnction("His-tor-ya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The study of past events - particularly in human affairs.");
        loDetail.setTransLte("History");
        loDetail.setInfoxxxx("Wala su historya mi., We have a history.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Holdap");
        loDetail.setPrnction("Hol-dap");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The action of taking property unlawfully from a person or place by force or threat of force.");
        loDetail.setTransLte("Roberry");
        loDetail.setInfoxxxx("Wala su holdap karuman., There was a roberry yesterday.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Holin");
        loDetail.setPrnction("Ho-lin");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The game of marbles.");
        loDetail.setTransLte("Marbles");
        loDetail.setInfoxxxx("Mangalaw tayu ya holin., Let's play marbles.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //240
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hulyo");
        loDetail.setPrnction("Hul-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The seventh month of the year - in the northern hemisphere usually considered the second month of summer.");
        loDetail.setTransLte("July");
        loDetail.setInfoxxxx("Onsempit si kuyak no hulyo., My brother will come home in July.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hunyo");
        loDetail.setPrnction("Hun-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The sixth month of the year - in the northern hemisphere usually considered the first month of summer.");
        loDetail.setTransLte("June");
        loDetail.setInfoxxxx("Hunyo so gapoan ya  klase., Class starts in June.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Husto");
        loDetail.setPrnction("Hus-to");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Enough or adequate.");
        loDetail.setTransLte("Sufficient");
        loDetail.setInfoxxxx("Wala su husto ya kuwartak., I have a sufficient money.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//I
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Iba");
        loDetail.setPrnction("I-ba");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person or animal with whom one spends a lot of time or with whom one travels.");
        loDetail.setTransLte("Companion");
        loDetail.setInfoxxxx("Syupa su iba da?., Who's with them?.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibaan");
        loDetail.setPrnction("I-ba-an");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Accompany (someone or something) somewhere as an escort.");
        loDetail.setTransLte("Escort");
        loDetail.setInfoxxxx("I will escort you., Ibaan taka.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibabaga");
        loDetail.setPrnction("I-ba-ba-ga");
        loDetail.setWordType("Noun");
        loDetail.setDescript("What is one saying or relating.");
        loDetail.setTransLte("Saying");
        loDetail.setInfoxxxx("Wala su ibabaga tu., He is saying something.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibaga");
        loDetail.setPrnction("I-ba-ga");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Something to inform or tell.");
        loDetail.setTransLte("Inform");
        loDetail.setInfoxxxx("Ibaga mu pa ta awit tu imay papel., Tell her that bring the paper.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibaki");
        loDetail.setPrnction("I-ba-ki");
        loDetail.setWordType("Verb");
                loDetail.setDescript("Something that will be brought to the other side.");
        loDetail.setTransLte("Transferable");
        loDetail.setInfoxxxx("Ibaki yu imay lamesa., Transfer the table.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibalaybay");
        loDetail.setPrnction("I-ba-lay-bay");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Attach or be attached to a hook on a wall.");
        loDetail.setTransLte("Hang");
        loDetail.setInfoxxxx("Ibalaybay mu imay kawes ed paway., Hang the clothes outside.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibales");
        loDetail.setPrnction("I-ba-les");
        loDetail.setWordType("Verb");
        loDetail.setDescript("An act of moving something or someone to another place.");
        loDetail.setTransLte("Transfer");
        loDetail.setInfoxxxx("Ibales mu imay danum., Transfer the water.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//250
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibalita");
        loDetail.setPrnction("I-ba-li-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("To make something known or tell people about something officially.");
        loDetail.setTransLte("Announce");
        loDetail.setInfoxxxx("Wala su ibalita tu., She has something to announce.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibangat");
        loDetail.setPrnction("I-ba-ngat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Show or explain to (someone) how to do something.");
        loDetail.setTransLte("Teach");
        loDetail.setInfoxxxx("Sikatoy angibangat ed sikato na panagbasa., She taught him to read.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibantak");
        loDetail.setPrnction("I-ban-tak");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act of throwing something");
        loDetail.setTransLte("Throw");
        loDetail.setInfoxxxx("Ibantak yu imay basura., Throw the garbage.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);



        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibubulaslas");
        loDetail.setPrnction("I-bu-bu-las-las");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Something that has grown or is growing.");
        loDetail.setTransLte("Growth");
        loDetail.setInfoxxxx("Anton klase na ibubulaslas so iilaloan ed sakey ya ugaw?, What kind of growth is expected in the case of a child?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Iknol");
        loDetail.setPrnction("Ik-nol");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An oval or round object laid by a female bird - reptile - fish - or invertebrate - usually containing a developing embryo.");
        loDetail.setTransLte("Egg");
        loDetail.setInfoxxxx("Mangaliw ka pa ya iknol., Buy some eggs.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ikol");
        loDetail.setPrnction("I-kol");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The hindmost part of an animal - especially when prolonged beyond the rest of the body - such as the flexible extension of the backbone in a vertebrate - the feathers at the hind end of a bird - or a terminal appendage in an insect.");
        loDetail.setTransLte("Tail");
        loDetail.setInfoxxxx("Malbaleg so ikol to., He has a big tail.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ilog");
        loDetail.setPrnction("I-log");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A large natural stream of water flowing in a channel to the sea, a lake, or another such stream.");
        loDetail.setTransLte("River");
        loDetail.setInfoxxxx("Unla tayo ed ilog., Let's go to the river.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Imbento");
        loDetail.setPrnction("Im-ben-to");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Create or design (something that has not existed before); be the originator of.");
        loDetail.setTransLte("Invent");
        loDetail.setInfoxxxx("Imbento yo ya ay., Invent this one.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Imis");
        loDetail.setPrnction("I-mis");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Form one's features into a pleased - kind - or amused expression - typically with the corners of the mouth turned up and the front teeth exposed.");
        loDetail.setTransLte("Smile");
        loDetail.setInfoxxxx("Balbale imis to., Her smile is so beautiful.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Imon");
        loDetail.setPrnction("I-mon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state or feeling of being jealous.");
        loDetail.setTransLte("Jealousy");
        loDetail.setInfoxxxx("Maniimon ka?, You are jealousing.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //260
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Impankabat");
        loDetail.setPrnction("Im-pan-ka-bat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state or feeling how they knowed");
        loDetail.setTransLte("Rowing");
        loDetail.setInfoxxxx(" Impankabat ta da kami., They rowed us each other.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Impankokomplot");
        loDetail.setPrnction("Im-pan-ko-kom-plot");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A secret plan by a group to do something unlawful or harmful.");
        loDetail.setTransLte("Conspiracy");
        loDetail.setInfoxxxx("Impankokomplot ed too., Conspiracy about human.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Impansukay");
        loDetail.setPrnction("Im-pan-su-kay");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person - especially a police officer - whose occupation is to investigate and solve crimes.");
        loDetail.setTransLte("Detective");
        loDetail.setInfoxxxx("Kasin akaromog na magenap ya ebidensya iray impansukay na siensia pian legal a naakusaan iray gene tayo?, Have the scientific detectives found enough evidence to make a case against our genes?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Impierno");
        loDetail.setPrnction("Im-pier-no");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A place regarded in various religions as a spiritual realm of evil and suffering - often traditionally depicted as a place of perpetual fire beneath the earth where the wicked are punished after death.");
        loDetail.setTransLte("Hell");
        loDetail.setInfoxxxx("Suppose we are discussing the topic of hell with someone., Alimbawa et ipapaliwawa tayod sakey ya unabung so nipaakar ed impierno.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Impormasyon");
        loDetail.setPrnction("Im-por-ma-syon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Facts provided or learned about something or someone.");
        loDetail.setTransLte("Information");
        loDetail.setInfoxxxx("Usaren so impormasyon ya walad unona tan sampot iran parapo parad antikey ya introduksion tan konklusyon., Use the information in the first and last paragraphs for a brief introduction and conclusion.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ina");
        loDetail.setPrnction("I-na");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A woman in relation to her child or children.");
        loDetail.setTransLte("Mother");
        loDetail.setInfoxxxx("Balet magmaong so amta na Ina., But Mother knows better.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inatey");
        loDetail.setPrnction("I-na-tey");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("No longer alive.");
        loDetail.setTransLte("Dead");
        loDetail.setInfoxxxx("Inatey may manok ko., My chicken died.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Indaak");
        loDetail.setPrnction("In-da-ak");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Become or make greater in size - amount - intensity - or degree.");
        loDetail.setTransLte("Increase");
        loDetail.setInfoxxxx("Namparan diad indaak na saray bilang tan pananguman ed organisasyon, Both as regards increase in numbers and changes in organization.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Iner");
        loDetail.setPrnction("I-ner");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In or to what place or position.");
        loDetail.setTransLte("Where");
        loDetail.setInfoxxxx("Iner so kawalaan na itakot ed siak?, Where is the fear of me?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ingas");
        loDetail.setPrnction("I-ngas");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take air into the lungs and then expel it - especially as a regular physiological process.");
        loDetail.setTransLte("Breathe");
        loDetail.setInfoxxxx("Tan abilay ak diad ingas na Makapanyarin-amin., And the Almighty’s own breath brought me to life.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //270
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inkabenger");
        loDetail.setPrnction("In-ka-be-nger");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having or showing dogged determination not to change one's attitude or position on something - especially in spite of good arguments or reasons to do so.");
        loDetail.setTransLte("Stubborn");
        loDetail.setInfoxxxx("Lapud amtak so inkabenger yo., Because I knew how stubborn you are.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inkaligen");
        loDetail.setPrnction("In-ka-li-gen");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state of being free from danger or threat.");
        loDetail.setTransLte("Security");
        loDetail.setInfoxxxx("Wala ta ni so makapangiter ed sikayo na ontan a liknaan na inkaligen?, What could make you feel more secure?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inkaruksa");
        loDetail.setPrnction("In-ka-ruk-sa");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Behavior involving physical force intended to hurt - damage - or kill someone or something.");
        loDetail.setTransLte("Violence");
        loDetail.setInfoxxxx("Siopa so Talagan Natetel ed Inkaruksa?, Who Really Is Behind Cruelty?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inkaugaw");
        loDetail.setPrnction("In-ka-u-gaw");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state of being a child.");
        loDetail.setTransLte("Childhood");
        loDetail.setInfoxxxx("Say idealized a mundo na inkaugaw., The idealized world of childhood.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inkotkot");
        loDetail.setPrnction("In-kot-kot");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Put or hide under ground.");
        loDetail.setTransLte("Bury");
        loDetail.setInfoxxxx("Inkotkot to so kahon diad beneg a hardin., He buried the box in the back garden.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inom");
        loDetail.setPrnction("I-nom");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take (a liquid) into the mouth and swallow.");
        loDetail.setTransLte("Drink");
        loDetail.setInfoxxxx("Inmirung kami ed abay na apoy tan inminom kami na kape., We sat by the fire and drinking our coffee.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail.setWordName("Intalak");
        loDetail.setPrnction("In-ta-lak");
        loDetail.setWordType("Verb");
        loDetail.setDescript("");
        loDetail.setTransLte("Lock");
        loDetail.setInfoxxxx("Tan kapaway to et intalak toy puerta., He locked the door behind her.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inyanak");
        loDetail.setPrnction("In-ya-nak");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Come into existence as a result of birth.");
        loDetail.setTransLte("Born");
        loDetail.setInfoxxxx("Kayarin inyanak nen Gomer so anak da nen Oseas., After she bore one child to him.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ipasal");
        loDetail.setPrnction("I-pa-sal");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Teach (a person or animal) a particular skill or type of behavior through practice and instruction over a period of time.");
        loDetail.setTransLte("Train");
        loDetail.setInfoxxxx("Itultuloy mon ipasal so konsiensiam pian napansiansia so maong a konsiensia., continue to train your conscience and to keep a good conscience.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ipikasi");
        loDetail.setPrnction("I-pi-ka-si");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Address a solemn request or expression of thanks to a deity or other object of worship.");
        loDetail.setTransLte("Pray");
        loDetail.setInfoxxxx("Manpikasi kayo parad siak., Pray for me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //280
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Istadyum");
        loDetail.setPrnction("Is-ta-dyum");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A sports arena with tiers of seats for spectators.");
        loDetail.setTransLte("Stadium");
        loDetail.setInfoxxxx("Isipen pan wala ka’d sakey ya istadyum ya aseksek na manliket a totoo., magine yourself in a sports stadium jammed with excited people.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Istante");
        loDetail.setPrnction("Is-tan-te");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A flat length of wood or other rigid material - attached to a wall or forming part of a piece of furniture - that provides a surface for the storage or display of objects.");
        loDetail.setTransLte("Shelf");
        loDetail.setInfoxxxx("Ag-itayo nagunggonaan ed Biblia no akasinop labat itan ed istante., The Bible does us no good if it lies unopened on a shelf.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Istorya");
        loDetail.setPrnction("Is-tor-ya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An account of imaginary or real people and events told for entertainment.");
        loDetail.setTransLte("Story");
        loDetail.setInfoxxxx("Walay istoryak., I have story.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Itaynan");
        loDetail.setPrnction("I-tay-nan");
        loDetail.setWordType("Adjective/Verb/Noun");
        loDetail.setDescript("");
        loDetail.setTransLte("Leaving");
        loDetail.setInfoxxxx(" Mansiansia kayo ditan anggad itaynan yo., Stay there until you leave that place.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Iter");
        loDetail.setPrnction("I-ter");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Freely transfer the possession of (something) to (someone); hand over to.");
        loDetail.setTransLte("Give");
        loDetail.setInfoxxxx("Iter to itan ed sikatayo., He will give it to us.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Iyalis");
        loDetail.setPrnction("I-ya-lis");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Move from one place to another.");
        loDetail.setTransLte("Transfer");
        loDetail.setInfoxxxx("Nayarian mon iyalis so panagaral ed libron Ibabangat na Biblia., You can transfer the study to the Bible Teach book.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Iyan");
        loDetail.setPrnction("I-yan");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Iyan");
        loDetail.setTransLte("Put");
        loDetail.setInfoxxxx("Iyan mo ditan iray ategteg a karne.,Put pieces of meat into it.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //K
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ka");
        loDetail.setPrnction("Ka");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used to refer to the person or people that the speaker is addressing.");
        loDetail.setTransLte("You");
        loDetail.setInfoxxxx("Makasalita ka na English?, Do you speak English?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaabay");
        loDetail.setPrnction("Ka-abay");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a place or thing) be situated next to or very near (another).");
        loDetail.setTransLte("Neighbor");
        loDetail.setInfoxxxx("Kanian singa inikdan ko may kaabay mi na pagkakataon ya abusoen ak., So I feel I gave my neighbor the opportunity to hurt me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaamong");
        loDetail.setPrnction("Ka-a-mong");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Anggano kaamong koy asawak, manbibii ak.");
        loDetail.setTransLte("Companion");
        loDetail.setInfoxxxx("Anggano kaamong koy asawak., Although still companion with my wife.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //290
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaaro");
        loDetail.setPrnction("Ka-a-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person whom one knows and with whom one has a bond of mutual affection - typically exclusive of sexual or family relations.");
        loDetail.setTransLte("Friend");
        loDetail.setInfoxxxx("Sikatoy kaarok., She's a friend of mine.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabaliksan");
        loDetail.setPrnction("Ka-ba-lik-san");
        loDetail.setWordType("Noun");
        loDetail.setDescript("What is meant by a word - text - concept - or action.");
        loDetail.setTransLte("Meaning");
        loDetail.setInfoxxxx("Anto so Talagan Kabaliksan na Satan?, What Does It Really Mean?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabat");
        loDetail.setPrnction("Ka-bat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Have developed a relationship with (someone) through meeting and spending time with them; be familiar or friendly with.");
        loDetail.setTransLte("Know");
        loDetail.setInfoxxxx("Anggaman agmo ak kabat., Although you did not know me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabayo");
        loDetail.setPrnction("Ka-ba-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A large plant-eating domesticated mammal with solid hoofs and a flowing mane and tail - used for riding - racing - and to carry and pull loads.");
        loDetail.setTransLte("Horse");
        loDetail.setInfoxxxx("Sikato so nilitrato ya akalugan ed sakey a kabayo., He is portrayed as riding on a horse.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabisado");
        loDetail.setPrnction("Ka-bi-sa-do");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Well known from long or close association.");
        loDetail.setTransLte("Familiar");
        loDetail.setInfoxxxx("Kabisado nen Philo itan ya isyu., Philo was familiar with the controversy.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabisera");
        loDetail.setPrnction("Ka-bi-se-ra");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The most important city or town of a country or region - usually its seat of government and administrative center.");
        loDetail.setTransLte("Capital");
        loDetail.setInfoxxxx("Balet asabi panaon et aliwa lan kabisera na Ehipto so Memphis., In time  however  Memphis lost its status as Egypt’s capital.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kab-uasan");
        loDetail.setPrnction("Kab-ua-san");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the day which follows noon - between noon and evening.");
        loDetail.setTransLte("Morning");
        loDetail.setInfoxxxx("Kabuasan tayo onalis., We will leave in the morning.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabusol");
        loDetail.setPrnction("Ka-bu-sol");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Feel intense or passionate dislike for (someone).");
        loDetail.setTransLte("Hate");
        loDetail.setInfoxxxx("Kabusol ta ka., I hate you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kadederal");
        loDetail.setPrnction("Ka-de-de-ral");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The action or process of causing so much damage to something that it no longer exists or cannot be repaired.");
        loDetail.setTransLte("Destruction");
        loDetail.setInfoxxxx("Elekan mo so kadederal tan eras., You will laugh at destruction and hunger.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kadimlaan");
        loDetail.setPrnction("Ka-dim-la-an");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A feeling of revulsion or strong disapproval aroused by something unpleasant or offensive.");
        loDetail.setTransLte("Disgust");
        loDetail.setInfoxxxx("Tinawag iratan na Dios a talintao na kadimlaan., God calls them disgusting things and dungy idols.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kakiewan");
        loDetail.setPrnction("Ka-kie-wan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A large area covered chiefly with trees and undergrowth.");
        loDetail.setTransLte("Forest");
        loDetail.setInfoxxxx("Saray palandey tan lawak ed abalaten na Haiti so asakbongan na mabubunan kakiewan na tropiko., Mountains and valleys in the south of Haiti are covered with lush tropical forest.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kalangweran");
        loDetail.setPrnction("Ka-lang-we-ran");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived or existed for only a short time.");
        loDetail.setTransLte("Young");
        loDetail.setInfoxxxx("Karaklan ed saray manpapabautismo et kalangweran., A large number of those getting baptized are young people.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaliberliber");
        loDetail.setPrnction("Ka-li-ber-li-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The surroundings or conditions in which a person, animal, or plant lives or operates.");
        loDetail.setTransLte("Environment");
        loDetail.setInfoxxxx("Say konsiensia na sakey so naapektaan met na kultura odino kaliberliber to., The conscience can also be shaped by the general culture or environment in which one lives.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kampanilya");
        loDetail.setPrnction("Kam-pa-nil-ya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A hollow object - typically made of metal and having the shape of a deep inverted cup widening at the lip - that sounds a clear musical note when struck - typically by means of a clapper inside.");
        loDetail.setTransLte("Bell");
        loDetail.setInfoxxxx("Impansalet-salet da so kampanilya tan singa prutas a granada., They alternated a bell and a pomegranate.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kanding");
        loDetail.setPrnction("Kan-ding");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Any of various hollow-horned ruminant mammals.");
        loDetail.setTransLte("Goat");
        loDetail.setInfoxxxx("Antoy pakabidbiran no kasin say indibidual et nipasen a karnero odino kanding?, What determines whether a person will be classed as a sheep or a goat?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kanen");
        loDetail.setPrnction("Ka-nen");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Any nutritious substance that people or animals eat or drink or that plants absorb in order to maintain life and growth.");
        loDetail.setTransLte("Food");
        loDetail.setInfoxxxx("Kanian nankiew kami pian niluto mi unor lan kanen mi., We gathered enough material to make a fire, cooked the last food we had.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kanian");
        loDetail.setPrnction("Ka-nian");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("For that reason; consequently.");
        loDetail.setTransLte("Therefore");
        loDetail.setInfoxxxx("Kanian inad-arok ya agagi., Therefore, beloved ones.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kansion");
        loDetail.setPrnction("Kan-sion");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A short poem or other set of words set to music or meant to be sung.");
        loDetail.setTransLte("Song");
        loDetail.setInfoxxxx("Marakdakep itan a kansion., That's a beautiful song.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("kapa");
        loDetail.setPrnction("Ka-pa");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A vessel larger than a boat for transporting people or goods by sea.");
        loDetail.setTransLte("Ship");
        loDetail.setInfoxxxx("Baleg so kapa., A ship is large.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kapal");
        loDetail.setPrnction("Ka-pal");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("With opposite sides or surfaces that are a great or relatively great distance apart.");
        loDetail.setTransLte("Thick");
        loDetail.setInfoxxxx("Agaylay kapal a bilunget., A darkness so thick that it can be felt.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //310
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kape");
        loDetail.setPrnction("Ka-pe");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A hot drink made from the roasted and ground seeds (coffee beans) of a tropical shrub.");
        loDetail.setTransLte("Coffee");
        loDetail.setInfoxxxx("Agsesebelan na Biblia iray Kristiano ya oninum na kape., The Bible does not rule out a Christian’s consuming coffee.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kapeles");
        loDetail.setPrnction("Ka-pe-les");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or capable of moving at high speed.");
        loDetail.setTransLte("Fast");
        loDetail.setInfoxxxx("Agalay kapeles mo., Your so fast.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kapes");
        loDetail.setPrnction("Ka-pes");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A soft white fibrous substance that surrounds the seeds of a tropical and subtropical plant and is used as textile fiber and thread for sewing.");
        loDetail.setTransLte("Cotton");
        loDetail.setInfoxxxx("Nanborbor ak met na kapes., I also harvested cotton.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kapigan");
        loDetail.setPrnction("Ka-pi-gan");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At what time.");
        loDetail.setTransLte("When");
        loDetail.setInfoxxxx("Kapigan so unor lan impakanengneng yo ed sikato?, When did you last see him?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kapinsan");
        loDetail.setPrnction("Ka-pin-san");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A child of one's uncle or aunt.");
        loDetail.setTransLte("Cousin");
        loDetail.setInfoxxxx("Labay nen Bernabe ya itagar so kapinsan ton si Marcos., Barnabas wanted to take along his cousin Mark.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kapontian");
        loDetail.setPrnction("Ka-pon-ti-an");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe.");
        loDetail.setTransLte("Bananas");
        loDetail.setInfoxxxx("Imbagak ed asawak tan ananak ko ya onamot irad kapontian., I told my wife and children to hide among the nearby banana trees.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaput");
        loDetail.setPrnction("Ka-put");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("The state of something not being open.");
        loDetail.setTransLte("Close");
        loDetail.setInfoxxxx("Ikaput mo may puerta., Close to the door.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Karatula");
        loDetail.setPrnction("Ka-ra-tu-la");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An object, quality, or event whose presence or occurrence indicates the probable presence or occurrence of something else.");
        loDetail.setTransLte("Sign");
        loDetail.setInfoxxxx("Onia so kabiangan a nabasa ed sakey a tablan karatula diad isla., A wooden sign on the island states in part:");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kareenan");
        loDetail.setPrnction("Ka-re-enan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Freedom from disturbance; tranquility.");
        loDetail.setTransLte("Peace");
        loDetail.setInfoxxxx("Makapaermen ta agnambayag so kareenan tan kaligenan na nasyon., Sadly the peace and security of the nation did not last long.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Karera");
        loDetail.setPrnction("Ka-re-ra");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An occupation undertaken for a significant period of a person's life and with opportunities for progress.");
        loDetail.setTransLte("Career");
        loDetail.setInfoxxxx("Nalmo mi so mas makapaliket ya karera., we found a more rewarding career.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//320
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kariton");
        loDetail.setPrnction("Ka-ri-ton");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A vehicle used for transporting goods or another specified purpose.");
        loDetail.setTransLte("Wagon");
        loDetail.setInfoxxxx("Puputeren to ray pana tan dederalen to ray gayang; popoolan to ray kariton a parad guerra., He breaks the bow and shatters the spear; he burns the military wagons with fire.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Karul");
        loDetail.setPrnction("Ka-rul");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A loud rumbling or crashing noise heard after a lightning flash due to the expansion of rapidly heated air.");
        loDetail.setTransLte("Thunder");
        loDetail.setInfoxxxx("A singa dia ed voces na karul., As with the voice of thunder.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Karuman");
        loDetail.setPrnction("Ka-ru-man");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The day before today.");
        loDetail.setTransLte("Yesterday");
        loDetail.setInfoxxxx("Linma kami ed dayat karuman., Yesterday we went to the beach.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kasi");
        loDetail.setPrnction("Ka-si");
        loDetail.setWordType("Conjunction");
        loDetail.setDescript("For the reason that; since.");
        loDetail.setTransLte("Because");
        loDetail.setInfoxxxx("Asali yo la kasi apangaranan lapud walaray gagawaen dan agyo pibibiangan?, Do your schoolmates ever call you names because you refuse to participate in certain activities with them?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kasilyas");
        loDetail.setPrnction("Ka-sil-yas");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A fixed receptacle into which a person may urinate or defecate - typically consisting of a large bowl connected to a system for flushing away the waste into a sewer or septic tank.");
        loDetail.setTransLte("Toilet");
        loDetail.setInfoxxxx("Iner so kasilyas?, Where is the toilet?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Katawan");
        loDetail.setPrnction("Ka-ta-wan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Someone or something having power - authority - or influence; a master or ruler.");
        loDetail.setTransLte("Lord");
        loDetail.setInfoxxxx("Twan Simbaan na Diyos a Katawan., True Jesus Church.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kawanan");
        loDetail.setPrnction("Ka-wa-nan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Allowing access - passage - or a view through an empty space; not closed or blocked up.");
        loDetail.setTransLte("Right");
        loDetail.setInfoxxxx("Unla tayo ed kawanan., Let's go to the right.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("kawes");
        loDetail.setPrnction("ka-wes");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Items worn to cover the body.");
        loDetail.setTransLte("Clothes");
        loDetail.setInfoxxxx("Mangipaway kayoy kawes., Bring out a Clothes");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kawigi");
        loDetail.setPrnction("Ka-wi-gi");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("On, toward - or relating to the side of a human body or of a thing that is to the west when the person or thing is facing north.");
        loDetail.setTransLte("Left");
        loDetail.setInfoxxxx("Unla tayo ed kawigi., Let's go to the left.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kayo");
        loDetail.setPrnction("Ka-yo");
        loDetail.setWordType("Contraction");
        loDetail.setDescript("You are.");
        loDetail.setTransLte("You're");
        loDetail.setInfoxxxx("Panon to no mantratrabaho kayo ed mismon palasyo na ari?, What if you're worked in the royal palace itself?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//330
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kendi");
        loDetail.setPrnction("Ken-di");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A sweet food made with sugar or other sweeteners - typically formed in small - shaped pieces and flavored with chocolate - fruit - or nuts.");
        loDetail.setTransLte("Candy");
        loDetail.setInfoxxxx("Balanglan patalastas iya nipaakar ed saray kotsi odino kendi., Whether these are advertising cars or candy the underlying idea is.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Keso");
        loDetail.setPrnction("Ke-so");
        loDetail.setWordType("Noun");
                loDetail.setDescript("A food made from the pressed curds of milk");
        loDetail.setTransLte("Cheese");
        loDetail.setInfoxxxx("Tan iter mod samay pangulo na sanlibo iyan samploran keso., And take these ten portions of cheese to the chief of the thousand.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Keyk");
        loDetail.setPrnction("Keyk");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An item of soft - sweet food made from a mixture of flour - shortening - eggs - sugar - and other ingredients - baked and often decorated.");
        loDetail.setTransLte("Cake");
        loDetail.setInfoxxxx("Sakey ya ugaw a bii et nanggawa na keyk parad atateng to., A girl bakes a cake for her parents.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kiew");
        loDetail.setPrnction("Kiew");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The hard fibrous material that forms the main substance of the trunk or branches of a tree or shrub - used for fuel or timber.");
        loDetail.setTransLte("Wood");
        loDetail.setInfoxxxx("Satan so singa “gansa” imbes a “kiew”—sakey a baleg ya iyaaligwas!, That was like “copper” instead of “wood”—a big improvement!");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kigtel");
        loDetail.setPrnction("Kig-tel");
        loDetail.setWordType("Verb");
        loDetail.setDescript(".");
        loDetail.setTransLte("Freeze");
        loDetail.setInfoxxxx("Man kigtel ka ditan., You are freezing.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kimey");
        loDetail.setPrnction("Ki-mey");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Activity involving mental or physical effort done in order to achieve a purpose or result.");
        loDetail.setTransLte("Work");
        loDetail.setInfoxxxx("Nepeg tayon gawaen iray kimey, We must do the works.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kinder");
        loDetail.setPrnction("Kin-der");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Relating to the time before a child is old enough to go to kindergarten or elementary school.");
        loDetail.setTransLte("Preschool");
        loDetail.setInfoxxxx("Insan diad arum a pantitipon a naatendian da, mandinayew iran maong lapud anggan saray ugugaw a kinder ni labat et marundunong la ya onebat., Then at the other meetings they attended they were deeply impressed that even preschool children gave intelligent answers.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kintilion");
        loDetail.setPrnction("Kin-ti-lion");
        loDetail.setWordType("Numeral");
        loDetail.setDescript("A thousand raised to the power of six (1018).");
        loDetail.setTransLte("Quintillion");
        loDetail.setInfoxxxx("Kintilion ya amin., Its quintillion.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kipapasen");
        loDetail.setPrnction("Ki-pa-pa-sen");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The particular condition that someone or something is in at a specific time.");
        loDetail.setTransLte("State");
        loDetail.setInfoxxxx("Ontan so inkuan na report a nanlapud Ireland nipaakar kipapasen na mundo., So notes a report from Ireland about the state of the world.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kirep");
        loDetail.setPrnction("Ki-rep");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The strip of hair growing on the ridge above a person's eye socket.");
        loDetail.setTransLte("Eyebrow");
        loDetail.setInfoxxxx("Nepeg ton kalboey ulo to tan ahiten toy balbas to tan saray kirep to., He should shave off all the hair on his head and his chin and his eyebrows.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kirmat");
        loDetail.setPrnction("Kir-mat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The occurrence of a natural electrical discharge of very short duration and high voltage between a cloud and the ground or within a cloud - accompanied by a bright flash and typically also thunder.");
        loDetail.setTransLte("Lightning");
        loDetail.setInfoxxxx("Naimano yo so kabiangan na satan ya enerhiya bilang kirmat., You see some of that energy as lightning.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Klase");
        loDetail.setPrnction("Kla-se");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A set or category of things having some property or attribute in common and differentiated from others by kind - type - or quality.");
        loDetail.setTransLte("Class");
        loDetail.setInfoxxxx("Klased online., Online class.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Klasikal");
        loDetail.setPrnction("Kla-si-kal");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Relating to ancient Greek or Latin literature, art, or culture.");
        loDetail.setTransLte("Classical");
        loDetail.setInfoxxxx("Wala ray ombabansag ya klasikal a musika ed dakel ya eksena., Classical music accompanied many scenes.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Klima");
        loDetail.setPrnction("Kli-ma");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The weather conditions prevailing in an area in general or over a long period.");
        loDetail.setTransLte("Climate");
        loDetail.setInfoxxxx("Makapabigla met so klima., The climate was also quite a shock.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kolayot");
        loDetail.setPrnction("Ko-la-yot");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A nocturnal bird of prey with large forward-facing eyes surrounded by facial disks - a hooked beak, and typically a loud call.");
        loDetail.setTransLte("Owl");
        loDetail.setInfoxxxx("Aya may kolayot., This is owl.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kolkol");
        loDetail.setPrnction("Kol-kol");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take part in a violent struggle involving the exchange of physical blows or the use of weapons.");
        loDetail.setTransLte("Fight");
        loDetail.setInfoxxxx("Mankokolkol kila lalangula., You are fighting again.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //350
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komadua");
        loDetail.setPrnction("Ko-ma-dua");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number two in a sequence; coming after the first in time or order; 2nd.");
        loDetail.setTransLte("Second");
        loDetail.setInfoxxxx("Sika so komadua ya onalis., You are the second to leave.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komalima");
        loDetail.setPrnction("Ko-ma-li-ma");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number five in a sequence; 5th.");
        loDetail.setTransLte("Fifth");
        loDetail.setInfoxxxx("Asumpal siakto ya komalima., He finished fifth.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komawalo");
        loDetail.setPrnction("Komawalo");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number eight in a sequence; 8th.");
        loDetail.setTransLte("Eighth");
        loDetail.setInfoxxxx("Sikato so komawaloan ed saray analo., He is the eighth among the winners.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komanem");
        loDetail.setPrnction("Ko-ma-nem");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number six in a sequence; 6th.");
        loDetail.setTransLte("Sixth");
        loDetail.setInfoxxxx("Komanem sikato ed san aagi., He is the sixth among siblings.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komapat");
        loDetail.setPrnction("Ko-ma-pat");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number four in a sequence; 4th.");
        loDetail.setTransLte("Fourth");
        loDetail.setInfoxxxx("Sika so komapat ya onalis., You are the Fourth to leave.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komapito");
        loDetail.setPrnction("Ko-ma-pi-to");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number seven in a sequence; 7th.");
        loDetail.setTransLte("Seventh");
        loDetail.setInfoxxxx("Say komapiton gol to ed sayan taon., His seventh goal of the season.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komasamplo");
        loDetail.setPrnction("Ko-ma-sam-plo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Constituting number ten in a sequence; 10th.");
        loDetail.setTransLte("Tenth");
        loDetail.setInfoxxxx("Komasamplo ka ed klase., You are tenth in class.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komasiam");
        loDetail.setPrnction("Ko-ma-siam");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number nine in a sequence; 9th.");
        loDetail.setTransLte("Ninth");
        loDetail.setInfoxxxx("Sika so komasiam ed kompetisyon., You are ninth in the contest.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komatlo");
        loDetail.setPrnction("Ko-mat-lo");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number three in a sequence; 3rd.");
        loDetail.setTransLte("Third");
        loDetail.setInfoxxxx("Inunor to so komatlon napampilian., He chose a third option.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komon");
        loDetail.setPrnction("Ko-mon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fifth month of the year, in the northern hemisphere usually considered the last month of spring.");
        loDetail.setTransLte("May");
        loDetail.setInfoxxxx("Tan komon ta itultuloy tayo nin siansia so onaligwas ed espiritual legan tayon manlilingkor ed si Jehova., And may we ourselves continue to make spiritual progress in rendering sacred service to Jehovah.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //360
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kompetisyon");
        loDetail.setPrnction("Kom-pe-ti-syon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An event in which people compete for supremacy in a sport - activity - or particular quality.");
        loDetail.setTransLte("Contest");
        loDetail.setInfoxxxx("Siopa so manalo ed kompetisyon na bisikleta?, Who will win in bike contest?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kompyuter");
        loDetail.setPrnction("Kom-pyu-ter");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program.");
        loDetail.setTransLte("Computer");
        loDetail.setInfoxxxx("Ibabaga ni ingen na arum ya eksperto ya agnayarian na kompyuter so mangipatalos., Some experts have even felt that translation is beyond what a computer can do.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komunidad");
        loDetail.setPrnction("Ko-mu-ni-dad");
        loDetail.setWordType("Noun");
        loDetail.setDescript("");
        loDetail.setTransLte("Community");
        loDetail.setInfoxxxx("Sakey tayon komunidad., We are one community.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Koneho");
        loDetail.setPrnction("Ko-ne-ho");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A burrowing - gregarious - plant-eating mammal with long ears - long hind legs - and a short tail.");
        loDetail.setTransLte("Rabbit");
        loDetail.setInfoxxxx("Kanian nampapabaleg kami na saray manok tan koneho tan nampapaubong kami na saray bayaong., So we raised chickens and rabbits and maintained beehives.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Konsierto");
        loDetail.setPrnction("Kon-sier-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A musical performance given in public - typically by several performers or of several separate compositions.");
        loDetail.setTransLte("Concert");
        loDetail.setInfoxxxx("Sanen ompaway kami lan sankakaaro kayari min nambantay na mainga-ingal a konsierto., One day when leaving a rock concert with some friends.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Konstruksion");
        loDetail.setPrnction("Kons-truk-sion");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The building of something, typically a large structure.");
        loDetail.setTransLte("Construction");
        loDetail.setInfoxxxx("Komikimey ed konstruksion., Construction worker.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kontribusyon");
        loDetail.setPrnction("Kon-tri-bu-syon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A gift or payment to a common fund or collection.");
        loDetail.setTransLte("Contributions");
        loDetail.setInfoxxxx("Kontribusyon na totoo tan say pangulo., People’s contributions and the chieftain.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kopa");
        loDetail.setPrnction("Ko-pa");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A small bowl-shaped container for drinking from, typically having a handle.");
        loDetail.setTransLte("Cup");
        loDetail.setInfoxxxx("Diad sengeg na kandelero et walay apatiran kopa a singa rosas na almendro., On the stem of the lampstand are four cups shaped like almond flowers.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kordero");
        loDetail.setPrnction("Kor-de-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A young sheep.");
        loDetail.setTransLte("Lamb");
        loDetail.setInfoxxxx("Akanengneng ak ya kordero., I saw some lambs.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//370
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Koryenti");
        loDetail.setPrnction("Kor-yen-ti");
        loDetail.setWordType("Adjective/Noun");
        loDetail.setDescript("");
        loDetail.setTransLte("Electricity");
        loDetail.setInfoxxxx("Agbalot sasalinen na koryenti so paraan na iyaandar na kagawaan., The electric current never takes on the features of the equipment it activates.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kostyum");
        loDetail.setPrnction("Kos-tyum");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A set of clothes in a style typical of a particular country or historical period.");
        loDetail.setTransLte("Costume");
        loDetail.setInfoxxxx("Saray kontodo-kostyum a drama ed Biblia., Full-costume Bible dramas.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kotkot");
        loDetail.setPrnction("Kot-kot");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Break up and move earth with a tool or machine - or with hands - paws - snout - etc.");
        loDetail.setTransLte("Dig");
        loDetail.setInfoxxxx("Aliling to et kotkot mo iray impormasyon ed Biblia tan ed arum nin publikasyon., Dig into the Bible with the research tools you have at hand.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Krayola");
        loDetail.setPrnction("Kra-yo-la");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A pencil or stick of colored chalk or wax, used for drawing.");
        loDetail.setTransLte("Crayon");
        loDetail.setInfoxxxx("Makukulay yay krayola., The crayons are colorful.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Krema");
        loDetail.setPrnction("Kre-ma");
        loDetail.setWordType("Adjective/Verb/Noun");
        loDetail.setDescript("The thick white or pale yellow fatty liquid which rises to the top when milk is left to stand and which can be eaten as an accompaniment to desserts or used as a cooking ingredient.");
        loDetail.setTransLte("Cream");
        loDetail.setInfoxxxx("Krema - keso - tan mantikilya., Cream - cheese - and butter.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kriminal");
        loDetail.setPrnction("Kri-mi-nal");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who has committed a crime.");
        loDetail.setTransLte("Criminal");
        loDetail.setInfoxxxx("Pepekien la natan na saray kriminal iray inagew-agew ya sasaliwen., Criminal gangs are now counterfeiting such everyday consumer goods as cosmetics.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Krisis");
        loDetail.setPrnction("Kri-sis");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A time of intense difficulty - trouble - or danger.");
        loDetail.setTransLte("Crisis");
        loDetail.setInfoxxxx("Ligliwa ed Panaon na Krisis., Comfort in Times of Crisis.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Krismas");
        loDetail.setPrnction("Kris-mas");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The annual Christian festival celebrating Christ's birth - held on December 25 in the Western Church.");
        loDetail.setTransLte("Christmas");
        loDetail.setInfoxxxx("Masantos ya Krismas., Merry Christmas.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kuarta");
        loDetail.setPrnction("Kuar-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A current medium of exchange in the form of coins and banknotes; coins and banknotes collectively.");
        loDetail.setTransLte("Money");
        loDetail.setInfoxxxx("Akiletletan ak ed saray ompapaway ya fans tan impawil koy kuarta., I managed to push my way through a crowd of fans and return the extra money.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kuarto");
        loDetail.setPrnction("Kuar-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Space that can be occupied or where something can be done, especially viewed in terms of whether there is enough.");
        loDetail.setTransLte("Room");
        loDetail.setInfoxxxx("Walaray banyo na saray kuarto parad bisita., Guest rooms had their own lavatories.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//380
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kuentaen");
        loDetail.setPrnction("Kuen-ta-en");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Determine the total number of (a collection of items).");
        loDetail.setTransLte("Count");
        loDetail.setInfoxxxx("Natan et kuentaen tayo., Now all we must do is count.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kugip");
        loDetail.setPrnction("Ku-gip");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A series of thoughts - images - and sensations occurring in a person's mind during sleep.");
        loDetail.setTransLte("Dream");
        loDetail.setInfoxxxx("Akupkugip taka., I had a dream about you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kugtot");
        loDetail.setPrnction("Kug-tot");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A sudden upsetting or surprising event or experience.");
        loDetail.setTransLte("Shock");
        loDetail.setInfoxxxx("Akugtot ak., I was shock.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kulang");
        loDetail.setPrnction("Ku-lang");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Measuring a small distance from end to end.");
        loDetail.setTransLte("Short");
        loDetail.setInfoxxxx("Say anemira et kulang na sakey ed pitora., Six is one short of seven.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kulasisi");
        loDetail.setPrnction("Ku-la-si-si");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A bird - often vividly colored - with a short down-curved hooked bill - grasping feet - and a raucous voice - found especially in the tropics and feeding on fruits and seeds.");
        loDetail.setTransLte("Parrot");
        loDetail.setInfoxxxx("Lanang ak makakanengeng na kulasisi., I often see parrots.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kulintang");
        loDetail.setPrnction("Ku-lin-tang");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A metal disk with a turned rim - giving a resonant note when struck.");
        loDetail.setTransLte("Gong");
        loDetail.setInfoxxxx("Tan mantogtog kami na saray kulintang., We performed a dance after the burial, and we played gongs.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kumpapey");
        loDetail.setPrnction("Kum-pa-pey");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A nectar-feeding insect with two pairs of large - typically brightly colored wings that are covered with microscopic scales.");
        loDetail.setTransLte("Butterfly");
        loDetail.setInfoxxxx("Balibali tay kumpapey., The butterfly is beautiful.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kusina");
        loDetail.setPrnction("Kusina");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A room or area where food is prepared and cooked.");
        loDetail.setTransLte("Kitchen");
        loDetail.setInfoxxxx("Siansian sanagew ak nin mankikimey diad kusina tan diad pananganan., I am still able to work full days in the kitchen and in the dining room.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kuto");
        loDetail.setPrnction("Ku-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Either of two small wingless parasitic insects that live on the skin of mammals and birds.");
        loDetail.setTransLte("Louse");
        loDetail.setInfoxxxx("Labalabay met itan a panayaman na kuto., It also easily became a repository for lice.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kuya");
        loDetail.setPrnction("Ku-ya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A man or boy in relation to other sons and daughters of his parents.");
        loDetail.setTransLte("Brother");
        loDetail.setInfoxxxx("Say kuya nen Nanay,, Mom’s older brother");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//390
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kwadrado");
        loDetail.setPrnction("Kwa-dra-do");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A plane figure with four equal straight sides and four right angles.");
        loDetail.setTransLte("Square");
        loDetail.setInfoxxxx("Amay kwadrado., A market square.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Labasan");
        loDetail.setPrnction("La-ba-san");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A way out, especially of a public building - room - or passenger vehicle.");
        loDetail.setTransLte("Exit");
        loDetail.setInfoxxxx("Diman so labasan., There is the exit.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Labi");
        loDetail.setPrnction("La-bi");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The period of time at the end of the day - usually from about 6 p.m. to bedtime.");
        loDetail.setTransLte("Evening");
        loDetail.setInfoxxxx("Masantos ya Labi., Good Evening.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Labindua");
        loDetail.setPrnction("La-bin-dua");
        loDetail.setWordType("Number");
        loDetail.setDescript("Equivalent to the product of three and four; two more than ten; 12.");
        loDetail.setTransLte("Twelve");
        loDetail.setInfoxxxx("Inmebat si Jesus ed sikara:Agta labindua kayo a pinilik?, Jesus answered them:I chose you twelve - did I not?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Laen");
        loDetail.setPrnction("La-en");
        loDetail.setWordType("Verb");
        loDetail.setDescript("o");
        loDetail.setTransLte("Go");
        loDetail.setInfoxxxx("No iner so laen yo dimay laen ko., Where you go I will go.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Laki");
        loDetail.setPrnction("La-ki");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of or denoting the sex that produces small - typically motile gametes -  especially spermatozoa - with which a female may be fertilized or inseminated to produce offspring.");
        loDetail.setTransLte("Male");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lakseb");
        loDetail.setPrnction("Lak-seb");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(of a person or part of the body) without clothes.");
        loDetail.setTransLte("Naked");
        loDetail.setInfoxxxx("Manakar ak a kasalisali tan lakseb., I will walk barefoot and naked.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Laman");
        loDetail.setPrnction("La-man");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The physical structure of a person or an animal - including the bones - flesh - and organs.");
        loDetail.setTransLte("Body");
        loDetail.setInfoxxxx("Matmabeng lay laman mo., You body was so thin.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//400
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lamet");
        loDetail.setPrnction("La-met");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("Another time; once more.");
        loDetail.setTransLte("Again");
        loDetail.setInfoxxxx("Ibabangat na Biblia a saray inatey et bilayen lamet., The Bible teaches that the dead will live again.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lamisaan");
        loDetail.setPrnction("La-mi-sa-an");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A piece of furniture with a flat top and one or more legs - providing a level surface on which objects may be placed - and that can be used for such purposes as eating - writing - working - or playing games.");
        loDetail.setTransLte("Table");
        loDetail.setInfoxxxx("Dakel so naakan ed lamisaan., There's a lot of food on the table.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lamot");
        loDetail.setPrnction("La-mot");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of a plant which attaches it to the ground or to a support - typically underground - conveying water and nourishment to the rest of the plant via numerous branches and fibers.");
        loDetail.setTransLte("Root");
        loDetail.setInfoxxxx("Balbaleg so lamot to., Its has a big root.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Langoy");
        loDetail.setPrnction("La-ngoy");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Propel the body through water by using the limbs - or (in the case of a fish or other aquatic animal) by using fins - tail - or other bodily movement. ");
        loDetail.setTransLte("Swim");
        loDetail.setInfoxxxx("Onlangoy tayo., Let's us swim.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lenag");
        loDetail.setPrnction("Le-nag");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A period of time.");
        loDetail.setTransLte("While");
        loDetail.setInfoxxxx("Manaaral ak lenag na mantratrabaho., I study while working.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Libre");
        loDetail.setPrnction("Lib-re");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("Without cost or payment.");
        loDetail.setTransLte("Free");
        loDetail.setInfoxxxx("Akala ak ya libre ya naakan., I got free food.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Li-ko");
        loDetail.setPrnction("Liko");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Move in a circular direction wholly or partly around an axis or point.");
        loDetail.setTransLte("Turn");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lima");
        loDetail.setPrnction("Li-ma");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The end part of a person's arm beyond the wrist - including the palm - fingers - and thumb.");
        loDetail.setTransLte("Hand");
        loDetail.setInfoxxxx("Antoy walad limam?, What is in you hands?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Limara");
        loDetail.setPrnction("Li-ma-ra");
        loDetail.setWordType("Number");
        loDetail.setDescript("Equivalent to the sum of two and three; one more than four, or half of ten; 5.");
        loDetail.setTransLte("Five");
        loDetail.setInfoxxxx("Walay limarak ya peso., I have five pesos.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Linew");
        loDetail.setPrnction("Li-new");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(of a color) intensely deep or bright.");
        loDetail.setTransLte("Vivid");
        loDetail.setInfoxxxx("Labay koy linew., I want snow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //410
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Linget");
        loDetail.setPrnction("Li-nget");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Moisture exuded through the pores of the skin - typically in profuse quantities as a reaction to heat - physical exertion - fever - or fear.");
        loDetail.setTransLte("Sweat");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Listaan");
        loDetail.setPrnction("Lis-ta-an");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A number of connected items or names written or printed consecutively - typically one below the other.");
        loDetail.setTransLte("List");
        loDetail.setInfoxxxx("Walay listaan mo?, Do you have the list?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Litratista");
        loDetail.setPrnction("Lit-ra-tis-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who takes photographs - especially as a job.");
        loDetail.setTransLte("Photographer");
        loDetail.setInfoxxxx("Labay koy ungawa na litratista., I want to be a photographer.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Litrato");
        loDetail.setPrnction("Lit-ra-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A painting or drawing.");
        loDetail.setTransLte("Picture");
        loDetail.setInfoxxxx("Kulaan to may litratok., Where is my picture.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Litson");
        loDetail.setPrnction("Lit-son");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A metal framework used for cooking food over an open fire; a gridiron.");
        loDetail.setTransLte("Grill");
        loDetail.setInfoxxxx("Mangaliw ka ya litson baboy., Buy some grilled pig.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lobo");
        loDetail.setPrnction("Lo-bo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A brightly colored rubber sac that is inflated with air and then sealed at the neck - used as a children's toy or a decoration.");
        loDetail.setTransLte("Balloon");
        loDetail.setInfoxxxx("Isaliwan mo ak ya lobo., Buy me some baloon.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Loob");
        loDetail.setPrnction("Lo-ob");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The inner side or surface of something.");
        loDetail.setTransLte("Inside");
        loDetail.setInfoxxxx("Loob ka., Come inside.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Looban");
        loDetail.setPrnction("Lo-o-ban");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An opening - such as a door - passage - or gate - that allows access to a place.");
        loDetail.setTransLte("Entrance");
        loDetail.setInfoxxxx("Iner so looban?, Where is the entrance?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lorem");
        loDetail.setPrnction("Lo-rem");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A visible mass of condensed water vapor floating in the atmosphere - typically high above the ground.");
        loDetail.setTransLte("Cloud");
        loDetail.setInfoxxxx("Balibali so lorem., The was beautiful.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lukas");
        loDetail.setPrnction("Lu-kas");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Allowing access - passage - or a view through an empty space; not closed or blocked up.");
        loDetail.setTransLte("Open");
        loDetail.setInfoxxxx("Lukasan mo may puerta., Open the door.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //420
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Luluganan");
        loDetail.setPrnction("Lu-lu-ga-nan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A thing used for transporting people or goods - especially on land - such as a car or truck.");
        loDetail.setTransLte("Vehicle");
        loDetail.setInfoxxxx("Walay luluganan ko., I have A vehicle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Luto");
        loDetail.setPrnction("Lu-to");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Prepare (food - a dish, or a meal) by combining and heating the ingredients in various ways., ");
        loDetail.setTransLte("Cook");
        loDetail.setInfoxxxx("Kasin manluto ak na pangdem ed sayan labi?, Shall I cook dinner tonight? ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lutoan");
        loDetail.setPrnction("Lu-to-an");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An apparatus for cooking or heating that operates by burning fuel or using electricity.");
        loDetail.setTransLte("Stove");
        loDetail.setInfoxxxx("Iner so lutoan?, Where is the stove?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //M
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maagew");
        loDetail.setPrnction("Ma-a-gew");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Bright with sunlight.");
        loDetail.setTransLte("Sunny");
        loDetail.setInfoxxxx("Maagew ya agew., A sunny day.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maasin");
        loDetail.setPrnction("Ma-a-sin");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Tasting of, containing, or preserved with salt.");
        loDetail.setTransLte("Salty");
        loDetail.setInfoxxxx("Maasin ya maong., Too salty.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mabaing");
        loDetail.setPrnction("Ma-ba-ing");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Being reserved or having or showing nervousness or timidity in the company of other people.");
        loDetail.setTransLte("Shy");
        loDetail.setInfoxxxx("Mabaing ed ya too., Shy person.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mabetbet");
        loDetail.setPrnction("Ma-bet-bet");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("Regularly or habitually; often.");
        loDetail.setTransLte("Frequently");
        loDetail.setInfoxxxx("Mabetbet ya mangangansion., He frequently singing.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mabli");
        loDetail.setPrnction("Mab-li");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Costing a lot of money.");
        loDetail.setTransLte("Expensive");
        loDetail.setInfoxxxx("Your clothes are expensive., Mabmabli iray kawes mo.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

//430
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Magbabawi");
        loDetail.setPrnction("Mag-ba-ba-wi");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Feel or express sincere regret or remorse about one's wrongdoing or sin");
        loDetail.setTransLte("Regret");
        loDetail.setInfoxxxx("Magbabawi ka nu anggapo la., You will regret it if it's gone.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mainget");
        loDetail.setPrnction("Ma-i-nget");
        loDetail.setWordType("Adjective; noun");
        loDetail.setDescript("Of small width in relation to length.");
        loDetail.setTransLte("Narrow");
        loDetail.setInfoxxxx("Mainget su kalsada diya., The road is narrow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mainomay");
        loDetail.setPrnction("Ma-i-no-may");
        loDetail.setWordType("Adjective; verb");
        loDetail.setDescript("Achieved without great effort; presenting few difficulties.");
        loDetail.setTransLte("Easy");
        loDetail.setInfoxxxx("Mainomay labat su eksam., The exam is just easy.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Makaarum");
        loDetail.setPrnction("Ma-ka-a-rum");
        loDetail.setWordType("Verb");
        loDetail.setDescript("To combine something with something else.");
        loDetail.setTransLte("Add");
        loDetail.setInfoxxxx("Makaarum ya ambag., To add contribution.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mairap");
        loDetail.setPrnction("Ma-i-rap");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Needing much effort or skill to accomplish - deal with - or understand.");
        loDetail.setTransLte("Difficult, Hard");
        loDetail.setInfoxxxx("Mairap so quiz., The quiz is so difficult.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Makapanyari");
        loDetail.setPrnction("Ma-ka-pan-ya-ri");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having control and influence over people and events.");
        loDetail.setTransLte("Powerful");
        loDetail.setInfoxxxx("Sankamakapanyarin bansa ed mundo., The world's most powerful nation.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maksil");
        loDetail.setPrnction("Mak-sil");
        loDetail.setWordType("Adjective; adverb");
        loDetail.setDescript("Having the power to move heavy weights or perform other physically demanding tasks.");
        loDetail.setTransLte("Strong");
        loDetail.setInfoxxxx("Maksil su kalaban mi., Our enemy is strong.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maliket");
        loDetail.setPrnction("Ma-li-ket");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Feeling or showing pleasure or contentment.");
        loDetail.setTransLte("Happy");
        loDetail.setInfoxxxx("Maliket ya agew ed sikayo., Happy day ahead to all.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Malimpek");
        loDetail.setPrnction("Ma-lim-pek");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Shaped like a circle or cylinder.");
        loDetail.setTransLte("Round");
        loDetail.setInfoxxxx("Tan saray dingding na satan et kuadrado, aliwan malimpek., And their side panels were square, not round.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maminsan");
        loDetail.setPrnction("Ma-min-san");
        loDetail.setWordType("Adjective; verb");
        loDetail.setDescript("Occasionally, rather than all of the time.");
        loDetail.setTransLte("Sometimes");
        loDetail.setInfoxxxx("Paway ta maminsan., Let's hang-out sometimes.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //440
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Managawat");
        loDetail.setPrnction("Ma-nag-a-wat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of a telephone apparatus contained in the earpiece - in which electrical signals are converted into sounds.");
        loDetail.setTransLte("Receiver");
        loDetail.setInfoxxxx("Sika may managawat?, Are you the reciever.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Managbangat");
        loDetail.setPrnction("Ma-nag-ba-ngat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who helps students to acquire knowledge - competence - or virtue - via the practice of teaching.");
        loDetail.setTransLte("Teacher");
        loDetail.setInfoxxxx("Managbangat la imay anak nen Jose., The daughter of Jose is already a teacher.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Manalwar");
        loDetail.setPrnction("Ma-nal-war");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Making sure of avoiding potential danger - mishap - or harm; cautious.");
        loDetail.setTransLte("Careful");
        loDetail.setInfoxxxx("Manalwar ka ta lenag moy manmaneho., Be careful while you are driving.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mangiras");
        loDetail.setPrnction("Ma-ngi-ras");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Unwilling to work or use energy.");
        loDetail.setTransLte("Lazy");
        loDetail.setInfoxxxx("Sikatoy mangiras a manluto., He was too lazy to cook.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mantila");
        loDetail.setPrnction("Man-ti-la");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Marked by or containing untrue statements.");
        loDetail.setTransLte("Lying");
        loDetail.setInfoxxxx("Mantila ka ed satan., You are lying about that.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maong");
        loDetail.setPrnction("Ma-ong");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Very satisfactory - enjoyable - pleasant - or interesting.");
        loDetail.setTransLte("Good");
        loDetail.setInfoxxxx("Maong su lasa tu., It taste good.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mapalna");
        loDetail.setPrnction("Ma-pal-na");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or operating - or designed to do so - only at a low speed; not quick or fast.");
        loDetail.setTransLte("Slow");
        loDetail.setInfoxxxx("Mapalna su panagmaneho tu., The way he drive is slow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mapeket");
        loDetail.setPrnction("Ma-pe-ket");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Tending or designed to stick to things on contact.");
        loDetail.setTransLte("Sticky");
        loDetail.setInfoxxxx("Mapeket su inusar tu ya gamit., He used sticky tool.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maples");
        loDetail.setPrnction("Map-les");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or capable of moving at high speed.");
        loDetail.setTransLte("Fast");
        loDetail.setInfoxxxx("Maples tan makapanyari ya kotse., A fast and powerful car.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mareen");
        loDetail.setPrnction("Ma-re-en");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Making little or no noise.");
        loDetail.setTransLte("Quiet");
        loDetail.setInfoxxxx("Say luluganan et mareen., The car has a quiet.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //450
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Marso");
        loDetail.setPrnction("Mar-so");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The third month of the year - in the northern hemisphere usually considered the first month of spring.");
        loDetail.setTransLte("March");
        loDetail.setInfoxxxx("Marso so graduasyon mi., Our graduation is in march.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Masakbay");
        loDetail.setPrnction("Ma-sak-bay");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Happening or done before the usual or expected time.");
        loDetail.setTransLte("Early");
        loDetail.setInfoxxxx("You should come early., Masakbay kan Onsabi a.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Masamit");
        loDetail.setPrnction("Ma-sa-mit");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having the pleasant taste characteristic of sugar 	or honey; not salty - sour - or bitter.");
        loDetail.setTransLte("Sweet");
        loDetail.setInfoxxxx("Ta inala rad sangi yo so masamit ya alak., Because the sweet wine has been taken from your mouths. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Masiken");
        loDetail.setPrnction("Ma-si-ken");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived for a long time; no longer young.");
        loDetail.setTransLte("Old");
        loDetail.setInfoxxxx("Masiken la ray atateng ko., My parents are old.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mata");
        loDetail.setPrnction("Ma-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Organ that detects light and converts it into electro-chemical impulses in neurons");
        loDetail.setTransLte("Eye");
        loDetail.setInfoxxxx("Nalukasan iray mata yo tan magmaliw kayon singa Dios. —Gen. ,Your eyes will be opened and you will be like God. —Gen. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mataba");
        loDetail.setPrnction("Ma-ta-ba");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A natural oily or greasy substance occurring in animal bodies, especially when deposited as a layer under the skin or around certain organs.");
        loDetail.setTransLte("Fat");
        loDetail.setInfoxxxx("Inala itan ed salitan sha·menʹ, a mankabaliksan na “manpataba, magmaliw a mataba.” ,It is derived from the verb sha·menʹ, which means “be fat, grow fat.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Matadero");
        loDetail.setPrnction("Ma-ta-de-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person whose trade is cutting up and selling meat in a shop.");
        loDetail.setTransLte("Butcher");
        loDetail.setInfoxxxx("Say panadero et Polako, say matadero et Polako, tan say pari diman et Polako.,The baker was Polish, the butcher was Polish, and the parish priest was Polish.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Matalag");
        loDetail.setPrnction("Ma-ta-lag");
        loDetail.setWordType("adverb");
        loDetail.setDescript("not often; seldom.");
        loDetail.setTransLte("Rarely");
        loDetail.setInfoxxxx("Diad pidumaan, say Ebola virus et mas matalag, balet walaray pankanawnawan ngalngali 90 porsiento ed saramay adapoan so inatey. ,By contrast, Ebola virus is much rarer, but in some outbreaks it has killed nearly 90 percent of those it infected. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Matantan");
        loDetail.setPrnction("Ma-tan-tan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or operating, or designed to do so, only at a low speed; not quick or fast.");
        loDetail.setTransLte("Slow");
        loDetail.setInfoxxxx("Talagan matantan ka., You are so slow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mauges");
        loDetail.setPrnction("Ma-u-ges");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of poor quality or a low standard.");
        loDetail.setTransLte("Bad");
        loDetail.setInfoxxxx("Mauges tan ed sika., It's bad for you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //460
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mayo");
        loDetail.setPrnction("Ma-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fifth month of the year - in the northern hemisphere usually considered the last month of spring.");
        loDetail.setTransLte("May");
        loDetail.setInfoxxxx("Mayo so agew ya inkiyanak ko., May is my birthday.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Melag");
        loDetail.setPrnction("Me-lag");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of a size that is less than normal or usual.");
        loDetail.setTransLte("Small");
        loDetail.setInfoxxxx("Melag tan mareen so kuarto., The room was small and quiet.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Milyon");
        loDetail.setPrnction("Mil-yon");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of a thousand and a thousand; 1000000 or 106.");
        loDetail.setTransLte("Million");
        loDetail.setInfoxxxx("Sakey milyon a totoo so nagunggonaan., A million people will benefit.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Muling");
        loDetail.setPrnction("Mu-ling");
        loDetail.setWordType("Noun");
        loDetail.setDescript("area of the head between the eyebrows and the hairline");
        loDetail.setTransLte("forehead");
        loDetail.setInfoxxxx("13 Natan ompawil itayo lamet ed saray Amlicite, lapu ed wala met so tanda a niiter ed sikara; on, sikara so añgiter na tanda ed inkasikara a dili, on, iñgen tanda ya ambalañga ed saray muling da. , 13 Now we will return again to the Amlicites, for they also had a amark set upon them; yea, they set the mark upon themselves, yea, even a mark of red upon their foreheads.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Multa");
        loDetail.setPrnction("Mul-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The infliction or imposition of a penalty as retribution for an offense. Crime demands just punishment");
        loDetail.setTransLte("Punishment");
        loDetail.setInfoxxxx("Kayari to et akaawat ak na onkomaduan taloy-bulan a kipriso lapud agko binayaran so multa., Subsequently I received a second three-month prison term for nonpayment of that fine.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mura");
        loDetail.setPrnction("Mu-ra");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(of an item for sale) low in price; worth more than its cost.");
        loDetail.setTransLte("Cheap");
        loDetail.setInfoxxxx("Angaliw ira na mamuran prutas., They bought some cheap fruit.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nabuas");
        loDetail.setPrnction("Nab-uas");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The day after today.");
        loDetail.setTransLte("Tomorrow");
        loDetail.setInfoxxxx("Onalis sikato nabuas., He leaves tomorrow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Naksawan");
        loDetail.setPrnction("Nak-sa-wan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("In need of sleep or rest; weary.");
        loDetail.setTransLte("Tired");
        loDetail.setInfoxxxx("Naknaksawan ak lan mantrabaho., I'm tired of working.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Naksel");
        loDetail.setPrnction("Nak-sel");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("The period, point, or state of the greatest fullness or strength; the height of a period of time.");
        loDetail.setTransLte("Full");
        loDetail.setInfoxxxx("Insan dinerewan nen Boaz na saray insanglil ya ilik, tan sikatoy angan tan naksel, tan wala ni kera to. ,Insan dinerewan nen Boaz na saray insanglil ya ilik, tan sikatoy angan tan naksel, tan wala ni kera to. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nalanor");
        loDetail.setPrnction("Na-la-nor");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("contained as part of a whole being considered.");
        loDetail.setTransLte("Included");
        loDetail.setInfoxxxx("Antoy kaukolan mon gawaen pian agka nalanor ed pansumpalan na palson relihyon? ,What must you do if you do not want to share the fate of false religion? ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //470
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nalmo");
        loDetail.setPrnction("Nal-mo");
        loDetail.setWordType("Verb");
        loDetail.setDescript("having been discovered by chance or unexpectedly.");
        loDetail.setTransLte("Found");
        loDetail.setInfoxxxx("3 Nalmo Mi so Mas Makapaliket ya Karera , 3 We Found a More Rewarding Career");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Napno");
        loDetail.setPrnction("Nap-no");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Containing or holding as much or as many as possible; having no empty space.");
        loDetail.setTransLte("Full");
        loDetail.setInfoxxxx("Saray basuraan a napno na basura., Wastebaskets full of rubbish.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Narasan");
        loDetail.setPrnction("Na-ra-san");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Feeling or showing the need for food.");
        loDetail.setTransLte("Hungry");
        loDetail.setInfoxxxx("Mangan ta la ta narasan ak la., Let's eat im already hungry.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Natan");
        loDetail.setPrnction("Na-tan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("This present day.");
        loDetail.setTransLte("Today");
        loDetail.setInfoxxxx("Natan ya agew et painawa, Today is a day of rest.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nanengneng");
        loDetail.setPrnction("Na-neng-neng");
        loDetail.setWordType("Verb");
        loDetail.setDescript("To be conscious of what is around you by using your eyes.");
        loDetail.setTransLte("See");
        loDetail.setInfoxxxx("Nanengneng ku su dayat., I can see the sea.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ngaran");
        loDetail.setPrnction("Nga-ran");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A word or set of words by which a person - animal - place - or thing is known - addressed - or referred to.");
        loDetail.setTransLte("Name");
        loDetail.setInfoxxxx("Say ngaran ko et Parsons, John Parsons., My name is Parsons, John Parsons.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ngarem");
        loDetail.setPrnction("Nga-rem");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Twelve o'clock in the day; midday.");
        loDetail.setTransLte("Noon");
        loDetail.setInfoxxxx("Ngarem la., It's already noon.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ninunot");
        loDetail.setPrnction("Ni-nu-not");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Have in or be able to bring to one's mind an awareness of (someone or something from the past).");
        loDetail.setTransLte("Remember");
        loDetail.setInfoxxxx("Susubukan tu ya nunuten su abalang tu ya kuarta., He's trying to remember the money he lost.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nobyembre");
        loDetail.setPrnction("Nob-yem-bre");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The eleventh month of the year - in the northern hemisphere usually considered the last month of autumn.");
        loDetail.setTransLte("November");
        loDetail.setInfoxxxx("Nanlukas may lakoan nin nobyembre., The store opened in november.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //O
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ondengel");
        loDetail.setPrnction("Ondengel");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Give one's attention to a sound");
        loDetail.setTransLte("Listen");
        loDetail.setInfoxxxx("Ondengel ka ed inam., Listen to your mother.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //480
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Oktubre");
        loDetail.setPrnction("Ok-tu-bre");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The tenth month of the year - in the northern hemisphere usually considered the second month of autumn.");
        loDetail.setTransLte("October");
        loDetail.setInfoxxxx("Say proyekto nan ompisa nin oktubre. The project started in october.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("On");
        loDetail.setPrnction("On");
        loDetail.setWordType("Exclamation");
        loDetail.setDescript("Used to give an affirmative response.");
        loDetail.setTransLte("Yes");
        loDetail.setInfoxxxx("On sarag yo., Yes you can.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Onalis");
        loDetail.setPrnction("O-na-lis");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go away from.");
        loDetail.setTransLte("Leave");
        loDetail.setInfoxxxx("Onalis siakto nabuas. He leaves tomorrow. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Paalagey");
        loDetail.setPrnction("Pa-a-la-gey");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Construct (something) by putting parts or material together.");
        loDetail.setTransLte("Build");
        loDetail.setInfoxxxx("Umpisa la su paalagey da ya abong., The building of their house has started.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pabayesen");
        loDetail.setPrnction("Pa-ba-ye-sen");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grant to (someone) the use of (something) on the understanding that it shall be returned.");
        loDetail.setTransLte("Lend");
        loDetail.setInfoxxxx("Pabayesen taka naani., I will lend you later.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Painawa");
        loDetail.setPrnction("Pa-i-na-wa");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An instance or period of relaxing or ceasing to engage in strenuous or stressful activity.");
        loDetail.setTransLte("Rest");
        loDetail.setInfoxxxx("Painawa tini., Let's rest first.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //490
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pano");
        loDetail.setPrnction("Pa-no");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In what way or manner; by what means.");
        loDetail.setTransLte("How");
        loDetail.setInfoxxxx("Panon itan ya nagagawa?, How does it work?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Patalos");
        loDetail.setPrnction("Pa-ta-los");
        loDetail.setWordType("Verb; noun");
        loDetail.setDescript("Express the sense of (words or text) in another language.");
        loDetail.setTransLte("Translate");
        loDetail.setInfoxxxx("Patalos mu su imbaga tu., Translate what he said.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pebrero");
        loDetail.setPrnction("Peb-re-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The second month of the year - in the northern hemisphere usually considered the last month of winter.");
        loDetail.setTransLte("February");
        loDetail.setInfoxxxx("Pebrero so agew ya puso., February is the day of hearts.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pegley");
        loDetail.setPrnction("Peg-ley");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The point or position at an equal distance from the sides - edges - or ends of something.");
        loDetail.setTransLte("Middle");
        loDetail.setInfoxxxx("Dia ka ed pegley., You're in the middle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kapigan");
        loDetail.setPrnction("Ka-pi-gan");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At what time.");
        loDetail.setTransLte("When");
        loDetail.setInfoxxxx("Kapigan so unor lan impakanengneng yo ed sikato?, When did you last see him?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Piligro");
        loDetail.setPrnction("Pi-lig-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The possibility of suffering harm or injury.");
        loDetail.setTransLte("Danger");
        loDetail.setInfoxxxx("Wala ak ed piligro., I'm in danger.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Piligroso");
        loDetail.setPrnction("Pi-lig-ro-so");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Able or likely to cause harm or injury.");
        loDetail.setTransLte("Dangerous");
        loDetail.setInfoxxxx("Ang pagkain na ito ay piligroso., This food is dangerous.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pinta");
        loDetail.setPrnction("Pin-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A colored substance which is spread over a surface and dries to leave a thin decorative or protective coating.");
        loDetail.setTransLte("Paint");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pisag");
        loDetail.setPrnction("Pisag");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Break or cause to break forcibly into parts - especially into halves or along the grain.");
        loDetail.setTransLte("Split");
        loDetail.setInfoxxxx("Pisag mo ed pegley., Split it in the middle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pising");
        loDetail.setPrnction("Pi-sing");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A plant or part of a plant used as food - such as a cabbage - potato - carrot - or bean.");
        loDetail.setTransLte("Vegetable");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //500
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Polisya");
        loDetail.setPrnction("Po-li-sya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The civil force of a national or local government - responsible for the prevention and detection of crime and the maintenance of public order.");
        loDetail.setTransLte("Police");
        loDetail.setInfoxxxx("Akitongtong ira ed lokal a komander na polisya., They talked to the local police commander.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pribado");
        loDetail.setPrnction("Pri-ba-do");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Belonging to or for the use of one particular person or group of people only.");
        loDetail.setTransLte("Private");
        loDetail.setInfoxxxx("Pribado ya na luluganan., This is a private vehicle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Proyekto");
        loDetail.setPrnction("Pro-yek-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An individual or collaborative enterprise that is carefully planned to achieve a particular aim.");
        loDetail.setTransLte("Project");
        loDetail.setInfoxxxx("Dakel so proyekto mi., We have a lot of project.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Puerta");
        loDetail.setPrnction("Pu-er-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A hinged, sliding - or revolving barrier at the entrance to a building - room - or vehicle - or in the framework of a cupboard.");
        loDetail.setTransLte("Door");
        loDetail.setInfoxxxx("Lukasan mo may puerta., Open the door.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Punas");
        loDetail.setPrnction("Pu-nas");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Clean or dry (something) by rubbing its surface with a cloth - a piece of paper - or one's hand.");
        loDetail.setTransLte("Wipe");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Putot");
        loDetail.setPrnction("Pu-tot");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Make an opening - incision - or wound in (something) with a sharp-edged tool or object.");
        loDetail.setTransLte("Cut");
        loDetail.setInfoxxxx(" , ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Reserba");
        loDetail.setPrnction("Re-ser-ba");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A supply of a commodity not needed for immediate use but available if required.");
        loDetail.setTransLte("Reserve");
        loDetail.setInfoxxxx("Dakel so reserba mi ed basketbol., We have a lot of reserves in basketball.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Reseta");
        loDetail.setPrnction("Re-se-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A medical prescription.");
        loDetail.setTransLte("Recipe");
        loDetail.setInfoxxxx("Kulaan to may reseta?, Where is the recipe?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sabaw");
        loDetail.setPrnction("Sa-baw");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A liquid dish - typically made by boiling meat - fish - or vegetables - etc. - in stock or water.");
        loDetail.setTransLte("Soup");
        loDetail.setInfoxxxx("Saray daluyon tan say danum ed paway et nagmaliw a makapal ya sopas. The waves and the water beyond have become a thick  soup.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sabon");
        loDetail.setPrnction("Sa-bon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A substance used with water for washing and cleaning - made of a compound of natural oils or fats with sodium hydroxide or another strong alkali - and typically having perfume and coloring added. a bar of soap");
        loDetail.setTransLte("Soap");
        loDetail.setInfoxxxx("Wadtan may sabon?, Is soap was there?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sali");
        loDetail.setPrnction("Sa-li");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The lower extremity of the leg below the ankle - on which a person stands or walks.");
        loDetail.setTransLte("Foot");
        loDetail.setInfoxxxx("Akalotan so sali ra ed iket ya impatit da., Their own foot has been caught in the net they hid.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Saliw");
        loDetail.setPrnction("Sa-liw");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Obtain in exchange for payment.");
        loDetail.setTransLte("Buy");
        loDetail.setInfoxxxx("Saliw mo na., Just buy it already.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sal-ming");
        loDetail.setPrnction("Sal-ming");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A reflective surface - now typically of glass coated with a metal amalgam - that reflects a clear image.");
        loDetail.setTransLte("Mirror");
        loDetail.setInfoxxxx("Nengneng mo ed salming., See it in the mirror.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Saloy");
        loDetail.setPrnction("Sa-loy");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A decorative border of hanging threads left loose or formed into tassels or twists - used to edge clothing or material.");
        loDetail.setTransLte("Fringe");
        loDetail.setInfoxxxx("Atay saloy to may kawes., The fringe of the cloth.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Samput");
        loDetail.setPrnction("Sam-put");
        loDetail.setWordType("");
        loDetail.setDescript("A final part of something - especially a period of time - an activity - or a story.");
        loDetail.setTransLte("End");
        loDetail.setInfoxxxx("Antoy samput na estorya?, What is the ending of the story?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sankaabigan");
        loDetail.setPrnction("San-ka-a-bi-gan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of the most excellent - effective - or desirable type or quality.");
        loDetail.setTransLte("Best");
        loDetail.setInfoxxxx("Say sankaabigan a pitcher ed liga., The best pitcher in the league.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sanlasos");
        loDetail.setPrnction("San-la-sos");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of ten and ten; ten more than ninety; 100.");
        loDetail.setTransLte("Hundred");
        loDetail.setInfoxxxx("Say kuartak et sanlasos labat., My money is only a hundred.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sanlibon");
        loDetail.setPrnction("San-li-bon");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of a hundred and ten; 1000.");
        loDetail.setTransLte("Thousand");
        loDetail.setInfoxxxx("Nilibon totoo so inmatendi ed sayan okasyon., Thousands of people attended the event.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Say");
        loDetail.setPrnction("Say");
        loDetail.setWordType("Determiner");
        loDetail.setDescript("Belonging to or associated with a thing previously mentioned or easily identified.");
        loDetail.setTransLte("Its");
        loDetail.setInfoxxxx("Say tawag da et Basketbol., Its called Basketball.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Seguridad");
        loDetail.setPrnction("Se-gu-ri-dad");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state of being free from danger or threat.");
        loDetail.setTransLte("Security");
        loDetail.setInfoxxxx("Seguridad so unaan., Security first.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //120
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Setyembre");
        loDetail.setPrnction("Set-yem-bre");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The ninth month of the year - in the northern hemisphere usually considered the first month of autumn.");
        loDetail.setTransLte("September");
        loDetail.setInfoxxxx("Setyembre la nabwas., It's September tomorrow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Siak");
        loDetail.setPrnction("Siak");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used by a speaker to refer to himself or herself as the object of a verb or preposition. ");
        loDetail.setTransLte("I, Me");
        loDetail.setInfoxxxx("Siak so nanluto., I was the one who cooked.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sibok");
        loDetail.setPrnction("Si-bok");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Expel air through pursed lips.");
        loDetail.setTransLte("Blow");
        loDetail.setInfoxxxx("Sibokan moy kandila., Blow the candle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sika");
        loDetail.setPrnction("Si-ka");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("The one or ones being addressed");
        loDetail.setTransLte("You");
        loDetail.setInfoxxxx("You are the one i love., Sika so inarok.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sikara");
        loDetail.setPrnction("Si-ka-ra");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Use to refer to tow or more people or things previously mentioned or easily identified");
        loDetail.setTransLte("They");
        loDetail.setInfoxxxx("Sikara so angaliw ya abong tayo., They bought our house.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sikatayo");
        loDetail.setPrnction("Si-ka-ta-yo");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used by a speaker to refer to himself or herself and one or more other people considered together");
        loDetail.setTransLte("We, Us");
        loDetail.setInfoxxxx("Sikami so anak to., We are his children.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sikato");
        loDetail.setPrnction("Si-ka-to");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used to refer to a man - boy - or male animal previously mentioned or easily identified.");
        loDetail.setTransLte("He");
        loDetail.setInfoxxxx("Sikato so parad siak., He is the one for me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        //530
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Simba");
        loDetail.setPrnction("Sim-ba");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A period of seven days.");
        loDetail.setTransLte("Week");
        loDetail.setInfoxxxx("Sakey simba kami labat diman., We were only there for a week.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Siopa");
        loDetail.setPrnction("Sio-pa");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used primarily to refer to persons");
        loDetail.setTransLte("Who");
        loDetail.setInfoxxxx("Siopa so angaliw yaabong tayo?, Who bought our house?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sira");
        loDetail.setPrnction("Si-ra");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A limbless cold-blooded vertebrate animal with gills and fins and living wholly in water.");
        loDetail.setTransLte("Fish");
        loDetail.setInfoxxxx("Mangilako ak na sira., I sell fish.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Suerte");
        loDetail.setPrnction("Su-er-te");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Success or failure apparently brought by chance rather than through one's own actions.");
        loDetail.setTransLte("Luck");
        loDetail.setInfoxxxx("Agaylay suertik ed bilay., I am very lucky in life.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Talaga");
        loDetail.setPrnction("Ta-la-ga");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In actual fact - as opposed to what is said or imagined to be true or possible.");
        loDetail.setTransLte("Really");
        loDetail.setInfoxxxx("Antoy talagan agawa?, What really happened?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Talosan");
        loDetail.setPrnction("Ta-lo-san");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Perceive the intended meaning of (words - a language - or a speaker).");
        loDetail.setTransLte("Understand");
        loDetail.setInfoxxxx("Agto atalosan so anggan sakey a salita ya imbagak., He didn't understand a word I said. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Taon");
        loDetail.setPrnction("Ta-on");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The time taken by the earth to make one revolution around the sun.");
        loDetail.setTransLte("Year");
        loDetail.setInfoxxxx("Maliket na balon taon., Happy New Year.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Toktok");
        loDetail.setPrnction("Tok-tok");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A sudden short sound caused by a blow - especially on a door to attract attention or gain entry.");
        loDetail.setTransLte("Knock");
        loDetail.setInfoxxxx("Toktok ni bago Onloob, Knock first before entering.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ugaw");
        loDetail.setPrnction("U-gaw");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived or existed for only a short time");
        loDetail.setTransLte("Young");
        loDetail.setInfoxxxx("Talagan marunong so ugaw a bii., The young girl is very smart.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ugto");
        loDetail.setPrnction("Ug-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the day which follows noon - between noon and evening");
        loDetail.setTransLte("Afternoon");
        loDetail.setInfoxxxx("Ugto kala simabi., You arrived in the afternoon.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Uliten");
        loDetail.setPrnction("U-li-ten");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Do (something) again - either once or a number of times.");
        loDetail.setTransLte("Repeat");
        loDetail.setInfoxxxx("Ulit mo., Repeat it.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Unona");
        loDetail.setPrnction("U-no-na");
        loDetail.setWordType("Number");
        loDetail.setDescript("Coming before all others in time or order; earliest; 1st.");
        loDetail.setTransLte("First");
        loDetail.setInfoxxxx("Sika so unona ya onalis., You are the first to leave.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Wala");
        loDetail.setPrnction("Wa-la");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Possess - own - or hold.");
        loDetail.setTransLte("Have");
        loDetail.setInfoxxxx("Walay sirak. I have fish.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Yorong");
        loDetail.setPrnction("Yo-rong");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Adopt or be in a position in which one's weight is supported by one's buttocks rather than one's feet and one's back is upright.");
        loDetail.setTransLte("Sit");
        loDetail.setInfoxxxx("Yorong ka., Sit down.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);


    }

    public List<EDictionaryWords> GetWordsList(){
        return poList;
    }

    public List<ETrivia> GetTriviaList(){
        List<ETrivia> loList = new ArrayList<>();

        loTrivia = new ETrivia();
        loTrivia.setWordName("PANGASINAN");
        loTrivia.setImgLinkx("https://www.discoverthephilippines.com/wp-content/uploads/2021/08/article-cover-photo-pangasinan-guide.jpg");
        loTrivia.setInfoxxxx("Pangasinans name was derived from the word “asin”. Pangasinan was the largest producer of salt in the Philippines, but it was during the Spanish occupation when people called the place, “pang-asinan” or a place of salt-making. One salt farm called the Pacific Farm, can produce 30 million of kilos of salt annually. Pangasinan is the largest province in Ilocos Region, as well as located at the border of the region at its south. It comprises of 4 cities and 44 towns");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("SUNFLOWER MAZE");
        loTrivia.setImgLinkx("https://outoftownblog.com/wp-content/uploads/2017/02/Sunflower-Farm-Maze-in-Layug-Pangasinan-photo-by-Allied-Botanical-Corp-Facebook.jpg");
        loTrivia.setInfoxxxx("The first sunflower maze in the Philippines is in Pangasinan. This sunflower farm is called Allied Botanical Corporation, can be found in Barangay Lichauco in Tayug, the eastern part of the province.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("HUNDRED ISLAND NATIONAL PARK");
        loTrivia.setImgLinkx("https://ilovepangasinan.com/wp-content/uploads/2016/12/I-Love-Front-Picture-Hundred-Islands.jpg");
        loTrivia.setInfoxxxx("Hundred Islands National Park Alaminos Pangasinan has more than 100 islands for you to enjoy, 124 to be exact during low tide and 123 during high tide. It is officially declared by President Manuel Quezon as a national park in 1940.  Tourist  can dip at the beautiful beaches and see amazing nature spots. Its home to places that are perfect for recreational activities—from swimming and trekking to sightseeing.Its known across the world for good reason—scattered beautifully upon the blue-green waters of the Lingayen Gulf, with abundant inland and underwater flora and fauna, cream-colored fine sand that yields to every step, and friendly local islanders.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("FIRST TRAIN OUTSIDE MANILA");
        loTrivia.setImgLinkx("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/PNR17-Dagupan.jpg/640px-PNR17-Dagupan.jpg");
        loTrivia.setInfoxxxx("The railway officially opened on November 24, 1892. Its route is from Dagupan City to Tutuban in Manila. The railway is no longer functioning, but anybody can still see its remains in Tutuban.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("PHILIPPINE NATIONAL ANTHEM");
        loTrivia.setImgLinkx("https://coconuts.co/wp-content/uploads/2018/09/20150612-flag-luneta-bs-950x540.jpg");
        loTrivia.setInfoxxxx("The Philippine National Anthem lyrics was in written in Pangasinan. The lyrics was originally a poem, entitled, “Filipinas” was written in Spanish by Jose Palma in Bautista, Pangasinan. The music was also originally a march song commissioned by the first president of the Republic of the Philippines, General Emilio Aguinaldo.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("BUGALLON");
        loTrivia.setImgLinkx("https://3.bp.blogspot.com/_qlZRMA0BnbY/TUHwvz5D3aI/AAAAAAAAGGo/YSgOvdEgrBQ/w1200-h630-p-k-no-nu/4053406072_f14e79cd12_z.jpg");
        loTrivia.setInfoxxxx("Bugallon was named after the hero from the town, and one of the provinces hero as well, Jose Torres Bugallon. In fact, a road in Lingayen was named after him. The town was known for agriculture by which the main statue in their plaza is a huge carabao.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("MAPANDAN");
        loTrivia.setImgLinkx("https://justforfun868929716.files.wordpress.com/2018/09/26874919-e1537515055286.jpg?w=594&h=350");
        loTrivia.setInfoxxxx("Mapandan is in fact a part of Mangaldan town then, and went independent as a town. Its name is even similar to the latter, but it was really derived from pandan, a plant/herb used as a flavoring or aroma in cooking.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("PRINCESS URDUJA");
        loTrivia.setImgLinkx("http://1.bp.blogspot.com/-nGyUPCyn8-U/U0A6lopQWlI/AAAAAAAADa8/XtiOG7vSULA/s1600/Princess+Urduja.jpg");
        loTrivia.setInfoxxxx("Princess of Pangasinan. A warrior queen of a matriarchal dynasty, Urduja was a 14th century ruler of Tawalisi, in what is now known as Pangasinan. Princess Urduja was trained in the art of war since she was a child, and became an expert in using the kampilan and a skilled navigator. Known far and wide, she was famous for leading a retinue of women warriors who were skilled fighters, equestrians, and experts in weaponry. With bodies of strength and muscular physique, they were known as Kinalakian, or Amazons. The legend of Princess Urduja can be attributed to the story of when she met the greatest traveler in history, Ibn Battuta.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("DAGUPAN CITY");
        loTrivia.setImgLinkx("https://i0.wp.com/peoplaid.com/wp-content/uploads/2019/03/Dagupan-City-Welcome-Arch.jpg?fit=632%2C465&ssl=1");
        loTrivia.setInfoxxxx("Home of the tastiest milkfish in the world. Dagupan City was originally named Bacnotan by the Augustinian missionaries a few years after the establishment of the Spanish encomienda in Pangasinan in 1583.  In 1660, Andres Malong, a local chieftain, led a revolt against the Spaniards for imposing forced labor.  After the revolt, the people rebuilt the town. To commemorate the gathering forces under Malong, the place was renamed to “Nandaragupan” which means “where people meet”.  In 1780, the name of the town was simplified to Dagupan, followed by the end of Spanish rule in July 23, 1898 when the Spanish troops surrendered to the Katipunan leader, General Francisco Makabulos.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("CALASIAO");
        loTrivia.setImgLinkx("https://live.staticflickr.com/3161/3349916963_3fc42c7690_b.jpg");
        loTrivia.setInfoxxxx("Known as the “Home of the famous and tasty rice cake. The Municipality of Calasiao is the second oldest town in the Province of Pangasinan.  It was founded by the Dominicans in the year 1588.  CALASIAO is derived from the root word “LASI” which means a place of lightning. Calasiao is where one can find the pilgrim site of the Señor Divino Tesoro and the only NCCA acknowledged cultural treasure in Pangasinan, the Sts. Peter & Paul Parish Church. It is also the home of the famous and tasty Calasiao Puto, it is a type of rice cake (puto) that is made out of fermented rice flour and shaped in bite-size portions.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("LINGAYEN");
        loTrivia.setImgLinkx("https://i0.wp.com/www.themermaidtravels.com/wp-content/uploads/2014/05/1-DSC_0137.jpg?fit=1600%2C1059&ssl=1");
        loTrivia.setInfoxxxx("The heart, the soul, and the face” of the Province of Pangasinan.The municipality got its name from a certain corpulent tamarind tree that grew at the present town plaza.  The tree was exceptionally big, tall and spreading that the surrounding trees were just dwarfs in comparison.  Passersby developed the habit of looking back and back again at this corpulent tree until it would vanish from their view.  When they arrived home and were asked what way they took in return, they would simply say through Lingayen meaning “looking back”.  Since then up to the present time, the town bears its name as “LINGAYEN”. It is also known as the home of the most delectable bagoong.  The theory of some makers is that the salinity of the air is a factor why fish fermenting is very ideal in Lingayen.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("MANAOAG");
        loTrivia.setImgLinkx("https://images.squarespace-cdn.com/content/v1/54889a49e4b0a429df687e67/1606159518413-PXZ09TPZJOMFLR2QP8VQ/IMG_5065.jpeg?format=2500w");
        loTrivia.setInfoxxxx("Manaoag began as a small settlement of Cawili, now the town of San Jacinto, by the banks of Baloquing Creek in the early 1600’s.  Some years later, the Augustinian Fathers established a Christian Mission which was originated and regarded as the Mission of Sta. Monica.  Being devout of the Blessed Virgin Mary, the Dominican Fathers who succeeded the Augustinians placed the settlements under the mantle of protection of the “Queen of the Most Holy Rosary.");
        loList.add(loTrivia);

        return loList;
    }
}
