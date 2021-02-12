public class Zodiac {
    public static String fortune (int day,int month){
        if((day>=14 && month==4) || (day<=13 && month==5)){
            return "Aries : Character traits of people in this zodiac is not going back , pioneers and innovators. If you decide, you will be determined to work hard regardless of how many obstacles and problems you have.\n";
        }
        else if((day>=14 && month==5) || (day<=13 && month==6)){
            return "Taurus : Friendly, intelligent, talented person with a talent for music and entertainment. But a negative trait to look after is a personality trait that has a tendency to become choleric.";
        }
        else if((day>=14 && month==6) || (day<=14 && month==7)){
            return "Gemini : The negative trait of this zodiac sign is being impatient and anxious. This zodiac sign consists of intelligence and wisdom. And having fun as a youth is a natural character";
        }
        else if((day>=15 && month==7) || (day<=16 && month==8)){
            return "Cancer : Be adaptable, generous, considerate, frugal, and a rigorous planner. But on the other hand People in this Zodiac also tend to be very hesitant.";
        }
        else if((day>=17 && month==8) || (day<=16 && month==9)){
            return "Leo : Tend to be intelligent and achieve artistic success. Have a positive attitude. If failure ,they will see it as a temporary defeat.";
        }
        else if((day>=17 && month==9) || (day<=16 && month==10)){
            return "Virgo : A person who followed the rules and regulations in the way that they worked with society in those days. Does not like being still or dormant for long periods of time.";
        }
        else if((day>=17 && month==10) || (day<=15 && month==11)){
            return "Libra : This zodiac man seeks happiness and friendship, is beautiful, charming, loves music and is happy. The disadvantage is that there is often a character that shows a lack of stillness.";
        }
        else if((day>=16 && month==11) || (day<=15 && month==12)){
            return "Scorpio : People born in the zodiac are characterized by their talents ,mysterious charm ,trust, patience, curiosity, skepticism, flexibility, but negatively can have a self-destructive effect.";
        }
        else if((day>=16 && month==12) || (day<=13 && month==1)){
            return "Sagittarius : Has outstanding character in virtue, high ethics, compassion, cheerfulness, as well as being an idealist.";
        }
        else if((day>=14 && month==1) || (day<=12 && month==2)){
            return "Capricorn : The zodiac is worried about the future and long-term planning. Possesses knowledge, understanding, self-control, and restraint Making decisions and taking responsibility.";
        }
        else if((day>=13 && month==2) || (day<=13 && month==3)){
            return "Aquarius : Aquarius is the zodiac sign of friendship and fortune. You will have many friends. Even though you may seem like a normal person, you will always be surrounded by extraordinary people.";
        }
        else if((day>=14 && month==3) || (day<=12 && month==4)){
            return "Pisces : Pisces are researchy, introverted, love working behind the scenes, and still love mystery. Having a contradictory personality that can sometimes bewilder others, including themselves.";
        }
        else{
            return "There is no zodiac.";
        }
    }

}
