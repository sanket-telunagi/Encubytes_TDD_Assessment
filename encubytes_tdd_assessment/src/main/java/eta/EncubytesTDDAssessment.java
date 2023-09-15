package eta;
// eta : Encubytes TDD Aseessment 


// space craft class 

/**
 * Spacecraft
 */
class Spacecraft {

    private int x ;
    private int y ;
    private int z ;
    private String direction ;

    public Spacecraft () {
        /*
         * Initial position  : (0, 0, 0)
         * Initial direction : "N"
         */
        this.x = 0 ;
        this.y = 0 ;
        this.z = 0 ; 
        this.direction = "N" ; 
    }
    
    // moving as per commands 
    public void executeCommand(String command) {
        if ("f".equals(command)) {
            moveForward();
        } else if ("b".equals(command)) {
            moveBackward();
        } else if ("l".equals(command)) {
            turnLeft();
        }
    }


    // adding individual movements 
    private void moveForward() {
        if ("N".equals(direction)) {
            y++;
        } else if ("S".equals(direction)) {
            y--;
        } else if ("E".equals(direction)) {
            x++;
        } else if ("W".equals(direction)) {
            x--;
        } else if ("Up".equals(direction)) {
            z++;
        } else if ("Down".equals(direction)) {
            z--;
        }
    }

    private void moveBackward() {
        if ("N".equals(direction)) {
            y--;
        } else if ("S".equals(direction)) {
            y++;
        } else if ("E".equals(direction)) {
            x--;
        } else if ("W".equals(direction)) {
            x++;
        } else if ("Up".equals(direction)) {
            z--;
        } else if ("Down".equals(direction)) {
            z++;
        }
    }

    private void turnLeft() {
        if ("N".equals(direction)) {
            direction = "W";
        } else if ("S".equals(direction)) {
            direction = "E";
        } else if ("E".equals(direction)) {
            direction = "N";
        } else if ("W".equals(direction)) {
            direction = "S";
        }
    }


    // executing commands 
    public void executeCommands(String[] commands) {
        for (String command : commands) {
            executeCommand(command);
        }
    }


    // return direction 
    public String getDirection() {
        return direction;
    }

    // getting individual coordinate  
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    // complete coordinates with direction 
    public String getCoordinates() {
        String coordinates = "(" + getX() + ", " + getY() + ", " + getZ() + ") " + getDirection() ;
        return coordinates ;
    }

}


public class EncubytesTDDAssessment 
{
    public static void main( String[] args )
    {
        // creating spacecraft object and initialising 
        Spacecraft spacecraft = new Spacecraft() ;
    }
}
