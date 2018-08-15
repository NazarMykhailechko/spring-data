package data.ioc_example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CourseServiceAop {

    @Before("getMethods()")
    public void printPublicMethods(){
        System.out.println("public method");
    }

    @Around("execution(public * *(..))")
    public Object aroundPublicMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println(signature.getName());
        return proceedingJoinPoint.proceed();
    }

    @Pointcut("execution(public * *(*))")
    public void getMethods(){}
}