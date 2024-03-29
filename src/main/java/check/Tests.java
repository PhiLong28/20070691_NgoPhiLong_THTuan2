package check;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.modules.ModuleDeclaration;

public class Tests {

    void prinAllMethods(File javaFile) throws Exception{
        CompilationUnit cu = StaticJavaParser.parse(javaFile);
        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
        for(MethodDeclaration method: methods) {
            System.out.println(
                    method.getType()+" "+
                            method.getName());
        }
    }




    void prinAllFields(File javaFile) throws Exception{
        CompilationUnit cu = StaticJavaParser.parse(javaFile);
        List<MethodDeclaration> fields = cu.findAll(MethodDeclaration.class);
        for(MethodDeclaration field: fields) {
            System.out.println(field);
        }
    }





    public static void main(String[] args) throws Exception {
        File file = new File("T:\\NguyenLeChiDai_20065421\\com.nguyenlechidaitest\\src\\main\\java\\triangle\\Triangle.java");
        Tests ast =new Tests();
        ast.prinAllMethods(file);
        ast.prinAllFields(file);
    }

}