@file:Suppress("NOTHING_TO_INLINE")

import kotlin.math.pow

interface CalculatorValue/*<Self : CalculatorValue<Self>>*/ {
    operator fun plus(other: CalculatorValue): CalculatorValue
    operator fun minus(other: CalculatorValue): CalculatorValue
    operator fun times(other: CalculatorValue): CalculatorValue
    operator fun div(other: CalculatorValue): CalculatorValue
    infix fun pow(other: CalculatorValue): CalculatorValue
    infix fun dot(other: CalculatorValue): CalculatorValue
}

inline class Number(val double: Double) : CalculatorValue {
    constructor(text: String) : this(text.toDouble())

    override operator fun plus(other: CalculatorValue) = Number(double + (other as Number).double)
    override operator fun minus(other: CalculatorValue) = Number(double - (other as Number).double)
    override operator fun times(other: CalculatorValue) = Number(double * (other as Number).double)
    override operator fun div(other: CalculatorValue) = Number(double / (other as Number).double)
    override fun pow(other: CalculatorValue): CalculatorValue = Number(double.pow((other as Number).double))
    override fun dot(other: CalculatorValue): CalculatorValue { error("Cannot divide Vectors") }

    override fun toString(): String = double.toString()
}

inline class Vector(val values: DoubleArray) : CalculatorValue {
    /*@JvmName("varargConstructor")
    constructor(vararg values: Double) : this(values)*/

    override operator fun plus(other: CalculatorValue) = Vector(values.addToEach((other as Vector).values))
    override operator fun minus(other: CalculatorValue) = Vector(values.subtractFromEach((other as Vector).values))
    override operator fun times(other: CalculatorValue) = Vector(doubleArrayOf(
        values[1]*(other as Vector).values[2]-values[2]*other.values[1],
        values[2]*other.values[0]-values[0]*other.values[2],
        values[0]*other.values[1]-values[1]*other.values[0]
    ))
    override fun div(other: CalculatorValue): CalculatorValue { error("Cannot divide Vectors") }
    override infix fun dot(other: CalculatorValue): CalculatorValue {
        var ir = 0.0
        other as Vector
        repeat(values.size) { i ->
            ir += values[i] * other.values[i]
        }
        return Number(ir)
    }
    override fun pow(other: CalculatorValue): CalculatorValue { error("Cannot divide Vectors") }

    override fun toString(): String = values.joinToString(", ", "[", "]")
}

inline fun DoubleArray.addToEach(other: DoubleArray): DoubleArray {
    val out = DoubleArray(size)
    repeat(size) { i ->
        out[i] = get(i) + other[i]
    }
    return out
}

inline fun DoubleArray.subtractFromEach(other: DoubleArray): DoubleArray {
    val out = DoubleArray(size)
    repeat(size) { i ->
        out[i] = get(i) - other[i]
    }
    return out
}