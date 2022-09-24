//package Projects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public class Calculator extends JFrame {
    public static void main(String[] args){
        //Setting up application frame
        JFrame Calc = new JFrame("Calculator");
        Calc.setSize(350, 450);
        Calc.setLayout(null);
        Calc.setVisible(true);
        
        //Setting up buttons
        JButton one = new JButton("1");
        one.setBounds(15, 50, 80, 100);
        Calc.add(one);

        JButton two = new JButton("2");
        two.setBounds(95, 50, 80, 100);
        Calc.add(two);

        JButton three = new JButton("3");
        three.setBounds(175, 50, 80, 100);
        Calc.add(three);

        JButton four = new JButton("4");
        four.setBounds(15, 150, 80, 100);
        Calc.add(four);

        JButton five = new JButton("5");
        five.setBounds(95, 150, 80, 100);
        Calc.add(five);

        JButton six = new JButton("6");
        six.setBounds(175, 150, 80, 100);
        Calc.add(six);

        JButton seven = new JButton("7");
        seven.setBounds(15, 250, 80, 100);
        Calc.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(95, 250, 80, 100);
        Calc.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(175, 250, 80, 100);
        Calc.add(nine);

        JButton zero = new JButton("0");
        zero.setBounds(95, 350, 80, 100);
        Calc.add(zero);

        JButton add = new JButton("+");
        add.setBounds(255, 50, 80, 100);
        Calc.add(add);

        JButton subtract = new JButton("-");
        subtract.setBounds(255, 150, 80, 100);
        Calc.add(subtract);

        JButton multiply = new JButton("x");
        multiply.setBounds(255, 250, 80, 100);
        Calc.add(multiply);

        JButton divide = new JButton("/");
        divide.setBounds(255, 350, 80, 100);
        Calc.add(divide);

        JButton equals = new JButton("=");
        equals.setBounds(175, 350, 80, 100);
        Calc.add(equals);

        JButton onButton = new JButton("On");
        onButton.setBounds(15, 350, 80, 100);
        Calc.add(onButton);

        //Number Inputs
        String[] buttonStrings = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
          "+", "-", "x", "/"};

        //Getting user input
        onButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                  // this makes sure the button you are pressing is the button variable
                  if(a.getSource() == onButton) {
                    JTextField userInput = new JTextField();
                    userInput.setBounds(15, 5, 320, 45);
                    Calc.add(userInput);
                    // do action necessary code 
                    zero.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == zero) {
                          userInput.setText(userInput.getText() + buttonStrings[0]);
                        }
                      }
                    });

                    one.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == one) {
                          userInput.setText(userInput.getText() + buttonStrings[1]);
                        }
                      }
                    });

                    two.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == two) {
                          userInput.setText(userInput.getText() + buttonStrings[2]);
                        }
                      }
                    });

                    three.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == three) {
                          userInput.setText(userInput.getText() + buttonStrings[3]);
                        }
                      }
                    });

                    four.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == four) {
                          userInput.setText(userInput.getText() + buttonStrings[4]);
                        }
                      }
                    });

                    five.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == five) {
                          userInput.setText(userInput.getText() + buttonStrings[5]);
                        }
                      }
                    });

                    six.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == six) {
                          userInput.setText(userInput.getText() + buttonStrings[6]);
                        }
                      }
                    });

                    seven.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == seven) {
                          userInput.setText(userInput.getText() + buttonStrings[7]);
                        }
                      }
                    });

                    eight.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == eight) {
                          userInput.setText(userInput.getText() + buttonStrings[8]);
                        }
                      }
                    });

                    nine.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == nine) {
                          userInput.setText(userInput.getText() + buttonStrings[9]);
                        }
                      }
                    });

                    add.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == add) {
                          userInput.setText(userInput.getText() + buttonStrings[10]);
                        }
                      }
                    });

                    subtract.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == subtract) {
                          userInput.setText(userInput.getText() + buttonStrings[11]);
                        }
                      }
                    });

                    multiply.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == multiply) {
                          userInput.setText(userInput.getText() + buttonStrings[12]);
                        }
                      }
                    });

                    divide.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == divide) {
                          userInput.setText(userInput.getText() + buttonStrings[13]);
                        }
                      }
                    });

                    //Calculations
                    equals.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent a) {
                        if(a.getSource() == equals) {
                          String equation = userInput.getText();
                          if(equation.contains(buttonStrings[10])) {
                            int place = equation.indexOf(buttonStrings[10]);
                            int length = equation.length();
                            String firstNumber = equation.substring(0, place);
                            String secondNumber = equation.substring(place, length);
                            Integer firstInt = Integer.parseInt(firstNumber);
                            Integer secondInt = Integer.parseInt(secondNumber);
                            double answer = firstInt + secondInt;
                            String answerString = String.valueOf(answer);
                            userInput.setText(answerString);
                          }
                          if(equation.contains(buttonStrings[11])) {
                            int place = equation.indexOf(buttonStrings[11]);
                            int length = equation.length();
                            String firstNumber = equation.substring(0, place);
                            String secondNumber = equation.substring(place, length);
                            Integer firstInt = Integer.parseInt(firstNumber);
                            Integer secondInt = Integer.parseInt(secondNumber);
                            double answer = firstInt + secondInt;
                            userInput.setText(String.valueOf(answer));
                          }
                          if(equation.contains(buttonStrings[12])) {
                            int place = equation.indexOf(buttonStrings[12]);
                            int length = equation.length();
                            String firstNumber = equation.substring(0, place);
                            String secondNumber = equation.substring(place + 1, length);
                            Integer firstInt = Integer.parseInt(firstNumber);
                            Integer secondInt = Integer.parseInt(secondNumber);
                            double answer = firstInt * secondInt;
                            String answerString = String.valueOf(answer);
                            userInput.setText(answerString);
                          }
                          if(equation.contains(buttonStrings[13])) {
                            int place = equation.indexOf(buttonStrings[13]);
                            int length = equation.length();
                            String firstNumber = equation.substring(0, place);
                            String secondNumber = equation.substring(place + 1, length);
                            Integer firstInt = Integer.parseInt(firstNumber);
                            Integer secondInt = Integer.parseInt(secondNumber);
                            double answer = firstInt / secondInt;
                            String answerString = String.valueOf(answer);
                            userInput.setText(answerString);
                          }
                        }
                      }
                    });
              }
          }
      });
    }
}