public class Zodiac {
    public static String fortune (int day,int month){
        if((day>=14 && month==4) || (day<=13 && month==5)){
            return "Aries : ";
        }
        else if((day>=14 && month==5) || (day<=13 && month==6)){
            return "Taurus : ";
        }
        else if((day>=14 && month==6) || (day<=14 && month==7)){
            return "Gemini : ";
        }
        else if((day>=15 && month==7) || (day<=16 && month==8)){
            return "Cancer : ";
        }
        else if((day>=17 && month==8) || (day<=16 && month==9)){
            return "Leo : ";
        }
        else if((day>=17 && month==9) || (day<=16 && month==10)){
            return "Virgo";
        }
        else if((day>=17 && month==10) || (day<=15 && month==11)){
            return "Libra";
        }
        else if((day>=16 && month==11) || (day<=15 && month==12)){
            return "Scorpio";
        }
        else if((day>=16 && month==12) || (day<=13 && month==1)){
            return "Sagittarius";
        }
        else if((day>=14 && month==1) || (day<=12 && month==2)){
            return "Capricorn";
        }
        else if((day>=13 && month==2) || (day<=13 && month==3)){
            return "Aquarius";
        }
        else if((day>=14 && month==3) || (day<=12 && month==4)){
            return "Pisces";
        }
        else{
            return "There is no zodiac.";
        }
    }

}
