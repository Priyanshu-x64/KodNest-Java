class Result {
    void show(int mark) {
        String message;

        if (mark >= 60) {
            message = "Eligible";
        } else {
            message = "Keep Practising";
        }

        System.out.println(message);
    }
}