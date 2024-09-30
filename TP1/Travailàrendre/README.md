# Travail à Rendre

## Objective
The objective of this exercise is to develop an Android application with two screens: a registration form and a summary screen that displays the entered information.

## Components Used
- **TextInputEditText**: For entering information (name, email, phone number, address).
- **Spinner**: For selecting the city.
- **Button**: For the "Submit" button.
- **TextView**: To display the summary of the entered data.

## Main Steps of the Java Code

### Activity 1 - Registration Form
1. **Declare Variables**: Declare the variables for the UI elements (`TextInputEditText`, Spinner, Button).
2. **Initialize Variables**: Initialize these variables in the `onCreate()` method.
3. **Implement OnClickListener**: 
   - Set up an `OnClickListener` for the "Submit" button.
   - Retrieve the entered information.
   - Create an Intent to move to the next activity while transferring the data.
   - Start the new activity.

### Activity 2 - Summary
1. **Retrieve Data**: Retrieve the data from the Intent in the `onCreate()` method.
2. **Format Information**: Format the received information into a string.
3. **Display Summary**: Display this string in the `TextView` for the summary.

## Video Demonstration
<div align="center">

   
https://github.com/user-attachments/assets/54401664-0e4c-4c7e-a160-fba3fd99a57a

</div>
