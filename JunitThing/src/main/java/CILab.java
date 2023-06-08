public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        for(int i = 0; i < myString.length(); i++) {
            //has to be rewritten to subscribe to the rules of the challenge
            if(Character.isUpperCase(myString.charAt(i))) {return true;}
        }
        return false;
    }


}

