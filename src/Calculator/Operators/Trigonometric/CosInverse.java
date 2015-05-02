package Calculator.Operators.Trigonometric;

import Calculator.ErrorModule;

import java.util.logging.Logger;


public class CosInverse extends Trigonometric {

	public CosInverse()
	{
		angleValue = null;
	}
	
	public CosInverse(String angleValueToUse) {
		super.angleValue = angleValueToUse;
	}
	
	public String evaluate() {
		try {
			Double angle = Double.parseDouble(super.angleValue);
			//Check if the angle type is Degree and return the result in degree form if it is
			if(super.getAngleType() == AngleNotation.DEGREES) {
				return String.valueOf(Math.acos(Math.toDegrees(angle)));
			}
			//Else, check if the angle type is Radians and return the result in radian form if it is
			else if(super.getAngleType() == AngleNotation.RADIANS) {
				return String.valueOf(Math.acos(Math.toRadians(angle)));
			}
			else {
				//For future extensions
				//Problematic if it comes here right now.
                //Display an error message
                ErrorModule.displayError("Error. Please try again.");
				//Log the entry
				Logger.getLogger("AngleType is invalid");
				//Return null if it comes here
				return null;
			}
		}
        catch(Exception e)
        {
            //Display an error message
            ErrorModule.displayError("Error. Please try again.");
            //Log the error
            Logger.getLogger(e.getMessage());
            //Return null
            return null;
        }
	}
}