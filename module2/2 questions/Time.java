public Time(int sec) {
    this.sec = sec % 60;
    this.min = sec / 60 % 60;
    this.hour = sec / 3600;
}