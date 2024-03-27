
class BirdWatcher {
    private int[] birdsPerDay = {2, 5, 0, 7, 4, 1};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeeksBirds = {0, 2, 5, 3, 7, 8, 4};
        return lastWeeksBirds;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int day: birdsPerDay) {
            return day == 0;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int visitingBirds = 0;

        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }

        for (int i = 0; i < numberOfDays; i++){
            visitingBirds += birdsPerDay[i];
        }
        return visitingBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int day: birdsPerDay){
            if (day >= 5){ busyDays++; }
        }
        return busyDays;
    }
}
