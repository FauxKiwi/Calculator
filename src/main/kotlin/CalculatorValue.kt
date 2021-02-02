@file:Suppress("NOTHING_TO_INLINE")

import kotlin.math.*

interface CalculatorValue/*<Self : CalculatorValue<Self>>*/ {
    operator fun plus(other: CalculatorValue): CalculatorValue = NoValue
    operator fun minus(other: CalculatorValue): CalculatorValue = NoValue
    operator fun times(other: CalculatorValue): CalculatorValue = NoValue
    operator fun div(other: CalculatorValue): CalculatorValue = NoValue
    infix fun pow(other: CalculatorValue): CalculatorValue = NoValue
    infix fun dot(other: CalculatorValue): CalculatorValue = NoValue
    fun abs(): CalculatorValue = NoValue

    fun sqrt(): CalculatorValue = NoValue
    fun sin(): CalculatorValue = NoValue
    fun cos(): CalculatorValue = NoValue
    fun tan(): CalculatorValue = NoValue
    fun log(base: CalculatorValue): CalculatorValue = NoValue
    fun lg(): CalculatorValue = NoValue
    fun ln(): CalculatorValue = NoValue
    fun exp(): CalculatorValue = NoValue
}

inline class Number(val double: Double) : CalculatorValue {
    constructor(text: String) : this(text.toDouble())

    override operator fun plus(other: CalculatorValue) = Number(double + (other as Number).double)
    override operator fun minus(other: CalculatorValue) = Number(double - (other as Number).double)
    override operator fun times(other: CalculatorValue) = Number(double * (other as Number).double)
    override operator fun div(other: CalculatorValue) = Number(double / (other as Number).double)
    override fun pow(other: CalculatorValue) = Number(double.pow((other as Number).double))
    override fun abs() = Number(abs(double))

    override fun sqrt(): CalculatorValue = Number(sqrt(double))
    override fun sin(): CalculatorValue = Number(sin(double))
    override fun cos(): CalculatorValue = Number(cos(double))
    override fun tan(): CalculatorValue = Number(tan(double))
    override fun log(base: CalculatorValue): CalculatorValue = Number(log(double, (base as Number).double))
    override fun lg(): CalculatorValue = Number(log10(double))
    override fun ln(): CalculatorValue = Number(ln(double))
    override fun exp(): CalculatorValue = Number(exp(double))

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
    override fun abs(): CalculatorValue {
        var ir = 0.0
        values.forEach {
            ir += it*it
        }
        return Number(sqrt(ir))
    }

    override fun toString(): String = values.joinToString(", ", "[", "]")
}

object NoValue : CalculatorValue

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