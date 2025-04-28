package Ex.Ex4;

    public class CircuitTester {
        public static void main(String[] args) {
            E3_4.HallwayLight hallwayLight = new E3_4.HallwayLight();
            boolean[][] switchStates = {{false, false}, {false, true}, {true, false}, {true, true}};
            for (boolean[] state : switchStates) {
                hallwayLight.setSwitch1(state[0]);
                hallwayLight.setSwitch2(state[1]);
                boolean actualLightState = hallwayLight.isLightOn();
                boolean expectedLightState = state[0] ^ state[1];
                System.out.println("Switch 1:" + (state[0] ? "ON" : "OFF ") + " Switch 2:" + (state[1] ? "ON" : "OFF ") + " Actual Light:" + (actualLightState ? "NO" : "OFF ") + " expected Light" + (expectedLightState ? "NO" : "OFF"));
            }
        }
    }