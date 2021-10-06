package com.startjava.lesson1.variable;

class Variable {
    public static void main(String[] args) {
        byte cpuCore = 2;
        short hddVolume = 1000;
        int gpuMemory = 4;
        long systemMemory = 8L;
        float cpuFreq = 3.5F;
        double monutorDiag = 23.8;
        char nameComp = 'C';
        boolean working = true;
        String workingPrint = working? "Да": "Нет";
        System.out.println("Количество ядер: " + cpuCore + ".");
        System.out.println("Объем жесткого диска: " + hddVolume + "Гб.");
        System.out.println("Объем памяти видеокарты: " + gpuMemory + "Гб.");
        System.out.println("Объем оперативной памяти: " + systemMemory + "Гб.");
        System.out.println("Частота процессора: " + cpuFreq + "ГГц.");
        System.out.println("Диагональ монитора: " + monutorDiag + " дюймов.");
        System.out.println("Имя компьютера: " + nameComp + ".");
        System.out.println("Работает: " + workingPrint);
    }
}