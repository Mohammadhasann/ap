package Ex.Ex4;

public class E3_4 {
    public static class HallwayLight {
        private boolean isLightOn = false;
        public void lightSwitch() {
            isLightOn = !isLightOn;
        }
        public boolean isLightOn() {
            return isLightOn;
        }
    }
    public static void main(String[] args) {
     HallwayLight hallwayLight = new HallwayLight();
        System.out.println("The light is on:" + hallwayLight.isLightOn());
        hallwayLight.lightSwitch();
        System.out.println("The light is on:" + hallwayLight.isLightOn());
        hallwayLight.lightSwitch();
        System.out.println("The light is on:" + hallwayLight.isLightOn());
    }
}
