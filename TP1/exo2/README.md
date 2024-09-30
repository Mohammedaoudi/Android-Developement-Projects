# Exo2

## Objective
The objective of this exercise is to develop an Android application that calculates taxes based on specific formulas.

## Components Used
- **TextInputEditText**: For entering input values.
- **RadioButton**: To indicate the presence of a pool.
- **Button**: To trigger the calculation.
- **TextView**: To display the result.

## Main Steps of the Java Code
1. **Declare Variables**: Declare the variables for the input fields, the radio button, and the result field.
2. **Initialize Variables**: Initialize these variables in the `onCreate()` method.
3. **Create Calculation Method**:
   - Retrieve the values entered by the user.
   - Calculate the base tax: `surface * 2`.
   - Calculate the additional tax: `number of rooms * 50 + 100` if a pool is present.
   - Add these values to get the total tax amount.
4. **Set Click Listener**: Associate this method with the calculate button using `setOnClickListener()`.
5. **Display Result**: Show the result in the `TextView`.

## Recommended Layout
For the layout, consider using a **ConstraintLayout** for better responsiveness across different screen sizes.

## Video Demonstration
<div align="center">

   
https://github.com/user-attachments/assets/defd9754-8227-4fd6-b9fa-e275816eedc8

</div>
