package ru.netology

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val amount = 100
    val min = 35
    val comission = 0.0075
    if (amount*comission < min) {
        print(min)
    }
else  print(amount*comission)
    }
