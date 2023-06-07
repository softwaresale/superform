package com.github.softwaresale.superform

import kotlinx.coroutines.flow.Flow

sealed interface FormState {
    data class Valid<ValueType>(val value: ValueType) : FormState
    data class Invalid<ErrorType>(val err: ErrorType) : FormState
}

/**
 * Describes a form element. All parts of a form (control, group, etc.) are form elements. Every form element
 * holds a single value, has a stream of value changes, and holds a validation state.
 */
interface FormElement<ValueType> {

    /**
     * Gets the state of the current form element. This will either be `Valid`, in which case the form element
     * has a value, or `Invalid`, in which case there is a validation error that dealing with
     */
    fun getState(): FormState

    /**
     * Gets the current value fot he form element
     */
    fun getValue(): ValueType?

    fun stateChanges(): Flow<FormState>

    fun valueChanges(): Flow<ValueType?>
}