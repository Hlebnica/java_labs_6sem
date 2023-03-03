public Polygon(Polygon p) {
    this.x = new float[p.x.length];
    for (int i = 0; i < this.x.length; i++) {
        this.x[i] = p.x[i];
    }
    
    this.y = new float[p.y.length];
    for (int i = 0; i < this.y.length; i++) {
        this.y[i] = p.y[i];
    }
}