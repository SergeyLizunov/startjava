class ConditionalStatement {
    public static void main(String[] args) {
        int age = 40;
        boolean sex = true;
        float height = 1.75F;
        char firstCharName = 'S';
        if (age > 20) {
            System.out.println("Вам больше 20 лет.");
        }
        if (sex) {
            System.out.println("Пол мужской.");
        }
        if (!sex) {
            System.out.println("Пол женский.");
        }
        if (height < 1.80) {
            System.out.println("Рост меньше 180 см.");
        }
        else {
            System.out.println("Рост больше или равен 180 см.");
        }
        if (firstCharName == 'M') {
            System.out.println("Имя начинается на букву М");
        }
        else if (firstCharName == 'I') {
            System.out.println("Имя начинается на букву И");
        }
        else {
            System.out.println("Имя не начинается на буквы М и И");
        }
    }
}