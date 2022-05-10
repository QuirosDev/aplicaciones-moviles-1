package testCompany;
import java.util.Scanner;

import company.*;

public class TestCompany {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        DbCompany dbCompany = new DbCompany();
        boolean flag = true;
        
        while(flag == true){
            System.out.println("Digite la accion que desea realizar.");
            System.out.println("1. Ingresar personal de vigilancia");
            System.out.println("2. Ingresar personal de limpieza");
            System.out.println("3. Ingresar personal de contaduria");
            System.out.println("4. Ingresar personal de administracion");
            System.out.println("5. Imprimir base de datos de la compañia");
            System.out.println("6. Salir");
            int option = Integer.parseInt(inputData.nextLine());
            switch (option) {
                case 1:
                    WatchMan watchMans = new WatchMan();
                    System.out.println("Digite el nombre del vigilante: ");
                    watchMans.setName(inputData.nextLine());
                    System.out.println("Digite la identificacion del vigilante: ");
                    watchMans.setIdentification(inputData.nextLine());
                    System.out.println("Digite la edad del vigilante: ");
                    watchMans.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Digite el arma del vigilante: ");
                    watchMans.setWeapon(inputData.nextLine());
                    System.out.println("Digite el dia de trabajo del vigilante: ");
                    watchMans.setWorkDay(inputData.nextLine());
                    dbCompany.setWatchMan(watchMans);
                    break;
                case 2:
                    CleaningStaff cleaningStaffs = new CleaningStaff();
                    System.out.println("Digite el nombre del limpiador@: ");
                    cleaningStaffs.setName(inputData.nextLine());
                    System.out.println("Digite la identificacion del limpiador@: ");
                    cleaningStaffs.setIdentification(inputData.nextLine());
                    System.out.println("Digite el la edad del limpiador@: ");
                    cleaningStaffs.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Digite el dia de descanso del limpiador@: ");
                    cleaningStaffs.setDayOff(inputData.nextLine());
                    dbCompany.setCleaningStaff(cleaningStaffs);
                    break;
                case 3:
                    Accountant accountants = new Accountant();
                    System.out.println("Digite el nombre del contador@: ");
                    accountants.setName(inputData.nextLine());
                    System.out.println("Digite la identificacion del contador@: ");
                    accountants.setIdentification(inputData.nextLine());
                    System.out.println("Digite la edad del contador@: ");
                    accountants.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Digite el nombre del jefe del contador@: ");
                    accountants.setLeader(inputData.nextLine());
                    System.out.println("Digite el numero de parqueadero del contador@: ");
                    accountants.setParking(inputData.nextLine());
                    dbCompany.setAccountat(accountants);
                    break;
                case 4: 
                    Admin admins = new Admin();
                    System.out.println("Digite el nombre del administrador@: ");
                    admins.setName(inputData.nextLine());
                    System.out.println("Digite la identificaion del administrador@: ");
                    admins.setIdentification(inputData.nextLine());
                    System.out.println("Digite la edad del administrador@: ");
                    admins.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Digite el jefe del administrador: ");
                    admins.setLeader(inputData.nextLine());
                    System.out.println("Digite el numero de parqueadero del administrador@: ");
                    admins.setParking(inputData.nextLine());
                    dbCompany.setAdmin(admins);
                    break;
                case 5:
                    for(WatchMan dbw: dbCompany.getWatchMans()){
                        System.out.println("VIGILANTES: \n");
                        System.out.println("Nombre: " + dbw.getName());
                        System.out.println("Identificacion: " + dbw.getIdentification());
                        System.out.println("Edad: " + dbw.getAge());
                        System.out.println("Arma: " + dbw.getWeapon());
                        System.out.println("Dia trabajo: \n" + dbw.getWorkDay());
                        System.out.println("////////////////////////\n");
                    }
                    for(CleaningStaff dbc: dbCompany.getCleaningStaffs()){
                        System.out.println("LIMPIADOR@S: \n");
                        System.out.println("Nombre: " + dbc.getName());
                        System.out.println("Identificacion: " + dbc.getIdentification());
                        System.out.println("Edad: " + dbc.getAge());
                        System.out.println("Dia descanso: \n" + dbc.getDayOff());
                        System.out.println("////////////////////////\n");
                    }
                    for(Accountant dba: dbCompany.getAccountants()){
                        System.out.println("CONTADOR@S: \n");
                        System.out.println("Nombre: " + dba.getName());
                        System.out.println("Identificacion: " + dba.getIdentification());
                        System.out.println("Edad: " + dba.getAge());
                        System.out.println("Nombre jefe directo: " + dba.getLeader());
                        System.out.println("Numero parqueadero: \n" + dba.getParking());
                        System.out.println("////////////////////////\n");
                    }
                    for(Admin dbAdmin: dbCompany.getAdmins()){
                        System.out.println("ADMINISTRADOR@S: \n");
                        System.out.println("Nombre: " + dbAdmin.getName());
                        System.out.println("Identificacion: " + dbAdmin.getIdentification());
                        System.out.println("Edad: " + dbAdmin.getAge());
                        System.out.println("Nombre jefe directo: " + dbAdmin.getLeader());
                        System.out.println("Numero parqueadero: \n" + dbAdmin.getParking());
                        System.out.println("////////////////////////\n");
                    }
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        
    }
}
