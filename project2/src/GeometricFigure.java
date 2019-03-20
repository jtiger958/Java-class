abstract class GeometricFigure {
    double area;
    String type;

    GeometricFigure(String type, double area) {
        this.area = area;
        this.type = type;
    }

    abstract boolean equal(Rectangle f);

    double compare(GeometricFigure f) {
        return this.area - f.area;
    }

    void resize(double ratio) {
        this.area = this.area * Math.pow(ratio, 2);
    }

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "area=" + area +
                ", type='" + type + '\'' +
                '}';
    }
}
