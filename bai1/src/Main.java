import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        for(int i=0;i<10;i++) {
            Employee employee = new Employee(i, "A" +i, (30+i), "department"+i, "abc"+i, 100000f);
            employees.add(employee);
        }
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {


            do{
                System.out.println("-----------Menu-------------");
                System.out.println("1,Hiển thị danh sách nhân viên");
                System.out.println("2,Thêm nhân viên");
                System.out.println("3,Xóa nhân viên");
                System.out.println("4,Kết thúc chương trình");
                System.out.print("Nhập lựa chọn: ");
                option = scanner.nextInt();
                System.out.println("-----------------------------");

                if (option<1||option>4){
                    System.out.println("Lựa chọn không hợp lệ mời nhập lại!");
                }
            }while (option<1||option>4);
            switch (option){
                case 1:
                    for(int i =0;i<employees.size();i++){
                        System.out.println("Id nhân viên: "+employees.get(i).getId());
                        System.out.println("Tên nhân viên: "+employees.get(i).getName());
                        System.out.println("Tuổi nhân viên: "+employees.get(i).getAge());
                        System.out.println("Phòng ban của nhân viên: "+employees.get(i).getDepartment());
                        System.out.println("Mã nhân viên: "+employees.get(i).getCode());
                        System.out.println("Lương nhân viên: "+employees.get(i).getSalary());
                        System.out.println("-----------------------------");
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên nhân viên:");
                    String name = scanner.next();
                    System.out.println("Nhập tuổi nhân viên:");
                    int age = scanner.nextInt();
                    System.out.println("Nhập phòng ban nhân viên:");
                    String department = scanner.next();
                    System.out.println("Nhập mã nhân viên:");
                    String code = scanner.next();
                    System.out.println("Nhập lương nhân viên:");
                    float salary = scanner.nextFloat();

                    int id = employees.get(employees.size()-1).getId()+1;

                    employees.add(new Employee(id,name,age,department,code,salary));
                    break;
                case 3:
                    System.out.print("Nhập id nhân viên cần xóa: ");
                    int employee_deltete = scanner.nextInt();

                    boolean is_deleted = true;
                    for(int i =0;i<employees.size();i++){
                        if (employees.get(i).getId() == employee_deltete){
                            employees.remove(i);
                            System.out.println("Xóa thành công!");
                            is_deleted = false;
                        }
                    }
                    if(is_deleted){
                        System.out.println("Id không hợp lệ!");
                    }
                case 4:
                    System.out.println("Good bye!");
                    System.exit(1);
            }
        }while (true);

    }
}