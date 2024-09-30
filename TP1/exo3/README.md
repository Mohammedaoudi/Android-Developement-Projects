# Exo3
## Objective
The objective of this exercise is to create an Android application that displays a simple questionnaire with checkboxes, radio buttons, and navigation buttons.

## Views Used
- **TextView**: To display the title and questions.
- **RadioButton** and **RadioGroup**: For the single-choice question.
- **Button**: For the "Exit" and "Next" buttons.

## Main Steps of the Java Code
1. **Declare Variables**: Declare variables for the important views (CheckBox, RadioButton, Button).
2. **Initialize Variables**: Initialize these variables in the `onCreate()` method.
3. **Implement Next Button Listener**:
   - Set an `OnClickListener` for the "Next" button.
   - Retrieve the selected answers.
   - Create an `Intent` to move to the next activity with the answers.
   - Start the new activity.
4. **Implement Exit Button Listener**:
   - Set an `OnClickListener` for the "Exit" button.
   - Use `finish()` to close the current activity.

## Video Demonstration
<div align="center">

   
https://github.com/user-attachments/assets/1d9168fe-6ee6-4194-b943-b7925b85265e"
</div>
