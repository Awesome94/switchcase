package com.pluralsight.Switch;

public class Main {

    public static void main(String[] args) {
//        double[] var1 = {50.0d, 25.0d, 11.4d, 3.0d};
//        double[] var2 = {100.0d, 225.0d, 13.4d, 11.0d};
//        char[] opsCode = {'a', 's', 'd', 'm'};
//        double[] result = new double[opsCode.length];
        // creating the math equations array. to have all the results/equation executions.
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(50.0d, 25.0d, 'd');
        equations[1] = create(100.0d, 92.0d, 's');
        equations[2] = create(225.0d, 15.0d, 'm');
        equations[3] = create(11.0d, 3.0d, 'a');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }

//        for (int i=0; i<opsCode.length; i++){
//            switch (opsCode[i]){
//                case 'a':
//                    result[i] = var1[i] + var2[i];
//                    break;
//                case 's':
//                    result[i] = var1[i] - var2[i];
//                    break;
//                case 'm':
//                    result[i] = var1[i] * var2[i];
//                    break;
//                case 'd':
//                    result[i] = var2[i] != 0? var1[i] / var2[i]: 0.0d;
//                    break;
//                    default:
//                        System.out.println("!Error");
//                        break;
//            }

//        }
        //System.out.println(result);
//        for(double theresult: result){
//            System.out.print("result = ");
//            System.out.println(theresult);
//        }

//    }

    public static MathEquation create(double val1, double val2, char opCode){
        MathEquation equation = new MathEquation();
        equation.setval1(val1);
        equation.setval2(val2);
        equation.setopCode(opCode);

        return  equation;
    }
}
