import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class QuizApp extends JFrame implements ActionListener {
    JLabel label0, label1;
    JRadioButton RadioBtn[] = new JRadioButton[5];
    JButton Button0;
    ButtonGroup BGrp1;
    int count = 0, page = 0;

    QuizApp(String args) {
        super(args);
        label0 = new JLabel();
        add(label0);
        BGrp1 = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            RadioBtn[i] = new JRadioButton();
            add(RadioBtn[i]);
            BGrp1.add(RadioBtn[i]);
        }
        Button0 = new JButton("Next");
        Button0.addActionListener(this);
        add(Button0);
        QuestionPaper();
        label0.setBounds(350, 60, 600, 20);
        RadioBtn[0].setBounds(370, 100, 450, 20);
        RadioBtn[1].setBounds(370, 130, 450, 20);
        RadioBtn[2].setBounds(370, 160, 450, 20);
        RadioBtn[3].setBounds(370, 190, 450, 20);
        Button0.setBounds(520, 300, 100, 30);
        label1 = new JLabel();
        add(label1);
        label1.setText("Java Quiz");
        label1.setBounds(510, 20, 100, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(1080, 600);
        this.getContentPane().setBackground(Color.cyan);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button0) {
            if (AnswerKey())
                count = count + 1;
            page++;
            QuestionPaper();
            if (page == 9) {
                Button0.setText("Result");
            }
        }

        if (e.getActionCommand().equals("Result")) {

            JOptionPane.showMessageDialog(this, "Your Score : " + count);
            System.exit(0);
        }
    }

    void QuestionPaper() {
        RadioBtn[4].setSelected(true);
        if (page == 0) {
            label0.setText("Question 1 : Which of the following is a type of polymorphism in Java? ");
            RadioBtn[0].setText("Compile time polymorphism");
            RadioBtn[1].setText("Execution time polymorphism");
            RadioBtn[2].setText("Multiple polymorphism");
            RadioBtn[3].setText("Multilevel polymorphism");
        }
        if (page == 1) {
            label0.setText(
                    "Question 2 : Which concept of Java is achieved by combining methods and attribute into a class? ");
            RadioBtn[0].setText("Encapsulation");
            RadioBtn[1].setText("Inheritance");
            RadioBtn[2].setText("Polymorphism");
            RadioBtn[3].setText("Abstraction");
        }
        if (page == 2) {
            label0.setText("Question 3 : What would be behaviour if the constructor has a return type ?");
            RadioBtn[0].setText("Runtime error");
            RadioBtn[1].setText("Compilation and runs successfully");
            RadioBtn[2].setText("Compilation error");
            RadioBtn[3].setText("Only String return type is allowed");
        }
        if (page == 3) {
            label0.setText("Question 4 : String class is defined in which package ?");
            RadioBtn[0].setText("lang");
            RadioBtn[1].setText("Swing");
            RadioBtn[2].setText("Applet");
            RadioBtn[3].setText("awt");
        }
        if (page == 4) {
            label0.setText("Question 5 : Which of these can be overloaded? ");
            RadioBtn[0].setText("Methods");
            RadioBtn[1].setText("Constructors");
            RadioBtn[2].setText("All of the mentioned");
            RadioBtn[3].setText("None of the mentioned");
        }
        if (page == 5) {
            label0.setText("Question 6 : Which of these access specifiers must be used for main() method? ");
            RadioBtn[0].setText("private");
            RadioBtn[1].setText("public");
            RadioBtn[2].setText("protected");
            RadioBtn[3].setText("none of the mentioned");
        }
        if (page == 6) {
            label0.setText("Question 7 : Which of these keywords can be used to prevent Method overriding ? ");
            RadioBtn[0].setText("static");
            RadioBtn[1].setText("constant");
            RadioBtn[2].setText("protected");
            RadioBtn[3].setText("final");
        }
        if (page == 7) {
            label0.setText("Question 8 : Which of these keywords is not a part of exception handling ?");
            RadioBtn[0].setText("try");
            RadioBtn[1].setText("finally");
            RadioBtn[2].setText("thrown");
            RadioBtn[3].setText("catch");
        }
        if (page == 8) {
            label0.setText(
                    "Question 9 : Which of these method of Thread class is used to Suspend a thread for a period of time ?");
            RadioBtn[0].setText("sleep()");
            RadioBtn[1].setText("terminate()");
            RadioBtn[2].setText("suspend()");
            RadioBtn[3].setText("stop()");
        }
        if (page == 9) {
            label0.setText("Question 10 : Which of these methods are used to register a mouse motion listener ?");
            RadioBtn[0].setText("addMouse()");
            RadioBtn[1].setText("addMouseListener()");
            RadioBtn[2].setText("addMouseMotionListner()");
            RadioBtn[3].setText("eventMouseMotionListener()");
        }
        label0.setBounds(350, 60, 600, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            RadioBtn[j].setBounds(370, 100 + i, 450, 20);
    }

    boolean AnswerKey() {
        if (page == 0)
            return (RadioBtn[0].isSelected());
        if (page == 1)
            return (RadioBtn[0].isSelected());
        if (page == 2)
            return (RadioBtn[2].isSelected());
        if (page == 3)
            return (RadioBtn[0].isSelected());
        if (page == 4)
            return (RadioBtn[2].isSelected());
        if (page == 5)
            return (RadioBtn[1].isSelected());
        if (page == 6)
            return (RadioBtn[3].isSelected());
        if (page == 7)
            return (RadioBtn[2].isSelected());
        if (page == 8)
            return (RadioBtn[0].isSelected());
        if (page == 9)
            return (RadioBtn[2].isSelected());
        return true;
    }

    public static void main(String args[]) {
        new QuizApp("Quiz Application");
    }
}