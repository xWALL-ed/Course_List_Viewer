package com.example.depsubviewer;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller1 implements Initializable {
    @FXML
    ComboBox<String> depBox;
    @FXML
    ComboBox<String> semBox;
    @FXML
    TextArea subView1;
    @FXML
    TextArea subView2;
    @FXML
    TextArea subView3;
    String SWE_S1_ID= """
            CourseID:
            
            SE 111
            SE 112
            SE 113
            ENG 101
            AOL 101
            """;
    String SWE_S1_Title= """
            Course Title:
            
            Computer Fundamentals
            Computer Fundamentals Lab
            Introduction to Software Engineering
            English I
            Art of Living
            """;
    String SWE_S1_Credit= """
            Credit:
            
            3
            1
            3
            3
            3
            """;
    String SWE_S2_ID= """
            CourseID:
            
            SE 121
            SE 122
            SE 123
            MAT 101
            PHY 101
            """;
    String SWE_S2_Title= """
            Course Title:
            
            Structured Programming
            Structured Programming Lab
            Discrete Mathematics
            Mathematics I
            Physics I
            """;
    String SWE_S2_Credit= """
            Credit:
            
            1
            3
            3
            3
            3
            """;
    String SWE_S3_ID= """
            CourseID:
            
            SE 133
            SE 131
            SE 132
            MAT 102
            STA 101
            """;
    String SWE_S3_Title= """
            Course Title:
            
            Software Development Capstone Project
            Data Structure
            Data Structure Lab
            Math-II: Linear Algebra & Fourier Analysis/ Mathematics II
            Probability & Statistics in Software Engineering/ Statistics I
            """;
    String SWE_S3_Credit= """
            Credit:
            
            3
            3
            1
            3
            3
            """;
    String SWE_S4_ID= """
            CourseID:
            
            SE 211
            SE 212
            SE 214
            SE 215
            SE 213
            """;

    String SWE_S4_Title= """
            Course Title:
            
            Object Oriented Concepts
            Software Requirement Specifications & Analysis
            Algorithms Design & Analysis
            Algorithms Design & Analysis Lab
            Digital Electronics & Logic Design
            """;
    String SWE_S4_Credit= """
            Credit:
            
            3
            3
            3
            1
            3
            """;
    String SWE_S5_ID= """
            CourseID:
            
            SE 221
            SE 223
            SE 224
            SE 225
            SE 226
            SE 222
            """;
    String SWE_S5_Title= """
            Course Title:
            
            Object Oriented Design
            Database System
            Database System Lab
            Data Communication & Computer Networking
            Data Communication & Computer Networking Lab
            Computer Architecture
            """;
    String SWE_S5_Credit= """
            Credit:
            
            3
            3
            1
            3
            1
            3
            """;
    String SWE_S6_ID= """
            CourseID:
            
            SE 231
            SE 234
            GE 235
            SE 232
            SE 233
            """;
    String SWE_S6_Title= """
            Course Title:
            
            System Analysis & Design Capstone Project
            Theory of Computing
            Principles of Accounting, Business & Economics
            Operating System & System Programming
            Operating System & System Programming Lab
            """;
    String SWE_S6_Credit= """
            Credit:
            
            3
            3
            3
            3
            1
            """;
    String SWE_S7_ID= """
            CourseID:
            
            SE 311
            SE 312
            SE 313
            BNS 101
            SE 3XX
            """;
    String SWE_S7_Title= """
            Course Title:
            
            Design Pattern
            Software Quality Assurance & Testing
            Software Quality Assurance & Testing Lab
            Bangladesh Studies
            Guided Elective - I
            """;
    String SWE_S7_Credit= """
            Credit:
            
            3
            3
            1
            3
            3
            """;
    String SWE_S8_ID= """
            CourseID:
            
            SE 321
            SE 322
            SE 323
            GE 324
            SE 3XX
            """;
    String SWE_S8_Title= """
            Course Title:
            
            Software Engineering Web Application
            Software Engineering Web Application Lab
            Software Architecture & Design
            Business Analysis & Communication
            Guided Elective - II
            """;
    String SWE_S8_Credit= """
            Credit:
            
            1
            3
            3
            3
            3
            """;
    String SWE_S9_ID= """
            CourseID:
            
            SE 331
            SE 332
            SE 333
            SE 334
            GE 335
            """;
    String SWE_S9_Title= """
            Course Title:
            
            Software Engineering Design Capstone Project
            Information System Security
            Artificial Intelligence
            Artificial Intelligence Lab
            History of the Emergence of Bangladesh
            """;
    String SWE_S9_Credit= """
            Credit:
            
            3
            3
            3
            1
            3
            """;
    String SWE_S10_ID= """
            CourseID:
            
            SE 411
            SE 4XX
            SE 4XX
            SE 5XX
            """;
    String SWE_S10_Title= """
            Course Title:
            
            Software Project Management & Documentation
            Guided Elective - III
            Guided Elective - IV
            Open Elective - I
            """;
    String SWE_S10_Credit= """
            Credit:
            
            3
            3
            3
            3
            """;
    String SWE_S11_ID= """
            CourseID:
            
            SE 4XX
            SE 5XX
            SE 5XX
            """;
    String SWE_S11_Title= """
            Course Title:
            
            Guided Elective - V
            Open Elective - II
            Open Elective - III
            """;
    String SWE_S11_Credit= """
            Credit:
            
            3
            3
            3
            """;
    String SWE_S12_ID= """
            CourseID:
            
            SE 422
            """;
    String SWE_S12_Title= """
            Course Title:
            
            Final Year Project/ Thesis/ Internship
            """;
    String SWE_S12_Credit= """
            Credit:
            
            6
            """;
    String CSE_S1_ID= """
            CourseID:
            
            CSE112
            MAT111
            ENG113
            PHY113
            PHY114
            GED111
            """;
    String CSE_S1_Title= """
            Course Title:
            
            Computer Fundamentals
            Basic Mathematics
            Basic Functional English and English Spoken
            Basic Physics
            Basic Physics Lab
            History of Bangladesh and Bangla Language
            """;
    String CSE_S1_Credit = """
            Credit:
            
            3
            3
            3
            3
            1
            3
            """;
    String CSE_S2_ID= """
            CourseID:
            
            MAT121
            CSE122
            CSE123
            ENG123
            CSE124
            GED121
            """;
    String CSE_S2_Title= """
            Course Title:
            
            Mathematics-II: Calculus, Complex Variables and Linear Algebra
            Programming and Problem Solving
            Problem Solving Lab
            Writing and Comprehension
            Design for User Experience
            Bangladesh Studies
            """;
    String CSE_S2_Credit = """
            Credit:
            
            3
            2
            2
            3
            1
            3
            """;
    String CSE_S3_ID= """
            CourseID:
            
            CSE131
            CSE132
            CSE133
            CSE134
            CSE135
            CSE136
            GED131
            """;
    String CSE_S3_Title= """
            Course Title:
            
            Discrete Mathematics
            Electrical Circuits
            Electrical Circuits Lab
            Data Structure
            Data Structure Lab
            Software Project I
            Art of Living
            """;
    String CSE_S3_Credit = """
            Credit:
            
            2
            1
            2
            2
            2
            1
            3
            """;
    String CSE_S4_ID= """
            CourseID:
            
            MAT211
            CSE212
            CSE213
            CSE214
            CSE215
            CSE216
            ACT211
            """;
    String CSE_S4_Title= """
            Course Title:
            
            Engineering Mathematics
            Basic Electronics
            Basic Electronics Lab
            Algorithms
            Algorithms Lab
            Software Project II
            Financial and Managerial Accounting
            """;
    String CSE_S4_Credit = """
            Credit:
            
            3
            1
            2
            2
            2
            1
            2
            """;
    String CSE_S5_ID= """
            CourseID:
            
            CSE221
            CSE222
            STA221
            CSE223
            CSE224
            CSE225
            CSE226
            """;
    String CSE_S5_Title= """
            Course Title:
            
            Object Oriented Programming
            Object Oriented Programming Lab
            Statistics and Probability
            Digital Electronics
            Digital Electronics Lab
            Data Communication
            Software Project III
            """;
    String CSE_S5_Credit = """
            Credit:
            
            2
            2
            3
            1
            2
            3
            1
            """;
    String CSE_S6_ID= """
            CourseID:
            
            CSE231
            CSE232
            CSE233
            CSE234
            CSE235
            CSE236
            CSE237
            """;
    String CSE_S6_Title= """
            Course Title:
            
            Microprocessor, Embedded Systems and IoT
            Microprocessor, Embedded Systems and IoT Lab
            Object Oriented Programming II
            Object Oriented Programming II Lab
            Numerical Methods
            Math for Computer Science
            Software Project IV
            """;
    String CSE_S6_Credit = """
            Credit:
            
            1
            2
            1
            2
            3
            2
            1
            """;
    String CSE_S7_ID= """
            CourseID:
            
            CSE311
            CSE312
            CSE313
            CSE314
            CSE315
            CSE316
            CSE317
            """;
    String CSE_S7_Title= """
            Course Title:
            
            Database Management System
            Database Management System Lab
            Computer Networks
            Computer Networks Lab
            Artificial Intelligence
            Artificial Intelligence Lab
            Software Project V
            """;
    String CSE_S7_Credit = """
            Credit:
            
            2
            2
            1
            2
            1
            2
            1
            """;
    String CSE_S8_ID= """
            CourseID:
            
            CSE321
            CSE322
            CSE323
            CSE324
            CSE325
            ECO321
            CSE326
            """;
    String CSE_S8_Title= """
            Course Title:
            
            Data Mining and Machine Learning
            Data Mining and Machine Learning Lab
            Operating Systems
            Operating Systems Lab
            System Analysis and Design
            Economics
            Research and Innovation in CSE
            """;
    String CSE_S8_Credit = """
            Credit:
            
            2
            2
            1
            2
            3
            2
            1
            """;
    String CSE_S9_ID= """
            CourseID:
            
            CSE331
            CSE332
            CSE333
            CSE334
            CSE335
            CSE336
            """;
    String CSE_S9_Title= """
            Course Title:
            
            Compiler Design
            Compiler Design Lab
            Software Engineering
            Pervasive Computing
            Pervasive Computing and Mobile App Development Lab
            Software Project VI
            """;
    String CSE_S9_Credit = """
            Credit:
            
            2
            2
            3
            1
            2
            1
            """;
    String CSE_S10_ID= """
            CourseID:
            
            CSE411
            CSE412
            CSE413
            CSE414
            CSE415
            CSE416
            """;
    String CSE_S10_Title= """
            Course Title:
            
            Computer Architecture and Organization
            Big Data and IoT
            Big Data and IoT Lab
            Web Engineering
            Web Engineering Lab
            Software Project VII
            """;
    String CSE_S10_Credit = """
            Credit:
            
            3
            1
            2
            1
            2
            1
            """;
    String CSE_S11_ID= """
            CourseID:
            
            CSE421
            CSE422
            CSE423
            CSE XXX
            CSE499
            """;
    String CSE_S11_Title= """
            Course Title:
            
            Computer Graphics
            Computer Graphics Lab
            Information Security
            Elective I
            Project / Internship (Phase I, to be completed in Level- 4 Term-3
            """;
    String CSE_S11_Credit = """
            Credit:
            
            1
            2
            3
            3
            3
            """;
    String CSE_S12_ID= """
            CourseID:
            
            CSE498
            CSE XXX
            CSE499
            """;
    String CSE_S12_Title= """
            Course Title:
            
            Social and Professional Issues in Computing
            Elective II
            Project / Internship (Phase II, continued from Level 4 Term 2)
            """;
    String CSE_S12_Credit = """
            Credit:
            
            3
            3
            3
            """;
    String EEE_S1_ID = """
            CourseID:
            
            HUM 111
            BDS 111
            PHY 111
            PHY 112
            CHE 111
            CHE 112
            MAT 111
            ENG 112
            EEE 111
            """;
    String EEE_S1_Title = """
            Course Title:
                        
            Functional Bengali Language
            Bangladesh Studies
            Physics
            Physics Lab
            Chemistry
            Chemistry Lab
            Differential and Integral Calculus
            English I
            Electric Circuit I
            """;
    String EEE_S1_Credit = """
            Credit:
            
            2
            2
            2
            1
            2
            1
            3
            1
            3
            """;
    String EEE_S2_ID = """
            CourseID:
            
            ENG 122
            CSE 122
            HUM 121
            MAT 121
            MAT 123
            HUM 124
            EEE 121
            EEE 122
            EEE 124
            """;
    String EEE_S2_Title = """
            Course Title:
            
            English II
            Programming I
            Economics and Accounting for Engineers
            Linear Algebra & Complex Variable
            Co-ordinate Geometry, Vector Analysis and Statistic
            Art of Living
            Electrical Circuit II
            Electrical Circuit Lab
            Circuit Simulation Lab
            """;
    String EEE_S2_Credit = """
            Credit:
            
            1
            1
            2
            3
            3
            1
            3
            1
            1
            """;
    String EEE_S3_ID = """
            CourseID:
            
            MAT 211
            CE 212
            EEE 211
            EEE 213
            EEE 215
            EEE 218
            EEE 219
            """;
    String EEE_S3_Title = """
            Course Title:
            
            Ordinary and Portal Differential Equation
            Engineering Drawing and Services Design Lab
            Electronics I
            Energy Conversion I
            Electric Properties of Materials
            Numerical Analysis Lab
            Continuous Signal and Linear Systems
            """;
    String EEE_S3_Credit = """
            Credit:
            
            3
            1
            3
            3
            3
            1
            3
            """;
    String EEE_S4_ID = """
            CourseID:
            
            ME 221
            ME 222
            EEE 221
            EEE 222
            EEE 223
            EEE 224
            EEE 225
            EEE 226
            EEE 227
            """;
    String EEE_S4_Title = """
            Course Title:
            
            Basic Mechanical Engineering
            Basic Mechanical Engineering Lab
            Electronics II
            Electronics Lab
            Energy Conversion II
            Energy Conversion Lab
            Digital Electronics
            Digital Electronics Lab
            Transmission and Distribution of Electric Power
            """;
    String EEE_S4_Credit = """
            Credit:
            
            2
            1
            3
            1
            3
            1
            3
            1
            3
            """;
    String EEE_S5_ID = """
            CourseID:
            
            CSE 312
            EEE 311
            EEE 313
            EEE 314
            EEE 315
            EEE 316
            EEE 317
            EEE 318
            EEE 319
            EEE 300
            """;
    String EEE_S5_Title = """
            Course Title:
            
            Programming II
            Communication Engineering I
            Microprocessor And Interfacing
            Microprocessor And Interfacing Lab
            Power System Analysis
            Power System Analysis Lab
            Control Systems
            Control Systems Lab
            Electromagnetic Fields and Waves
            Industrial Training
            """;
    String EEE_S5_Credit = """
            Credit:
            
            1
            3
            3
            1
            3
            1
            3
            1
            3
            1
            """;
    String EEE_S6_ID = """
            CourseID:
            
            EEE 321
            EEE 322
            EEE 323
            EEE 324
            EEE 325
            EEE 326
            EEE 327
            EEE 327
            HUM 321
            """;
    String EEE_S6_Title = """
            Course Title:
            
            Communication Engineering II
            Communication Engineering Lab
            Digital Signal Processing
            Digital Signal Processing Lab
            Measurement and Instrumentation
            Measurement and Instrumentation Lab
            Power System Protection
            Power System Protection Lab
            Engineering Ethics and Environment Protection
            """;
    String EEE_S6_Credit = """
            Credit:
            
            3
            1
            3
            1
            3
            1
            3
            1
            2
            """;
    String EEE_S7_ID = """
            CourseID:
            
            EEE 411
            EEE 412
            IPE 411
            HUM 412
            EEE 4XX
            EEE 4XX
            EEE 4XX
            EEE 4XX
            EEE 400
            """;
    String EEE_S7_Title = """
            Course Title:
            
            Power Electronics
            Power Electronics Lab
            Industrial Management
            Employability 360
            Elective I (Major)
            Elective I Lab (Major)
            Elective II (Major)
            Elective I (Major)
            Capstone Project
            """;
    String EEE_S7_Credit = """
            Credit:
            
            3
            1
            2
            1
            3
            3
            1
            3
            2
            """;
    String EEE_S8_ID = """
            CourseID:
            
            ENG 422
            EEE 421
            EEE 424
            EEE 426
            EEE 4XX
            EEE 4XX
            EEE 4XX
            EEE 400
            """;
    String EEE_S8_Title = """
            Course Title:
            
            English III
            Energy Economics
            Electrical and Electronic Appliance Lab
            Industrial Automation and Robotics
            Elective I (Minor)
            Elective I Lab (Minor)
            Elective II (Minor)
            Capstone Project
            """;
    String EEE_S8_Credit = """
            Credit:
            
            1
            3
            1
            1
            3
            3
            1
            3
            """;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        depBox.setItems(FXCollections.observableArrayList(
                "Software Engineering",
                "Computer Science Engineering",
                "Electrical and Electronic Engineering"
        ));
        semBox.setItems(FXCollections.observableArrayList(
                "1st Semester",
                "2nd Semester",
                "3rd Semester",
                "4th Semester",
                "5th Semester",
                "6th Semester",
                "7th Semester",
                "8th Semester",
                "9th Semester",
                "10th Semester",
                "11th Semester",
                "12th Semester"
        ));
    }
    public void sub(String x,String y){

        switch(x){
            case "Software Engineering":
                switch (y) {
                    case "1st Semester" -> {
                        subView1.setText(SWE_S1_ID);
                        subView2.setText(SWE_S1_Title);
                        subView3.setText(SWE_S1_Credit);
                    }
                    case "2nd Semester" -> {
                        subView1.setText(SWE_S2_ID);
                        subView2.setText(SWE_S2_Title);
                        subView3.setText(SWE_S2_Credit);
                    }
                    case "3rd Semester" -> {
                        subView1.setText(SWE_S3_ID);
                        subView2.setText(SWE_S3_Title);
                        subView3.setText(SWE_S3_Credit);
                    }
                    case "4th Semester" -> {
                        subView1.setText(SWE_S4_ID);
                        subView2.setText(SWE_S4_Title);
                        subView3.setText(SWE_S4_Credit);
                    }
                    case "5th Semester" -> {
                        subView1.setText(SWE_S5_ID);
                        subView2.setText(SWE_S5_Title);
                        subView3.setText(SWE_S5_Credit);
                    }
                    case "6th Semester" -> {
                        subView1.setText(SWE_S6_ID);
                        subView2.setText(SWE_S6_Title);
                        subView3.setText(SWE_S6_Credit);
                    }
                    case "7th Semester" -> {
                        subView1.setText(SWE_S7_ID);
                        subView2.setText(SWE_S7_Title);
                        subView3.setText(SWE_S7_Credit);
                    }
                    case "8th Semester" -> {
                        subView1.setText(SWE_S8_ID);
                        subView2.setText(SWE_S8_Title);
                        subView3.setText(SWE_S8_Credit);
                    }
                    case "9th Semester" -> {
                        subView1.setText(SWE_S9_ID);
                        subView2.setText(SWE_S9_Title);
                        subView3.setText(SWE_S9_Credit);
                    }
                    case "10th Semester" -> {
                        subView1.setText(SWE_S10_ID);
                        subView2.setText(SWE_S10_Title);
                        subView3.setText(SWE_S10_Credit);
                    }
                    case "11th Semester" -> {
                        subView1.setText(SWE_S11_ID);
                        subView2.setText(SWE_S11_Title);
                        subView3.setText(SWE_S11_Credit);
                    }
                    case "12th Semester" -> {
                        subView1.setText(SWE_S12_ID);
                        subView2.setText(SWE_S12_Title);
                        subView3.setText(SWE_S12_Credit);
                    }
                }
                break;
            case "Computer Science Engineering":
                switch (y) {
                    case "1st Semester" -> {
                        subView1.setText(CSE_S1_ID);
                        subView2.setText(CSE_S1_Title);
                        subView3.setText(CSE_S1_Credit);
                    }
                    case "2nd Semester" -> {
                        subView1.setText(CSE_S2_ID);
                        subView2.setText(CSE_S2_Title);
                        subView3.setText(CSE_S2_Credit);
                    }
                    case "3rd Semester" -> {
                        subView1.setText(CSE_S3_ID);
                        subView2.setText(CSE_S3_Title);
                        subView3.setText(CSE_S3_Credit);
                    }
                    case "4th Semester" -> {
                        subView1.setText(CSE_S4_ID);
                        subView2.setText(CSE_S4_Title);
                        subView3.setText(CSE_S4_Credit);
                    }
                    case "5th Semester" -> {
                        subView1.setText(CSE_S5_ID);
                        subView2.setText(CSE_S5_Title);
                        subView3.setText(CSE_S5_Credit);
                    }
                    case "6th Semester" -> {
                        subView1.setText(CSE_S6_ID);
                        subView2.setText(CSE_S6_Title);
                        subView3.setText(CSE_S6_Credit);
                    }
                    case "7th Semester" -> {
                        subView1.setText(CSE_S7_ID);
                        subView2.setText(CSE_S7_Title);
                        subView3.setText(CSE_S7_Credit);
                    }
                    case "8th Semester" -> {
                        subView1.setText(CSE_S8_ID);
                        subView2.setText(CSE_S8_Title);
                        subView3.setText(CSE_S8_Credit);
                    }
                    case "9th Semester" -> {
                        subView1.setText(CSE_S9_ID);
                        subView2.setText(CSE_S9_Title);
                        subView3.setText(CSE_S9_Credit);
                    }
                    case "10th Semester" -> {
                        subView1.setText(CSE_S10_ID);
                        subView2.setText(CSE_S10_Title);
                        subView3.setText(CSE_S10_Credit);
                    }
                    case "11th Semester" -> {
                        subView1.setText(CSE_S11_ID);
                        subView2.setText(CSE_S11_Title);
                        subView3.setText(CSE_S11_Credit);
                    }
                    case "12th Semester" -> {
                        subView1.setText(CSE_S12_ID);
                        subView2.setText(CSE_S12_Title);
                        subView3.setText(CSE_S12_Credit);
                    }
                }
                break;
            case "Electrical and Electronic Engineering":
                switch (y) {
                    case "1st Semester" -> {
                        subView1.setText(EEE_S1_ID);
                        subView2.setText(EEE_S1_Title);
                        subView3.setText(EEE_S1_Credit);
                    }
                    case "2nd Semester" -> {
                        subView1.setText(EEE_S2_ID);
                        subView2.setText(EEE_S2_Title);
                        subView3.setText(EEE_S2_Credit);
                    }
                    case "3rd Semester" -> {
                        subView1.setText(EEE_S3_ID);
                        subView2.setText(EEE_S3_Title);
                        subView3.setText(EEE_S3_Credit);
                    }
                    case "4th Semester" -> {
                        subView1.setText(EEE_S4_ID);
                        subView2.setText(EEE_S4_Title);
                        subView3.setText(EEE_S4_Credit);
                    }
                    case "5th Semester" -> {
                        subView1.setText(EEE_S5_ID);
                        subView2.setText(EEE_S5_Title);
                        subView3.setText(EEE_S5_Credit);
                    }
                    case "6th Semester" -> {
                        subView1.setText(EEE_S6_ID);
                        subView2.setText(EEE_S6_Title);
                        subView3.setText(EEE_S6_Credit);
                    }
                    case "7th Semester" -> {
                        subView1.setText(EEE_S7_ID);
                        subView2.setText(EEE_S7_Title);
                        subView3.setText(EEE_S7_Credit);
                    }
                    case "8th Semester" -> {
                        subView1.setText(EEE_S8_ID);
                        subView2.setText(EEE_S8_Title);
                        subView3.setText(EEE_S8_Credit);
                    }
                    default -> {
                        subView2.setText("Bi-Semester Only up to 8 Semesters");
                        subView1.setText("");
                        subView3.setText("");
                    }
                }
                break;
        }

    }


    @FXML
    public void clickViewBtn(){
        sub(depBox.getValue(),semBox.getValue());
    }
}

























