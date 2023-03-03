public Time(int minutes) {
    this.hour = minutes / 60 % 24;
    this.min = minutes % 60;
}