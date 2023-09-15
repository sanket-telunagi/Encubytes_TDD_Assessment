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
        } else if ("r".equals(command)) {
            turnRight();
        } else if ("u".equals(command)) {
            tiltUp();
        } else if ("d".equals(command)) {
            tiltDown();
        }
        System.out.println(command + " " + getCoordinates());
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
    // backward motion
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
    // left turn 
    private void turnLeft() {
        if ("N".equals(direction)) {
            direction = "W";
        } else if ("S".equals(direction)) {
            direction = "E";
        } else if ("E".equals(direction)) {
            direction = "N";
        } else if ("W".equals(direction)) {
            direction = "S";
        } else if ("Up".equals(direction)) {
            direction = "N" ;
        } else if ("Down".equals(direction)) {
            direction = "S" ;
        }
    }

    // right turn 
    private void turnRight() {
        if ("N".equals(direction)) {
            direction = "E";
        } else if ("S".equals(direction)) {
            direction = "W";
        } else if ("E".equals(direction)) {
            direction = "S";
        } else if ("W".equals(direction)) {
            direction = "N";
        } else if ("Up".equals(direction)) {
            direction = "S" ;
        } else if ("Down".equals(direction)) {
            direction = "N" ;
        }
    }

    // up tilt 
    private void tiltUp() {
        if ("N".equals(direction) || "S".equals(direction) || "E".equals(direction) || "W".equals(direction) || "Down".equals(direction)) {
            direction = "Up";
        }
    }
    // down tilt 
    private void tiltDown() {
        if ("N".equals(direction) || "S".equals(direction) || "E".equals(direction) || "W".equals(direction) || "Up".equals(direction)) {
            direction = "Down";
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
