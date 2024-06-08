import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // Create Department objects
        Department department1 = new Department();
        department1.setDepartmentID(1);
        department1.setDepartmentName("Sales");

        Department department2 = new Department();
        department2.setDepartmentID(2);
        department2.setDepartmentName("Marketing");

        Department department3 = new Department();
        department3.setDepartmentID(3);
        department3.setDepartmentName("IT");

        System.out.println("Department Name: " + department1.getDepartmentName());

        // Create Position objects
        Position position1 = new Position();
        position1.setPositionID(1);
        position1.setPositionName("Developer");

        Position position2 = new Position();
        position2.setPositionID(2);
        position2.setPositionName("Tester");

        Position position3 = new Position();
        position3.setPositionID(3);
        position3.setPositionName("Scrum Master");

        System.out.println("Position Name: " + position1.getPositionName());

        // Create Account objects
        Account account1 = new Account();
        account1.setAccountID(1);
        account1.setEmail("user1@example.com");
        account1.setUsername("user1");
        account1.setFullName("User One");
        account1.setDepartment(department1);
        account1.setPosition(position1);
        account1.setCreateDate(LocalDate.now());

        Account account2 = new Account();
        account2.setAccountID(2);
        account2.setEmail("user2@example.com");
        account2.setUsername("user2");
        account2.setFullName("User Two");
        account2.setDepartment(department2);
        account2.setPosition(position2);
        account2.setCreateDate(LocalDate.now());

        Account account3 = new Account();
        account3.setAccountID(3);
        account3.setEmail("user3@example.com");
        account3.setUsername("user3");
        account3.setFullName("User Three");
        account3.setDepartment(department3);
        account3.setPosition(position3);
        account3.setCreateDate(LocalDate.now());

        System.out.println("Account Email: " + account1.getEmail());

        // Create Group objects
        Group group1 = new Group();
        group1.setGroupID(1);
        group1.setGroupName("Group One");
        group1.setCreator(account1);
        group1.setCreateDate(LocalDate.now());

        Group group2 = new Group();
        group2.setGroupID(2);
        group2.setGroupName("Group Two");
        group2.setCreator(account2);
        group2.setCreateDate(LocalDate.now());

        Group group3 = new Group();
        group3.setGroupID(3);
        group3.setGroupName("Group Three");
        group3.setCreator(account3);
        group3.setCreateDate(LocalDate.now());

        System.out.println("Group Name: " + group1.getGroupName());

        // Create GroupAccount objects
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.setGroup(group1);
        groupAccount1.setAccount(account1);
        groupAccount1.setJoinDate(LocalDate.now());

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.setGroup(group2);
        groupAccount2.setAccount(account2);
        groupAccount2.setJoinDate(LocalDate.now());

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.setGroup(group3);
        groupAccount3.setAccount(account3);
        groupAccount3.setJoinDate(LocalDate.now());

        System.out.println("GroupAccount Join Date: " + groupAccount1.getJoinDate());

        // Create TypeQuestion objects
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.setTypeID(1);
        typeQuestion1.setTypeName("Essay");

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.setTypeID(2);
        typeQuestion2.setTypeName("Multiple-Choice");

        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion3.setTypeID(3);
        typeQuestion3.setTypeName("True/False");

        System.out.println("TypeQuestion Name: " + typeQuestion1.getTypeName());

        // Create CategoryQuestion objects
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.setCategoryID(1);
        categoryQuestion1.setCategoryName("Java");

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.setCategoryID(2);
        categoryQuestion2.setCategoryName(".NET");

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.setCategoryID(3);
        categoryQuestion3.setCategoryName("SQL");

        System.out.println("CategoryQuestion Name: " + categoryQuestion1.getCategoryName());

        // Create Question objects
        Question question1 = new Question();
        question1.setQuestionID(1);
        question1.setContent("What is Java?");
        question1.setCategoryQuestion(categoryQuestion1);
        question1.setTypeQuestion(typeQuestion1);
        question1.setCreator(account1);
        question1.setCreateDate(LocalDate.now());

        Question question2 = new Question();
        question2.setQuestionID(2);
        question2.setContent("Explain .NET framework.");
        question2.setCategoryQuestion(categoryQuestion2);
        question2.setTypeQuestion(typeQuestion2);
        question2.setCreator(account2);
        question2.setCreateDate(LocalDate.now());

        Question question3 = new Question();
        question3.setQuestionID(3);
        question3.setContent("Describe SQL joins.");
        question3.setCategoryQuestion(categoryQuestion3);
        question3.setTypeQuestion(typeQuestion3);
        question3.setCreator(account3);
        question3.setCreateDate(LocalDate.now());

        System.out.println("Question Content: " + question1.getContent());

        // Create Answer objects
        Answer answer1 = new Answer();
        answer1.setAnswerID(1);
        answer1.setContent("Java is a programming language.");
        answer1.setQuestion(question1);
        answer1.setCorrect(true);

        Answer answer2 = new Answer();
        answer2.setAnswerID(2);
        answer2.setContent("The .NET framework is a software development platform developed by Microsoft.");
        answer2.setQuestion(question2);
        answer2.setCorrect(true);

        Answer answer3 = new Answer();
        answer3.setAnswerID(3);
        answer3.setContent("SQL joins are used to combine rows from two or more tables.");
        answer3.setQuestion(question3);
        answer3.setCorrect(true);

        System.out.println("Answer Content: " + answer1.getContent());

        // Create Exam objects
        Exam exam1 = new Exam();
        exam1.setExamID(1);
        exam1.setCode("EX1");
        exam1.setTitle("Java Exam");
        exam1.setCategoryQuestion(categoryQuestion1);
        exam1.setDuration(60);
        exam1.setCreator(account1);
        exam1.setCreateDate(LocalDate.now());

        Exam exam2 = new Exam();
        exam2.setExamID(2);
        exam2.setCode("EX2");
        exam2.setTitle(".NET Exam");
        exam2.setCategoryQuestion(categoryQuestion2);
        exam2.setDuration(60);
        exam2.setCreator(account2);
        exam2.setCreateDate(LocalDate.now());

        Exam exam3 = new Exam();
        exam3.setExamID(3);
        exam3.setCode("EX3");
        exam3.setTitle("SQL Exam");
        exam3.setCategoryQuestion(categoryQuestion3);
        exam3.setDuration(60);
        exam3.setCreator(account3);
        exam3.setCreateDate(LocalDate.now());

        System.out.println("Exam Title: " + exam1.getTitle());

        // Create ExamQuestion objects
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.setExam(exam1);
        examQuestion1.setQuestion(question1);

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.setExam(exam2);
        examQuestion2.setQuestion(question2);

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.setExam(exam3);
        examQuestion3.setQuestion(question3);

        System.out.println("ExamQuestion Exam Code: " + examQuestion1.getExam().getCode());
    }
}
