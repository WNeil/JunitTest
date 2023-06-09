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


    //detecting correct capital usage:
    //first letter is capital only
    //OR all letters are capital, OR none of them are
    @Override
    public boolean detectCapitalUse() {
        if(myString.length() == 0) {return false;}
        //get just the letters
        String justLetters = myString.replaceAll("[\\W]", "");
        //base case
        if(justLetters.length() == 1) {
            return Character.isUpperCase(justLetters.charAt(0));
        }

        //get the idea of the casing at the start, true is caps false is not
        boolean startCap = Character.isUpperCase(justLetters.charAt(0));
        boolean proper = false; //for the case of the starting cap and no more caps

        for(int i = 1; i < justLetters.length() - 1; i++) {
            if(Character.isUpperCase(justLetters.charAt(i)) != startCap) { //doesn't match
                if(startCap) { proper = true; } //if its caps, then we're still following rules
                else { return false; } //if not, it'd be a caps following lowercase
            } else if(proper) {
                return false;
            }
        }
        return true; //no problems found
    }


}

