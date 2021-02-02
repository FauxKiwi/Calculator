@file:Suppress("NOTHING_TO_INLINE")

import kotlin.math.pow
import kotlin.math.sqrt

interface CalculatorValue/*<Self : CalculatorValue<Self>>*/ {
    operator fun plus(other: CalculatorValue): CalculatorValue
    operator fun minus(other: CalculatorValue): CalculatorValue
    operator fun times(other: CalculatorValue): CalculatorValue
    operator fun div(other: CalculatorValue): CalculatorValue
    infix fun pow(other: CalculatorValue): CalculatorValue
    infix fun dot(other: CalculatorValue): CalculatorValue
    fun abs(): CalculatorValue
}

inline class Number(val double: Double) : CalculatorValue {
    constructor(text: String) : this(text.toDouble())

    override operator fun plus(other: CalculatorValue) = Number(double + (other as Number).double)
    override operator fun minus(other: CalculatorValue) = Number(double - (other as Number).double)
    override operator fun times(other: CalculatorValue) = Number(double * (other as Number).double)
    override operator fun div(other: CalculatorValue) = Number(double / (other as Number).double)
    override fun pow(other: CalculatorValue) = Number(double.pow((other as Number).double))
    override fun dot(other: CalculatorValue) = NoValue
    override fun abs() = Number(kotlin.math.abs(double))

    override fun toString(): String = double.toString()
}

inline class Vector(val values: DoubleArray) : CalculatorValue {
    override operator fun plus(other: CalculatorValue) = Vector(values.addToEach((other as Vector).values))
    override operator fun minus(other: CalculatorValue) = Vector(values.subtractFromEach((other as Vector).values))
    override operator fun times(other: CalculatorValue) = when (other) {
        is Number -> Vector(values.multiplyEachWith(other.double))
        is Vector -> Vector(
            doubleArrayOf(
                values[1] * other.values[2] - values[2] * other.values[1],
                values[2] * other.values[0] - values[0] * other.values[2],
                values[0] * other.values[1] - values[1] * other.values[0]
            )
        )
        else -> error("Unknown Subclass")
    }
    override fun div(other: CalculatorValue) = Vector(values.multiplyEachWith(1.0 / (other as Number).double))
    override infix fun dot(other: CalculatorValue): CalculatorValue {
        var ir = 0.0
        other as Vector
        repeat(values.size) { i ->
            ir += values[i] * other.values[i]
        }
        return Number(ir)
    }
    override fun pow(other: CalculatorValue) = NoValue
    override fun abs(): CalculatorValue {
        var ir = 0.0
        values.forEach {
            ir += it*it
        }
        return Number(sqrt(ir))
    }

    override fun toString(): String = values.joinToString(", ", "[", "]")
}

object NoValue : CalculatorValue {
    override fun plus(other: CalculatorValue) = NoValue
    override fun minus(other: CalculatorValue) = NoValue
    override fun times(other: CalculatorValue) = NoValue
    override fun div(other: CalculatorValue) = NoValue
    override fun pow(other: CalculatorValue) = NoValue
    override fun dot(other: CalculatorValue) = NoValue
    override fun abs() = NoValue
}

inline fun DoubleArray.addToEach(other: DoubleArray): DoubleArray {
    return DoubleArray(size) { i ->
        get(i) + other[i]
    }
}

inline fun DoubleArray.subtractFromEach(other: DoubleArray): DoubleArray {
    return DoubleArray(size) { i ->
        get(i) - other[i]
    }
}

inline fun DoubleArray.multiplyEachWith(double: Double): DoubleArray {
    return DoubleArray(size) { i ->
        get(i) * double
    }
}