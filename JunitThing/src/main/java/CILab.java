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
        if(myString.length == 0) { return false; } //catch
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i).isUpperCase()) {return true;}
        }
        return false;
    }

}

