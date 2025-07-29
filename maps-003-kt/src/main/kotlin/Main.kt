/**
 * @author Kasey Claramonte Soler - kasclasol@proton.me
 */

/* ----- < MAIN > ----- */
fun main()
{
    println("---")

    // Maps cannot have duplicates
    val fixedPrices = mapOf(
        "Orange" to 1.45,
        "Tangerine" to 1.78,
        "Banana" to 1.99
    )

    val mutablePrices = mutableMapOf(
        "Banana" to 1.99,
        "Tangerine" to 1.78,
        "Orange" to 1.45
    )

    // Adding pairs to mutableMap with "put"
    mutablePrices.put("Apple", 1.24)

    // Adding pairs to mutableMap by index
    mutablePrices["Kiwi"] = 3.14

    // Get Value from Key (Returns null if Key doesn't exist)
    println("Price of Apple: ${mutablePrices["Apple"]} €")
    println("Price of Kiwi: ${mutablePrices["Kiwi"]} €")

    println("---")

    // Get size of Map
    println("The size of the Map is: ${mutablePrices.count()}")
    println("---")

    println("View of the whole Map: $mutablePrices")
    println("---")

    // Check if a Key is inside a Map
    println("Is the Key 'Apple' in the Map?: ${if (mutablePrices.containsKey("Apple")) "Yes" else "No"}.")

    println("---")

    // Check if a Value is in a Map
    println("Is the Value '2.78' in the Map?: ${if (2.78 in mutablePrices.values) "Yes" else "No"}.")
}
/* ----- < MAIN > ----- */