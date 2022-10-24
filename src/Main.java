public class Main {
    public static void main(String[] args) {
        Автомобиль Lada = new Автомобиль("Lada", "Granta", "объем двигателя - 1,7" , "желтого цвета", "2015 год выпуска" , " сборка в России");
        Lada.toString();
        Автомобиль Audi  = new Автомобиль("Audi ", "A8 50 L TDI quattro ", "объем двигателя — 3,0 л", "черный цвет кузова", " 2020 год выпуска" , " сборка в Германии,");
        Audi.toString();
        Автомобиль BMW  = new Автомобиль("BMW ", "Z8", "объем — 3,0 л.", "черный цвет кузова", " в 2021 году" , " сборка в Германиии");
        BMW.toString();
        Автомобиль Kia  = new Автомобиль("Kia", "Sportage 4-го поколения ", "объем двигателя — 2,4 л.", "цвет кузова — красный", " 2018 год выпуска" , " сборка в Южной Корее");
        Kia.toString();
        Автомобиль Hyundai  = new Автомобиль("Hyundai", "Avante 4-го поколения ", "объем двигателя — 1,6 л", "цвет кузова — оранжевый", "год выпуска — 2016 год." , " сборка в Южной Корее");
        Hyundai.toString();

        System.out.println(Lada.toString());
        System.out.println(Audi.toString());
        System.out.println(BMW.toString());
        System.out.println(Kia.toString());
        System.out.println(Hyundai.toString());

    }
}
