package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        // assume there is a `counter`
        while(counter < personArray.length){
            result += "\nMy first name is " + personArray[counter].getFirstName()+"\n" +
                    "My last name is " + personArray[counter].getLastName();
            counter ++;
        }
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        for(int i =0; i < personArray.length; i++){
            result += "\nMy first name is " + personArray[i].getFirstName()+"\n"+
                    "My last name is " + personArray[i].getLastName();
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        for(Person personObject : personArray) {
            result += "\nMy first name is " + personObject.getFirstName()+"\n"+"My last name is "+ personObject.getLastName();
            // identify array's type
            // identify array's variable-name

            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
