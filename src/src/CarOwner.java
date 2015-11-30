import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Определить класс autoOwnerDirectory (каталог автовладельцев), хранящий информацию об автовладельцах и номерах их автомобилей и реализующий следующий набор функций:
 * • добавление новой записи в каталог;
 * • удаление записи из каталога;
 * • редактирование записи в каталоге;
 * • поиск фамилии автовладельца по сочетанию цифр и букв в номере автомобиля;
 * • вывод записей каталога, отсортированных по номерам.
 * Информацию об автовладельцах и номерах их автомобилей внутри класса хранить в виде мультиотображения.
 * Разработать программу, демонстрирующую работу с созданным классом.﻿
 */
public class CarOwner {
    public static void main(String[] args) throws IOException {
        Catalog catalog = new Catalog();
        int valueAction;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        information();
        valueAction = Integer.parseInt(reader.readLine());
        if (valueAction == 1) {
            catalog.setFullName(reader.readLine());
            catalog.setNumberOfCar(reader.readLine());
            catalog.addOwner();
        }


    }


    private static void information() {
        System.out.println("Выберите действие:");
        System.out.println("1-добавление новой записи в каталог");
        System.out.println("2-удаление записи из каталога");
        System.out.println("3-редактирование записи в каталоге");
        System.out.println("4-поиск фамилии автовладельца по сочетанию цифр и букв в номере автомобиля");
        System.out.println("5-вывод записей каталога, отсортированных по номерам");
    }


}
