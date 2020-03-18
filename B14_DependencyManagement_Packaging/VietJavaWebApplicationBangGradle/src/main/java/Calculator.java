public class Calculator {
    public static float calculate(float soThuNhat, char phepTinh, float soThuHai) {
        switch (phepTinh) {
            case '+':
                return soThuNhat + soThuHai;
            case '-':
                return soThuNhat - soThuHai;
            case '*':
                return soThuNhat - soThuHai;
            case '/':
                if (soThuHai != 0) {
                    return soThuNhat / soThuHai;
                }
                throw new RuntimeException("Khong the chia cho 0");
            default:
                throw new RuntimeException("Khong dung toan tu");
        }
    }
}
