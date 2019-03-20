class Rectangle extends GeometricFigure {
    double width, height;

    Rectangle(double width, double height){
        super("Rectangle",width * height);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "width=" + width +
                ", height=" + height;
    }

    @Override
    boolean equal(Rectangle r){
        if((this.width == r.width) && (this.height == r.height)) return true;
        else return false;
    }

    @Override
    void resize(double ratio){
        super.resize(ratio);
        this.width *= ratio;
        this.height *= ratio;
    }
}
