public class Day {
    public static String fortune(int day,int type){
        String answer;
        if(day == 1){
            if(type == 1){
                answer="The business will be prosperous and successful.";
            }
            else if(type == 2){
                answer= "Experience unexpected expenses";

            }
            else if(type == 3){
                answer= "Became more estranged";

            }
            else{
                answer="There is no type you have chosen.";
            }
        }
        else if(day == 2){
            if(type == 1){
                answer="There will be someone to help you fix the situation and give you good advice.";

            }
            else if(type == 2){
                answer= "There will be financial support people.";

            }
            else if(type == 3){
                answer= "Encountered divorce";

            }
            else{
                answer="There is no type you have chosen.";
            }

        }
        else if(day == 3){
            if(type == 1){
                answer="If doing business in fashion , the entertainment industry, using speech or imagination, writing a poem ,it will prosper well.";

            }
            else if(type == 2){
                answer= "Get the money then have to pay out quickly.";

            }
            else if(type == 3){
                answer= "Happy and fulfilled in love.";

            }
            else{
                answer="There is no type you have chosen.";
            }

        }
        else if(day == 4){
            if(type == 1){
                answer="There was a sudden change in travel and migration.";

            }
            else if(type == 2){
                answer= "Younger ones will bring good luck to you.";
            }
            else if(type == 3){
                answer= "Happy and fulfilled in love. " +
                        "Meet in love with a spouse, a partner who had known each other since their previous life.";
            }
            else{
                answer="There is no type you have chosen.";
            }
        }
        else if(day == 5){
            if(type == 1){
                answer="During this period, you will be  work that you do not have much expertise but you will make a lot of profit.";

            }
            else if(type == 2){
                answer= "This period will have good fortune.";

            }
            else if(type == 3){
                answer= "During this period, there will be a chance to find love at a sudden, unexpected time.";
            }
            else{
                answer="There is no type you have chosen.";
            }
        }
        else if(day == 6){
            if(type == 1){
                answer="You use your talent to change business strategies, making it very profitable.";
            }
            else if(type == 2){
                answer= "Today, good luck will get a large sum of money.";

            }
            else if(type == 3){
                answer= "Have the opportunity to find love and find a good partner.";
            }
            else{
                answer="There is no type you have chosen.";
            }
        }
        else if(day == 7){
            if(type == 1){
                answer="Have a chance to promote.";
            }
            else if(type == 2){
                answer= "Will be richer than before.";

            }
            else if(type == 3){
                answer= "Have the opportunity to find love and find a good partner.";
            }
            else {
                answer = "Meet a partner with fair skin and younger";
            }
        }
        else {
            answer="There is no day you have chosen.";
        }
    return answer;
    }

}
