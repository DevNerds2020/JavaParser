package com.company;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            // Open the Java source code file for parsing
            FileInputStream in = new FileInputStream("C:\\Users\\alast\\IdeaProjects\\javaparser\\src\\com\\company\\MyClass.java");
            JavaParser parser = new JavaParser();



            // Parse the Java source code
            CompilationUnit cu = parser.parse(in).getResult().orElseThrow();

            // Retrieve the class name
            ClassOrInterfaceDeclaration classDeclaration = cu.getClassByName("MyClass").get();
            String className = classDeclaration.getNameAsString();
            String projectName = cu.getPackageDeclaration().get().getNameAsString();
            String packageName = cu.getPackageDeclaration().get().getNameAsString();
            System.out.println("Class Name: " + className + " Project Name: " + projectName + " Package Name: " + packageName);
            //class type: normal , interface , nested
//            String classType = classDeclaration.isInterface() ? "interface" : "normal";
//            String classVisibility = classDeclaration.getAccessSpecifier().toString();
//            boolean isAbstract = classDeclaration.isAbstract();
//            boolean isFinal = classDeclaration.isFinal();
//            boolean isStatic = classDeclaration.isStatic();
//            boolean isInterface = classDeclaration.isInterface();
//            //extended classes
//            String extendedClass = classDeclaration.getExtendedTypes().toString();
//            String implements = classDeclaration.getImplementedTypes().toString();
//            //children
//            String children = classDeclaration.getChildNodes().toString();
//            //constructors
//            String constructors = classDeclaration.getConstructors().toString();
//            //fields
//            String fields = classDeclaration.getFields().toString();
//            //methods
//            String methods = classDeclaration.getMethods().toString();
//            //override
//            String override = classDeclaration.getOverriddenMethods().toString();
//            //has static methods
//            String hasStaticMethods = classDeclaration.hasStaticMethods();
//            //has final methods
//            String hasFinalMethods = classDeclaration.hasFinalMethods();
//            //has abstract methods
//            String hasAbstractMethods = classDeclaration.hasAbstractMethods();
//            //associaten
//            String associate = classDeclaration.getAssociationNodes().toString();
//            //aggregation
//            String aggregation = classDeclaration.getAggregationNodes().toString();
//            //composition
//            String composition = classDeclaration.getCompositionNodes().toString();
//            //instantiation
//            String instantiation = classDeclaration.getInstantiationNodes().toString();
//            //API
//            String api = classDeclaration.getApi().toString();
//            //pattern
//            String pattern = classDeclaration.getPattern().toString();
//            //role
//            String role = classDeclaration.getRole().toString();

            // Print the class name

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}