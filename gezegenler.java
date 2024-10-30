public enum gezegenler {
    MERCURY(1, 57_910_000L, 2439.7, 58.6),
    VENUS(2, 108_160_000L, 6051.8, -243),
    EARTH(3, 149_600_000L, 6371, 1),
    MARS(4, 227_940_000L, 3389.5, 1.03),
    JUPITER(5, 778_330_000L, 69911, 0.41),
    SATURN(6, 1_429_400_000L, 58232, 0.45),
    URANUS(7, 2_870_990_000L, 25362, -0.72),
    NEPTUNE(8, 4_498_250_000L, 24622, 0.67);

    private final int order;
    private final long distanceFromSunKm;
    private final double radiusKm;
    private final double rotationPeriodDays;

    gezegenler(int order, long distanceFromSunKm, double radiusKm, double rotationPeriodDays) {
        this.order = order;
        this.distanceFromSunKm = distanceFromSunKm;
        this.radiusKm = radiusKm;
        this.rotationPeriodDays = rotationPeriodDays;
    }

    public int getOrder() {
        return order;
    }

    public long getDistanceFromSunKm() {
        return distanceFromSunKm;
    }

    public double getRadiusKm() {
        return radiusKm;
    }

    public double getRotationPeriodDays() {
        return rotationPeriodDays;
    }

    @Override
    public String toString() {
        return String.format("%s: Order=%d, Distance from Sun=%.1f km, Radius=%.1f km, Rotation Period=%.2f days",
                this.name(), order, distanceFromSunKm, radiusKm, rotationPeriodDays);
    }

    public static void main(String[] args) {
        for (gezegenler planet : gezegenler.values()) {
            System.out.println(planet); 
        }
    }
}
