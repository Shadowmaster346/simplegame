import replics
import error
import system
import verison
fun main() {
    println("Very not interested game!")
    val ver = verison()
    println("by finderfailoff")
    println("Version: ${ver.version}")
    println("Кидатель шин зе гаме")
    val asd = (1..100).random()
    val ad = (1..2).random()
    val replics_main = replics()
    val error = error()
    val system = system()
    println("Вы готовы? Да - Напишите true Нет - Напишите false")
    var reshenie: Boolean? = readLine().toBoolean()
    if (reshenie == true) {
        Thread.sleep(1_000)
        println("Вы размахиваетесь")
        println()
        Thread.sleep(1_000)
        println("Вы кидаете")
        println()
        Thread.sleep(1_000)
        println("Шина покатилась")
        println()
        val shda = (1..3).random()
        // println("Debug:$shda")
        // println("Debug:$reshenie")
        // println("Debug:$ad")
        // println("Debug:$asd")

        if (shda <= 2) {
            Thread.sleep(4_000)
            if (asd <= 20) {
                println("Егор: ${replics_main.egor_small} $asd ${replics_main.metrov1}")
                Thread.sleep(2_000)
                println("Илья: ${replics_main.ilya_small} ")
                println(system.dima_end)
                // println("Debug:$shda")
                // println("Debug:$reshenie")
                // println("Debug:$ad")
                // println("Debug:$asd")
                Thread.sleep(1_000)
                // FIXME: 16.06.2022
                // STOPSHIP: 16.06.2022  
                if (ad == 2) {
                    println(system.system_ad1)
                    println(system.system_ad2)
                    Thread.sleep(10_000)
                } else {
                    Thread.sleep(10_000)
                    // FIXME: 16.06.2022
                    // println("Debug:$shda")
                    // println("Debug:$reshenie")
                    // println("Debug:$ad")
                    // println("Debug:$asd")
                    // STOPSHIP: 16.06.2022
                }
            } else {
                if (asd <= 50) {
                    println("Алексей: ${replics_main.lexa_win} $asd ${replics_main.metrov1}")
                    Thread.sleep(2_000)
                    // println("Debug:$shda")
                    // println("Debug:$reshenie")
                    // println("Debug:$ad")
                    // println("Debug:$asd")
                    println("Никита: ${replics_main.nikita_win}")
                    Thread.sleep(10_000)
                    println("Егор: ${replics_main.egor_win} $asd ${replics_main.metrov}")
                    println(system.dima_end)
                    Thread.sleep(1_000)
                    if (ad == 2) {
                        println(system.system_ad1)
                        println(system.system_ad2)
                        Thread.sleep(10_000)
                    } else {
                        Thread.sleep(10_000)
                        // println("Debug:$shda")
                        // println("Debug:$reshenie")
                        // println("Debug:$ad")
                        // println("Debug:$asd")
                    }

                } else {
                    println("Алексей: ${replics_main.lexa_wins} $asd ${replics_main.metrov1}")
                    // println("Debug:$shda")
                    // println("Debug:$reshenie")
                    // println("Debug:$ad")
                    // println("Debug:$asd")
                    Thread.sleep(2_000)
                    println("Никита: ${replics_main.nikita_wins} $asd ${replics_main.metrov2}")
                    // println("Debug:$shda")
                    // println("Debug:$reshenie")
                    // println("Debug:$ad")
                    // println("Debug:$asd")
                    Thread.sleep(2_000)
                    println("Егор: ${replics_main.egor_wins_1}")
                    // println("Debug:$shda")
                    // println("Debug:$reshenie")
                    // println("Debug:$ad")
                    // println("Debug:$asd")
                    Thread.sleep(2_000)
                    println("Илья: ${replics_main.ilya_wins} $asd ${replics_main.metrov3}")
                    // println("Debug:$shda")
                    // println("Debug:$reshenie")
                    // println("Debug:$ad")
                    // println("Debug:$asd")
                    Thread.sleep(4_000)
                    println("Егор: ${replics_main.egor_wins_2}")
                    println(system.dima_end)
                    Thread.sleep(1_000)
                    if (ad == 2) {
                        println(system.system_ad1)
                        println(system.system_ad2)
                        Thread.sleep(10_000)
                    } else {
                        Thread.sleep(10_000)
                        // println("Debug:$shda")
                        // println("Debug:$reshenie")
                        // println("Debug:$ad")
                        // println("Debug:$asd")
                    }
                }
            }
        } else {
            Thread.sleep(4_000)
            println(system.system_player_fall)
            Thread.sleep(2_000)
            println("Алексей: ${replics_main.lexa_lose}")
            // println("Debug:$shda")
            // println("Debug:$reshenie")
            // println("Debug:$ad")
            // println("Debug:$asd")
            Thread.sleep(2_000)
            println("Илья: ${replics_main.ilya_lose}")
            println(system.dima_end)
            Thread.sleep(1_000)
            // FIXME: 20.04.2022
            // STOPSHIP: 23.04.2022
            if (ad == 2) {
                println(system.system_ad1)
                println(system.system_ad2)
                Thread.sleep(10_000)
            } else {
                Thread.sleep(10_000)
                // println("Debug:$shda")
                // println("Debug:$reshenie")
                // println("Debug:$ad")
                // println("Debug:$asd")
            }


        }
    } else {
        println(system.system_player_deny)
        println("Егор: ${replics_main.egor_false}")
        Thread.sleep(1_000)
        println("Илья: ${replics_main.ilya_false}")
        Thread.sleep(2_000)
        println("Алексей: ${replics_main.lexa_false}")
        // println("Debug:$reshenie")
        // println("Debug:$ad")
        // println("Debug:$asd")
        Thread.sleep(1_000)
        println("Дима: ${replics_main.dima_false}")
        println(system.dima_end)
        Thread.sleep(2_000)
        if (ad == 2) {
            // FIXME: 15.06.2022
            println(system.system_ad1)
            println(system.system_ad2)
            Thread.sleep(2_000)
        } else {
            Thread.sleep(2_000)
            // println("Debug:$reshenie")
            // println("Debug:$ad")
            // println("Debug:$asd")
            // STOPSHIP: 16.06.2022  
        }
    }

}